/**
 * TokenCertificateRequestWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

public class TokenCertificateRequestWS  implements java.io.Serializable {
    private java.lang.String CAName;

    private java.lang.String certificateProfileName;

    private java.lang.String keyalg;

    private java.lang.String keyspec;

    private byte[] pkcs10Data;

    private java.lang.String tokenType;

    private int type;

    private java.lang.String validityIdDays;

    public TokenCertificateRequestWS() {
    }

    public TokenCertificateRequestWS(
           java.lang.String CAName,
           java.lang.String certificateProfileName,
           java.lang.String keyalg,
           java.lang.String keyspec,
           byte[] pkcs10Data,
           java.lang.String tokenType,
           int type,
           java.lang.String validityIdDays) {
           this.CAName = CAName;
           this.certificateProfileName = certificateProfileName;
           this.keyalg = keyalg;
           this.keyspec = keyspec;
           this.pkcs10Data = pkcs10Data;
           this.tokenType = tokenType;
           this.type = type;
           this.validityIdDays = validityIdDays;
    }


    /**
     * Gets the CAName value for this TokenCertificateRequestWS.
     * 
     * @return CAName
     */
    public java.lang.String getCAName() {
        return CAName;
    }


    /**
     * Sets the CAName value for this TokenCertificateRequestWS.
     * 
     * @param CAName
     */
    public void setCAName(java.lang.String CAName) {
        this.CAName = CAName;
    }


    /**
     * Gets the certificateProfileName value for this TokenCertificateRequestWS.
     * 
     * @return certificateProfileName
     */
    public java.lang.String getCertificateProfileName() {
        return certificateProfileName;
    }


    /**
     * Sets the certificateProfileName value for this TokenCertificateRequestWS.
     * 
     * @param certificateProfileName
     */
    public void setCertificateProfileName(java.lang.String certificateProfileName) {
        this.certificateProfileName = certificateProfileName;
    }


    /**
     * Gets the keyalg value for this TokenCertificateRequestWS.
     * 
     * @return keyalg
     */
    public java.lang.String getKeyalg() {
        return keyalg;
    }


    /**
     * Sets the keyalg value for this TokenCertificateRequestWS.
     * 
     * @param keyalg
     */
    public void setKeyalg(java.lang.String keyalg) {
        this.keyalg = keyalg;
    }


    /**
     * Gets the keyspec value for this TokenCertificateRequestWS.
     * 
     * @return keyspec
     */
    public java.lang.String getKeyspec() {
        return keyspec;
    }


    /**
     * Sets the keyspec value for this TokenCertificateRequestWS.
     * 
     * @param keyspec
     */
    public void setKeyspec(java.lang.String keyspec) {
        this.keyspec = keyspec;
    }


    /**
     * Gets the pkcs10Data value for this TokenCertificateRequestWS.
     * 
     * @return pkcs10Data
     */
    public byte[] getPkcs10Data() {
        return pkcs10Data;
    }


    /**
     * Sets the pkcs10Data value for this TokenCertificateRequestWS.
     * 
     * @param pkcs10Data
     */
    public void setPkcs10Data(byte[] pkcs10Data) {
        this.pkcs10Data = pkcs10Data;
    }


    /**
     * Gets the tokenType value for this TokenCertificateRequestWS.
     * 
     * @return tokenType
     */
    public java.lang.String getTokenType() {
        return tokenType;
    }


    /**
     * Sets the tokenType value for this TokenCertificateRequestWS.
     * 
     * @param tokenType
     */
    public void setTokenType(java.lang.String tokenType) {
        this.tokenType = tokenType;
    }


    /**
     * Gets the type value for this TokenCertificateRequestWS.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this TokenCertificateRequestWS.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the validityIdDays value for this TokenCertificateRequestWS.
     * 
     * @return validityIdDays
     */
    public java.lang.String getValidityIdDays() {
        return validityIdDays;
    }


    /**
     * Sets the validityIdDays value for this TokenCertificateRequestWS.
     * 
     * @param validityIdDays
     */
    public void setValidityIdDays(java.lang.String validityIdDays) {
        this.validityIdDays = validityIdDays;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TokenCertificateRequestWS)) return false;
        TokenCertificateRequestWS other = (TokenCertificateRequestWS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CAName==null && other.getCAName()==null) || 
             (this.CAName!=null &&
              this.CAName.equals(other.getCAName()))) &&
            ((this.certificateProfileName==null && other.getCertificateProfileName()==null) || 
             (this.certificateProfileName!=null &&
              this.certificateProfileName.equals(other.getCertificateProfileName()))) &&
            ((this.keyalg==null && other.getKeyalg()==null) || 
             (this.keyalg!=null &&
              this.keyalg.equals(other.getKeyalg()))) &&
            ((this.keyspec==null && other.getKeyspec()==null) || 
             (this.keyspec!=null &&
              this.keyspec.equals(other.getKeyspec()))) &&
            ((this.pkcs10Data==null && other.getPkcs10Data()==null) || 
             (this.pkcs10Data!=null &&
              java.util.Arrays.equals(this.pkcs10Data, other.getPkcs10Data()))) &&
            ((this.tokenType==null && other.getTokenType()==null) || 
             (this.tokenType!=null &&
              this.tokenType.equals(other.getTokenType()))) &&
            this.type == other.getType() &&
            ((this.validityIdDays==null && other.getValidityIdDays()==null) || 
             (this.validityIdDays!=null &&
              this.validityIdDays.equals(other.getValidityIdDays())));
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
        if (getCAName() != null) {
            _hashCode += getCAName().hashCode();
        }
        if (getCertificateProfileName() != null) {
            _hashCode += getCertificateProfileName().hashCode();
        }
        if (getKeyalg() != null) {
            _hashCode += getKeyalg().hashCode();
        }
        if (getKeyspec() != null) {
            _hashCode += getKeyspec().hashCode();
        }
        if (getPkcs10Data() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPkcs10Data());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPkcs10Data(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTokenType() != null) {
            _hashCode += getTokenType().hashCode();
        }
        _hashCode += getType();
        if (getValidityIdDays() != null) {
            _hashCode += getValidityIdDays().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TokenCertificateRequestWS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "tokenCertificateRequestWS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CAName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateProfileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificateProfileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyalg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyalg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyspec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyspec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pkcs10Data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pkcs10Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tokenType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tokenType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validityIdDays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validityIdDays"));
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
