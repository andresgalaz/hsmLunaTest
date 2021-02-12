/**
 * ErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

public class ErrorCode  implements java.io.Serializable {
    private java.lang.String internalErrorCode;

    public ErrorCode() {
    }

    public ErrorCode(
           java.lang.String internalErrorCode) {
           this.internalErrorCode = internalErrorCode;
    }


    /**
     * Gets the internalErrorCode value for this ErrorCode.
     * 
     * @return internalErrorCode
     */
    public java.lang.String getInternalErrorCode() {
        return internalErrorCode;
    }


    /**
     * Sets the internalErrorCode value for this ErrorCode.
     * 
     * @param internalErrorCode
     */
    public void setInternalErrorCode(java.lang.String internalErrorCode) {
        this.internalErrorCode = internalErrorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorCode)) return false;
        ErrorCode other = (ErrorCode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.internalErrorCode==null && other.getInternalErrorCode()==null) || 
             (this.internalErrorCode!=null &&
              this.internalErrorCode.equals(other.getInternalErrorCode())));
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
        if (getInternalErrorCode() != null) {
            _hashCode += getInternalErrorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorCode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "errorCode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalErrorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
