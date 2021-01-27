package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

import org.apache.axis.encoding.Base64;

import com.safenetinc.luna.LunaUtils;

public class LoadPrivateKey {
	private static final String KEK_ALIAS = "MSP_WK";

	public static void main(String[] args) throws Exception {
		HsmManager.login();

		String bin = loadFromFile("/home/firmador/keys/bin.b64");
		String material = loadFromFile("/home/firmador/keys/material.b64");

		HsmManager.login();
		HsmManager.setSecretKeysExtractable(true);
		SecretKey wmk = (SecretKey) HsmManager.getSavedKey(KEK_ALIAS);
		out.println(wmk);

		Cipher cipher = Cipher.getInstance("AES", "LunaProvider");
		// cipher.init(Cipher.WRAP_MODE, wmk);
		cipher.init(Cipher.UNWRAP_MODE, wmk);
		Key unwrappedExtractableKey = cipher.unwrap(bin.getBytes(), "AES", Cipher.SECRET_KEY);
		out.println(getHex(unwrappedExtractableKey.getEncoded()));

		Key unwrappedExtractableKey2 = cipher.unwrap(material.getBytes(), "AES", Cipher.SECRET_KEY);
		out.println(getHex(unwrappedExtractableKey2.getEncoded()));

	}

	private static String getHex(byte array[]) {
		return "0x" + LunaUtils.getHexString(array, false).toUpperCase();
	}

	private static String loadFromFile(String cNombreAcrh)
			throws NoSuchAlgorithmException, CertificateException, IOException, KeyStoreException {
		String contentB64 = new String(Files.readAllBytes(Paths.get(cNombreAcrh)));
		String content = new String(Base64.decode(contentB64), "UTF-8");
		return content;
	}
}
