package to.noc.hsm.lunasa.example;

import java.net.URL;
import java.security.cert.X509Certificate;

import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.cesecore.util.CryptoProviderTools;
import org.ejbca.core.protocol.ws.client.gen.EjbcaWS;
import org.ejbca.core.protocol.ws.client.gen.EjbcaWSService;

public class TestEjbca {
	private static Logger   logger = Logger.getLogger( TestEjbca.class );
	
	private static String host = "https://10.77.40.5/";
	// private static String host = "https://ejbca/";

	public static void main(String[] args) throws Exception {
        /* Start of Fix */
        TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }   

            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }

        } };

		CryptoProviderTools.installBCProvider();	
		String urlstr = host+ "ejbca/ejbcaws/ejbcaws?wsdl";
		logger.info("Paso 1");
		System.setProperty("javax.net.ssl.trustStore","/home/firmador/keys/truststore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword","changeit");  
		// System.setProperty("javax.net.ssl.keyStore","/home/firmador/keys/keystore.jks");
		// System.setProperty("javax.net.ssl.keyStorePassword","serverpwd");   
		System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
		System.setProperty("javax.net.ssl.keyStore","/home/firmador/keys/superadmin.p12");
		System.setProperty("javax.net.ssl.keyStorePassword","ejbca");      

		
		logger.info("Paso 2");
		QName qname = new QName("http://ws.protocol.core.ejbca.org/", "EjbcaWSService");
		logger.info("Paso 3");
		EjbcaWSService service = new EjbcaWSService(new URL(urlstr),qname);
		logger.info("Paso 4");
		@SuppressWarnings("unused")
		EjbcaWS ejbcaraws = service.getEjbcaWSPort();  
		logger.info("Paso 5");
		
	}

}
