
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceAddressType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceAddressType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Subscription"/>
 *     &lt;enumeration value="Agreement"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="Group"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoiceAddressType")
@XmlEnum
public enum InvoiceAddressType {

    @XmlEnumValue("Subscription")
    SUBSCRIPTION("Subscription"),
    @XmlEnumValue("Agreement")
    AGREEMENT("Agreement"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Group")
    GROUP("Group");
    private final String value;

    InvoiceAddressType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvoiceAddressType fromValue(String v) {
        for (InvoiceAddressType c: InvoiceAddressType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
