
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cobertura complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
    @XmlSchemaType(name = "string")
    protected TipoCobertura tipoCobertura;

    /**
     * Obtém o valor da propriedade descricao.
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
     * Define o valor da propriedade descricao.
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
     * Obtém o valor da propriedade limite.
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
     * Define o valor da propriedade limite.
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
     * Obtém o valor da propriedade tipoCobertura.
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
     * Define o valor da propriedade tipoCobertura.
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
