
package com.mdsuk.ws.dise3g.order.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOrderDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryOrderDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASIC"/>
 *     &lt;enumeration value="SALES"/>
 *     &lt;enumeration value="PRODUCTS"/>
 *     &lt;enumeration value="SUBSCRIPTIONS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryOrderDatasetType")
@XmlEnum
public enum QueryOrderDatasetType {

    BASIC,
    SALES,
    PRODUCTS,
    SUBSCRIPTIONS;

    public String value() {
        return name();
    }

    public static QueryOrderDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
