
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountUsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountUsageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Subscription"/>
 *     &lt;enumeration value="Sales"/>
 *     &lt;enumeration value="SubscriptionAndSales"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountUsageType")
@XmlEnum
public enum AccountUsageType {

    @XmlEnumValue("Subscription")
    SUBSCRIPTION("Subscription"),
    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("SubscriptionAndSales")
    SUBSCRIPTION_AND_SALES("SubscriptionAndSales");
    private final String value;

    AccountUsageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountUsageType fromValue(String v) {
        for (AccountUsageType c: AccountUsageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
