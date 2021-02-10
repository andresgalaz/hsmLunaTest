package to.noc.hsm.lunasa.example;

import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.cesecore.util.CryptoProviderTools;
import org.ejbca.core.protocol.ws.client.gen.EjbcaWS;
import org.ejbca.core.protocol.ws.client.gen.EjbcaWSService;

public class TestEjbca {
	private static Logger logger = Logger.getLogger(TestEjbca.class);

	private static String host = "https://10.77.40.5/";
	// private static String host = "https://ejbca/";

    // Permite usar HTTPS sin bajar el certificado localmente
    static {
        TrustManager[] trustAllCertificates = new TrustManager[] {
            new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                    // No need to implement.
                }

                public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
                    // No need to implement.
                }
            }
        };

        try {
            SSLContext sc = SSLContext.getInstance( "SSL" );
            sc.init( null, trustAllCertificates, new SecureRandom() );
            HttpsURLConnection.setDefaultSSLSocketFactory( sc.getSocketFactory() );
        } catch (Exception e) {
            throw new ExceptionInInitializerError( e );
        }
    }

	
	public static void main(String[] args) throws Exception {

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
