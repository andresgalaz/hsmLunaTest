/**
 * EjbcaWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

public class EjbcaWSServiceLocator extends org.apache.axis.client.Service implements org.ejbca.core.protocol.ws.EjbcaWSService {

    public EjbcaWSServiceLocator() {
    }


    public EjbcaWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EjbcaWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EjbcaWSPort
    private java.lang.String EjbcaWSPort_address = "https://10.101.151.15:8443/ejbca/ejbcaws/ejbcaws";

    public java.lang.String getEjbcaWSPortAddress() {
        return EjbcaWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EjbcaWSPortWSDDServiceName = "EjbcaWSPort";

    public java.lang.String getEjbcaWSPortWSDDServiceName() {
        return EjbcaWSPortWSDDServiceName;
    }

    public void setEjbcaWSPortWSDDServiceName(java.lang.String name) {
        EjbcaWSPortWSDDServiceName = name;
    }

    public org.ejbca.core.protocol.ws.EjbcaWS getEjbcaWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EjbcaWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEjbcaWSPort(endpoint);
    }

    public org.ejbca.core.protocol.ws.EjbcaWS getEjbcaWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.ejbca.core.protocol.ws.EjbcaWSBindingStub _stub = new org.ejbca.core.protocol.ws.EjbcaWSBindingStub(portAddress, this);
            _stub.setPortName(getEjbcaWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEjbcaWSPortEndpointAddress(java.lang.String address) {
        EjbcaWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.ejbca.core.protocol.ws.EjbcaWS.class.isAssignableFrom(serviceEndpointInterface)) {
                org.ejbca.core.protocol.ws.EjbcaWSBindingStub _stub = new org.ejbca.core.protocol.ws.EjbcaWSBindingStub(new java.net.URL(EjbcaWSPort_address), this);
                _stub.setPortName(getEjbcaWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EjbcaWSPort".equals(inputPortName)) {
            return getEjbcaWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "EjbcaWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EjbcaWSPort".equals(portName)) {
            setEjbcaWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
