package to.noc.hsm.lunasa.example;

import java.net.URL;

import javax.xml.namespace.QName;

import org.apache.log4j.Logger;
import org.cesecore.util.CryptoProviderTools;
import org.ejbca.core.protocol.ws.client.gen.EjbcaWS;
import org.ejbca.core.protocol.ws.client.gen.EjbcaWSService;

public class TestEjbca {
	private static Logger   logger = Logger.getLogger( TestEjbca.class );
	
	private static String host = "https://10.77.40.5/ejbca/ejbcaws/ejbcaws?wsdl";

	public static void main(String[] args) throws Exception {

		CryptoProviderTools.installBCProvider();	
		String urlstr = host+ "ejbca/ejbcaws/ejbcaws?wsdl";
		logger.info("Paso 1");
		System.setProperty("javax.net.ssl.trustStore","/home/firmador/keys/truststore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword","xchangeit");  
		System.setProperty("javax.net.ssl.keyStore","/home/firmador/keys/keystore.jks");
		System.setProperty("javax.net.ssl.keyStorePassword","serverpwd");      
		                             
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
