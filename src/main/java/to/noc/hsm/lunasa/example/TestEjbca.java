package to.noc.hsm.lunasa.example;

import java.net.URL;

import javax.xml.namespace.QName;

import org.cesecore.util.CryptoProviderTools;
import org.ejbca.core.protocol.ws.client.gen.EjbcaWS;
import org.ejbca.core.protocol.ws.client.gen.EjbcaWSService;

public class TestEjbca {
	private static String host = "https://10.77.40.5:8443/";

	public static void main(String[] args) throws Exception {

		CryptoProviderTools.installBCProvider();	
		String urlstr = host+ "ejbca/ejbcaws/ejbcaws?wsdl";
			
		System.setProperty("javax.net.ssl.trustStore","/home/firmador/keys/truststore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword","");  
		System.setProperty("javax.net.ssl.keyStore","/home/firmador/keys/keystore.jks");
		System.setProperty("javax.net.ssl.keyStorePassword","serverpwd");      
		                             
		QName qname = new QName("http://ws.protocol.core.ejbca.org/", "EjbcaWSService");
		EjbcaWSService service = new EjbcaWSService(new URL(urlstr),qname);
		EjbcaWS ejbcaraws = service.getEjbcaWSPort();  
		
	}

}
