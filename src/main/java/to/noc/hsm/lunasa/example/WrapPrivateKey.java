package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Security;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPrivateKey;
import java.util.Enumeration;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.safenetinc.luna.LunaUtils;
import com.safenetinc.luna.provider.key.LunaPrivateKeyRsa;

public class WrapPrivateKey {
	private Certificate certificate;
	private PrivateKey privateKey;
	private String alias;
	// private static final byte[] FIXED_128BIT_IV_FOR_TESTS =
	// LunaUtils.hexStringToByteArray("DEADD00D8BADF00DDEADBABED15EA5ED");
	private static final String KEK_ALIAS = "MSP_WK";

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			out.println("\n==========================================================");
			out.println("Se esperaban dos un parámetros: archivo y password");
			return;
		}
		out.println("\n==========================================================");

		Security.addProvider(new BouncyCastleProvider());
		
		HsmManager.login();
		// HsmManager.setSecretKeysExtractable(true);
		SecretKey wmk = (SecretKey) HsmManager.getSavedKey(KEK_ALIAS);

		WrapPrivateKey me = new WrapPrivateKey();
		out.println("\n");
		me.loadCertificado(args[0], args[1]);
		out.println("alias:" + me.getAlias());
		me.print(me.getPrivateKey());
		out.println("Class of PrivateKey: " + me.getPrivateKey().getClass());

		// Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "LunaProvider");
		// Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256ANDMGF1Padding",
		// "LunaProvider");
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS5Padding", "BC");
		// cipher.init(Cipher.WRAP_MODE, wmk);
		// AlgorithmParameters algParams = AlgorithmParameters.getInstance("IV",
		// "LunaProvider");
		// algParams.init(new IvParameterSpec(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		// 0, 0, 0, 0, 0, 0 }));
		cipher.init(Cipher.WRAP_MODE, wmk );
		// , new IvParameterSpec(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }));

		byte[] b1 = cipher.wrap(me.getPrivateKey());
		out.println(getHex(b1));

		HsmManager.logout();
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
			setAlias(e.nextElement());
		}
		setPrivateKey((PrivateKey) p12.getKey(getAlias(), clave.toCharArray()));
		setCertificate(p12.getCertificate(getAlias()));
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

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}
