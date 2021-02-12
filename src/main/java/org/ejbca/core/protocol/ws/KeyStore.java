/**
 * KeyStore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

public class KeyStore  extends org.ejbca.core.protocol.ws.TokenCertificateResponseWS  implements java.io.Serializable {
    private byte[] keystoreData;

    public KeyStore() {
    }

    public KeyStore(
           org.ejbca.core.protocol.ws.Certificate certificate,
           org.ejbca.core.protocol.ws.KeyStore keyStore,
           int type,
           byte[] keystoreData) {
        super(
            certificate,
            keyStore,
            type);
        this.keystoreData = keystoreData;
    }


    /**
     * Gets the keystoreData value for this KeyStore.
     * 
     * @return keystoreData
     */
    public byte[] getKeystoreData() {
        return keystoreData;
    }


    /**
     * Sets the keystoreData value for this KeyStore.
     * 
     * @param keystoreData
     */
    public void setKeystoreData(byte[] keystoreData) {
        this.keystoreData = keystoreData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeyStore)) return false;
        KeyStore other = (KeyStore) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.keystoreData==null && other.getKeystoreData()==null) || 
             (this.keystoreData!=null &&
              java.util.Arrays.equals(this.keystoreData, other.getKeystoreData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getKeystoreData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeystoreData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeystoreData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeyStore.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "keyStore"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keystoreData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keystoreData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
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
