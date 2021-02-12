/**
 * RevokeStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.ejbca.core.protocol.ws;

import org.ejbca.core.model.ca.crl.RevokedCertInfo;

public class RevokeStatus  implements java.io.Serializable {
    private java.lang.String certificateSN;

    private java.lang.String issuerDN;

    private int reason;

    private java.util.Calendar revocationDate;

    
    /** Constants defining different revocation reasons. */
    public static final int NOT_REVOKED                            = RevokedCertInfo.NOT_REVOKED;
    public static final int REVOKATION_REASON_UNSPECIFIED          = RevokedCertInfo.REVOCATION_REASON_UNSPECIFIED;
    public static final int REVOKATION_REASON_KEYCOMPROMISE        = RevokedCertInfo.REVOCATION_REASON_KEYCOMPROMISE;
    public static final int REVOKATION_REASON_CACOMPROMISE         = RevokedCertInfo.REVOCATION_REASON_CACOMPROMISE;
    public static final int REVOKATION_REASON_AFFILIATIONCHANGED   = RevokedCertInfo.REVOCATION_REASON_AFFILIATIONCHANGED;
    public static final int REVOKATION_REASON_SUPERSEDED           = RevokedCertInfo.REVOCATION_REASON_SUPERSEDED;
    public static final int REVOKATION_REASON_CESSATIONOFOPERATION = RevokedCertInfo.REVOCATION_REASON_CESSATIONOFOPERATION;
    public static final int REVOKATION_REASON_CERTIFICATEHOLD      = RevokedCertInfo.REVOCATION_REASON_CERTIFICATEHOLD;
    public static final int REVOKATION_REASON_REMOVEFROMCRL        = RevokedCertInfo.REVOCATION_REASON_REMOVEFROMCRL;
    public static final int REVOKATION_REASON_PRIVILEGESWITHDRAWN  = RevokedCertInfo.REVOCATION_REASON_PRIVILEGESWITHDRAWN;
    public static final int REVOKATION_REASON_AACOMPROMISE         = RevokedCertInfo.REVOCATION_REASON_AACOMPROMISE;
    
    
    
    public RevokeStatus() {
    }

    public RevokeStatus(
           java.lang.String certificateSN,
           java.lang.String issuerDN,
           int reason,
           java.util.Calendar revocationDate) {
           this.certificateSN = certificateSN;
           this.issuerDN = issuerDN;
           this.reason = reason;
           this.revocationDate = revocationDate;
    }


    /**
     * Gets the certificateSN value for this RevokeStatus.
     * 
     * @return certificateSN
     */
    public java.lang.String getCertificateSN() {
        return certificateSN;
    }


    /**
     * Sets the certificateSN value for this RevokeStatus.
     * 
     * @param certificateSN
     */
    public void setCertificateSN(java.lang.String certificateSN) {
        this.certificateSN = certificateSN;
    }


    /**
     * Gets the issuerDN value for this RevokeStatus.
     * 
     * @return issuerDN
     */
    public java.lang.String getIssuerDN() {
        return issuerDN;
    }


    /**
     * Sets the issuerDN value for this RevokeStatus.
     * 
     * @param issuerDN
     */
    public void setIssuerDN(java.lang.String issuerDN) {
        this.issuerDN = issuerDN;
    }


    /**
     * Gets the reason value for this RevokeStatus.
     * 
     * @return reason
     */
    public int getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this RevokeStatus.
     * 
     * @param reason
     */
    public void setReason(int reason) {
        this.reason = reason;
    }


    /**
     * Gets the revocationDate value for this RevokeStatus.
     * 
     * @return revocationDate
     */
    public java.util.Calendar getRevocationDate() {
        return revocationDate;
    }


    /**
     * Sets the revocationDate value for this RevokeStatus.
     * 
     * @param revocationDate
     */
    public void setRevocationDate(java.util.Calendar revocationDate) {
        this.revocationDate = revocationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RevokeStatus)) return false;
        RevokeStatus other = (RevokeStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certificateSN==null && other.getCertificateSN()==null) || 
             (this.certificateSN!=null &&
              this.certificateSN.equals(other.getCertificateSN()))) &&
            ((this.issuerDN==null && other.getIssuerDN()==null) || 
             (this.issuerDN!=null &&
              this.issuerDN.equals(other.getIssuerDN()))) &&
            this.reason == other.getReason() &&
            ((this.revocationDate==null && other.getRevocationDate()==null) || 
             (this.revocationDate!=null &&
              this.revocationDate.equals(other.getRevocationDate())));
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
        if (getCertificateSN() != null) {
            _hashCode += getCertificateSN().hashCode();
        }
        if (getIssuerDN() != null) {
            _hashCode += getIssuerDN().hashCode();
        }
        _hashCode += getReason();
        if (getRevocationDate() != null) {
            _hashCode += getRevocationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RevokeStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.protocol.core.ejbca.org/", "revokeStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificateSN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certificateSN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuerDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revocationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revocationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
