
package com.mdsuk.ws.dise3g.bundle.dto.business;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BundleFullType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BundleFullType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Company" type="{http://mdsuk.com/ws/dise3g/base}CompanyCodeType"/>
 *         &lt;element name="BundleCode" type="{http://mdsuk.com/ws/dise3g/bundle/dto/business}BundleCodeType"/>
 *         &lt;element name="BundleEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ServiceCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ServiceCodeType"/>
 *         &lt;element name="CallClassGroupCode" type="{http://mdsuk.com/ws/dise3g/bundle/dto/business}CallClassGroupCodeType"/>
 *         &lt;element name="BundleExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BundleDescription" type="{http://mdsuk.com/ws/dise3g/bundle/dto/business}BundleDescriptionType"/>
 *         &lt;element name="BundleType" type="{http://mdsuk.com/ws/dise3g/bundle/dto/business}BundleTypeType"/>
 *         &lt;element name="BundleLinks" type="{http://mdsuk.com/ws/dise3g/bundle/dto/business}BundleLinksType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BundleFullType", propOrder = {

})
public class BundleFullType {

    @XmlElement(name = "Company", required = true)
    protected String company;
    @XmlElement(name = "BundleCode", required = true)
    protected String bundleCode;
    @XmlElement(name = "BundleEffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bundleEffectiveDate;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "CallClassGroupCode", required = true)
    protected String callClassGroupCode;
    @XmlElement(name = "BundleExpiryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bundleExpiryDate;
    @XmlElement(name = "BundleDescription", required = true)
    protected String bundleDescription;
    @XmlElement(name = "BundleType", required = true)
    protected String bundleType;
    @XmlElement(name = "BundleLinks", required = true)
    protected BigDecimal bundleLinks;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

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
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the callClassGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallClassGroupCode() {
        return callClassGroupCode;
    }

    /**
     * Sets the value of the callClassGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallClassGroupCode(String value) {
        this.callClassGroupCode = value;
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
     * Gets the value of the bundleDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleDescription() {
        return bundleDescription;
    }

    /**
     * Sets the value of the bundleDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleDescription(String value) {
        this.bundleDescription = value;
    }

    /**
     * Gets the value of the bundleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleType() {
        return bundleType;
    }

    /**
     * Sets the value of the bundleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleType(String value) {
        this.bundleType = value;
    }

    /**
     * Gets the value of the bundleLinks property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBundleLinks() {
        return bundleLinks;
    }

    /**
     * Sets the value of the bundleLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBundleLinks(BigDecimal value) {
        this.bundleLinks = value;
    }

}
