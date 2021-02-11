package to.noc.hsm.lunasa.example;

import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.cesecore.util.CryptoProviderTools;

import cl.c2c.ejbca.EjbcaWS;
import cl.c2c.ejbca.EjbcaWSService;

public class TestEjbca {
	private static Logger logger = Logger.getLogger(TestEjbca.class);

	private static String host = "https://10.77.40.5/";
	// private static String host = "https://ejbca/";

	// Permite usar HTTPS sin bajar el certificado localmente
	static {
		TrustManager[] trustAllCertificates = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
			}

			public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
			}
		} };

		try {
			SSLContext sc = SSLContext.getInstance("SSL");
			sc.init(null, trustAllCertificates, new SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		} catch (Exception e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static void main(String[] args) throws Exception {

		CryptoProviderTools.installBCProvider();
		String urlstr = host + "ejbca/ejbcaws/ejbcaws";
		logger.info("1 - Set Properties");
		// System.setProperty("javax.net.ssl.trustStore", "/home/agalaz/workspace_sign/HSM/truststore.jks");
		System.setProperty("javax.net.ssl.trustStore", "/home/firmador/keys/truststore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		// System.setProperty("javax.net.ssl.keyStore","/home/firmador/keys/keystore.jks");
		// System.setProperty("javax.net.ssl.keyStorePassword","serverpwd");
		System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
		// System.setProperty("javax.net.ssl.keyStore", "/home/agalaz/workspace_sign/HSM/superadmin.p12");
		System.setProperty("javax.net.ssl.keyStore", "/home/firmador/keys/superadmin.p12");
		System.setProperty("javax.net.ssl.keyStorePassword", "ejbca");

		logger.info("2 - QName");
		QName qname = new QName("http://ws.protocol.core.ejbca.org/", "EjbcaWSService");
		logger.info("3 - Service");
		fixHttpsHandler();
		EjbcaWSService service = new EjbcaWSService(new URL(urlstr), qname);
		logger.info("4 - Conexion PORT");
		@SuppressWarnings("unused")
		EjbcaWS ejbcaraws = service.getEjbcaWSPort();
		logger.info("5 - Finished");

	}

	private static void fixHttpsHandler() {
		try {

			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}

				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			} };

			SSLContext mySSLContext = SSLContext.getInstance("TLSv1.3");
			mySSLContext.init(null, trustAllCerts, new java.security.SecureRandom());
			HttpsURLConnection.setDefaultSSLSocketFactory(mySSLContext.getSocketFactory());

			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};

			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
