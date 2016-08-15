
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cobertura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cobertura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCobertura" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoCobertura" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cobertura", propOrder = {
    "descricao",
    "limite",
    "tipoCobertura"
})
public class Cobertura {

    protected String descricao;
    protected String limite;
    protected TipoCobertura tipoCobertura;

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the limite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimite() {
        return limite;
    }

    /**
     * Sets the value of the limite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimite(String value) {
        this.limite = value;
    }

    /**
     * Gets the value of the tipoCobertura property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCobertura }
     *     
     */
    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    /**
     * Sets the value of the tipoCobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCobertura }
     *     
     */
    public void setTipoCobertura(TipoCobertura value) {
        this.tipoCobertura = value;
    }

}
