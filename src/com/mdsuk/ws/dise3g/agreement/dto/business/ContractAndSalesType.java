
package com.mdsuk.ws.dise3g.agreement.dto.business;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data structure  returned by Agreement Query Response when CONTRACTANDSALES dataset is specified
 * 
 * <p>Java class for ContractAndSalesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractAndSalesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SalesAccountCodeType" type="{http://mdsuk.com/ws/dise3g/base}SalesAccountCodeType" minOccurs="0"/>
 *         &lt;element name="TermsAndConditionsGroupCode" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}TermsAndConditionsGroupCodeType" minOccurs="0"/>
 *         &lt;element name="TermsAndConditionsEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DefaultContractTermMonths" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
@XmlType(name = "ContractAndSalesType", propOrder = {

})
public class ContractAndSalesType {

    @XmlElement(name = "SalesAccountCodeType")
    protected Integer salesAccountCodeType;
    @XmlElement(name = "TermsAndConditionsGroupCode")
    protected String termsAndConditionsGroupCode;
    @XmlElement(name = "TermsAndConditionsEffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termsAndConditionsEffectiveDate;
    @XmlElement(name = "DefaultContractTermMonths")
    protected BigInteger defaultContractTermMonths;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the salesAccountCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesAccountCodeType() {
        return salesAccountCodeType;
    }

    /**
     * Sets the value of the salesAccountCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesAccountCodeType(Integer value) {
        this.salesAccountCodeType = value;
    }

    /**
     * Gets the value of the termsAndConditionsGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditionsGroupCode() {
        return termsAndConditionsGroupCode;
    }

    /**
     * Sets the value of the termsAndConditionsGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditionsGroupCode(String value) {
        this.termsAndConditionsGroupCode = value;
    }

    /**
     * Gets the value of the termsAndConditionsEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermsAndConditionsEffectiveDate() {
        return termsAndConditionsEffectiveDate;
    }

    /**
     * Sets the value of the termsAndConditionsEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermsAndConditionsEffectiveDate(XMLGregorianCalendar value) {
        this.termsAndConditionsEffectiveDate = value;
    }

    /**
     * Gets the value of the defaultContractTermMonths property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefaultContractTermMonths() {
        return defaultContractTermMonths;
    }

    /**
     * Sets the value of the defaultContractTermMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefaultContractTermMonths(BigInteger value) {
        this.defaultContractTermMonths = value;
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
