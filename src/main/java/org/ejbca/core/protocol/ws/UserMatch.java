/**
 * UserMatch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

public class UserMatch  implements java.io.Serializable {
    private int matchtype;

    private java.lang.String matchvalue;

    private int matchwith;

    public UserMatch() {
    }

    public UserMatch(
           int matchtype,
           java.lang.String matchvalue,
           int matchwith) {
           this.matchtype = matchtype;
           this.matchvalue = matchvalue;
           this.matchwith = matchwith;
    }


    /**
     * Gets the matchtype value for this UserMatch.
     * 
     * @return matchtype
     */
    public int getMatchtype() {
        return matchtype;
    }


    /**
     * Sets the matchtype value for this UserMatch.
     * 
     * @param matchtype
     */
    public void setMatchtype(int matchtype) {
        this.matchtype = matchtype;
    }


    /**
     * Gets the matchvalue value for this UserMatch.
     * 
     * @return matchvalue
     */
    public java.lang.String getMatchvalue() {
        return matchvalue;
    }


    /**
     * Sets the matchvalue value for this UserMatch.
     * 
     * @param matchvalue
     */
    public void setMatchvalue(java.lang.String matchvalue) {
        this.matchvalue = matchvalue;
    }


    /**
     * Gets the matchwith value for this UserMatch.
     * 
     * @return matchwith
     */
    public int getMatchwith() {
        return matchwith;
    }


    /**
     * Sets the matchwith value for this UserMatch.
     * 
     * @param matchwith
     */
    public void setMatchwith(int matchwith) {
        this.matchwith = matchwith;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserMatch)) return false;
        UserMatch other = (UserMatch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.matchtype == other.getMatchtype() &&
            ((this.matchvalue==null && other.getMatchvalue()==null) || 
             (this.matchvalue!=null &&
              this.matchvalue.equals(other.getMatchvalue()))) &&
            this.matchwith == other.getMatchwith();
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
        _hashCode += getMatchtype();
        if (getMatchvalue() != null) {
            _hashCode += getMatchvalue().hashCode();
        }
        _hashCode += getMatchwith();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserMatch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userMatch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchwith");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchwith"));
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
