package to.noc.hsm.lunasa.example;

import static java.lang.System.err;
import static java.lang.System.out;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPrivateKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

import com.safenetinc.luna.LunaUtils;
import com.safenetinc.luna.provider.key.LunaPrivateKeyRsa;
import com.safenetinc.luna.provider.key.LunaSecretKey;

public class WrapPrivateKey {
	private Certificate certificate;
	private PrivateKey privateKey;
	private String aliasCert;
	private Integer idCert;
	private LunaSecretKey wmk;

	private static final String KEK_ALIAS = "MSP_WK_256";

	private Connection con;
	private String host = "10.77.40.53:5432";
	private String nameDB = "firmador";
	private String usuarioDB = "firmador";
	private String passwdDB = "desa"; // "CeNtoNtu";

	public static void main(String[] args) throws Exception {
		if (args.length != 3) {
			out.println("\n==========================================================");
			out.println("Se esperaban tres parámetros: id_certificado archivo clave");
			return;
		}

		out.println("\n==========================================================");

		// Security.addProvider(new BouncyCastleProvider());

		HsmManager.login();
		HsmManager.setSecretKeysExtractable(true);
		out.println("\n");
		// KeyGenerator kg = KeyGenerator.getInstance("AES", "LunaProvider");
		// kg.init(128);


		WrapPrivateKey me = new WrapPrivateKey();
		
		me.wmk = (LunaSecretKey) HsmManager.getSavedKey(KEK_ALIAS);
		out.println("wmk:" + me.wmk + ", length=" + me.wmk.getEncoded().length * 8);
		// Conecta a la BD
		me.con = DriverManager.getConnection("jdbc:postgresql://" + me.host + "/" + me.nameDB, me.usuarioDB,
				me.passwdDB);

		me.setIdCertificado(new Integer(args[0]));
		if (!me.loadCertificado(me.con, me.getIdCertificado()))
			me.loadCertificado(args[1], args[2]);

		me.print(me.getPrivateKey());
		out.println("Class of PrivateKey: " + me.getPrivateKey().getClass());

		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "LunaProvider");
		AlgorithmParameters algParams = AlgorithmParameters.getInstance("IV", "LunaProvider");
		algParams.init(new IvParameterSpec(new byte[16]));
		cipher.init(Cipher.WRAP_MODE, me.wmk, algParams);

		byte[] wrappedKey = cipher.wrap(me.getPrivateKey());
		out.println("wrappedKey:" + wrappedKey.length);
		me.savePrivateKeyWrapped(wrappedKey);

		HsmManager.logout();
		me.con.close();
	}

	private boolean loadCertificado(Connection con, int idCert) throws Exception {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String cSql = "SELECT alias, certificado_base64, clave, llave_privada FROM certificado WHERE id=?";
			ps = con.prepareStatement(cSql);
			ps.setInt(1, idCert);
			rs = ps.executeQuery();

			if (!rs.next())
				return false;

			byte [] wrpKey = rs.getBytes("llave_privada");
			if(wrpKey!=null) {
				Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "LunaProvider");
				AlgorithmParameters algParams = AlgorithmParameters.getInstance("IV", "LunaProvider");
				algParams.init(new IvParameterSpec(new byte[16]));
				cipher.init(Cipher.UNWRAP_MODE, this.wmk, algParams);
				
				Key unwrappedExtractableKey = cipher.unwrap(wrpKey, "RSA", Cipher.PRIVATE_KEY);
				print((PrivateKey) unwrappedExtractableKey);
				throw new Exception("Llave ya está wrapeada OK");
			}
			
			Utilidades u = new Utilidades();

			setAliasCert(rs.getString("alias"));
			String certB64 = rs.getString("certificado_base64");
			byte[] certContent = u.base64Decode(certB64);
			String clave = u.desencriptar(rs.getString("clave"));

			out.println(getAliasCert());
			out.println(clave);
			out.println(certB64.length() + " - " + certContent.length);

			try {
				KeyStore p12 = KeyStore.getInstance("pkcs12");
				p12.load(new ByteArrayInputStream(certContent), clave.toCharArray());
				setPrivateKey((PrivateKey) p12.getKey(getAliasCert(), clave.toCharArray()));
				setCertificate(p12.getCertificate(getAliasCert()));
			} catch (Exception e) {
				return false;
			}

			return true;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			out.print("error al leer certificado:" + idCert + "\n" + e.getMessage());
			throw e;
		} finally {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
		}
	}

	private void loadCertificado(String filename, String clave) throws KeyStoreException, NoSuchAlgorithmException,
			CertificateException, IOException, UnrecoverableKeyException {
		File f = new File(filename);
		FileInputStream fis = new FileInputStream(f);

		KeyStore p12 = KeyStore.getInstance("pkcs12");
		p12.load(fis, clave.toCharArray());
		fis.close();

		Enumeration<String> e = p12.aliases();
		while (e.hasMoreElements()) {
			setAliasCert(e.nextElement());
		}
		setPrivateKey((PrivateKey) p12.getKey(getAliasCert(), clave.toCharArray()));
		setCertificate(p12.getCertificate(getAliasCert()));
	}

	private boolean savePrivateKeyWrapped(byte[] wrpKey) throws Exception {
		PreparedStatement ps = null;
		try {
			String cSql = "UPDATE certificado SET llave_privada=? WHERE id=?";
			ps = con.prepareStatement(cSql);
			ps.setBytes(1, wrpKey);
			ps.setInt(2, getIdCertificado());
			ps.execute();
			return true;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			out.print("error al leer certificado:" + idCert + "\n" + e.getMessage());
			throw e;
		} finally {
			if (ps != null)
				ps.close();
		}

	}

	public void print(LunaPrivateKeyRsa k) {
		out.println("Class:" + k.getClass().getName());
		out.println("Modulus:" + k.getModulus().toString());
		// out.println("Exponent:" + k.getPrivateExponent().toString());
	}

	public void print(PrivateKey k) {
		out.println("Class:" + k.getClass().getName());
		RSAPrivateKey rsaKey = (RSAPrivateKey) k;
		out.println("Modulus:" + rsaKey.getModulus().toString());
		out.println("Exponent:" + rsaKey.getPrivateExponent().toString());
	}

	private static String getHex(byte array[]) {
		return "0x" + LunaUtils.getHexString(array, false).toUpperCase();
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public PrivateKey getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(PrivateKey privateKey) {
		this.privateKey = privateKey;
	}

	public String getAliasCert() {
		return aliasCert;
	}

	public void setAliasCert(String alias) {
		this.aliasCert = alias;
	}

	public Integer getIdCertificado() {
		return idCert;
	}

	public void setIdCertificado(Integer idCert) {
		this.idCert = idCert;
	}

}
