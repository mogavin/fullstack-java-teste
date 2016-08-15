
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for totais complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the totalSolicitacao property.
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
     * Sets the value of the totalSolicitacao property.
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
     * Gets the value of the totalAereos property.
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
     * Sets the value of the totalAereos property.
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
     * Gets the value of the totalHoteis property.
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
     * Sets the value of the totalHoteis property.
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
     * Gets the value of the totalCarros property.
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
     * Sets the value of the totalCarros property.
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
     * Gets the value of the totalOutros property.
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
     * Sets the value of the totalOutros property.
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
     * Gets the value of the totalFee property.
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
     * Sets the value of the totalFee property.
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
     * Gets the value of the totalSeguros property.
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
     * Sets the value of the totalSeguros property.
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
     * Gets the value of the totalTraslados property.
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
     * Sets the value of the totalTraslados property.
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
