
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Agreement data which can be updated with an "UpdateContractAndSales" dataset 
 *             Attribute names match existing query attributes or names in GUI panel for clarity
 *             Query attribute DefaultContractTermMonths is TermOfAgreement here (and on GUI)
 *             
 * 
 * <p>Java class for UpdateContractAndSalesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateContractAndSalesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SalesAccountCode" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}UpdateSalesAccountCodeType" minOccurs="0"/>
 *         &lt;element name="TermsAndConditionsGroupCode" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}TermsAndConditionsGroupCodeType" minOccurs="0"/>
 *         &lt;element name="TermOfAgreement" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}UpdateTermOfAgreementType" minOccurs="0"/>
 *         &lt;element name="ContractCode" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}ContractCodeType" minOccurs="0"/>
 *         &lt;element name="AutoContractRenewal" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}AutoContractRenewalType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateContractAndSalesType", propOrder = {

})
public class UpdateContractAndSalesType {

    @XmlElement(name = "SalesAccountCode")
    protected Integer salesAccountCode;
    @XmlElement(name = "TermsAndConditionsGroupCode")
    protected String termsAndConditionsGroupCode;
    @XmlElement(name = "TermOfAgreement")
    protected Integer termOfAgreement;
    @XmlElement(name = "ContractCode")
    protected String contractCode;
    @XmlElement(name = "AutoContractRenewal")
    protected AutoContractRenewalType autoContractRenewal;
    @XmlElement(name = "LastAmendedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the salesAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesAccountCode() {
        return salesAccountCode;
    }

    /**
     * Sets the value of the salesAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesAccountCode(Integer value) {
        this.salesAccountCode = value;
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
     * Gets the value of the termOfAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTermOfAgreement() {
        return termOfAgreement;
    }

    /**
     * Sets the value of the termOfAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTermOfAgreement(Integer value) {
        this.termOfAgreement = value;
    }

    /**
     * Gets the value of the contractCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * Sets the value of the contractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractCode(String value) {
        this.contractCode = value;
    }

    /**
     * Gets the value of the autoContractRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link AutoContractRenewalType }
     *     
     */
    public AutoContractRenewalType getAutoContractRenewal() {
        return autoContractRenewal;
    }

    /**
     * Sets the value of the autoContractRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoContractRenewalType }
     *     
     */
    public void setAutoContractRenewal(AutoContractRenewalType value) {
        this.autoContractRenewal = value;
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
