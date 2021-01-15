package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Enumeration;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
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

		KeyStore ks = loadFromFile("/home/firmador/keys/keystore.jks");

		out.println("Load wrapped from file [BIN]");
		Path path = Paths.get("/home/firmador/keys/wrappedKeyBin.b64");
		byte[] wrappedKey = Files.readAllBytes(path);

		String password = "serverpwd";
		final Key kek = (PrivateKey) ks.getKey("localhost", password.toCharArray());
		// final Key kek = (PrivateKey) ks.getKey("IM_SIERRAGORDA_FEA_G1.KP", HsmManager.getPartitionPass().toCharArray());
		Cipher lunaAesCbcCipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "LunaProvider");
		//
		// Unwrap the key
		//
		out.println("Init cipher usando kek:" + kek);
		lunaAesCbcCipher.init(Cipher.UNWRAP_MODE, kek, FIXED_128BIT_IV_FOR_TESTS);
		out.println("Unwrapping ...");
		LunaKey unwrappedKey = (LunaKey) lunaAesCbcCipher.unwrap(wrappedKey, "AES", Cipher.SECRET_KEY);
		out.println("Unwrapped key (in clear same as original): " + getHex(unwrappedKey.getEncoded()));
	}

	private static String getHex(byte array[]) {
		return "0x" + LunaUtils.getHexString(array, false).toUpperCase();
	}

	private static KeyStore loadFromFile(String cNombreAcrh)
			throws NoSuchAlgorithmException, CertificateException, IOException, KeyStoreException {
		// Input file keystore
		File fJks = new File(cNombreAcrh);
		FileInputStream is = new FileInputStream(fJks);

		out.println("Load from file:" + cNombreAcrh);
		KeyStore sr = KeyStore.getInstance("JKS"); ;
		sr.load(is, "serverpwd".toCharArray());
		
		KeyStore ks = sr; // HsmManager.loadKey(is);
		is.close();

		out.println("Lista Alias");
		out.println("===========================================");
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
		out.println("===========================================");
		return ks;
	}

	private static void Unwrapp(KeyStore ks, String cNombreArch)
			throws IOException, UnrecoverableKeyException, KeyStoreException, NoSuchAlgorithmException,
			NoSuchProviderException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
		out.println("Load wrapped from file:" + cNombreArch);
		Path path = Paths.get(cNombreArch);
		byte[] wrappedKey = Files.readAllBytes(path);

		String password = "serverpwd";
		// final Key kek = (PrivateKey) ks.getKey("localhost", password.toCharArray());
		final Key kek = (PrivateKey) ks.getKey("localhost", HsmManager.getPartitionPass().toCharArray());
		Cipher lunaAesCbcCipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "LunaProvider");
		//
		// Unwrap the key
		//
		out.println("Init cipher usando kek:" + kek);
		lunaAesCbcCipher.init(Cipher.UNWRAP_MODE, kek, FIXED_128BIT_IV_FOR_TESTS);
		out.println("Unwrapping ...");
		LunaKey unwrappedKey = (LunaKey) lunaAesCbcCipher.unwrap(wrappedKey, "AES", Cipher.SECRET_KEY);
		out.println("Unwrapped key (in clear same as original): " + getHex(unwrappedKey.getEncoded()));
	}

}
