//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.01.07 alle 12:41:15 AM CET 
//


package it.univaq.disim.bpd.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per farmBusinessStartupRequestFormDetails complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="farmBusinessStartupRequestFormDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="owner" type="{http://eu.chorevolution.farmbusinessstartup/user}personData"/&gt;
 *         &lt;element name="farm" type="{http://eu.chorevolution.farmbusinessstartup/user}farmDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmBusinessStartupRequestFormDetails", propOrder = {
    "owner",
    "farm"
})
public class FarmBusinessStartupRequestFormDetails {

    @XmlElement(required = true)
    protected PersonData owner;
    @XmlElement(required = true)
    protected FarmDetails farm;

    /**
     * Recupera il valore della proprietà owner.
     * 
     * @return
     *     possible object is
     *     {@link PersonData }
     *     
     */
    public PersonData getOwner() {
        return owner;
    }

    /**
     * Imposta il valore della proprietà owner.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonData }
     *     
     */
    public void setOwner(PersonData value) {
        this.owner = value;
    }

    /**
     * Recupera il valore della proprietà farm.
     * 
     * @return
     *     possible object is
     *     {@link FarmDetails }
     *     
     */
    public FarmDetails getFarm() {
        return farm;
    }

    /**
     * Imposta il valore della proprietà farm.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmDetails }
     *     
     */
    public void setFarm(FarmDetails value) {
        this.farm = value;
    }

}
