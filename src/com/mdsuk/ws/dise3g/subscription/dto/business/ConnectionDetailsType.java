
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConnectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ConnectionType" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ConnectionType"/>
 *         &lt;element name="ConnectionDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ConnectionReason" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ConnectionReasonType"/>
 *         &lt;element name="ConnectionTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionDetailsType", propOrder = {

})
public class ConnectionDetailsType {

    @XmlElement(name = "ConnectionType", required = true)
    protected String connectionType;
    @XmlElement(name = "ConnectionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar connectionDate;
    @XmlElement(name = "ConnectionReason", required = true)
    protected String connectionReason;
    @XmlElement(name = "ConnectionTime", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar connectionTime;

    /**
     * Gets the value of the connectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionType() {
        return connectionType;
    }

    /**
     * Sets the value of the connectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionType(String value) {
        this.connectionType = value;
    }

    /**
     * Gets the value of the connectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConnectionDate() {
        return connectionDate;
    }

    /**
     * Sets the value of the connectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConnectionDate(XMLGregorianCalendar value) {
        this.connectionDate = value;
    }

    /**
     * Gets the value of the connectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionReason() {
        return connectionReason;
    }

    /**
     * Sets the value of the connectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionReason(String value) {
        this.connectionReason = value;
    }

    /**
     * Gets the value of the connectionTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConnectionTime() {
        return connectionTime;
    }

    /**
     * Sets the value of the connectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConnectionTime(XMLGregorianCalendar value) {
        this.connectionTime = value;
    }

}
