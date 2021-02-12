
package cl.c2c.ejbca;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchtype" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="matchvalue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matchwith" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userMatch", propOrder = {
    "matchtype",
    "matchvalue",
    "matchwith"
})
public class UserMatch {
    public static final int MATCH_NONE                     = -1;

    public static final int MATCH_WITH_USERNAME            = 0;
    public static final int MATCH_WITH_EMAIL               = 1;
    public static final int MATCH_WITH_STATUS              = 2; // Value must the number representation.
    public static final int MATCH_WITH_ENDENTITYPROFILE    = 3; // Matches the profile id not profilename.
    public static final int MATCH_WITH_CERTIFICATEPROFILE  = 4; // Matches the certificatetype id not name.
    public static final int MATCH_WITH_CA                  = 5; // Matches the CA id not CA name.
    public static final int MATCH_WITH_TOKEN               = 6;
    public static final int MATCH_WITH_DN                  = 7;
    // Subject DN fields.
    public static final int MATCH_WITH_UID                 = 100;
    public static final int MATCH_WITH_COMMONNAME          = 101;
    public static final int MATCH_WITH_DNSERIALNUMBER      = 102;
    public static final int MATCH_WITH_GIVENNAME           = 103;
    public static final int MATCH_WITH_INITIALS            = 104;
    public static final int MATCH_WITH_SURNAME             = 105;
    public static final int MATCH_WITH_TITLE               = 106;
    public static final int MATCH_WITH_ORGANIZATIONALUNIT  = 107;
    public static final int MATCH_WITH_ORGANIZATION        = 108;
    public static final int MATCH_WITH_LOCALITY            = 109;
    public static final int MATCH_WITH_STATEORPROVINCE     = 110;
    public static final int MATCH_WITH_DOMAINCOMPONENT     = 111;
    public static final int MATCH_WITH_COUNTRY             = 112;
    // Subject Altname Fields
    public static final int MATCH_WITH_RFC822NAME          = 200;
    public static final int MATCH_WITH_DNSNAME             = 201;
    public static final int MATCH_WITH_IPADDRESS           = 202;
    public static final int MATCH_WITH_X400ADDRESS         = 203;
    public static final int MATCH_WITH_DIRECTORYNAME       = 204;
    public static final int MATCH_WITH_EDIPARTYNAME        = 205;
    public static final int MATCH_WITH_URI                 = 206;
    public static final int MATCH_WITH_REGISTEREDID        = 207;
    public static final int MATCH_WITH_UPN                 = 208;
    public static final int MATCH_WITH_GUID                = 209;

    public static final int MATCH_TYPE_EQUALS = 0;
    public static final int MATCH_TYPE_BEGINSWITH = 1;
    public static final int MATCH_TYPE_CONTAINS = 2;
    

    protected int matchtype;
    protected String matchvalue;
    protected int matchwith;

    /**
     * Gets the value of the matchtype property.
     * 
     */
    public int getMatchtype() {
        return matchtype;
    }

    /**
     * Sets the value of the matchtype property.
     * 
     */
    public void setMatchtype(int value) {
        this.matchtype = value;
    }

    /**
     * Gets the value of the matchvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchvalue() {
        return matchvalue;
    }

    /**
     * Sets the value of the matchvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchvalue(String value) {
        this.matchvalue = value;
    }

    /**
     * Gets the value of the matchwith property.
     * 
     */
    public int getMatchwith() {
        return matchwith;
    }

    /**
     * Sets the value of the matchwith property.
     * 
     */
    public void setMatchwith(int value) {
        this.matchwith = value;
    }

}
