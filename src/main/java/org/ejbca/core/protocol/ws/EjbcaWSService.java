/**
 * EjbcaWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

public interface EjbcaWSService extends javax.xml.rpc.Service {
    public java.lang.String getEjbcaWSPortAddress();

    public org.ejbca.core.protocol.ws.EjbcaWS getEjbcaWSPort() throws javax.xml.rpc.ServiceException;

    public org.ejbca.core.protocol.ws.EjbcaWS getEjbcaWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
