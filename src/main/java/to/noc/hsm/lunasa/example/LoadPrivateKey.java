package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

import org.apache.axis.encoding.Base64;

import com.safenetinc.luna.LunaUtils;

public class LoadPrivateKey {
	private static final String KEK_ALIAS = "MSP_WK";

	// private static final byte[] FIXED_128BIT_IV_FOR_TESTS =
	// LunaUtils.hexStringToByteArray("DEADD00D8BADF00DDEADBABED15EA5ED");

	public static void main(String[] args) throws Exception {
		HsmManager.login();

		byte[] bin = loadFromFile("/home/firmador/keys/wrappedKeyBin.b64");
		byte[] material = loadFromFile("/home/firmador/keys/wrappedKeyMaterial.b64");

		HsmManager.login();
		HsmManager.setSecretKeysExtractable(true);
		SecretKey wmk = (SecretKey) HsmManager.getSavedKey(KEK_ALIAS);
		out.println("\nŧMaster KEY");
		out.println(wmk);
		out.println("\n\tBIN");
		out.println(getHex(bin));
		out.println("\n\tMATERIAL");
		out.println(getHex(material));
		out.println();
		
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "LunaProvider");
		// cipher.init(Cipher.WRAP_MODE, wmk);
		AlgorithmParameters algParams = AlgorithmParameters.getInstance("IV", "LunaProvider");
		algParams.init(new IvParameterSpec(new byte[16]));
		cipher.init(Cipher.UNWRAP_MODE, wmk, algParams);
		
		Key unwrappedExtractableKey = cipher.unwrap(bin, "RSA/PKCS8", Cipher.SECRET_KEY);
		out.println(getHex(unwrappedExtractableKey.getEncoded()));

		Key unwrappedExtractableKey2 = cipher.unwrap(material, "AES", Cipher.SECRET_KEY);
		out.println(getHex(unwrappedExtractableKey2.getEncoded()));

	}

	private static String getHex(byte array[]) {
		return "0x" + LunaUtils.getHexString(array, false).toUpperCase();
	}

	private static byte[] loadFromFile(String cNombreAcrh)
			throws NoSuchAlgorithmException, CertificateException, IOException, KeyStoreException {
		String contentB64 = new String(Files.readAllBytes(Paths.get(cNombreAcrh)));
		return Base64.decode(contentB64);
	}
}
