
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for configuracaoCentroDeCusto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configuracaoCentroDeCusto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoAprovavel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="debitaBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuracaoCentroDeCusto", propOrder = {
    "autoAprovavel",
    "debitaBudget"
})
public class ConfiguracaoCentroDeCusto {

    protected boolean autoAprovavel;
    @XmlElementRef(name = "debitaBudget", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> debitaBudget;

    /**
     * Gets the value of the autoAprovavel property.
     * 
     */
    public boolean isAutoAprovavel() {
        return autoAprovavel;
    }

    /**
     * Sets the value of the autoAprovavel property.
     * 
     */
    public void setAutoAprovavel(boolean value) {
        this.autoAprovavel = value;
    }

    /**
     * Gets the value of the debitaBudget property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDebitaBudget() {
        return debitaBudget;
    }

    /**
     * Sets the value of the debitaBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDebitaBudget(JAXBElement<Boolean> value) {
        this.debitaBudget = value;
    }

}
