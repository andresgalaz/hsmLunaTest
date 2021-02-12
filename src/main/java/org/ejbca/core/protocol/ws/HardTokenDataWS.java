/**
 * HardTokenDataWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

public class HardTokenDataWS  implements java.io.Serializable {
    private org.ejbca.core.protocol.ws.Certificate[] certificates;

    private java.lang.String[] copies;

    private java.lang.String copyOfSN;

    private java.util.Calendar createTime;

    private boolean encKeyKeyRecoverable;

    private java.lang.String hardTokenSN;

    private java.lang.String label;

    private java.util.Calendar modifyTime;

    private org.ejbca.core.protocol.ws.PinDataWS[] pinDatas;

    private int tokenType;

    public HardTokenDataWS() {
    }

    public HardTokenDataWS(
           org.ejbca.core.protocol.ws.Certificate[] certificates,
           java.lang.String[] copies,
           java.lang.String copyOfSN,
           java.util.Calendar createTime,
           boolean encKeyKeyRecoverable,
           java.lang.String hardTokenSN,
           java.lang.String label,
           java.util.Calendar modifyTime,
           org.ejbca.core.protocol.ws.PinDataWS[] pinDatas,
           int tokenType) {
           this.certificates = certificates;
           this.copies = copies;
           this.copyOfSN = copyOfSN;
           this.createTime = createTime;
           this.encKeyKeyRecoverable = encKeyKeyRecoverable;
           this.hardTokenSN = hardTokenSN;
           this.label = label;
           this.modifyTime = modifyTime;
           this.pinDatas = pinDatas;
           this.tokenType = tokenType;
    }


    /**
     * Gets the certificates value for this HardTokenDataWS.
     * 
     * @return certificates
     */
    public org.ejbca.core.protocol.ws.Certificate[] getCertificates() {
        return certificates;
    }


    /**
     * Sets the certificates value for this HardTokenDataWS.
     * 
     * @param certificates
     */
    public void setCertificates(org.ejbca.core.protocol.ws.Certificate[] certificates) {
        this.certificates = certificates;
    }

    public org.ejbca.core.protocol.ws.Certificate getCertificates(int i) {
        return this.certificates[i];
    }

    public void setCertificates(int i, org.ejbca.core.protocol.ws.Certificate _value) {
        this.certificates[i] = _value;
    }


    /**
     * Gets the copies value for this HardTokenDataWS.
     * 
     * @return copies
     */
    public java.lang.String[] getCopies() {
        return copies;
    }


    /**
     * Sets the copies value for this HardTokenDataWS.
     * 
     * @param copies
     */
    public void setCopies(java.lang.String[] copies) {
        this.copies = copies;
    }

    public java.lang.String getCopies(int i) {
        return this.copies[i];
    }

    public void setCopies(int i, java.lang.String _value) {
        this.copies[i] = _value;
    }


    /**
     * Gets the copyOfSN value for this HardTokenDataWS.
     * 
     * @return copyOfSN
     */
    public java.lang.String getCopyOfSN() {
        return copyOfSN;
    }


    /**
     * Sets the copyOfSN value for this HardTokenDataWS.
     * 
     * @param copyOfSN
     */
    public void setCopyOfSN(java.lang.String copyOfSN) {
        this.copyOfSN = copyOfSN;
    }


    /**
     * Gets the createTime value for this HardTokenDataWS.
     * 
     * @return createTime
     */
    public java.util.Calendar getCreateTime() {
        return createTime;
    }


    /**
     * Sets the createTime value for this HardTokenDataWS.
     * 
     * @param createTime
     */
    public void setCreateTime(java.util.Calendar createTime) {
        this.createTime = createTime;
    }


    /**
     * Gets the encKeyKeyRecoverable value for this HardTokenDataWS.
     * 
     * @return encKeyKeyRecoverable
     */
    public boolean isEncKeyKeyRecoverable() {
        return encKeyKeyRecoverable;
    }


    /**
     * Sets the encKeyKeyRecoverable value for this HardTokenDataWS.
     * 
     * @param encKeyKeyRecoverable
     */
    public void setEncKeyKeyRecoverable(boolean encKeyKeyRecoverable) {
        this.encKeyKeyRecoverable = encKeyKeyRecoverable;
    }


    /**
     * Gets the hardTokenSN value for this HardTokenDataWS.
     * 
     * @return hardTokenSN
     */
    public java.lang.String getHardTokenSN() {
        return hardTokenSN;
    }


    /**
     * Sets the hardTokenSN value for this HardTokenDataWS.
     * 
     * @param hardTokenSN
     */
    public void setHardTokenSN(java.lang.String hardTokenSN) {
        this.hardTokenSN = hardTokenSN;
    }


    /**
     * Gets the label value for this HardTokenDataWS.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this HardTokenDataWS.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the modifyTime value for this HardTokenDataWS.
     * 
     * @return modifyTime
     */
    public java.util.Calendar getModifyTime() {
        return modifyTime;
    }


    /**
     * Sets the modifyTime value for this HardTokenDataWS.
     * 
     * @param modifyTime
     */
    public void setModifyTime(java.util.Calendar modifyTime) {
        this.modifyTime = modifyTime;
    }


    /**
     * Gets the pinDatas value for this HardTokenDataWS.
     * 
     * @return pinDatas
     */
    public org.ejbca.core.protocol.ws.PinDataWS[] getPinDatas() {
        return pinDatas;
    }


    /**
     * Sets the pinDatas value for this HardTokenDataWS.
     * 
     * @param pinDatas
     */
    public void setPinDatas(org.ejbca.core.protocol.ws.PinDataWS[] pinDatas) {
        this.pinDatas = pinDatas;
    }

    public org.ejbca.core.protocol.ws.PinDataWS getPinDatas(int i) {
        return this.pinDatas[i];
    }

    public void setPinDatas(int i, org.ejbca.core.protocol.ws.PinDataWS _value) {
        this.pinDatas[i] = _value;
    }


    /**
     * Gets the tokenType value for this HardTokenDataWS.
     * 
     * @return tokenType
     */
    public int getTokenType() {
        return tokenType;
    }


    /**
     * Sets the tokenType value for this HardTokenDataWS.
     * 
     * @param tokenType
     */
    public void setTokenType(int tokenType) {
        this.tokenType = tokenType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HardTokenDataWS)) return false;
        HardTokenDataWS other = (HardTokenDataWS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificates==null && other.getCertificates()==null) || 
             (this.certificates!=null &&
              java.util.Arrays.equals(this.certificates, other.getCertificates()))) &&
            ((this.copies==null && other.getCopies()==null) || 
             (this.copies!=null &&
              java.util.Arrays.equals(this.copies, other.getCopies()))) &&
            ((this.copyOfSN==null && other.getCopyOfSN()==null) || 
             (this.copyOfSN!=null &&
              this.copyOfSN.equals(other.getCopyOfSN()))) &&
            ((this.createTime==null && other.getCreateTime()==null) || 
             (this.createTime!=null &&
              this.createTime.equals(other.getCreateTime()))) &&
            this.encKeyKeyRecoverable == other.isEncKeyKeyRecoverable() &&
            ((this.hardTokenSN==null && other.getHardTokenSN()==null) || 
             (this.hardTokenSN!=null &&
              this.hardTokenSN.equals(other.getHardTokenSN()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.modifyTime==null && other.getModifyTime()==null) || 
             (this.modifyTime!=null &&
              this.modifyTime.equals(other.getModifyTime()))) &&
            ((this.pinDatas==null && other.getPinDatas()==null) || 
             (this.pinDatas!=null &&
              java.util.Arrays.equals(this.pinDatas, other.getPinDatas()))) &&
            this.tokenType == other.getTokenType();
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
        if (getCertificates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertificates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertificates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCopies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCopies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCopies(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCopyOfSN() != null) {
            _hashCode += getCopyOfSN().hashCode();
        }
        if (getCreateTime() != null) {
            _hashCode += getCreateTime().hashCode();
        }
        _hashCode += (isEncKeyKeyRecoverable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHardTokenSN() != null) {
            _hashCode += getHardTokenSN().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getModifyTime() != null) {
            _hashCode += getModifyTime().hashCode();
        }
        if (getPinDatas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPinDatas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPinDatas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getTokenType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HardTokenDataWS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "hardTokenDataWS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "certificate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copies");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyOfSN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copyOfSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encKeyKeyRecoverable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encKeyKeyRecoverable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardTokenSN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hardTokenSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinDatas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pinDatas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "pinDataWS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenType"));
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
