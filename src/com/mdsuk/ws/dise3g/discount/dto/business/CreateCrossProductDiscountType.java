
package com.mdsuk.ws.dise3g.discount.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateCrossProductDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateCrossProductDiscountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Services" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}ServicesListType" minOccurs="0"/>
 *         &lt;element name="CallClassGroups" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}CallClassGroupsListType" minOccurs="0"/>
 *         &lt;element name="CrossProducts" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}CrossProductsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateCrossProductDiscountType", propOrder = {
    "services",
    "callClassGroups",
    "crossProducts"
})
public class CreateCrossProductDiscountType {

    @XmlElement(name = "Services")
    protected ServicesListType services;
    @XmlElement(name = "CallClassGroups")
    protected CallClassGroupsListType callClassGroups;
    @XmlElement(name = "CrossProducts")
    protected CrossProductsListType crossProducts;

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesListType }
     *     
     */
    public ServicesListType getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesListType }
     *     
     */
    public void setServices(ServicesListType value) {
        this.services = value;
    }

    /**
     * Gets the value of the callClassGroups property.
     * 
     * @return
     *     possible object is
     *     {@link CallClassGroupsListType }
     *     
     */
    public CallClassGroupsListType getCallClassGroups() {
        return callClassGroups;
    }

    /**
     * Sets the value of the callClassGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallClassGroupsListType }
     *     
     */
    public void setCallClassGroups(CallClassGroupsListType value) {
        this.callClassGroups = value;
    }

    /**
     * Gets the value of the crossProducts property.
     * 
     * @return
     *     possible object is
     *     {@link CrossProductsListType }
     *     
     */
    public CrossProductsListType getCrossProducts() {
        return crossProducts;
    }

    /**
     * Sets the value of the crossProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossProductsListType }
     *     
     */
    public void setCrossProducts(CrossProductsListType value) {
        this.crossProducts = value;
    }

}
