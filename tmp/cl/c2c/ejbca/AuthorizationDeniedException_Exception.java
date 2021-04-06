
package cl.c2c.ejbca;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.5.6
 * 2021-02-10T23:01:14.673-03:00
 * Generated source version: 2.5.6
 */

@WebFault(name = "AuthorizationDeniedException", targetNamespace = "http://ws.protocol.core.ejbca.org/")
public class AuthorizationDeniedException_Exception extends Exception {
    
    private cl.c2c.ejbca.AuthorizationDeniedException authorizationDeniedException;

    public AuthorizationDeniedException_Exception() {
        super();
    }
    
    public AuthorizationDeniedException_Exception(String message) {
        super(message);
    }
    
    public AuthorizationDeniedException_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthorizationDeniedException_Exception(String message, cl.c2c.ejbca.AuthorizationDeniedException authorizationDeniedException) {
        super(message);
        this.authorizationDeniedException = authorizationDeniedException;
    }

    public AuthorizationDeniedException_Exception(String message, cl.c2c.ejbca.AuthorizationDeniedException authorizationDeniedException, Throwable cause) {
        super(message, cause);
        this.authorizationDeniedException = authorizationDeniedException;
    }

    public cl.c2c.ejbca.AuthorizationDeniedException getFaultInfo() {
        return this.authorizationDeniedException;
    }
}