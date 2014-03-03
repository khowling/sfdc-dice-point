
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutoContractRenewalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoContractRenewalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AutoContractRenewal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ContractTemplateCode" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}UpdateContractTemplateCodeType" minOccurs="0"/>
 *         &lt;element name="RenewalContractTemplateCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength8Type" minOccurs="0"/>
 *         &lt;element name="OptOutDeliveryAddressCode" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}UpdateOptOutAddressCodeType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutoContractRenewalType", propOrder = {

})
public class AutoContractRenewalType {

    @XmlElement(name = "AutoContractRenewal")
    protected boolean autoContractRenewal;
    @XmlElement(name = "ContractTemplateCode")
    protected String contractTemplateCode;
    @XmlElement(name = "RenewalContractTemplateCode")
    protected String renewalContractTemplateCode;
    @XmlElement(name = "OptOutDeliveryAddressCode")
    protected Integer optOutDeliveryAddressCode;

    /**
     * Gets the value of the autoContractRenewal property.
     * 
     */
    public boolean isAutoContractRenewal() {
        return autoContractRenewal;
    }

    /**
     * Sets the value of the autoContractRenewal property.
     * 
     */
    public void setAutoContractRenewal(boolean value) {
        this.autoContractRenewal = value;
    }

    /**
     * Gets the value of the contractTemplateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTemplateCode() {
        return contractTemplateCode;
    }

    /**
     * Sets the value of the contractTemplateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTemplateCode(String value) {
        this.contractTemplateCode = value;
    }

    /**
     * Gets the value of the renewalContractTemplateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewalContractTemplateCode() {
        return renewalContractTemplateCode;
    }

    /**
     * Sets the value of the renewalContractTemplateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewalContractTemplateCode(String value) {
        this.renewalContractTemplateCode = value;
    }

    /**
     * Gets the value of the optOutDeliveryAddressCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOptOutDeliveryAddressCode() {
        return optOutDeliveryAddressCode;
    }

    /**
     * Sets the value of the optOutDeliveryAddressCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOptOutDeliveryAddressCode(Integer value) {
        this.optOutDeliveryAddressCode = value;
    }

}
