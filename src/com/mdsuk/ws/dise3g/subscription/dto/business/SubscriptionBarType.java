
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubscriptionBarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionBarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="NetworkCommandCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BarredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UnBarredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BarReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnbarReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdminBarFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "SubscriptionBarType", propOrder = {

})
public class SubscriptionBarType {

    @XmlElement(name = "NetworkCommandCode", required = true)
    protected String networkCommandCode;
    @XmlElement(name = "BarredDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar barredDate;
    @XmlElement(name = "UnBarredDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar unBarredDate;
    @XmlElement(name = "BarReasonCode")
    protected String barReasonCode;
    @XmlElement(name = "UnbarReasonCode")
    protected String unbarReasonCode;
    @XmlElement(name = "AdminBarFlag")
    protected Boolean adminBarFlag;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the networkCommandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkCommandCode() {
        return networkCommandCode;
    }

    /**
     * Sets the value of the networkCommandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkCommandCode(String value) {
        this.networkCommandCode = value;
    }

    /**
     * Gets the value of the barredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBarredDate() {
        return barredDate;
    }

    /**
     * Sets the value of the barredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBarredDate(XMLGregorianCalendar value) {
        this.barredDate = value;
    }

    /**
     * Gets the value of the unBarredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUnBarredDate() {
        return unBarredDate;
    }

    /**
     * Sets the value of the unBarredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUnBarredDate(XMLGregorianCalendar value) {
        this.unBarredDate = value;
    }

    /**
     * Gets the value of the barReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarReasonCode() {
        return barReasonCode;
    }

    /**
     * Sets the value of the barReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarReasonCode(String value) {
        this.barReasonCode = value;
    }

    /**
     * Gets the value of the unbarReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnbarReasonCode() {
        return unbarReasonCode;
    }

    /**
     * Sets the value of the unbarReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnbarReasonCode(String value) {
        this.unbarReasonCode = value;
    }

    /**
     * Gets the value of the adminBarFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdminBarFlag() {
        return adminBarFlag;
    }

    /**
     * Sets the value of the adminBarFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdminBarFlag(Boolean value) {
        this.adminBarFlag = value;
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
