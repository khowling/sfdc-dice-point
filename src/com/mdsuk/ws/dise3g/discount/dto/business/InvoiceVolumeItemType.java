
package com.mdsuk.ws.dise3g.discount.dto.business;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceVolumeItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceVolumeItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VolumeLimit" type="{http://mdsuk.com/ws/dise3g/base}SignedDecimal9_2Type"/>
 *         &lt;element name="InvoiceBand" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}InvoiceBandType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceVolumeItemType", propOrder = {
    "volumeLimit",
    "invoiceBand"
})
public class InvoiceVolumeItemType {

    @XmlElement(name = "VolumeLimit", required = true)
    protected BigDecimal volumeLimit;
    @XmlElement(name = "InvoiceBand", required = true)
    protected InvoiceBandType invoiceBand;

    /**
     * Gets the value of the volumeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolumeLimit() {
        return volumeLimit;
    }

    /**
     * Sets the value of the volumeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolumeLimit(BigDecimal value) {
        this.volumeLimit = value;
    }

    /**
     * Gets the value of the invoiceBand property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceBandType }
     *     
     */
    public InvoiceBandType getInvoiceBand() {
        return invoiceBand;
    }

    /**
     * Sets the value of the invoiceBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceBandType }
     *     
     */
    public void setInvoiceBand(InvoiceBandType value) {
        this.invoiceBand = value;
    }

}
