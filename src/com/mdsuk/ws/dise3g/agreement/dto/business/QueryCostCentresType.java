
package com.mdsuk.ws.dise3g.agreement.dto.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This structure is returned as part of the some Query responses when
 * 				COSTCENTRES dataset is specified
 * 
 * <p>Java class for QueryCostCentresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCostCentresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CostCentre" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}QueryCostCentreType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCostCentresType", propOrder = {
    "costCentre"
})
public class QueryCostCentresType {

    @XmlElement(name = "CostCentre")
    protected List<QueryCostCentreType> costCentre;

    /**
     * Gets the value of the costCentre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costCentre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostCentre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryCostCentreType }
     * 
     * 
     */
    public List<QueryCostCentreType> getCostCentre() {
        if (costCentre == null) {
            costCentre = new ArrayList<QueryCostCentreType>();
        }
        return this.costCentre;
    }

}
