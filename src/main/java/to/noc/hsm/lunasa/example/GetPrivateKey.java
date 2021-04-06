package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;

import com.safenetinc.luna.provider.key.LunaPrivateKeyRsa;
import com.safenetinc.luna.provider.key.LunaSecretKey;

public class GetPrivateKey {
	private static KeyStore keyStore;
	private static boolean bHayHsm = true;
	private Certificate[] certificate;
	private PrivateKey privateKey;
	private String aliasHSM;
	private static final String KEK_ALIAS = "MSP_WK_256";

	/**
	 * Recuperaun certificado desde el HSM. Recibe un parámetros como
	 * arguentos:Alias HSM y Alias del Certificado
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			out.println("Error en argumentos. Se requiere:");
			out.println("\tAlias certificado almacenado en el HSM");
			return;
		}
		GetPrivateKey me = new GetPrivateKey();
		me.setAliasHSM(args[0]);

		if (bHayHsm) {
			HsmManager.login();
			HsmManager.setSecretKeysExtractable(true);
			keyStore = KeyStore.getInstance("Luna");
			keyStore.load(null, null);
		}
		LunaSecretKey wmk = (LunaSecretKey) HsmManager.getSavedKey(KEK_ALIAS);

		out.println("wmk:" + wmk + ", length=" + wmk.getEncoded().length);
		out.println("\n");

		out.println("alias HSM:" + me.getAliasHSM());
		// Recupera
		LunaPrivateKeyRsa kLoc = (LunaPrivateKeyRsa) getSavedKey(me.getAliasHSM());
		me.setPrivateKey(kLoc);

		me.setCertificate(keyStore.getCertificateChain(me.getAliasHSM())); // Certificado());
		me.print();
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

}
