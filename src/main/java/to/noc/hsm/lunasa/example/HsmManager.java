package to.noc.hsm.lunasa.example;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.UnrecoverableEntryException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Properties;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.axis.encoding.Base64;

import com.safenetinc.luna.LunaSlotManager;

/*
 *  This class looks for a file named "partition.properties" in the current
 *  user's home directory.  The file needs the following two properties:
 *
 *    partitionName = YourPartitionName
 *    partitionPass = PasswordForYourTestPartition
 *
 */
public class HsmManager {
	private static final LunaSlotManager slotManager;
	private static KeyStore keyStore;
	private static String partitionName;
	private static String partitionPass;
	private static final boolean bDebug = false;
	private static final String KEY_AES = "j11*ZCZSRg@KS.cl";

	static {
		if (bDebug) {
			slotManager = null;
		} else {
			Security.addProvider(new com.safenetinc.luna.provider.LunaProvider());
			slotManager = LunaSlotManager.getInstance();
		}

		Properties prop = new Properties();
		try {
			File propFile = new File(System.getProperty("user.home"), "partition.properties");
			InputStream in = new FileInputStream(propFile);
			prop.load(in);
			in.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		partitionName = prop.getProperty("partitionName");
		partitionPass = prop.getProperty("partitionPass");
		try {
			partitionPass = desencriptar(partitionPass);
		} catch (Exception e) {
		}

		paramsDesdeConsola();

		if (partitionName == null || partitionPass == null) {
			System.err.println("Aborting, mandatory properties not set");
			System.exit(-1);
		}
	}

	public static void login() throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException {
		slotManager.login(partitionName, partitionPass);
		keyStore = KeyStore.getInstance("Luna");
		keyStore.load(null, null);
	}

	public static void logout() {
		slotManager.logout();
		keyStore = null;
	}

	public static boolean hasSavedKey(String alias) throws KeyStoreException {
		// I think the second check alone is sufficient
		return keyStore.containsAlias(alias) && keyStore.isKeyEntry(alias);
	}

	public static Key getSavedKey(String alias)
			throws UnrecoverableEntryException, NoSuchAlgorithmException, KeyStoreException {
		return keyStore.getKey(alias, null);
	}

	public static void saveKey(String alias, Key key) throws KeyStoreException {
		keyStore.setKeyEntry(alias, key, null, null);
	}

	public static void saveRsaKey(String alias, Key key, Certificate[] chain) throws KeyStoreException {
		keyStore.setKeyEntry(alias, key, null, chain);
	}

	public static void deleteKey(String alias) throws KeyStoreException {
		keyStore.deleteEntry(alias);
	}

	public static void setSecretKeysExtractable(boolean isExtractable) {
		slotManager.setSecretKeysExtractable(isExtractable);
	}

	public static void main(String[] args) throws Exception {
		// Testing
		System.out.println("Testing OK:");
		System.out.println("\t" + partitionName);
		System.out.println("\t" + partitionPass);
	}

	private static void paramsDesdeConsola() {
		boolean bHayCambios = false;
		String cLn = readLine("Ingrese nombre de la partición [" + partitionName + "]: ");
		if (cLn != null) {
			bHayCambios |= (partitionName != cLn);
			partitionName = cLn;
		}
		cLn = readPassword("Ingrese contraseña de la partición [*********]: ");
		if (cLn != null) {
			bHayCambios |= (partitionPass != cLn);
			partitionPass = cLn;
		}
		if (bHayCambios) {
			Properties prop = new Properties();

			prop.setProperty("partitionName", partitionName);
			try {
				prop.setProperty("partitionPass", encriptar(partitionPass));
			} catch (Exception e) {
				System.err.println("No se puedo almacenar la contraseña:" + e.getMessage());
			}

			File propFile = new File(System.getProperty("user.home"), "partition.properties");
			try {
				prop.store(new FileOutputStream(propFile), "Testing HSM Wrapping");
			} catch (IOException ex) {
				System.err.println(ex.getMessage());
			}
		}
	}

	private static String readLine(String prompt) {
		return readLine(prompt, false);
	}

	private static String readPassword(String prompt) {
		return readLine(prompt, true);
	}

	private static String readLine(String prompt, boolean isPassword) {
		String line = null;
		Console c = System.console();
		if (c != null) {
			if (isPassword)
				line = String.valueOf(c.readPassword(prompt));
			else
				line = c.readLine(prompt);
		} else {
			System.out.print(prompt);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			try {
				line = bufferedReader.readLine();
			} catch (IOException e) {
				// Ignore
			}
		}
		if (line != null) {
			line = line.trim();
			if (line.length() == 0)
				line = null;
		}
		return line;
	}

	private static byte[] decrypt(byte[] encrypted, String keyAes)
			throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		byte[] original = null;
		Cipher cipher = null;
		byte[] raw = keyAes.getBytes();
		Key key = new SecretKeySpec(raw, "AES");
		cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		// the block size (in bytes), or 0 if the underlying algorithm is not a block
		// cipher
		byte[] ivByte = new byte[cipher.getBlockSize()];
		// This class specifies an initialization vector (IV). Examples which use IVs
		// are ciphers in feedback mode, e.g., DES in CBC mode and RSA ciphers with OAEP
		// encoding operation.
		IvParameterSpec ivParamsSpec = new IvParameterSpec(ivByte);
		cipher.init(Cipher.DECRYPT_MODE, key, ivParamsSpec);
		original = cipher.doFinal(encrypted);

		return original;
	}

	private static byte[] encrypt(byte[] value, String keyAes) throws NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		byte[] encrypted = null;
		byte[] raw = keyAes.getBytes();
		Key skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] iv = new byte[cipher.getBlockSize()];
		IvParameterSpec ivParams = new IvParameterSpec(iv);
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParams);
		encrypted = cipher.doFinal(value);
		return encrypted;
	}

	public static String desencriptar(String b64)
			throws InvalidKeyException, UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException,
			InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		return new String(decrypt(Base64.decode(b64), KEY_AES), "UTF-8");
	}

	public static String encriptar(String anyString) throws InvalidKeyException, NoSuchAlgorithmException,
			NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		return new String(Base64.encode(encrypt(anyString.getBytes(), KEY_AES)));
	}

	public String inputStreamToBase64(InputStream in) throws IOException {
		byte[] certByte = new byte[20];
		return Base64.encode(certByte);
	}

	public static KeyStore loadKey(FileInputStream is) throws NoSuchAlgorithmException, CertificateException, IOException {
		keyStore.load(is, partitionPass.toCharArray());
		return keyStore;
	}
	
}
