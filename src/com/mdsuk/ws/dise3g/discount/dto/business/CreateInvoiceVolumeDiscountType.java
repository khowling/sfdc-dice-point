
package com.mdsuk.ws.dise3g.discount.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateInvoiceVolumeDiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateInvoiceVolumeDiscountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceVolumes" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}InvoiceVolumesListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateInvoiceVolumeDiscountType", propOrder = {
    "invoiceVolumes"
})
public class CreateInvoiceVolumeDiscountType {

    @XmlElement(name = "InvoiceVolumes")
    protected InvoiceVolumesListType invoiceVolumes;

    /**
     * Gets the value of the invoiceVolumes property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceVolumesListType }
     *     
     */
    public InvoiceVolumesListType getInvoiceVolumes() {
        return invoiceVolumes;
    }

    /**
     * Sets the value of the invoiceVolumes property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceVolumesListType }
     *     
     */
    public void setInvoiceVolumes(InvoiceVolumesListType value) {
        this.invoiceVolumes = value;
    }

}
