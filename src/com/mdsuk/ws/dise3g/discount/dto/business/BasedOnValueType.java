
package com.mdsuk.ws.dise3g.discount.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasedOnValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BasedOnValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Service Provider Retail Value"/>
 *     &lt;enumeration value="Supplier Value"/>
 *     &lt;enumeration value="Service Provider Billed Value"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BasedOnValueType")
@XmlEnum
public enum BasedOnValueType {

    @XmlEnumValue("Service Provider Retail Value")
    SERVICE_PROVIDER_RETAIL_VALUE("Service Provider Retail Value"),
    @XmlEnumValue("Supplier Value")
    SUPPLIER_VALUE("Supplier Value"),
    @XmlEnumValue("Service Provider Billed Value")
    SERVICE_PROVIDER_BILLED_VALUE("Service Provider Billed Value");
    private final String value;

    BasedOnValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BasedOnValueType fromValue(String v) {
        for (BasedOnValueType c: BasedOnValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
