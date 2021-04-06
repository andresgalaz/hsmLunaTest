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
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPrivateKey;
import java.util.Enumeration;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import com.safenetinc.luna.LunaAPI;
import com.safenetinc.luna.LunaTokenObject;
import com.safenetinc.luna.provider.key.LunaSecretKey;

public class CertficateSaveHSM {
	private static KeyStore keyStore;
	private static boolean bHayHsm = true;
	private Certificate[] certificate;
	private PrivateKey privateKey;
	private String aliasCertificado;
	private String aliasHSM;
	private static final String KEK_ALIAS = "MSP_WK_256";

	/**
	 * Graba certificado en el HSM. Recibe tre parámetros como arguentos: - Alias
	 * para almacenar en el HSM - ruta del archivo p12 - clave del p12
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		if (args.length != 3) {
			out.println("Error en argumentos. Se requiere:");
			out.println("\tAlias para almacenar en el HSM");
			out.println("\tRuta y nombre p12");
			out.println("\tContraseña del p12");
			return;
		}
		String cAliasHSM = args[0];
		String cArchivoP12 = args[1];
		String cPassword = args[2];

		CertficateSaveHSM me = new CertficateSaveHSM();

		if (bHayHsm) {
			HsmManager.login();
			HsmManager.setSecretKeysExtractable(true);
			keyStore = KeyStore.getInstance("Luna");
			keyStore.load(null, null);
		}
		LunaSecretKey wmk = (LunaSecretKey) HsmManager.getSavedKey(KEK_ALIAS);

		out.println("wmk:" + wmk + ", length=" + wmk.getEncoded().length);
		out.println("\n");

		me.loadCertificado(cArchivoP12, cPassword);
		me.setAliasHSM(cAliasHSM);
		out.println("alias certificado:" + me.getAliasCertificado());
		me.print(me.getPrivateKey());

		// Limpia
		deleteKey(me.getAliasHSM());
		// Graba
		saveKey(me.getAliasHSM(), me.getPrivateKey(), me.getCertificate());

		out.println("Certificado Grabado OK");

		HsmManager.logout();
	}

	@SuppressWarnings("unused")
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

		LunaTokenObject obj = LunaTokenObject.LocateObjectByHandle(kek.GetKeyHandle());
		obj.SetBooleanAttribute(LunaAPI.CKA_ENCRYPT, false);
		obj.SetBooleanAttribute(LunaAPI.CKA_DECRYPT, false);

		HsmManager.saveKey(alias, kek);
		out.println("Se crea y lamacena KEK en forma existosa con el alias:" + alias);
		out.println(kek);
		HsmManager.logout();
	}

	@SuppressWarnings("unused")
	private static void verificaKek(String alias) throws Exception {
		HsmManager.login();
		HsmManager.setSecretKeysExtractable(true);
		if (!HsmManager.hasSavedKey(alias)) {
			out.println("KEK no existe con:" + alias);
			return;
		}
		SecretKey kek = (SecretKey) HsmManager.getSavedKey(alias);
		out.println(kek);
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
			setAliasCertificado(e.nextElement());
		}
		setPrivateKey((PrivateKey) p12.getKey(getAliasCertificado(), clave.toCharArray()));
		setCertificate(p12.getCertificateChain(getAliasCertificado()));
	}

	private static void deleteKey(String alias) throws KeyStoreException {
		if (bHayHsm)
			keyStore.deleteEntry(alias);
	}

	private static void saveKey(String alias, Key key, Certificate[] chain) throws KeyStoreException {
		keyStore.setKeyEntry(alias, key, null, chain);
	}

	private void print(PrivateKey k) {
		out.println("Class:" + k.getClass().getName());
		RSAPrivateKey rsaKey = (RSAPrivateKey) k;
		out.println("Modulus:" + rsaKey.getModulus().toString());
		out.println("Exponent:" + rsaKey.getPrivateExponent().toString());
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

	public String getAliasCertificado() {
		return aliasCertificado;
	}

	public void setAliasCertificado(String aliasCertificado) {
		this.aliasCertificado = aliasCertificado;
	}

	public String getAliasHSM() {
		return aliasHSM;
	}

	public void setAliasHSM(String aliasHSM) {
		this.aliasHSM = aliasHSM;
	}

}
