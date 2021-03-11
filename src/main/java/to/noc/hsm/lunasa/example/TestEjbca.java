package to.noc.hsm.lunasa.example;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.xml.namespace.QName;

import org.apache.axis.encoding.Base64;
import org.apache.log4j.Logger;
import org.bouncycastle.jce.PKCS10CertificationRequest;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.cesecore.certificates.util.AlgorithmConstants;
import org.cesecore.keys.util.KeyTools;
import org.ejbca.core.model.ra.UserDataConstants;
import org.ejbca.util.CertTools;

import cl.c2c.ejbca.CertificateHelper;
import cl.c2c.ejbca.CertificateResponse;
import cl.c2c.ejbca.EjbcaWS;
import cl.c2c.ejbca.EjbcaWSService;
import cl.c2c.ejbca.UserDataVOWS;
import cl.c2c.ejbca.UserMatch;

public class TestEjbca {
	private static Logger logger = Logger.getLogger(TestEjbca.class);

	private static String host = "https://10.77.40.5/";

	private static String csr = "MIIDQTCCAikCAQAwgcExJzAlBgNVBAMMHkJhbHRhemFyIE9jaGFnYXbDrWEgQmFs"
			+ "Ym9udMOtbjEPMA0GA1UEDAwGQXNlc29yMTkwNwYDVQQKDDBNaW5pc3RlcmlvIFNl"
			+ "Y3JldGFyw61hIEdlbmVyYWwgZGUgbGEgUHJlc2lkZW5jaWExCzAJBgNVBAYTAkNM"
			+ "MSgwJgYJKoZIhvcNAQkBFhlib2NoYWdhdmlhQGRpZ2l0YWwuZ29iLmNsMRMwEQYD"
			+ "VQQFEwoxODM5NTU2NS05MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA"
			+ "zQtSnbkrMAZT6rHFk33ks7UDqt0MMsqsDUilptiBJ6MoukFKIApGlliWy17koJim"
			+ "Ce+Ozk/HtrD4BJ3q7kK/BfsBhel8bTFVx/+Y3aAq981VymgfWrq9UVuVVo0rdUTc"
			+ "/Rldvqyc/gzyNZy59CeHMD1FmrDCp0rheoX98OVDP87feXfgm9m7rsjNqbIN216Z"
			+ "9RGw9z3fr59kbj4q7O9j5RYAHPXQDoGSQHwdGWaOY9nKJFbLhJHOoeohJMQOTLfv"
			+ "MleL54Wu/Cm2Eg9e9RL3aYGxqkel1ErcxQmO5IO5I+iA/wjNqaBXOgrGJxOZFVCc"
			+ "ywJHpglCk5Pa1ww/6hGcAwIDAQABoDowOAYJKoZIhvcNAQkOMSswKTAnBgNVHREE"
			+ "IDAepBwwGjEYMBYGCCsGAQQBwQEBDAoxODM5NTU2NS05MA0GCSqGSIb3DQEBCwUA"
			+ "A4IBAQCJ8jqA3ZGD7ZE/7OYtx9R78c18QnvHz3iNMVjJGG7Zj7NUH2fyFTUMZ8pU"
			+ "YtgExbljRLn7PaBYfeiTEbkP8/Vs1zqey9r0Cor63zrM5OGY/lyuXjaRFIKsFUcx"
			+ "gtOaDI++uBOCo0dhU1WV4wnSUiEyob+WxkH22ddKBIxfRujeOE7q40MZD7ELwX/u"
			+ "MhYZniZ+XXFNuBN8tHaN18kNTYRII60VkzIw8VnooALdPNL9+QGMqg9N7DjT6VTS"
			+ "qsA7qnNAfThVo/Ksz41o+0f9YRvrPPpZcgFCsCgqTL4BVcuJt3Rj4MKx3isMIHOz" + "70MXC83ZUQQw+S9nWANdIKazsOdZ";

	static {
		// Permite que no valide la IP
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				if (hostname.equals("10.77.40.5"))
					return true;
				return false;
			}
		});
	}

	public static void main(String[] args) throws Exception {
		Security.addProvider(new BouncyCastleProvider());
		
		// CryptoProviderTools.installBCProvider();
		String urlstr = host + "ejbca/ejbcaws/ejbcaws?WSDL";
		logger.info("1 - Set Properties");
		System.setProperty("javax.net.ssl.trustStore", "/home/firmador/keys/truststore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
		System.setProperty("javax.net.ssl.keyStore", "/home/firmador/keys/superadmin.p12");
		System.setProperty("javax.net.ssl.keyStorePassword", "ejbca");
		
		logger.info("javax.net.ssl.trustStore="+System.getProperty("javax.net.ssl.trustStore"));
		logger.info("javax.net.ssl.trustStorePassword="+System.getProperty("javax.net.ssl.trustStorePassword"));
		logger.info("javax.net.ssl.keyStoreType="+System.getProperty("javax.net.ssl.keyStoreType"));
		logger.info("javax.net.ssl.keyStore="+System.getProperty("javax.net.ssl.keyStore"));
		logger.info("javax.net.ssl.keyStorePassword="+System.getProperty("javax.net.ssl.keyStorePassword"));
		

		logger.info("2 - QName");
		QName qname = new QName("http://ws.protocol.core.ejbca.org/", "EjbcaWSService");
		logger.info("3 - Service");
		// fixHttpsHandler();
		EjbcaWSService service = new EjbcaWSService(new URL(urlstr), qname);
		logger.info("4 - Conexion PORT");
		@SuppressWarnings("unused")
		EjbcaWS ejbcaws = service.getEjbcaWSPort();
		logger.info("5 - Finished");

		UserMatch usermatch = new UserMatch();
		usermatch.setMatchwith(UserMatch.MATCH_WITH_DN);
		usermatch.setMatchtype(UserMatch.MATCH_TYPE_CONTAINS);
		usermatch.setMatchvalue("bochagavia@digital.gob.cl");
		List<UserDataVOWS> result = ejbcaws.findUser(usermatch);

		logger.info("8 - Genera pkcs10");
		UserDataVOWS user = result.get(0);

		logger.info("getCaName:" + user.getCaName());
		logger.info("getCardNumber:" + user.getCardNumber());
		logger.info("getCertificateProfileName:" + user.getCertificateProfileName());
		logger.info("getEmail:" + user.getEmail());
		logger.info("getEndEntityProfileName:" + user.getEndEntityProfileName());
		logger.info("getEndTime:" + user.getEndTime());
		logger.info("getHardTokenIssuerName:" + user.getHardTokenIssuerName());
		logger.info("getPassword:" + user.getPassword());
		logger.info("getStartTime:" + user.getStartTime());
		logger.info("getStatus:" + user.getStatus());
		logger.info("getSubjectAltName:" + user.getSubjectAltName());
		logger.info("getSubjectDN:" + user.getSubjectDN());
		logger.info("getTokenType:" + user.getTokenType());
		logger.info("getUsername:" + user.getUsername());

		user = result.get(1);

		logger.info("getCaName:" + user.getCaName());
		logger.info("getCardNumber:" + user.getCardNumber());
		logger.info("getCertificateProfileName:" + user.getCertificateProfileName());
		logger.info("getEmail:" + user.getEmail());
		logger.info("getEndEntityProfileName:" + user.getEndEntityProfileName());
		logger.info("getEndTime:" + user.getEndTime());
		logger.info("getHardTokenIssuerName:" + user.getHardTokenIssuerName());
		logger.info("getPassword:" + user.getPassword());
		logger.info("getStartTime:" + user.getStartTime());
		logger.info("getStatus:" + user.getStatus());
		logger.info("getSubjectAltName:" + user.getSubjectAltName());
		logger.info("getSubjectDN:" + user.getSubjectDN());
		logger.info("getTokenType:" + user.getTokenType());
		logger.info("getUsername:" + user.getUsername());

		// UserDataVOWS userNew = result.get(2);

		UserDataVOWS userNew = new UserDataVOWS();
		userNew.setUsername("bochagavia_test_2");
		userNew.setSubjectDN(
				"E=bochagavia@digital.gob.cl,CN=Baltazar Ochagavía B Test 2,SN=18395565-9,T=Consultor,O=Organismo_Test_2019,C=CL");
		userNew.setCaName("TEST_01");
		userNew.setEmail("bochagavia@digital.gob.cl");
		userNew.setSubjectAltName("1.3.6.1.4.1.8321.1=18395565-9");
		userNew.setEndEntityProfileName("FEA_PROFILE");
		userNew.setCertificateProfileName("FIRMA_ELECTRONICA_AVANZADA_NEW");
		userNew.setPassword("123456");
		userNew.setTokenType("INPROCESS");
		// ejbcaws.editUser(userNew);
		// userNew = result.get(2);
		// userNew.setTokenType("FAILED");
		// userNew.setStatus(UserDataConstants.STATUS_GENERATED);
		// ejbcaws.editUser(userNew);

		userNew = result.get(0);
		// userNew.setTokenType("FAILED");
		userNew.setStatus(UserDataConstants.STATUS_NEW);
		ejbcaws.editUser(userNew);

		KeyPair keys = KeyTools.genKeys("2048", AlgorithmConstants.KEYALGORITHM_RSA);
		PKCS10CertificationRequest pkcs10Req = new PKCS10CertificationRequest("SHA256WithRSA",
				CertTools.stringToBcX509Name("CN=NOUSED"), keys.getPublic(), null, keys.getPrivate());

		CertificateResponse pkcs10 = ejbcaws.certificateRequest(userNew, new String(Base64.encode(pkcs10Req.getEncoded())),
				CertificateHelper.CERT_REQ_TYPE_PKCS10, null, CertificateHelper.RESPONSETYPE_CERTIFICATE);
				
		// System.out.println(Base64.encode(kp.getPublic().getEncoded()));
		// System.out.println(csr);

		// CertificateResponse pkcs10 = ejbcaws.pkcs10Request(userNew.getUsername(), "123456", csr, null,				CertificateHelper.RESPONSETYPE_CERTIFICATE);
		CertificateResponse certenv = pkcs10;

		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		byte[] strContent = Base64.decode(new String(certenv.getData(), "UTF-8"));
		InputStream inputStream = new ByteArrayInputStream(strContent);
		java.security.cert.Certificate certifivate = cf.generateCertificate(inputStream);
		X509Certificate[] certX509 = new X509Certificate[] { (X509Certificate) certifivate };

		java.security.KeyStore store = java.security.KeyStore.getInstance("PKCS12");
		store.load(null, null);
		store.setKeyEntry(userNew.getUsername(), keys.getPrivate(), "123456".toCharArray(), certX509);
		FileOutputStream fOut = new FileOutputStream("certificado.p12");
		store.store(fOut, "123456".toCharArray());
		fOut.close();

		FileOutputStream fo = new FileOutputStream("certificado.pfx");
		fo.write("-----BEGIN CERTIFICATE-----\n".getBytes());
		fo.write(certenv.getData());
		fo.write("-----END CERTIFICATE-----\n".getBytes());
		fo.close();

		/*
		 * logger.info(pk10.getResponseType()); String strCertB64 =
		 * Base64.encode(pk10.getData()); strCertB64 = strCertB64.replaceAll("(.{64})",
		 * "$1\n"); fo = new FileOutputStream("certificado.pem");
		 * fo.write("-----BEGIN CERTIFICATE-----\n".getBytes());
		 * fo.write(strCertB64.getBytes());
		 * fo.write("\n-----END CERTIFICATE-----\n".getBytes()); fo.close();
		 */

//		try {
//			CertificateFactory cf = CertificateFactory.getInstance("X.509");
//			byte[] strContent = Base64.decode(new String(pk10.getData(), "UTF-8"));
//			InputStream inputStream = new ByteArrayInputStream(strContent);
//			java.security.cert.Certificate certificate = cf.generateCertificate(inputStream);
//
//			if (certificate instanceof X509Certificate) {
//				X509Certificate x509Certificate = (X509Certificate) certificate;
//				x509Certificate.getPublicKey();
//
//				String strCertB64 = Base64.encode(x509Certificate.getEncoded());
//				strCertB64 = strCertB64.replaceAll("(.{64})", "$1\n");
//				fo = new FileOutputStream("certificadoX509.pem");
//				fo.write("-----BEGIN CERTIFICATE-----\n".getBytes());
//				fo.write(strCertB64.getBytes());
//				fo.write("\n-----END CERTIFICATE-----\n".getBytes());
//				fo.close();
//
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		try {
			KeyStore p12 = KeyStore.getInstance("pkcs12");
			p12.load(new ByteArrayInputStream(certenv.getData()), "123456".toCharArray());
		} catch (Exception e) {
			logger.error("Al crear p12", e);
		}

		// sun.security.pkcs10 csr = new
		// sun.security.pkcs10(Base64Utils.decode(csrPem1.getBytes()));

		logger.info("user creado en ejbca: " + user.getEmail());
		// KeyPair keys = KeyTools.genKeys("2048", AlgorithmConstants.KEYALGORITHM_RSA);

		// logger.info(certenv.getData().length);
		// cambiamos el estado del certificado del usuario
		user.setStatus(UserDataConstants.STATUS_GENERATED);
		// ejbcaws.editUser(user);

	}

//	public static PKCS10CertificationRequest generatePKCS10CSR(X509Certificate cert, PrivateKey privateKey)
//			throws CryptoException {
//		X509Name subject = new X509Name(cert.getSubjectDN().toString());
//
//		try {
//			PKCS10CertificationRequest csr = new PKCS10CertificationRequest(cert.getSigAlgName(), subject,
//					cert.getPublicKey(), null, privateKey);
//			if (!csr.verify()) {
//				throw new CryptoException("Could not verify generated certification request.");
//			}
//
//			return csr;
//		} catch (GeneralSecurityException ex) {
//			throw new CryptoException("Could not generate a certification request.", ex);
//		}
//	}

//	public static void getCsrB64() throws FileNotFoundException, IOException {
//		InputStream stream = new ByteArrayInputStream(csr.getBytes(StandardCharsets.UTF_8));
//
//		CSRInfoDecoder m = new CSRInfoDecoder();
//
//		Certificate cert = null;
//		try {
//
//			ByteArrayInputStream bis = new ByteArrayInputStream(csr.getBytes());
//			CertificateFactory cf = CertificateFactory.getInstance("X.509");
//			while (bis.available() > 0) {
//				cert = cf.generateCertificate(bis);
//				try {
//					System.out.println("-----BEGIN CERTIFICATE-----");
//					System.out.println(DatatypeConverter.printBase64Binary(cert.getEncoded()));
//					System.out.println("-----END CERTIFICATE-----");
//					// System.out.println("key:"+cert.getPublicKey());
//				} catch (CertificateEncodingException e) {
//					e.printStackTrace();
//				}
//				System.out.println(cert.toString());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
}
