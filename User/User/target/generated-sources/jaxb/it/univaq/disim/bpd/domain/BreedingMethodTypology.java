//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.01.02 alle 08:51:18 PM CET 
//


package it.univaq.disim.bpd.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per breedingMethodTypology.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="breedingMethodTypology"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="intensive"/&gt;
 *     &lt;enumeration value="free-range intensive"/&gt;
 *     &lt;enumeration value="transhumant"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "breedingMethodTypology")
@XmlEnum
public enum BreedingMethodTypology {

    @XmlEnumValue("intensive")
    INTENSIVE("intensive"),
    @XmlEnumValue("free-range intensive")
    FREE_RANGE_INTENSIVE("free-range intensive"),
    @XmlEnumValue("transhumant")
    TRANSHUMANT("transhumant");
    private final String value;

    BreedingMethodTypology(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BreedingMethodTypology fromValue(String v) {
        for (BreedingMethodTypology c: BreedingMethodTypology.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
