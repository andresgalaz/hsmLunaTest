package to.noc.hsm.lunasa.example;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import static java.lang.System.out;

public class SavePrivateKey {

	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			out.println("Se esperaba un parámetro como nombre de archivo");
			return;
		}
		HsmManager.login();
		Key k = getPrivateKey(args[0]);
		HsmManager.saveKey("agalaz", k);
		HsmManager.logout();
	}

	public static PrivateKey getPrivateKey(String filename) throws Exception {
		File f = new File(filename);
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		byte[] keyBytes = new byte[(int) f.length()];
		dis.readFully(keyBytes);
		dis.close();
		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePrivate(spec);
	}

}
