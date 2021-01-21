package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;

import com.safenetinc.luna.provider.key.LunaKey;
import com.safenetinc.luna.provider.key.LunaPrivateKeyRsa;

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

		me.loadCertificado(args[0], args[1]);
		out.println("alias:" + me.getAlias());
		out.println("privateKey[" + me.getPrivateKey().getClass().getName() + "]:");
		me.print(me.getPrivateKey());
		
		// RSAPrivateCrtKey rsaKey = (RSAPrivateCrtKey) me.getPrivateKey();
		// String cModulus = rsaKey.getModulus().toString();
		// String cExponent = rsaKey.getPublicExponent().toString();
		// me.setPrivateKey(createPrivateKey(rsaKey.getModulus(), rsaKey.getPublicExponent()));

		// Limpia
		HsmManager.deleteKey(me.getAlias());
		// Graba
		HsmManager.saveRsaKey(me.getAlias(), me.getPrivateKey(), new Certificate[] { me.getCertificate() });
		// HsmManager.saveKey(me.getAlias(), me.getPrivateKey());
		// Recupera
		LunaPrivateKeyRsa kHsm = (LunaPrivateKeyRsa) HsmManager.getSavedKey(me.getAlias());
		out.println("kHsm[" + me.getPrivateKey().getClass().getName() + "]:");
		out.println(kHsm.IsKeyPersistent());
		out.println(kHsm.getAlgorithm());
		out.println(kHsm.GetAlias());
		out.println(kHsm.getSlot());
		// out.println(kHsm.getUsageCount());
		// out.println(kHsm.getUsageLimit());
		out.println(kHsm.getModulus());
		try {
			out.println(kHsm.getPrivateExponent());
		} catch (Exception e) {
			out.println("No se pudo obtener Exponen:" + e.getMessage());
		}
		Key kLoc = LunaKey.LocateKeyByAlias(me.getAlias(), 0);
		out.println("kLoc[" + kLoc.getClass().getName() + "]:");
		
		LunaKey lunaKey = kHsm;
		out.println("lunaKey[" + me.getPrivateKey().getClass().getName() + "]:");
		out.println(lunaKey.IsKeyPersistent());
		out.println(lunaKey.getAlgorithm());
		out.println(lunaKey.GetAlias());
		out.println(lunaKey.getSlot());
		// out.println(lunaKey.getUsageCount());
		// out.println(lunaKey.getUsageLimit());
		out.println(lunaKey);

		// me.print(kHsm);
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

//	private static PrivateKey createPrivateKey(String cModulus, String cPrivateExponent)
//			throws NoSuchAlgorithmException, InvalidKeySpecException {
//		return createPrivateKey(new BigInteger(cModulus), new BigInteger(cPrivateExponent));
//	}

	private static PrivateKey createPrivateKey(BigInteger modulus, BigInteger privateExponent)
			throws NoSuchAlgorithmException, InvalidKeySpecException {
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		RSAPrivateKeySpec rsaPrivateKeySpec = new RSAPrivateKeySpec(modulus, privateExponent);
		return keyFactory.generatePrivate(rsaPrivateKeySpec);
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
