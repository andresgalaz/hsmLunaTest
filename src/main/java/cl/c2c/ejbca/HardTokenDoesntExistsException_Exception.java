
package cl.c2c.ejbca;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.6
 * 2021-02-10T23:01:14.662-03:00
 * Generated source version: 2.5.6
 */

@WebFault(name = "HardTokenDoesntExistsException", targetNamespace = "http://ws.protocol.core.ejbca.org/")
public class HardTokenDoesntExistsException_Exception extends Exception {
    
    private cl.c2c.ejbca.HardTokenDoesntExistsException hardTokenDoesntExistsException;

    public HardTokenDoesntExistsException_Exception() {
        super();
    }
    
    public HardTokenDoesntExistsException_Exception(String message) {
        super(message);
    }
    
    public HardTokenDoesntExistsException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public HardTokenDoesntExistsException_Exception(String message, cl.c2c.ejbca.HardTokenDoesntExistsException hardTokenDoesntExistsException) {
        super(message);
        this.hardTokenDoesntExistsException = hardTokenDoesntExistsException;
    }

    public HardTokenDoesntExistsException_Exception(String message, cl.c2c.ejbca.HardTokenDoesntExistsException hardTokenDoesntExistsException, Throwable cause) {
        super(message, cause);
        this.hardTokenDoesntExistsException = hardTokenDoesntExistsException;
    }

    public cl.c2c.ejbca.HardTokenDoesntExistsException getFaultInfo() {
        return this.hardTokenDoesntExistsException;
    }
}
