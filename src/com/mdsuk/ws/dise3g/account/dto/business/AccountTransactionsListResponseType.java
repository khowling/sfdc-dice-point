
package com.mdsuk.ws.dise3g.account.dto.business;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data structure returned as response for QueryAccountTransaction after filter beeing applied
 * 
 * <p>Java class for AccountTransactionsListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountTransactionsListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="DescriptionType" type="{http://mdsuk.com/ws/dise3g/account/dto/business}DescriptionTypeType" minOccurs="0"/>
 *         &lt;element name="ReferenceType" type="{http://mdsuk.com/ws/dise3g/account/dto/business}ReferenceTypeType" minOccurs="0"/>
 *         &lt;element name="TaxDateType" type="{http://mdsuk.com/ws/dise3g/account/dto/business}TaxDateTypeType" minOccurs="0"/>
 *         &lt;element name="RemarkType" type="{http://mdsuk.com/ws/dise3g/account/dto/business}RemarkTypeType" minOccurs="0"/>
 *         &lt;element name="GrossAmountType" type="{http://mdsuk.com/ws/dise3g/account/dto/business}GrossAmountTypeType" minOccurs="0"/>
 *         &lt;element name="OpenAmountType" type="{http://mdsuk.com/ws/dise3g/account/dto/business}OpenAmountTypeType" minOccurs="0"/>
 *         &lt;element name="DueDateType" type="{http://mdsuk.com/ws/dise3g/account/dto/business}DueDateTypeType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountTransactionsListResponseType", propOrder = {

})
public class AccountTransactionsListResponseType {

    @XmlElement(name = "DescriptionType")
    protected String descriptionType;
    @XmlElement(name = "ReferenceType")
    protected String referenceType;
    @XmlElement(name = "TaxDateType")
    protected XMLGregorianCalendar taxDateType;
    @XmlElement(name = "RemarkType")
    protected String remarkType;
    @XmlElement(name = "GrossAmountType")
    protected BigDecimal grossAmountType;
    @XmlElement(name = "OpenAmountType")
    protected BigDecimal openAmountType;
    @XmlElement(name = "DueDateType")
    protected XMLGregorianCalendar dueDateType;

    /**
     * Gets the value of the descriptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionType() {
        return descriptionType;
    }

    /**
     * Sets the value of the descriptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionType(String value) {
        this.descriptionType = value;
    }

    /**
     * Gets the value of the referenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceType() {
        return referenceType;
    }

    /**
     * Sets the value of the referenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceType(String value) {
        this.referenceType = value;
    }

    /**
     * Gets the value of the taxDateType property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTaxDateType() {
        return taxDateType;
    }

    /**
     * Sets the value of the taxDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTaxDateType(XMLGregorianCalendar value) {
        this.taxDateType = value;
    }

    /**
     * Gets the value of the remarkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkType() {
        return remarkType;
    }

    /**
     * Sets the value of the remarkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkType(String value) {
        this.remarkType = value;
    }

    /**
     * Gets the value of the grossAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossAmountType() {
        return grossAmountType;
    }

    /**
     * Sets the value of the grossAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossAmountType(BigDecimal value) {
        this.grossAmountType = value;
    }

    /**
     * Gets the value of the openAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOpenAmountType() {
        return openAmountType;
    }

    /**
     * Sets the value of the openAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOpenAmountType(BigDecimal value) {
        this.openAmountType = value;
    }

    /**
     * Gets the value of the dueDateType property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDateType() {
        return dueDateType;
    }

    /**
     * Sets the value of the dueDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDateType(XMLGregorianCalendar value) {
        this.dueDateType = value;
    }

}
