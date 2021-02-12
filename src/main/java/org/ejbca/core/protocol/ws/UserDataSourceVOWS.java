/**
 * UserDataSourceVOWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

public class UserDataSourceVOWS  implements java.io.Serializable {
    private java.lang.Integer[] isModifyable;

    private org.ejbca.core.protocol.ws.UserDataVOWS userDataVOWS;

    public UserDataSourceVOWS() {
    }

    public UserDataSourceVOWS(
           java.lang.Integer[] isModifyable,
           org.ejbca.core.protocol.ws.UserDataVOWS userDataVOWS) {
           this.isModifyable = isModifyable;
           this.userDataVOWS = userDataVOWS;
    }


    /**
     * Gets the isModifyable value for this UserDataSourceVOWS.
     * 
     * @return isModifyable
     */
    public java.lang.Integer[] getIsModifyable() {
        return isModifyable;
    }


    /**
     * Sets the isModifyable value for this UserDataSourceVOWS.
     * 
     * @param isModifyable
     */
    public void setIsModifyable(java.lang.Integer[] isModifyable) {
        this.isModifyable = isModifyable;
    }

    public java.lang.Integer getIsModifyable(int i) {
        return this.isModifyable[i];
    }

    public void setIsModifyable(int i, java.lang.Integer _value) {
        this.isModifyable[i] = _value;
    }


    /**
     * Gets the userDataVOWS value for this UserDataSourceVOWS.
     * 
     * @return userDataVOWS
     */
    public org.ejbca.core.protocol.ws.UserDataVOWS getUserDataVOWS() {
        return userDataVOWS;
    }


    /**
     * Sets the userDataVOWS value for this UserDataSourceVOWS.
     * 
     * @param userDataVOWS
     */
    public void setUserDataVOWS(org.ejbca.core.protocol.ws.UserDataVOWS userDataVOWS) {
        this.userDataVOWS = userDataVOWS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDataSourceVOWS)) return false;
        UserDataSourceVOWS other = (UserDataSourceVOWS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isModifyable==null && other.getIsModifyable()==null) || 
             (this.isModifyable!=null &&
              java.util.Arrays.equals(this.isModifyable, other.getIsModifyable()))) &&
            ((this.userDataVOWS==null && other.getUserDataVOWS()==null) || 
             (this.userDataVOWS!=null &&
              this.userDataVOWS.equals(other.getUserDataVOWS())));
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
        if (getIsModifyable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsModifyable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsModifyable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserDataVOWS() != null) {
            _hashCode += getUserDataVOWS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDataSourceVOWS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userDataSourceVOWS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isModifyable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isModifyable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDataVOWS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDataVOWS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "userDataVOWS"));
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
