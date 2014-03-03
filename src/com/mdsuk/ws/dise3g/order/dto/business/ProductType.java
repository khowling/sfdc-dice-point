
package com.mdsuk.ws.dise3g.order.dto.business;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ProductCodeType" minOccurs="0"/>
 *         &lt;element name="ProductQuantityNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ProductQuantityNumber" minOccurs="0"/>
 *         &lt;element name="ProductUnitPrice" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="ProductGrossPrice" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="ProductItems" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ProductItemsType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", propOrder = {
    "productCode",
    "productQuantityNumber",
    "productUnitPrice",
    "productGrossPrice",
    "productItems",
    "lastAmendedDate"
})
public class ProductType {

    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "ProductQuantityNumber")
    protected Integer productQuantityNumber;
    @XmlElement(name = "ProductUnitPrice")
    protected BigDecimal productUnitPrice;
    @XmlElement(name = "ProductGrossPrice")
    protected BigDecimal productGrossPrice;
    @XmlElement(name = "ProductItems")
    protected ProductItemsType productItems;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the productQuantityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductQuantityNumber() {
        return productQuantityNumber;
    }

    /**
     * Sets the value of the productQuantityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductQuantityNumber(Integer value) {
        this.productQuantityNumber = value;
    }

    /**
     * Gets the value of the productUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductUnitPrice() {
        return productUnitPrice;
    }

    /**
     * Sets the value of the productUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductUnitPrice(BigDecimal value) {
        this.productUnitPrice = value;
    }

    /**
     * Gets the value of the productGrossPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductGrossPrice() {
        return productGrossPrice;
    }

    /**
     * Sets the value of the productGrossPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductGrossPrice(BigDecimal value) {
        this.productGrossPrice = value;
    }

    /**
     * Gets the value of the productItems property.
     * 
     * @return
     *     possible object is
     *     {@link ProductItemsType }
     *     
     */
    public ProductItemsType getProductItems() {
        return productItems;
    }

    /**
     * Sets the value of the productItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductItemsType }
     *     
     */
    public void setProductItems(ProductItemsType value) {
        this.productItems = value;
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
