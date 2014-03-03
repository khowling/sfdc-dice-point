
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.mdsuk.ws.dise3g.base.ClearableDateType;


/**
 * Update the Contract And Sales data associated with a Subscription - TB
 *                 check these are stored on Sub file rather than agreement file!!!
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
 *         &lt;element name="ContractNumber" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ContractNumberType" minOccurs="0"/>
 *         &lt;element name="ContractStartDate" type="{http://mdsuk.com/ws/dise3g/base}ClearableDateType" minOccurs="0"/>
 *         &lt;element name="TermOfContract" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ContractTermType" minOccurs="0"/>
 *         &lt;element name="TermsAndConditionsGroupCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}TermsAndConditionsGroupCodeType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType"/>
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

    @XmlElement(name = "ContractNumber")
    protected String contractNumber;
    @XmlElement(name = "ContractStartDate")
    protected ClearableDateType contractStartDate;
    @XmlElement(name = "TermOfContract")
    protected Integer termOfContract;
    @XmlElement(name = "TermsAndConditionsGroupCode")
    protected String termsAndConditionsGroupCode;
    @XmlElement(name = "LastAmendedDate", required = true)
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the contractStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link ClearableDateType }
     *     
     */
    public ClearableDateType getContractStartDate() {
        return contractStartDate;
    }

    /**
     * Sets the value of the contractStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearableDateType }
     *     
     */
    public void setContractStartDate(ClearableDateType value) {
        this.contractStartDate = value;
    }

    /**
     * Gets the value of the termOfContract property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTermOfContract() {
        return termOfContract;
    }

    /**
     * Sets the value of the termOfContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTermOfContract(Integer value) {
        this.termOfContract = value;
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
