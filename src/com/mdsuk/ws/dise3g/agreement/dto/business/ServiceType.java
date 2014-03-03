
package com.mdsuk.ws.dise3g.agreement.dto.business;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CompanyCode" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}CompanyCodeType"/>
 *         &lt;element name="ServiceCode" type="{http://mdsuk.com/ws/dise3g/base}ServiceCodeType"/>
 *         &lt;element name="ASEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SalesPersonId" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}SalespersonNumberType" minOccurs="0"/>
 *         &lt;element name="ServicePrice" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="InvoiceThisService" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}InvoiceThisServiceType" minOccurs="0"/>
 *         &lt;element name="ASEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ChargeToNominalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ComissionCalculatedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {

})
public class ServiceType {

    @XmlElement(name = "CompanyCode", required = true)
    protected String companyCode;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "ASEffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asEffectiveDate;
    @XmlElement(name = "SalesPersonId")
    protected BigDecimal salesPersonId;
    @XmlElement(name = "ServicePrice")
    protected BigDecimal servicePrice;
    @XmlElement(name = "InvoiceThisService")
    protected String invoiceThisService;
    @XmlElement(name = "ASEndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar asEndDate;
    @XmlElement(name = "ChargeToNominalCode")
    protected String chargeToNominalCode;
    @XmlElement(name = "ComissionCalculatedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar comissionCalculatedDate;

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
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
     * Gets the value of the asEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getASEffectiveDate() {
        return asEffectiveDate;
    }

    /**
     * Sets the value of the asEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setASEffectiveDate(XMLGregorianCalendar value) {
        this.asEffectiveDate = value;
    }

    /**
     * Gets the value of the salesPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalesPersonId() {
        return salesPersonId;
    }

    /**
     * Sets the value of the salesPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalesPersonId(BigDecimal value) {
        this.salesPersonId = value;
    }

    /**
     * Gets the value of the servicePrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServicePrice() {
        return servicePrice;
    }

    /**
     * Sets the value of the servicePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServicePrice(BigDecimal value) {
        this.servicePrice = value;
    }

    /**
     * Gets the value of the invoiceThisService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceThisService() {
        return invoiceThisService;
    }

    /**
     * Sets the value of the invoiceThisService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceThisService(String value) {
        this.invoiceThisService = value;
    }

    /**
     * Gets the value of the asEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getASEndDate() {
        return asEndDate;
    }

    /**
     * Sets the value of the asEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setASEndDate(XMLGregorianCalendar value) {
        this.asEndDate = value;
    }

    /**
     * Gets the value of the chargeToNominalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeToNominalCode() {
        return chargeToNominalCode;
    }

    /**
     * Sets the value of the chargeToNominalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeToNominalCode(String value) {
        this.chargeToNominalCode = value;
    }

    /**
     * Gets the value of the comissionCalculatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getComissionCalculatedDate() {
        return comissionCalculatedDate;
    }

    /**
     * Sets the value of the comissionCalculatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setComissionCalculatedDate(XMLGregorianCalendar value) {
        this.comissionCalculatedDate = value;
    }

}
