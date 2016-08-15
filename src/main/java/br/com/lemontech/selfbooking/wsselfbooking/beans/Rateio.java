
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rateio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rateio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorPorcentagem" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="nomeSubCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoSubCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateio", propOrder = {
    "nomeCentroCusto",
    "nomeRegional",
    "valorPorcentagem",
    "nomeSubCentroCusto",
    "descricaoCentroCusto",
    "descricaoSubCentroCusto"
})
public class Rateio {

    protected String nomeCentroCusto;
    protected String nomeRegional;
    protected Double valorPorcentagem;
    protected String nomeSubCentroCusto;
    protected String descricaoCentroCusto;
    protected String descricaoSubCentroCusto;

    /**
     * Gets the value of the nomeCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCentroCusto() {
        return nomeCentroCusto;
    }

    /**
     * Sets the value of the nomeCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCentroCusto(String value) {
        this.nomeCentroCusto = value;
    }

    /**
     * Gets the value of the nomeRegional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeRegional() {
        return nomeRegional;
    }

    /**
     * Sets the value of the nomeRegional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeRegional(String value) {
        this.nomeRegional = value;
    }

    /**
     * Gets the value of the valorPorcentagem property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorPorcentagem() {
        return valorPorcentagem;
    }

    /**
     * Sets the value of the valorPorcentagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorPorcentagem(Double value) {
        this.valorPorcentagem = value;
    }

    /**
     * Gets the value of the nomeSubCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSubCentroCusto() {
        return nomeSubCentroCusto;
    }

    /**
     * Sets the value of the nomeSubCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSubCentroCusto(String value) {
        this.nomeSubCentroCusto = value;
    }

    /**
     * Gets the value of the descricaoCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoCentroCusto() {
        return descricaoCentroCusto;
    }

    /**
     * Sets the value of the descricaoCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoCentroCusto(String value) {
        this.descricaoCentroCusto = value;
    }

    /**
     * Gets the value of the descricaoSubCentroCusto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoSubCentroCusto() {
        return descricaoSubCentroCusto;
    }

    /**
     * Sets the value of the descricaoSubCentroCusto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoSubCentroCusto(String value) {
        this.descricaoSubCentroCusto = value;
    }

}
