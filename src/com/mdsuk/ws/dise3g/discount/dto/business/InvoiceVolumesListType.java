
package com.mdsuk.ws.dise3g.discount.dto.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceVolumesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceVolumesListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceVolume" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}InvoiceVolumeItemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceVolumesListType", propOrder = {
    "invoiceVolume"
})
public class InvoiceVolumesListType {

    @XmlElement(name = "InvoiceVolume", required = true)
    protected List<InvoiceVolumeItemType> invoiceVolume;

    /**
     * Gets the value of the invoiceVolume property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceVolume property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceVolume().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceVolumeItemType }
     * 
     * 
     */
    public List<InvoiceVolumeItemType> getInvoiceVolume() {
        if (invoiceVolume == null) {
            invoiceVolume = new ArrayList<InvoiceVolumeItemType>();
        }
        return this.invoiceVolume;
    }

}
