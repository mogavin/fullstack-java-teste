
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de totais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="totais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalSolicitacao" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalAereos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalHoteis" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalCarros" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalOutros" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalSeguros" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="totalTraslados" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "totais", propOrder = {
    "totalSolicitacao",
    "totalAereos",
    "totalHoteis",
    "totalCarros",
    "totalOutros",
    "totalFee",
    "totalSeguros",
    "totalTraslados"
})
public class Totais {

    protected Double totalSolicitacao;
    protected Double totalAereos;
    protected Double totalHoteis;
    protected Double totalCarros;
    protected Double totalOutros;
    protected Double totalFee;
    protected Double totalSeguros;
    protected Double totalTraslados;

    /**
     * Obtém o valor da propriedade totalSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSolicitacao() {
        return totalSolicitacao;
    }

    /**
     * Define o valor da propriedade totalSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSolicitacao(Double value) {
        this.totalSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade totalAereos.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalAereos() {
        return totalAereos;
    }

    /**
     * Define o valor da propriedade totalAereos.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalAereos(Double value) {
        this.totalAereos = value;
    }

    /**
     * Obtém o valor da propriedade totalHoteis.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalHoteis() {
        return totalHoteis;
    }

    /**
     * Define o valor da propriedade totalHoteis.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalHoteis(Double value) {
        this.totalHoteis = value;
    }

    /**
     * Obtém o valor da propriedade totalCarros.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCarros() {
        return totalCarros;
    }

    /**
     * Define o valor da propriedade totalCarros.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCarros(Double value) {
        this.totalCarros = value;
    }

    /**
     * Obtém o valor da propriedade totalOutros.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalOutros() {
        return totalOutros;
    }

    /**
     * Define o valor da propriedade totalOutros.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalOutros(Double value) {
        this.totalOutros = value;
    }

    /**
     * Obtém o valor da propriedade totalFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalFee() {
        return totalFee;
    }

    /**
     * Define o valor da propriedade totalFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalFee(Double value) {
        this.totalFee = value;
    }

    /**
     * Obtém o valor da propriedade totalSeguros.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSeguros() {
        return totalSeguros;
    }

    /**
     * Define o valor da propriedade totalSeguros.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSeguros(Double value) {
        this.totalSeguros = value;
    }

    /**
     * Obtém o valor da propriedade totalTraslados.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTraslados() {
        return totalTraslados;
    }

    /**
     * Define o valor da propriedade totalTraslados.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTraslados(Double value) {
        this.totalTraslados = value;
    }

}
