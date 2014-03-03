
package com.mdsuk.ws.dise3g.order.dto.business;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.order.dto.service.ProductType;


/**
 * <p>Java class for OrderProductDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProductDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Category" type="{http://mdsuk.com/ws/dise3g/order/dto/business}CategoryType" minOccurs="0"/>
 *         &lt;element name="SubsOrderType" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SubsOrderType" minOccurs="0"/>
 *         &lt;element name="ProductCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ProductCodeType"/>
 *         &lt;element name="Quantity" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderQuantity"/>
 *         &lt;element name="ActivationType" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ActivationType"/>
 *         &lt;element name="Comment" type="{http://mdsuk.com/ws/dise3g/order/dto/business}CommentType" minOccurs="0"/>
 *         &lt;element name="ProductPriceOverride" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ProductPriceOverrideType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderProductDataType", propOrder = {
    "category",
    "subsOrderType",
    "productCode",
    "quantity",
    "activationType",
    "comment",
    "productPriceOverride"
})
@XmlSeeAlso({
    ProductType.class
})
public class OrderProductDataType {

    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "SubsOrderType")
    protected SubsOrderType subsOrderType;
    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "Quantity")
    protected long quantity;
    @XmlElement(name = "ActivationType", required = true)
    protected ActivationType activationType;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "ProductPriceOverride")
    protected BigDecimal productPriceOverride;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the subsOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link SubsOrderType }
     *     
     */
    public SubsOrderType getSubsOrderType() {
        return subsOrderType;
    }

    /**
     * Sets the value of the subsOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsOrderType }
     *     
     */
    public void setSubsOrderType(SubsOrderType value) {
        this.subsOrderType = value;
    }

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
     * Gets the value of the quantity property.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the activationType property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationType }
     *     
     */
    public ActivationType getActivationType() {
        return activationType;
    }

    /**
     * Sets the value of the activationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationType }
     *     
     */
    public void setActivationType(ActivationType value) {
        this.activationType = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the productPriceOverride property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductPriceOverride() {
        return productPriceOverride;
    }

    /**
     * Sets the value of the productPriceOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductPriceOverride(BigDecimal value) {
        this.productPriceOverride = value;
    }

}
