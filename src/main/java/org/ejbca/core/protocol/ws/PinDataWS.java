/**
 * PinDataWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

public class PinDataWS  implements java.io.Serializable {
    private java.lang.String initialPIN;

    private java.lang.String PUK;

    private int type;

    public PinDataWS() {
    }

    public PinDataWS(
           java.lang.String initialPIN,
           java.lang.String PUK,
           int type) {
           this.initialPIN = initialPIN;
           this.PUK = PUK;
           this.type = type;
    }


    /**
     * Gets the initialPIN value for this PinDataWS.
     * 
     * @return initialPIN
     */
    public java.lang.String getInitialPIN() {
        return initialPIN;
    }


    /**
     * Sets the initialPIN value for this PinDataWS.
     * 
     * @param initialPIN
     */
    public void setInitialPIN(java.lang.String initialPIN) {
        this.initialPIN = initialPIN;
    }


    /**
     * Gets the PUK value for this PinDataWS.
     * 
     * @return PUK
     */
    public java.lang.String getPUK() {
        return PUK;
    }


    /**
     * Sets the PUK value for this PinDataWS.
     * 
     * @param PUK
     */
    public void setPUK(java.lang.String PUK) {
        this.PUK = PUK;
    }


    /**
     * Gets the type value for this PinDataWS.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this PinDataWS.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PinDataWS)) return false;
        PinDataWS other = (PinDataWS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.initialPIN==null && other.getInitialPIN()==null) || 
             (this.initialPIN!=null &&
              this.initialPIN.equals(other.getInitialPIN()))) &&
            ((this.PUK==null && other.getPUK()==null) || 
             (this.PUK!=null &&
              this.PUK.equals(other.getPUK()))) &&
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
        if (getInitialPIN() != null) {
            _hashCode += getInitialPIN().hashCode();
        }
        if (getPUK() != null) {
            _hashCode += getPUK().hashCode();
        }
        _hashCode += getType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PinDataWS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "pinDataWS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialPIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initialPIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PUK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PUK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
