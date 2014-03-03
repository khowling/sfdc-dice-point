
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuerySubscriptionDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QuerySubscriptionDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASIC"/>
 *     &lt;enumeration value="ADDRESS"/>
 *     &lt;enumeration value="BILLINGMEDIA"/>
 *     &lt;enumeration value="BUNDLES"/>
 *     &lt;enumeration value="DISCOUNTS"/>
 *     &lt;enumeration value="CONTRACTANDSALES"/>
 *     &lt;enumeration value="CUSTOMERDETAILS"/>
 *     &lt;enumeration value="DISCOUNTOVERRIDES"/>
 *     &lt;enumeration value="SERIALNUMBERS"/>
 *     &lt;enumeration value="SERVICES"/>
 *     &lt;enumeration value="SUBSCRIPTIONBARS"/>
 *     &lt;enumeration value="USAGEANDCREDITCONTROL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QuerySubscriptionDatasetType")
@XmlEnum
public enum QuerySubscriptionDatasetType {

    BASIC,
    ADDRESS,
    BILLINGMEDIA,
    BUNDLES,
    DISCOUNTS,
    CONTRACTANDSALES,
    CUSTOMERDETAILS,
    DISCOUNTOVERRIDES,
    SERIALNUMBERS,
    SERVICES,
    SUBSCRIPTIONBARS,
    USAGEANDCREDITCONTROL;

    public String value() {
        return name();
    }

    public static QuerySubscriptionDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
