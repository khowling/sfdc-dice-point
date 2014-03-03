
package com.mdsuk.ws.dise3g.order.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderBasicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderBasicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderNumberType"/>
 *         &lt;element name="DeliveryAddressNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}DeliveryAddressNumberType" minOccurs="0"/>
 *         &lt;element name="CompanyNumber" type="{http://mdsuk.com/ws/dise3g/base}CompanyNumberType" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="SubscriptionAccountCode" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="SalesAccountCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SalesAccountCodeType" minOccurs="0"/>
 *         &lt;element name="UserDepartmentCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}UserDepartmentCodeType" minOccurs="0"/>
 *         &lt;element name="DeliveryMethodCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}DeliveryMethodCodeType" minOccurs="0"/>
 *         &lt;element name="WarehouseCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}WarehouseCodeType" minOccurs="0"/>
 *         &lt;element name="PromisedForDate" type="{http://mdsuk.com/ws/dise3g/order/dto/business}PromisedForDateType" minOccurs="0"/>
 *         &lt;element name="DespatchByDate" type="{http://mdsuk.com/ws/dise3g/order/dto/business}DespatchByDateType" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://mdsuk.com/ws/dise3g/order/dto/business}CreatedDateType" minOccurs="0"/>
 *         &lt;element name="CustomerReference" type="{http://mdsuk.com/ws/dise3g/order/dto/business}CustomerReferenceType" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://mdsuk.com/ws/dise3g/order/dto/business}PaymentType" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderStatusType" minOccurs="0"/>
 *         &lt;element name="DeliveryInstructions" type="{http://mdsuk.com/ws/dise3g/order/dto/business}DeliveryInstructionsType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *         &lt;element name="OverrideHardwareCreditLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBasicType", propOrder = {
    "orderNumber",
    "deliveryAddressNumber",
    "companyNumber",
    "accountNumber",
    "subscriptionAccountCode",
    "salesAccountCode",
    "userDepartmentCode",
    "deliveryMethodCode",
    "warehouseCode",
    "promisedForDate",
    "despatchByDate",
    "createdDate",
    "customerReference",
    "paymentType",
    "orderStatus",
    "deliveryInstructions",
    "lastAmendedDate",
    "overrideHardwareCreditLimit"
})
public class OrderBasicType {

    @XmlElement(name = "OrderNumber", required = true)
    protected String orderNumber;
    @XmlElement(name = "DeliveryAddressNumber")
    protected Integer deliveryAddressNumber;
    @XmlElement(name = "CompanyNumber")
    protected String companyNumber;
    @XmlElement(name = "AccountNumber")
    protected Integer accountNumber;
    @XmlElement(name = "SubscriptionAccountCode")
    protected Integer subscriptionAccountCode;
    @XmlElement(name = "SalesAccountCode")
    protected Integer salesAccountCode;
    @XmlElement(name = "UserDepartmentCode")
    protected String userDepartmentCode;
    @XmlElement(name = "DeliveryMethodCode")
    protected String deliveryMethodCode;
    @XmlElement(name = "WarehouseCode")
    protected String warehouseCode;
    @XmlElement(name = "PromisedForDate")
    protected XMLGregorianCalendar promisedForDate;
    @XmlElement(name = "DespatchByDate")
    protected XMLGregorianCalendar despatchByDate;
    @XmlElement(name = "CreatedDate")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CustomerReference")
    protected String customerReference;
    @XmlElement(name = "PaymentType")
    protected PaymentType paymentType;
    @XmlElement(name = "OrderStatus")
    protected String orderStatus;
    @XmlElement(name = "DeliveryInstructions")
    protected String deliveryInstructions;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;
    @XmlElement(name = "OverrideHardwareCreditLimit", defaultValue = "false")
    protected Boolean overrideHardwareCreditLimit;

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the deliveryAddressNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeliveryAddressNumber() {
        return deliveryAddressNumber;
    }

    /**
     * Sets the value of the deliveryAddressNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeliveryAddressNumber(Integer value) {
        this.deliveryAddressNumber = value;
    }

    /**
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNumber(String value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountNumber(Integer value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the subscriptionAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionAccountCode() {
        return subscriptionAccountCode;
    }

    /**
     * Sets the value of the subscriptionAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionAccountCode(Integer value) {
        this.subscriptionAccountCode = value;
    }

    /**
     * Gets the value of the salesAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesAccountCode() {
        return salesAccountCode;
    }

    /**
     * Sets the value of the salesAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesAccountCode(Integer value) {
        this.salesAccountCode = value;
    }

    /**
     * Gets the value of the userDepartmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDepartmentCode() {
        return userDepartmentCode;
    }

    /**
     * Sets the value of the userDepartmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDepartmentCode(String value) {
        this.userDepartmentCode = value;
    }

    /**
     * Gets the value of the deliveryMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethodCode() {
        return deliveryMethodCode;
    }

    /**
     * Sets the value of the deliveryMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethodCode(String value) {
        this.deliveryMethodCode = value;
    }

    /**
     * Gets the value of the warehouseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseCode() {
        return warehouseCode;
    }

    /**
     * Sets the value of the warehouseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseCode(String value) {
        this.warehouseCode = value;
    }

    /**
     * Gets the value of the promisedForDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPromisedForDate() {
        return promisedForDate;
    }

    /**
     * Sets the value of the promisedForDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPromisedForDate(XMLGregorianCalendar value) {
        this.promisedForDate = value;
    }

    /**
     * Gets the value of the despatchByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDespatchByDate() {
        return despatchByDate;
    }

    /**
     * Sets the value of the despatchByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDespatchByDate(XMLGregorianCalendar value) {
        this.despatchByDate = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType }
     *     
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType }
     *     
     */
    public void setPaymentType(PaymentType value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the deliveryInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryInstructions() {
        return deliveryInstructions;
    }

    /**
     * Sets the value of the deliveryInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryInstructions(String value) {
        this.deliveryInstructions = value;
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

    /**
     * Gets the value of the overrideHardwareCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideHardwareCreditLimit() {
        return overrideHardwareCreditLimit;
    }

    /**
     * Sets the value of the overrideHardwareCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideHardwareCreditLimit(Boolean value) {
        this.overrideHardwareCreditLimit = value;
    }

}
