
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAccountDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryAccountDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASIC"/>
 *     &lt;enumeration value="ACCOUNT_TYPE_AND_USAGE"/>
 *     &lt;enumeration value="ADDRESS"/>
 *     &lt;enumeration value="AUTO_PAYMENTS"/>
 *     &lt;enumeration value="CREDIT_CONTROL"/>
 *     &lt;enumeration value="CUSTOMER_DETAILS"/>
 *     &lt;enumeration value="DISCOUNTS"/>
 *     &lt;enumeration value="NON_SUBSCRIPTION_INVOICE"/>
 *     &lt;enumeration value="PAYMENT_DETAILS"/>
 *     &lt;enumeration value="SUBSCRIPTION_INVOICE"/>
 *     &lt;enumeration value="ACCOUNT_SERIAL_NUMBERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryAccountDatasetType")
@XmlEnum
public enum QueryAccountDatasetType {

    BASIC,
    ACCOUNT_TYPE_AND_USAGE,
    ADDRESS,
    AUTO_PAYMENTS,
    CREDIT_CONTROL,
    CUSTOMER_DETAILS,
    DISCOUNTS,
    NON_SUBSCRIPTION_INVOICE,
    PAYMENT_DETAILS,
    SUBSCRIPTION_INVOICE,
    ACCOUNT_SERIAL_NUMBERS;

    public String value() {
        return name();
    }

    public static QueryAccountDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
