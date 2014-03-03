
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateEmailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateEmailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="EmailType" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}EmailTypeType"/>
 *         &lt;element name="EmailDescription" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}EmailDescriptionType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateEmailType", propOrder = {

})
public class CreateEmailType {

    @XmlElement(name = "EmailType", required = true)
    protected String emailType;
    @XmlElement(name = "EmailDescription", required = true)
    protected String emailDescription;

    /**
     * Gets the value of the emailType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailType() {
        return emailType;
    }

    /**
     * Sets the value of the emailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailType(String value) {
        this.emailType = value;
    }

    /**
     * Gets the value of the emailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailDescription() {
        return emailDescription;
    }

    /**
     * Sets the value of the emailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailDescription(String value) {
        this.emailDescription = value;
    }

}
