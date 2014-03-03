
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkSerialStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NetworkSerialStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Changing"/>
 *     &lt;enumeration value="Current"/>
 *     &lt;enumeration value="Superseded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NetworkSerialStatusType")
@XmlEnum
public enum NetworkSerialStatusType {

    @XmlEnumValue("Changing")
    CHANGING("Changing"),
    @XmlEnumValue("Current")
    CURRENT("Current"),
    @XmlEnumValue("Superseded")
    SUPERSEDED("Superseded");
    private final String value;

    NetworkSerialStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NetworkSerialStatusType fromValue(String v) {
        for (NetworkSerialStatusType c: NetworkSerialStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
