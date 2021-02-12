/**
 * TokenCertificateResponseWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

public class TokenCertificateResponseWS  implements java.io.Serializable {
    private org.ejbca.core.protocol.ws.Certificate certificate;

    private org.ejbca.core.protocol.ws.KeyStore keyStore;

    private int type;

    public TokenCertificateResponseWS() {
    }

    public TokenCertificateResponseWS(
           org.ejbca.core.protocol.ws.Certificate certificate,
           org.ejbca.core.protocol.ws.KeyStore keyStore,
           int type) {
           this.certificate = certificate;
           this.keyStore = keyStore;
           this.type = type;
    }


    /**
     * Gets the certificate value for this TokenCertificateResponseWS.
     * 
     * @return certificate
     */
    public org.ejbca.core.protocol.ws.Certificate getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this TokenCertificateResponseWS.
     * 
     * @param certificate
     */
    public void setCertificate(org.ejbca.core.protocol.ws.Certificate certificate) {
        this.certificate = certificate;
    }


    /**
     * Gets the keyStore value for this TokenCertificateResponseWS.
     * 
     * @return keyStore
     */
    public org.ejbca.core.protocol.ws.KeyStore getKeyStore() {
        return keyStore;
    }


    /**
     * Sets the keyStore value for this TokenCertificateResponseWS.
     * 
     * @param keyStore
     */
    public void setKeyStore(org.ejbca.core.protocol.ws.KeyStore keyStore) {
        this.keyStore = keyStore;
    }


    /**
     * Gets the type value for this TokenCertificateResponseWS.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this TokenCertificateResponseWS.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenCertificateResponseWS)) return false;
        TokenCertificateResponseWS other = (TokenCertificateResponseWS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              this.certificate.equals(other.getCertificate()))) &&
            ((this.keyStore==null && other.getKeyStore()==null) || 
             (this.keyStore!=null &&
              this.keyStore.equals(other.getKeyStore()))) &&
            this.type == other.getType();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCertificate() != null) {
            _hashCode += getCertificate().hashCode();
        }
        if (getKeyStore() != null) {
            _hashCode += getKeyStore().hashCode();
        }
        _hashCode += getType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenCertificateResponseWS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "tokenCertificateResponseWS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyStore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "keyStore"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
