
package com.mdsuk.ws.dise3g.discount.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateFavouriteNumberDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateFavouriteNumberDiscountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallClassGroups" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}CallClassGroupsListType" minOccurs="0"/>
 *         &lt;element name="FavouriteNumbers" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}FavouriteNumbersListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateFavouriteNumberDiscountType", propOrder = {
    "callClassGroups",
    "favouriteNumbers"
})
public class CreateFavouriteNumberDiscountType {

    @XmlElement(name = "CallClassGroups")
    protected CallClassGroupsListType callClassGroups;
    @XmlElement(name = "FavouriteNumbers")
    protected FavouriteNumbersListType favouriteNumbers;

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
     * Gets the value of the favouriteNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link FavouriteNumbersListType }
     *     
     */
    public FavouriteNumbersListType getFavouriteNumbers() {
        return favouriteNumbers;
    }

    /**
     * Sets the value of the favouriteNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FavouriteNumbersListType }
     *     
     */
    public void setFavouriteNumbers(FavouriteNumbersListType value) {
        this.favouriteNumbers = value;
    }

}
