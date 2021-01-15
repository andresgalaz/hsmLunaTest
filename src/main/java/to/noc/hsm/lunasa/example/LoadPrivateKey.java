package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Enumeration;

public class LoadPrivateKey {
	public static void main(String[] args) throws Exception {
		// Load input stream into keystore
		File fJks = new File("/home/firmador/keys/keystore.jks");
		String password = "serverpwd";
		FileInputStream is = new FileInputStream(fJks);

		KeyStore ks = KeyStore.getInstance("Luna");

		ks.load(is, password.toCharArray());

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

		PrivateKey privateKey = get("/mnt/hdd/agalaz/Descargas/localhost.key");
		String cModulus = ((RSAPrivateCrtKey) privateKey).getModulus().toString();
		String cExponent = ((RSAPrivateCrtKey) privateKey).getPublicExponent().toString();
		out.println(cModulus);
		out.println(cExponent);
	}

	public static PrivateKey get(String filename) throws Exception {

		byte[] keyBytes = Files.readAllBytes(Paths.get(filename));

		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");

		return kf.generatePrivate(spec);
	}
}
