//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.3.0 
// Vedere <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.01.04 alle 11:52:17 AM CET 
//


package it.univaq.disim.bpd.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per farmBusinessCodeStartupNotification complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="farmBusinessCodeStartupNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="farmCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "farmBusinessCodeStartupNotification", propOrder = {
    "farmCode",
    "farm"
})
public class FarmBusinessCodeStartupNotification {

    @XmlElement(required = true)
    protected String farmCode;
    @XmlElement(required = true)
    protected FarmDetails farm;

    /**
     * Recupera il valore della proprietà farmCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarmCode() {
        return farmCode;
    }

    /**
     * Imposta il valore della proprietà farmCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarmCode(String value) {
        this.farmCode = value;
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
