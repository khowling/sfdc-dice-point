
package com.mdsuk.ws.dise3g.bundle.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BundleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BundleCode" type="{http://mdsuk.com/ws/dise3g/bundle/dto/business}BundleCodeType"/>
 *         &lt;element name="BundleTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BundleEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BundleExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleType", propOrder = {

})
public class BundleType {

    @XmlElement(name = "BundleCode", required = true)
    protected String bundleCode;
    @XmlElement(name = "BundleTypeCode", required = true)
    protected String bundleTypeCode;
    @XmlElement(name = "BundleEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bundleEffectiveDate;
    @XmlElement(name = "BundleExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bundleExpiryDate;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the bundleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleCode() {
        return bundleCode;
    }

    /**
     * Sets the value of the bundleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleCode(String value) {
        this.bundleCode = value;
    }

    /**
     * Gets the value of the bundleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleTypeCode() {
        return bundleTypeCode;
    }

    /**
     * Sets the value of the bundleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleTypeCode(String value) {
        this.bundleTypeCode = value;
    }

    /**
     * Gets the value of the bundleEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBundleEffectiveDate() {
        return bundleEffectiveDate;
    }

    /**
     * Sets the value of the bundleEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBundleEffectiveDate(XMLGregorianCalendar value) {
        this.bundleEffectiveDate = value;
    }

    /**
     * Gets the value of the bundleExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBundleExpiryDate() {
        return bundleExpiryDate;
    }

    /**
     * Sets the value of the bundleExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBundleExpiryDate(XMLGregorianCalendar value) {
        this.bundleExpiryDate = value;
    }

    /**
     * Gets the value of the lastAmendedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAmendedDate() {
        return lastAmendedDate;
    }

    /**
     * Sets the value of the lastAmendedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAmendedDate(XMLGregorianCalendar value) {
        this.lastAmendedDate = value;
    }

}
