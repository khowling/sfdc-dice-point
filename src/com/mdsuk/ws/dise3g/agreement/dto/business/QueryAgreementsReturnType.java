
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.account.dto.business.TargetIdentifierType;
import com.mdsuk.ws.dise3g.base.LevelType;


/**
 * <p>Java class for QueryAgreementsReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryAgreementsReturnType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AgreementNumber" type="{http://mdsuk.com/ws/dise3g/base}AgreementNumberType"/>
 *         &lt;element name="InvoiceLoggedAt" type="{http://mdsuk.com/ws/dise3g/account/dto/business}TargetIdentifierType" minOccurs="0"/>
 *         &lt;element name="InvoiceConsolidationLevel" type="{http://mdsuk.com/ws/dise3g/base}LevelType" minOccurs="0"/>
 *         &lt;element name="InvoiceAddress" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}InvoiceAddressType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryAgreementsReturnType", propOrder = {

})
public class QueryAgreementsReturnType {

    @XmlElement(name = "AgreementNumber")
    protected int agreementNumber;
    @XmlElement(name = "InvoiceLoggedAt")
    protected TargetIdentifierType invoiceLoggedAt;
    @XmlElement(name = "InvoiceConsolidationLevel")
    protected LevelType invoiceConsolidationLevel;
    @XmlElement(name = "InvoiceAddress")
    protected InvoiceAddressType invoiceAddress;

    /**
     * Gets the value of the agreementNumber property.
     * 
     */
    public int getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     */
    public void setAgreementNumber(int value) {
        this.agreementNumber = value;
    }

    /**
     * Gets the value of the invoiceLoggedAt property.
     * 
     * @return
     *     possible object is
     *     {@link TargetIdentifierType }
     *     
     */
    public TargetIdentifierType getInvoiceLoggedAt() {
        return invoiceLoggedAt;
    }

    /**
     * Sets the value of the invoiceLoggedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetIdentifierType }
     *     
     */
    public void setInvoiceLoggedAt(TargetIdentifierType value) {
        this.invoiceLoggedAt = value;
    }

    /**
     * Gets the value of the invoiceConsolidationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LevelType }
     *     
     */
    public LevelType getInvoiceConsolidationLevel() {
        return invoiceConsolidationLevel;
    }

    /**
     * Sets the value of the invoiceConsolidationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelType }
     *     
     */
    public void setInvoiceConsolidationLevel(LevelType value) {
        this.invoiceConsolidationLevel = value;
    }

    /**
     * Gets the value of the invoiceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAddressType }
     *     
     */
    public InvoiceAddressType getInvoiceAddress() {
        return invoiceAddress;
    }

    /**
     * Sets the value of the invoiceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAddressType }
     *     
     */
    public void setInvoiceAddress(InvoiceAddressType value) {
        this.invoiceAddress = value;
    }

}
