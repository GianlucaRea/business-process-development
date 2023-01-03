//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.03 at 07:33:46 PM CET 
//


package it.univaq.disim.bpd.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for companyTypology.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="companyTypology"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="individual company"/&gt;
 *     &lt;enumeration value="partnership"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "companyTypology")
@XmlEnum
public enum CompanyTypology {

    @XmlEnumValue("individual company")
    INDIVIDUAL_COMPANY("individual company"),
    @XmlEnumValue("partnership")
    PARTNERSHIP("partnership");
    private final String value;

    CompanyTypology(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyTypology fromValue(String v) {
        for (CompanyTypology c: CompanyTypology.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
