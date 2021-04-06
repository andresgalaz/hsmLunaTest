package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.ByteArrayOutputStream;
import java.io.StringWriter;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

import com.safenetinc.luna.provider.key.LunaPrivateKeyRsa;
import com.safenetinc.luna.provider.key.LunaSecretKey;

public class CertificateFromHSM2DB {
	private static KeyStore keyStore;
	private Certificate[] certificate;
	private PrivateKey privateKey;
	private String aliasHSM;
	private Integer idCertificado;
	private String password;
	private static final String KEK_ALIAS = "MSP_WK_256";
	private static Connection con;
	private static LunaSecretKey wrapMasterKey;

	/**
	 * Recuperaun certificado desde el HSM. Recibe un parámetros como
	 * arguentos:Alias HSM y Alias del Certificado
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		if (args.length != 3) {
			out.println("Error en argumentos. Se requiere:");
			out.println("\tAlias certificado almacenado en el HSM");
			out.println("\tID registro tabla Certificado");
			out.println("\tPassword Certificado");
			return;
		}
		// Conecta a la BD
		String host = "localhost:5432";
		String nameDB = "firmador";
		String usuarioDB = "firmador";
		String passwdDB = "desa";
		con = DriverManager.getConnection("jdbc:postgresql://" + host + "/" + nameDB, usuarioDB, passwdDB);

		CertificateFromHSM2DB me = new CertificateFromHSM2DB();
		me.setAliasHSM(args[0]);
		me.setIdCertificado(args[1]);
		me.setPassword(args[2]);

		if (me.getIdCertificado() == null)
			return;

		HsmManager.login();
		HsmManager.setSecretKeysExtractable(true);
		keyStore = KeyStore.getInstance("Luna");
		keyStore.load(null, null);
		wrapMasterKey = (LunaSecretKey) HsmManager.getSavedKey(KEK_ALIAS);

		out.println("wmk:" + wrapMasterKey + ", length=" + wrapMasterKey.getEncoded().length);
		out.println("\n");

		out.println("alias HSM:" + me.getAliasHSM());
		out.println("ID Certificado:" + me.getIdCertificado());
		// Recupera
		LunaPrivateKeyRsa kLoc = (LunaPrivateKeyRsa) getSavedKey(me.getAliasHSM());
		me.setPrivateKey(kLoc);
		me.setCertificate(keyStore.getCertificateChain(me.getAliasHSM()));
		me.print();

		me.updateCertificado();
		con.commit();

		HsmManager.logout();
	}

	private static Key getSavedKey(String alias)
			throws UnrecoverableEntryException, NoSuchAlgorithmException, KeyStoreException {
		return keyStore.getKey(alias, null);
	}

	private void print() {
		LunaPrivateKeyRsa k = (LunaPrivateKeyRsa) getPrivateKey();
		if (k == null) {
			out.println("No hay certificado definido para alias:" + getAliasHSM());
			return;
		}
		Certificate[] cerChain = getCertificate();
		out.println("Class:" + k.getClass().getName());
		out.println("Modulus:" + k.getModulus().toString());
		out.println("Cadena:" + cerChain.length);
		out.println(cerChain[0]);
	}

	private boolean updateCertificado() throws Exception {
		Utilidades u = new Utilidades();

		PreparedStatement ps = null;
		try {
			String cSql = "UPDATE certificado SET llave_privada=?, certificado_base64=? WHERE id=?";
			ps = con.prepareStatement(cSql);
			ps.setString(1, u.base64Encode(wrapPrivateKey()));
			ps.setString(2, getCertificadoPEM());
			ps.setInt(3, getIdCertificado());
			ps.execute();
			return true;
		} catch (SQLException e) {
			throw e;
		} catch (Exception e) {
			out.print("error al leer certificado:" + getIdCertificado() + "\n" + e.getMessage());
			throw e;
		} finally {
			if (ps != null)
				ps.close();
		}
	}

	private String getCertificadoPEM() throws Exception {
		Utilidades u = new Utilidades();
		StringWriter sw = new StringWriter();
		for (int i = 0; i < getCertificate().length; i++) {
			sw.write("-----BEGIN CERTIFICATE-----\n");
			sw.write(u.base64Encode(getCertificate()[i].getEncoded()).replaceAll("(.{64})", "$1\n"));
			sw.write("\n-----END CERTIFICATE-----\n");
		}
		out.println(sw.toString());
		return sw.toString();
	}

	@SuppressWarnings("unused")
	private byte[] getCertificadoP12() throws Exception {
		KeyStore p12 = KeyStore.getInstance("pkcs12");
		p12.load(null, null);
		p12.setKeyEntry(getAliasHSM(), getPrivateKey(), getPassword().toCharArray(), getCertificate());
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		p12.store(bos, getPassword().toCharArray());
		return bos.toByteArray();
	}

	private byte[] wrapPrivateKey() throws Exception {
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "LunaProvider");
		AlgorithmParameters algParams = AlgorithmParameters.getInstance("IV", "LunaProvider");
		algParams.init(new IvParameterSpec(new byte[16]));
		cipher.init(Cipher.WRAP_MODE, wrapMasterKey, algParams);

		byte[] wrappedKey = cipher.wrap(getPrivateKey());
		out.println("wrappedKey:" + wrappedKey.length);
		return wrappedKey;
	}

	public Certificate[] getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate[] certificate) {
		this.certificate = certificate;
	}

	public PrivateKey getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(PrivateKey privateKey) {
		this.privateKey = privateKey;
	}

	public String getAliasHSM() {
		return aliasHSM;
	}

	public void setAliasHSM(String aliasHSM) {
		this.aliasHSM = aliasHSM;
	}

	public Integer getIdCertificado() {
		return idCertificado;
	}

	private void setIdCertificado(String cId) {
		try {
			setIdCertificado(Integer.valueOf(cId));
		} catch (Exception e) {
			out.println("Id certificado no es numérico:" + cId);
		}
	}

	public void setIdCertificado(Integer idCertificado) {
		this.idCertificado = idCertificado;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
