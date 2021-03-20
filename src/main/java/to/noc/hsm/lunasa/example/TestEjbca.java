package to.noc.hsm.lunasa.example;

import static java.lang.System.out;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.security.KeyPair;
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

import cl.c2c.ejbca.Certificate;
import cl.c2c.ejbca.CertificateHelper;
import cl.c2c.ejbca.CertificateResponse;
import cl.c2c.ejbca.EjbcaWS;
import cl.c2c.ejbca.EjbcaWSService;
import cl.c2c.ejbca.UserDataVOWS;
import cl.c2c.ejbca.UserMatch;

public class TestEjbca {
	private static Logger logger = Logger.getLogger(TestEjbca.class);

	private static String host = "https://10.77.40.5/";
	// private static String host = "https://54.67.117.183:8443/";

	static {
		// Permite que no valide la IP
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				if (hostname.equals("10.77.40.5"))
					return true;
				if (hostname.equals("54.67.117.183"))
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
		if (host.indexOf("10.77.40.5") > 0) {
			System.setProperty("javax.net.ssl.trustStore", "/home/firmador/keys/truststore.jks");
			System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
			System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
			System.setProperty("javax.net.ssl.keyStore", "/home/firmador/keys/superadmin.p12");
			System.setProperty("javax.net.ssl.keyStorePassword", "ejbca");
		} else {
			System.setProperty("javax.net.ssl.trustStore", "/home/firmador/keys/truststore2.jks");
			System.setProperty("javax.net.ssl.trustStorePassword", "1ea61439f61c301b6417f76aa32644ff047593b4");
			System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
			System.setProperty("javax.net.ssl.keyStore", "/home/firmador/keys/superadmin2.p12");
			System.setProperty("javax.net.ssl.keyStorePassword", "167d0d1397759363ccc033d0d6194be59c629ec2");
		}

		logger.info("javax.net.ssl.trustStore=" + System.getProperty("javax.net.ssl.trustStore"));
		logger.info("javax.net.ssl.trustStorePassword=" + System.getProperty("javax.net.ssl.trustStorePassword"));
		logger.info("javax.net.ssl.keyStoreType=" + System.getProperty("javax.net.ssl.keyStoreType"));
		logger.info("javax.net.ssl.keyStore=" + System.getProperty("javax.net.ssl.keyStore"));
		logger.info("javax.net.ssl.keyStorePassword=" + System.getProperty("javax.net.ssl.keyStorePassword"));

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
//		usermatch.setMatchvalue("cha");
		List<UserDataVOWS> result = ejbcaws.findUser(usermatch);

		logger.info("8 - Genera pkcs10");
		out.print("CaName\t");
		out.print("CardNumber\t");
		out.print("CertificateProfileName\t");
		out.print("Email\t");
		out.print("EndEntityProfileName\t");
		out.print("EndTime\t");
		out.print("HardTokenIssuerName\t");
		out.print("Password\t");
		out.print("StartTime\t");
		out.print("Status\t");
		out.print("SubjectAltName\t");
		out.print("SubjectDN\t");
		out.print("TokenType\t");
		out.print("Username\n");
		for (int i = 0; i < result.size(); i++) {
			UserDataVOWS user = result.get(i);

			out.print(user.getCaName());
			out.print('\t');
			out.print(user.getCardNumber());
			out.print('\t');
			out.print(user.getCertificateProfileName());
			out.print('\t');
			out.print(user.getEmail());
			out.print('\t');
			out.print(user.getEndEntityProfileName());
			out.print('\t');
			out.print(user.getEndTime());
			out.print('\t');
			out.print(user.getHardTokenIssuerName());
			out.print('\t');
			out.print(user.getPassword());
			out.print('\t');
			out.print(user.getStartTime());
			out.print('\t');
			out.print(user.getStatus());
			out.print('\t');
			out.print(user.getSubjectAltName());
			out.print('\t');
			out.print(user.getSubjectDN());
			out.print('\t');
			out.print(user.getTokenType());
			out.print('\t');
			out.print(user.getUsername());
			out.print('\n');
		}

		// UserDataVOWS userNew = result.get(2);

		UserDataVOWS userNew = new UserDataVOWS();
//		userNew.setUsername("bochagavia_test_2");
//		userNew.setSubjectDN(
//				"E=bochagavia@digital.gob.cl,CN=Baltazar Ochagavía B Test 2,SN=18395565-9,T=Consultor,O=Organismo_Test_2019,C=CL");
//		userNew.setCaName("TEST_01");
//		userNew.setEmail("bochagavia@digital.gob.cl");
//		userNew.setSubjectAltName("1.3.6.1.4.1.8321.1=18395565-9");
//		userNew.setEndEntityProfileName("FEA_PROFILE");
//		userNew.setCertificateProfileName("FIRMA_ELECTRONICA_AVANZADA_NEW");
//		userNew.setPassword("123456");
//		userNew.setTokenType("INPROCESS");
		// ejbcaws.editUser(userNew);
		// userNew = result.get(2);
		// userNew.setTokenType("FAILED");
		// userNew.setStatus(UserDataConstants.STATUS_GENERATED);
		// ejbcaws.editUser(userNew);

		userNew = result.get(0);
		// userNew.setTokenType("FAILED");

		userNew.setStatus(UserDataConstants.STATUS_NEW);
		userNew.setEndEntityProfileName("FEA_PROFILE");
		ejbcaws.editUser(userNew);

		KeyPair keys = KeyTools.genKeys("2048", AlgorithmConstants.KEYALGORITHM_RSA);
		PKCS10CertificationRequest pkcs10Req = new PKCS10CertificationRequest("SHA256WithRSA",
				CertTools.stringToBcX509Name("CN=NOUSED"), keys.getPublic(), null, keys.getPrivate());
//		PKCS10CertificationRequest pkcs10Req = new PKCS10CertificationRequest("SHA256WithRSA",
//				CertTools.stringToBcX509Name("CN=FEA_PROFILE"), keys.getPublic(), null, keys.getPrivate());

		CertificateResponse pkcs10 = ejbcaws.certificateRequest(userNew,
				new String(Base64.encode(pkcs10Req.getEncoded())), CertificateHelper.CERT_REQ_TYPE_PKCS10, null,
				CertificateHelper.RESPONSETYPE_CERTIFICATE);

		// AGV: AQUI ESTA LA CADENA
		List<Certificate> certChain = ejbcaws.getLastCertChain(userNew.getUsername());
		X509Certificate[] certX509 = new X509Certificate[certChain.size()];
		CertificateFactory cf = CertificateFactory.getInstance("X.509");
		for (int i = 0; i < certChain.size(); i++) {
			byte[] strContent = Base64.decode(new String(certChain.get(i).getCertificateData(), "UTF-8"));
			InputStream inputStream = new ByteArrayInputStream(strContent);
			java.security.cert.Certificate certifivate = cf.generateCertificate(inputStream);
			certX509[i] = (X509Certificate) certifivate;
		}

//		CertificateFactory cf = CertificateFactory.getInstance("X.509");
//		byte[] strContent = Base64.decode(new String(pkcs10.getData(), "UTF-8"));
//		InputStream inputStream = new ByteArrayInputStream(strContent);
//		java.security.cert.Certificate certifivate = cf.generateCertificate(inputStream);
//		X509Certificate[] certX509 = new X509Certificate[] { (X509Certificate) certifivate };

		java.security.KeyStore store = java.security.KeyStore.getInstance("PKCS12");
		store.load(null, null);
		store.setKeyEntry(userNew.getUsername(), keys.getPrivate(), "123456".toCharArray(), certX509);
		FileOutputStream fOut = new FileOutputStream("certificado_7.p12");
		store.store(fOut, "123456".toCharArray());
		fOut.close();

	}
}
