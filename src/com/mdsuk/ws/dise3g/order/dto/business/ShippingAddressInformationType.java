
package com.mdsuk.ws.dise3g.order.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.address.dto.business.AddressType;
import com.mdsuk.ws.dise3g.base.LevelType;


/**
 * <p>Java class for ShippingAddressInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingAddressInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AddressID" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressCodeType"/>
 *         &lt;element name="HierarchyLevel" type="{http://mdsuk.com/ws/dise3g/base}LevelType"/>
 *         &lt;element name="Address" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingAddressInformationType", propOrder = {
    "addressID",
    "hierarchyLevel",
    "address"
})
public class ShippingAddressInformationType {

    @XmlElement(name = "AddressID")
    protected Integer addressID;
    @XmlElement(name = "HierarchyLevel")
    protected LevelType hierarchyLevel;
    @XmlElement(name = "Address")
    protected AddressType address;

    /**
     * Gets the value of the addressID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddressID() {
        return addressID;
    }

    /**
     * Sets the value of the addressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddressID(Integer value) {
        this.addressID = value;
    }

    /**
     * Gets the value of the hierarchyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LevelType }
     *     
     */
    public LevelType getHierarchyLevel() {
        return hierarchyLevel;
    }

    /**
     * Sets the value of the hierarchyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelType }
     *     
     */
    public void setHierarchyLevel(LevelType value) {
        this.hierarchyLevel = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

}
