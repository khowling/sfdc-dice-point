
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Update the Customer Details data associated with a
 *             Subscription
 * 
 * <p>Java class for UpdateCustomerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateCustomerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="UserName" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}UserNameType" minOccurs="0"/>
 *         &lt;element name="SubPassword" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SubPasswordType" minOccurs="0"/>
 *         &lt;element name="ItemCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ItemCodeType" minOccurs="0"/>
 *         &lt;element name="DirectoryListingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerCostCentre" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CustomerCostCentreType" minOccurs="0"/>
 *         &lt;element name="CustomerReference" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}CustomerReferenceCodeType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateCustomerDetailsType", propOrder = {

})
public class UpdateCustomerDetailsType {

    @XmlElement(name = "UserName")
    protected String userName;
    @XmlElement(name = "SubPassword")
    protected String subPassword;
    @XmlElement(name = "ItemCode")
    protected String itemCode;
    @XmlElement(name = "DirectoryListingAllowed")
    protected Boolean directoryListingAllowed;
    @XmlElement(name = "CustomerCostCentre")
    protected String customerCostCentre;
    @XmlElement(name = "CustomerReference")
    protected String customerReference;
    @XmlElement(name = "LastAmendedDate", required = true)
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the subPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPassword() {
        return subPassword;
    }

    /**
     * Sets the value of the subPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPassword(String value) {
        this.subPassword = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the directoryListingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirectoryListingAllowed() {
        return directoryListingAllowed;
    }

    /**
     * Sets the value of the directoryListingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectoryListingAllowed(Boolean value) {
        this.directoryListingAllowed = value;
    }

    /**
     * Gets the value of the customerCostCentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCostCentre() {
        return customerCostCentre;
    }

    /**
     * Sets the value of the customerCostCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCostCentre(String value) {
        this.customerCostCentre = value;
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
