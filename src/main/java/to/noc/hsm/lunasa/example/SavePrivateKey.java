package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.util.Enumeration;

import com.safenetinc.luna.provider.key.LunaKey;

public class SavePrivateKey {
	private Certificate certificate;
	private Key privateKey;
	private String alias;

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			out.println("Se esperaban dos un parámetros: archivo y password");
			return;
		}
		SavePrivateKey me = new SavePrivateKey();

		HsmManager.login();
		HsmManager.setSecretKeysExtractable(true);

		out.println("\n");
		me.loadCertificado(args[0], args[1]);
		out.println("alias:" + me.getAlias());
		out.println("privateKey[" + me.getPrivateKey().getClass().getName() + "]:");
		me.print(me.getPrivateKey());

		// Limpia
		HsmManager.deleteKey(me.getAlias());
		// Graba
		HsmManager.saveRsaKey(me.getAlias(), me.getPrivateKey(), new Certificate[] { me.getCertificate() });
		// Recupera
		Key kLoc = LunaKey.LocateKeyByAlias(me.getAlias(), 0);
		out.println("kLoc[" + kLoc.getClass().getName() + "]:");
		RSAPrivateCrtKey k = (RSAPrivateCrtKey) kLoc;
		out.println("k[" + k.getClass().getName() + "]:");

		HsmManager.logout();

	}

	public void loadCertificado(String filename, String clave) throws KeyStoreException, NoSuchAlgorithmException,
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
		setPrivateKey(p12.getKey(getAlias(), clave.toCharArray()));
		setCertificate(p12.getCertificate(getAlias()));
	}

	public void print(Key k) {
		RSAPrivateCrtKey rsaKey = (RSAPrivateCrtKey) k;
		String cModulus = rsaKey.getModulus().toString();
		String cExponent = rsaKey.getPublicExponent().toString();
		out.println("Modulus" + cModulus);
		out.println("Exponent:" + cExponent);
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public Key getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(Key privateKey) {
		this.privateKey = privateKey;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

}
