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
 * <p>Java class for farmBusinessStartupResponseRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmBusinessStartupResponseRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="choreographyId" type="{http://eu.chorevolution.farmbusinessstartup/user}choreographyInstanceRequest"/&gt;
 *         &lt;element name="messageData" type="{http://eu.chorevolution.farmbusinessstartup/user}farmBusinessStartupResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmBusinessStartupResponseRequestType", propOrder = {
    "choreographyId",
    "messageData"
})
public class FarmBusinessStartupResponseRequestType {

    @XmlElement(required = true)
    protected ChoreographyInstanceRequest choreographyId;
    @XmlElement(required = true)
    protected FarmBusinessStartupResponse messageData;

    /**
     * Gets the value of the choreographyId property.
     * 
     * @return
     *     possible object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public ChoreographyInstanceRequest getChoreographyId() {
        return choreographyId;
    }

    /**
     * Sets the value of the choreographyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public void setChoreographyId(ChoreographyInstanceRequest value) {
        this.choreographyId = value;
    }

    /**
     * Gets the value of the messageData property.
     * 
     * @return
     *     possible object is
     *     {@link FarmBusinessStartupResponse }
     *     
     */
    public FarmBusinessStartupResponse getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmBusinessStartupResponse }
     *     
     */
    public void setMessageData(FarmBusinessStartupResponse value) {
        this.messageData = value;
    }

}