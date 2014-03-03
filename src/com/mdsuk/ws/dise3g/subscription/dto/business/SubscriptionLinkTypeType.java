
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionLinkTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubscriptionLinkTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Parent-Child"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubscriptionLinkTypeType")
@XmlEnum
public enum SubscriptionLinkTypeType {

    @XmlEnumValue("Parent-Child")
    PARENT_CHILD("Parent-Child");
    private final String value;

    SubscriptionLinkTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubscriptionLinkTypeType fromValue(String v) {
        for (SubscriptionLinkTypeType c: SubscriptionLinkTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
