
package com.mdsuk.ws.dise3g.order.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SalesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProspectIDNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ProspectIDNumberType" minOccurs="0"/>
 *         &lt;element name="ProspectEnquiryNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ProspectEnquiryNumberType" minOccurs="0"/>
 *         &lt;element name="EnquirySourceCode" type="{http://mdsuk.com/ws/dise3g/base}EnquirySourceCodeType" minOccurs="0"/>
 *         &lt;element name="PricePlanCode" type="{http://mdsuk.com/ws/dise3g/base}PricePlanCodeType" minOccurs="0"/>
 *         &lt;element name="CampaignCode" type="{http://mdsuk.com/ws/dise3g/base}CampaignCodeType" minOccurs="0"/>
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
@XmlType(name = "SalesType", propOrder = {
    "prospectIDNumber",
    "prospectEnquiryNumber",
    "enquirySourceCode",
    "pricePlanCode",
    "campaignCode",
    "lastAmendedDate"
})
public class SalesType {

    @XmlElement(name = "ProspectIDNumber")
    protected Integer prospectIDNumber;
    @XmlElement(name = "ProspectEnquiryNumber")
    protected Integer prospectEnquiryNumber;
    @XmlElement(name = "EnquirySourceCode")
    protected String enquirySourceCode;
    @XmlElement(name = "PricePlanCode")
    protected String pricePlanCode;
    @XmlElement(name = "CampaignCode")
    protected Integer campaignCode;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the prospectIDNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProspectIDNumber() {
        return prospectIDNumber;
    }

    /**
     * Sets the value of the prospectIDNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProspectIDNumber(Integer value) {
        this.prospectIDNumber = value;
    }

    /**
     * Gets the value of the prospectEnquiryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProspectEnquiryNumber() {
        return prospectEnquiryNumber;
    }

    /**
     * Sets the value of the prospectEnquiryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProspectEnquiryNumber(Integer value) {
        this.prospectEnquiryNumber = value;
    }

    /**
     * Gets the value of the enquirySourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnquirySourceCode() {
        return enquirySourceCode;
    }

    /**
     * Sets the value of the enquirySourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnquirySourceCode(String value) {
        this.enquirySourceCode = value;
    }

    /**
     * Gets the value of the pricePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlanCode() {
        return pricePlanCode;
    }

    /**
     * Sets the value of the pricePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlanCode(String value) {
        this.pricePlanCode = value;
    }

    /**
     * Gets the value of the campaignCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampaignCode() {
        return campaignCode;
    }

    /**
     * Sets the value of the campaignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampaignCode(Integer value) {
        this.campaignCode = value;
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
