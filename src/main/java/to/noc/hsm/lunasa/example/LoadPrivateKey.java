package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidParameterSpecException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

import org.apache.axis.encoding.Base64;

import com.safenetinc.luna.LunaUtils;

public class LoadPrivateKey {
	private static final String KEK_ALIAS = "MSP_WK";
	private static Connection con;
	private static String host = "10.77.40.52:5432";
	private static String nameDB = "banco_ke";
	private static String usuarioDB = "firmador";
	private static String passwdDB = "CeNtoNtu";

	// private static final byte[] FIXED_128BIT_IV_FOR_TESTS =
	// LunaUtils.hexStringToByteArray("DEADD00D8BADF00DDEADBABED15EA5ED");

	public static void main(String[] args) throws Exception {
		con = DriverManager.getConnection("jdbc:postgresql://" + host + "/" + nameDB, usuarioDB, passwdDB);
		HsmManager.login();
		HsmManager.setSecretKeysExtractable(true);
		SecretKey wmk = (SecretKey) HsmManager.getSavedKey(KEK_ALIAS);

		procesa(con, wmk);

		byte[] bin = loadFromFile("/home/firmador/keys/bin.b64");
		byte[] material = loadFromFile("/home/firmador/keys/material.b64");

		out.println("\nŧMaster KEY");
		out.println(wmk);
		out.println("\n\tBIN");
		out.println(getHex(bin));
		out.println("\n\tMATERIAL");
		out.println(getHex(material));
		out.println();

		// Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding", "LunaProvider");
		Cipher cipher = Cipher.getInstance("AESWrap/PKCS5Padding", "LunaProvider");
		// cipher.init(Cipher.WRAP_MODE, wmk);
		AlgorithmParameters algParams = AlgorithmParameters.getInstance("IV", "LunaProvider");
		algParams.init(new IvParameterSpec(new byte[16]));
		cipher.init(Cipher.UNWRAP_MODE, wmk, algParams);

		Key unwrappedExtractableKey = cipher.unwrap(bin, "AES", Cipher.SECRET_KEY);
		out.println(getHex(unwrappedExtractableKey.getEncoded()));

		Key unwrappedExtractableKey2 = cipher.unwrap(material, "RSA", Cipher.SECRET_KEY);
		out.println(getHex(unwrappedExtractableKey2.getEncoded()));

	}

	private static void procesa(Connection con, SecretKey wmk) throws Exception {
		out.println("\nMaster KEY");
		out.println(wmk);

//		Cipher.AES/CBC/PKCS5Padding
//		Cipher.AES/CBC/NoPadding
//		Cipher.AES/ECB/NoPadding
//		Cipher.DES/CBC/NoPadding
//		Cipher.DES/CBC/PKCS5Padding
//		Cipher.DES/ECB/NoPadding
//		Cipher.DES3/CBC/NoPadding
//		Cipher.DES3/CBC/PKCS5Padding
//		Cipher.DES3/ECB/NoPadding
//		Cipher.DESede/CBC/NoPadding
//		Cipher.DESede/CBC/PKCS5Padding
//		Cipher.DESede/ECB/NoPadding
//		Cipher.PBEWithMD2AndDES
//		Cipher.PBEWithMD2AndDES/CBC/PKCS5Padding
//		Cipher.PBEWithMD5AndDES
//		Cipher.PBEWithMD5AndDES/CBC/PKCS5Padding
//		Cipher.PBEWithSHA1AndDESede
//		Cipher.PBEWithSHA1AndDESede/CBC/PKCS5Padding
//		Cipher.RC2/CBC/NoPadding
//		Cipher.RC2/CBC/PKCS5Padding
//		Cipher.RC2/ECB/NoPadding
//		Cipher.RC4/NONE/NoPadding
//		Cipher.RC5/CBC/NoPadding
//		Cipher.RC5/CBC/PKCS5Padding
//		Cipher.RC5/ECB/NoPadding
//		Cipher.RSA/*/NoPadding
//		Cipher.RSA/*/OAEPWithSHA1AndMGF1Padding
//		Cipher.RSA/*/PKCS1v1_5 
		Cipher cipher = Cipher.getInstance("RC4/NONE/NoPadding", "LunaProvider");
		AlgorithmParameters algParams = AlgorithmParameters.getInstance("IV", "LunaProvider");
		algParams.init(new IvParameterSpec(new byte[16]));

		cipher.init(Cipher.UNWRAP_MODE, wmk, algParams);
//		cipher.init(Cipher.UNWRAP_MODE, wmk, new IvParameterSpec(new byte[16]));
//		cipher.init(Cipher.UNWRAP_MODE, wmk);


		String cSql = "SELECT id, lo_get(bin) bin, lo_get(material) material \n" //
				+ " FROM  public.luna_key \n" //
				+ " WHERE key_type='wrapped' " //
				+ " AND   id > 9999 \n" //
				+ " ORDER BY random() LIMIT 25";
		PreparedStatement ps = con.prepareStatement(cSql);
		ResultSet rs = ps.executeQuery();
		try {
//			String espacio = "                                                      ";
			while (rs.next()) {
				int id = rs.getInt("id");
				String sBin = rs.getString("bin");
				String sMaterial = rs.getString("material");

				out.println("id:" + id + ", bin[" + sBin.length() + "]:"
						+ new String(Base64.encode(sBin.getBytes())).substring(0, 20) + ", material["
						+ sMaterial.length() + "]:" + new String(Base64.encode(sMaterial.getBytes())) + "|"
						+ getHex(sMaterial.getBytes()));

//				byte[] bin = new byte[20]; // sBin.length() - offset];
//				for (int offset = 0; offset < 10; offset++) {
//					System.arraycopy(sBin.getBytes(), offset, bin, 0, bin.length);
//					out.println("offset:" + offset + ", bin:" + espacio.substring(0, offset * 2 + 1)
//							+ getHex(sBin.substring(offset, 20).getBytes()) + "|" + espacio.substring(0, offset * 2 + 1)
//							+ getHex(bin));
//				}

//				int offset = 0;
//				byte[] bin = new byte[sBin.length() - offset];
//				System.arraycopy(sBin.getBytes(), offset, bin, 0, bin.length);
//				bin = Base64.decode(sBin.substring(offset));

				try {
					Key unwrappedBin = cipher.unwrap(sBin.getBytes(), "RSA", Cipher.SECRET_KEY);
					out.println(getHex(unwrappedBin.getEncoded()));
				} catch (Exception e) {
					out.println(e.getMessage());
				}
				try {
					Key unwrappedBin = cipher.unwrap(sBin.getBytes(), "AES", Cipher.SECRET_KEY);
					out.println(getHex(unwrappedBin.getEncoded()));
				} catch (Exception e) {
					out.println(e.getMessage());
				}
				Key unwrappedMaterial = cipher.unwrap(sMaterial.getBytes(), "AES", Cipher.SECRET_KEY);
				out.println(getHex(unwrappedMaterial.getEncoded()));

			}
		} finally {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
		}
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
