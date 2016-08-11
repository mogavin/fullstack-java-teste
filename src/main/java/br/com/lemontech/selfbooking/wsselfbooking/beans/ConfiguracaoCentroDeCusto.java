
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de configuracaoCentroDeCusto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade autoAprovavel.
     * 
     */
    public boolean isAutoAprovavel() {
        return autoAprovavel;
    }

    /**
     * Define o valor da propriedade autoAprovavel.
     * 
     */
    public void setAutoAprovavel(boolean value) {
        this.autoAprovavel = value;
    }

    /**
     * Obtém o valor da propriedade debitaBudget.
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
     * Define o valor da propriedade debitaBudget.
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
