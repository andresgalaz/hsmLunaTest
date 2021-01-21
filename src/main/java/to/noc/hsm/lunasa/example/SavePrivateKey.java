package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.util.Enumeration;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;

import com.safenetinc.luna.LunaUtils;

public class SavePrivateKey {
	private static KeyStore keyStore;
	private Certificate certificate;
	private Key privateKey;
	private String alias;
	
    private static final IvParameterSpec FIXED_128BIT_IV_FOR_TESTS = new IvParameterSpec(
            LunaUtils.hexStringToByteArray("DEADD00D8BADF00DDEADBABED15EA5ED")
    );
	

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			out.println("Se esperaban dos un parámetros: archivo y password");
			return;
		}
		SavePrivateKey me = new SavePrivateKey();

		HsmManager.login();
		HsmManager.setSecretKeysExtractable(true);
		
		keyStore = KeyStore.getInstance("Luna");
		keyStore.load(null, null);
		

		out.println("\n");
		me.loadCertificado(args[0], args[1]);
		out.println("alias:" + me.getAlias());
		me.print(me.getPrivateKey());

		// Limpia
		deleteKey(me.getAlias());
		// Graba
		saveKey(me.getAlias(), me.getPrivateKey(), new Certificate[] { me.getCertificate() });
		// Recupera
		Key k0 = keyStore.getKey(me.getAlias(), null);
		me.print(k0);

		Key kLoc = getSavedKey(me.getAlias());		
		me.print(kLoc);

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

	public static void deleteKey(String alias) throws KeyStoreException {
		keyStore.deleteEntry(alias);
	}
	
	public static void saveKey(String alias, Key key, Certificate[] chain) throws KeyStoreException {
		keyStore.setKeyEntry(alias, key, null, chain);
	}
	
	public static Key getSavedKey(String alias)
			throws UnrecoverableEntryException, NoSuchAlgorithmException, KeyStoreException {
		return keyStore.getKey(alias, null);
	}
	
	public void print(Key k) {
		out.println("Class:" + k.getClass().getName());
		RSAPrivateCrtKey rsaKey = (RSAPrivateCrtKey) k;
		out.println("Modulus:" + rsaKey.getModulus().toString());
		out.println("Exponent:" + rsaKey.getPublicExponent().toString());
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
