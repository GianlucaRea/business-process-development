//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.03 at 07:33:46 PM CET 
//


package it.univaq.disim.bpd.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmBusinessCodeStartupNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the farmCode property.
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
     * Sets the value of the farmCode property.
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
     * Gets the value of the farm property.
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
     * Sets the value of the farm property.
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
