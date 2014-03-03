
package com.mdsuk.ws.dise3g.discount.dto.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FavouriteNumbersListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FavouriteNumbersListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FavouriteNumber" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}FavouriteNumberItemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FavouriteNumbersListType", propOrder = {
    "favouriteNumber"
})
public class FavouriteNumbersListType {

    @XmlElement(name = "FavouriteNumber", required = true)
    protected List<FavouriteNumberItemType> favouriteNumber;

    /**
     * Gets the value of the favouriteNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the favouriteNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFavouriteNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FavouriteNumberItemType }
     * 
     * 
     */
    public List<FavouriteNumberItemType> getFavouriteNumber() {
        if (favouriteNumber == null) {
            favouriteNumber = new ArrayList<FavouriteNumberItemType>();
        }
        return this.favouriteNumber;
    }

}
