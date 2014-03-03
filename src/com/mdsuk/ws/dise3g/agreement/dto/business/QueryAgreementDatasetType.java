
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryAgreementDatasetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryAgreementDatasetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BASIC"/>
 *     &lt;enumeration value="ADDRESS"/>
 *     &lt;enumeration value="BUNDLES"/>
 *     &lt;enumeration value="CONTRACTANDSALES"/>
 *     &lt;enumeration value="INVOICECONTROL"/>
 *     &lt;enumeration value="SERVICES"/>
 *     &lt;enumeration value="DISCOUNTS"/>
 *     &lt;enumeration value="COSTCENTRES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryAgreementDatasetType")
@XmlEnum
public enum QueryAgreementDatasetType {

    BASIC,
    ADDRESS,
    BUNDLES,
    CONTRACTANDSALES,
    INVOICECONTROL,
    SERVICES,
    DISCOUNTS,
    COSTCENTRES;

    public String value() {
        return name();
    }

    public static QueryAgreementDatasetType fromValue(String v) {
        return valueOf(v);
    }

}
