package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.util.Enumeration;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

import com.safenetinc.luna.LunaUtils;
import com.safenetinc.luna.provider.key.LunaKey;

public class LoadPrivateKey {
	//
	// AES block size is 128 bits or 16 bytes. Used easy HEX values so you can plug
	// them
	// into a website like http://aes.online-domain-tools.com/ to verify encrypted
	// values.
	//
	private static final IvParameterSpec FIXED_128BIT_IV_FOR_TESTS = new IvParameterSpec(
			LunaUtils.hexStringToByteArray("DEADD00D8BADF00DDEADBABED15EA5ED"));

	public static void main(String[] args) throws Exception {
		HsmManager.login();
		// Input file keystore
		File fJks = new File("/home/firmador/keys/keystore.jks");
		FileInputStream is = new FileInputStream(fJks);

		out.println("Load from file");
		KeyStore ks = HsmManager.loadKey(is);

		// List the aliases
		Enumeration<String> aliases = ks.aliases();
		for (; aliases.hasMoreElements();) {
			String alias = aliases.nextElement();

			// Does alias refer to a private key?
			boolean b = ks.isKeyEntry(alias);

			// Does alias refer to a trusted certificate?
			b = ks.isCertificateEntry(alias);

			out.print(alias + ":");
			out.println(b);
		}

		out.println("Load wrapped from file [BIN]");
		Path path = Paths.get("/home/firmador/keys/wrappedKeyBin.b64");
		byte[] wrappedKey = Files.readAllBytes(path);

		String password = "serverpwd";
		final Key kek = (PrivateKey) ks.getKey("localhost", password.toCharArray());
		Cipher lunaAesCbcCipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "LunaProvider");
		//
		// Unwrap the key
		//
		out.println("Unwrapping ...]");
		lunaAesCbcCipher.init(Cipher.UNWRAP_MODE, kek, FIXED_128BIT_IV_FOR_TESTS);
		LunaKey unwrappedKey = (LunaKey) lunaAesCbcCipher.unwrap(wrappedKey, "AES", Cipher.SECRET_KEY);
		out.println("Unwrapped key (in clear same as original): " + getHex(unwrappedKey.getEncoded()));
	}

	private static String getHex(byte array[]) {
		return "0x" + LunaUtils.getHexString(array, false).toUpperCase();
	}

}
