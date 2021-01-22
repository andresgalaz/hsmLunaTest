package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPrivateKey;
import java.util.Enumeration;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import com.safenetinc.luna.provider.key.LunaPrivateKeyRsa;
import com.safenetinc.luna.provider.key.LunaSecretKey;

public class SavePrivateKey {
	private static KeyStore keyStore;
	private static boolean bHayHsm = true;
	private Certificate certificate;
	private PrivateKey privateKey;
	private String alias;

	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			out.println("Faltan argumentos. Modo de uso:");
			out.println("\t-c <alias>       # crea la KEK con el <alias>");
			out.println("\t-v <alias>       # verifica si existe la KEK");
			return;
		}
		if ("-c".equalsIgnoreCase(args[0])) {
			// Crea una KEK
			creaKek(args[1]);
			return;
		}
		if ("-v".equalsIgnoreCase(args[0])) {
			// Crea una KEK
			verificaKek(args[1]);
			return;
		}
		if (true) {
			out.println("Se esperaban dos un parámetros: archivo y password");
			return;
		}
		SavePrivateKey me = new SavePrivateKey();

		if (bHayHsm) {
			HsmManager.login();
			HsmManager.setSecretKeysExtractable(true);
			keyStore = KeyStore.getInstance("Luna");
			keyStore.load(null, null);
		}

		out.println("\n");
		me.loadCertificado(args[0], args[1]);
		out.println("alias:" + me.getAlias());
		me.print(me.getPrivateKey());

		// Limpia
		deleteKey(me.getAlias());
		deleteKey(me.getAlias() + "_M");
		deleteKey(me.getAlias() + "_E");
		// Graba
		saveKey(me.getAlias(), me.getPrivateKey(), new Certificate[] { me.getCertificate() });

		// Recupera
		LunaPrivateKeyRsa kLoc = (LunaPrivateKeyRsa) getSavedKey(me.getAlias());
		me.print(kLoc);

		Certificate cer = keyStore.getCertificate(me.getAlias());
		out.println(cer);

		HsmManager.logout();
	}

	private static void creaKek(String alias) throws Exception {
		HsmManager.login();
		HsmManager.setSecretKeysExtractable(true);
		if (HsmManager.hasSavedKey(alias)) {
			out.println("Borrando alias existente:" + alias);
			HsmManager.deleteKey(alias);
		}
		KeyGenerator kg = KeyGenerator.getInstance("AES", "LunaProvider");
		kg.init(256);

		LunaSecretKey kek = (LunaSecretKey) kg.generateKey();
		HsmManager.saveKey(alias, kek);
		out.println("Se crea y lamacena KEK en forma existosa con el alias:" + alias);
		out.println(kek);

	}

	private static void verificaKek(String alias) throws Exception {
		HsmManager.login();
		HsmManager.setSecretKeysExtractable(true);
		if (HsmManager.hasSavedKey(alias)) {
			out.println("KEK no existe con:" + alias);
			return;
		}
		SecretKey kek = (SecretKey) HsmManager.getSavedKey(alias);
		out.println(kek);
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
		setPrivateKey((PrivateKey) p12.getKey(getAlias(), clave.toCharArray()));
		setCertificate(p12.getCertificate(getAlias()));
	}

	public static void deleteKey(String alias) throws KeyStoreException {
		if (bHayHsm)
			keyStore.deleteEntry(alias);
	}

	public static void saveKey(String alias, Key key, Certificate[] chain) throws KeyStoreException {
		keyStore.setKeyEntry(alias, key, null, chain);
	}

	public static Key getSavedKey(String alias)
			throws UnrecoverableEntryException, NoSuchAlgorithmException, KeyStoreException {
		return keyStore.getKey(alias, null);
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
