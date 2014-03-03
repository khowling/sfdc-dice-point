
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UpdateSubscriptionInvoiceControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSubscriptionInvoiceControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="GenericText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OverrideTaxCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrintStatementSubscription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrintStatementSubscriptionFormat" type="{http://mdsuk.com/ws/dise3g/account/dto/business}PrintStatementSubscriptionFormatType" minOccurs="0"/>
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
@XmlType(name = "UpdateSubscriptionInvoiceControlType", propOrder = {

})
public class UpdateSubscriptionInvoiceControlType {

    @XmlElement(name = "GenericText")
    protected Boolean genericText;
    @XmlElement(name = "OverrideTaxCode")
    protected Boolean overrideTaxCode;
    @XmlElement(name = "PrintStatementSubscription")
    protected Boolean printStatementSubscription;
    @XmlElement(name = "PrintStatementSubscriptionFormat")
    protected String printStatementSubscriptionFormat;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the genericText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenericText() {
        return genericText;
    }

    /**
     * Sets the value of the genericText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenericText(Boolean value) {
        this.genericText = value;
    }

    /**
     * Gets the value of the overrideTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideTaxCode() {
        return overrideTaxCode;
    }

    /**
     * Sets the value of the overrideTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideTaxCode(Boolean value) {
        this.overrideTaxCode = value;
    }

    /**
     * Gets the value of the printStatementSubscription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintStatementSubscription() {
        return printStatementSubscription;
    }

    /**
     * Sets the value of the printStatementSubscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintStatementSubscription(Boolean value) {
        this.printStatementSubscription = value;
    }

    /**
     * Gets the value of the printStatementSubscriptionFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintStatementSubscriptionFormat() {
        return printStatementSubscriptionFormat;
    }

    /**
     * Sets the value of the printStatementSubscriptionFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintStatementSubscriptionFormat(String value) {
        this.printStatementSubscriptionFormat = value;
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
