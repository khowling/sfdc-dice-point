
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure is returned as part of the Subscription Query response
 *                 when DISCOUNTOVERRIDES dataset is specified
 * 
 * <p>Java class for DiscountsOverridesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountsOverridesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="IgnoreAgreementDiscounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IgnoreAccountDiscounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "DiscountsOverridesType", propOrder = {

})
public class DiscountsOverridesType {

    @XmlElement(name = "IgnoreAgreementDiscounts")
    protected Boolean ignoreAgreementDiscounts;
    @XmlElement(name = "IgnoreAccountDiscounts")
    protected Boolean ignoreAccountDiscounts;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the ignoreAgreementDiscounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreAgreementDiscounts() {
        return ignoreAgreementDiscounts;
    }

    /**
     * Sets the value of the ignoreAgreementDiscounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreAgreementDiscounts(Boolean value) {
        this.ignoreAgreementDiscounts = value;
    }

    /**
     * Gets the value of the ignoreAccountDiscounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreAccountDiscounts() {
        return ignoreAccountDiscounts;
    }

    /**
     * Sets the value of the ignoreAccountDiscounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreAccountDiscounts(Boolean value) {
        this.ignoreAccountDiscounts = value;
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
