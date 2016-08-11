
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de rateio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade nomeCentroCusto.
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
     * Define o valor da propriedade nomeCentroCusto.
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
     * Obtém o valor da propriedade nomeRegional.
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
     * Define o valor da propriedade nomeRegional.
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
     * Obtém o valor da propriedade valorPorcentagem.
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
     * Define o valor da propriedade valorPorcentagem.
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
     * Obtém o valor da propriedade nomeSubCentroCusto.
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
     * Define o valor da propriedade nomeSubCentroCusto.
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
     * Obtém o valor da propriedade descricaoCentroCusto.
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
     * Define o valor da propriedade descricaoCentroCusto.
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
     * Obtém o valor da propriedade descricaoSubCentroCusto.
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
     * Define o valor da propriedade descricaoSubCentroCusto.
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
