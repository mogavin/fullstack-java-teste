
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPax;


/**
 * <p>Java class for aereoTarifaPax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aereoTarifaPax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxaDu" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tipoPax" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoPax" minOccurs="0"/>
 *         &lt;element name="quantidadePax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tarifaSemAcordo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moedaBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarifaBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cotacao" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="acordo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTarifaPax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxaFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorFullFare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereoTarifaPax", propOrder = {
    "tarifa",
    "taxa",
    "taxaDu",
    "tipoPax",
    "quantidadePax",
    "tarifaSemAcordo",
    "moeda",
    "moedaBase",
    "tarifaBase",
    "cotacao",
    "acordo",
    "totalTarifaPax",
    "taxaFee",
    "valorFullFare"
})
public class AereoTarifaPax {

    protected Double tarifa;
    protected Double taxa;
    protected Double taxaDu;
    protected TipoPax tipoPax;
    protected Integer quantidadePax;
    protected Double tarifaSemAcordo;
    protected String moeda;
    protected String moedaBase;
    protected Double tarifaBase;
    protected Double cotacao;
    protected String acordo;
    protected Double totalTarifaPax;
    protected Double taxaFee;
    protected Double valorFullFare;

    /**
     * Gets the value of the tarifa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarifa() {
        return tarifa;
    }

    /**
     * Sets the value of the tarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarifa(Double value) {
        this.tarifa = value;
    }

    /**
     * Gets the value of the taxa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxa() {
        return taxa;
    }

    /**
     * Sets the value of the taxa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxa(Double value) {
        this.taxa = value;
    }

    /**
     * Gets the value of the taxaDu property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaDu() {
        return taxaDu;
    }

    /**
     * Sets the value of the taxaDu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaDu(Double value) {
        this.taxaDu = value;
    }

    /**
     * Gets the value of the tipoPax property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPax }
     *     
     */
    public TipoPax getTipoPax() {
        return tipoPax;
    }

    /**
     * Sets the value of the tipoPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPax }
     *     
     */
    public void setTipoPax(TipoPax value) {
        this.tipoPax = value;
    }

    /**
     * Gets the value of the quantidadePax property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadePax() {
        return quantidadePax;
    }

    /**
     * Sets the value of the quantidadePax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadePax(Integer value) {
        this.quantidadePax = value;
    }

    /**
     * Gets the value of the tarifaSemAcordo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarifaSemAcordo() {
        return tarifaSemAcordo;
    }

    /**
     * Sets the value of the tarifaSemAcordo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarifaSemAcordo(Double value) {
        this.tarifaSemAcordo = value;
    }

    /**
     * Gets the value of the moeda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoeda() {
        return moeda;
    }

    /**
     * Sets the value of the moeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoeda(String value) {
        this.moeda = value;
    }

    /**
     * Gets the value of the moedaBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoedaBase() {
        return moedaBase;
    }

    /**
     * Sets the value of the moedaBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoedaBase(String value) {
        this.moedaBase = value;
    }

    /**
     * Gets the value of the tarifaBase property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarifaBase() {
        return tarifaBase;
    }

    /**
     * Sets the value of the tarifaBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarifaBase(Double value) {
        this.tarifaBase = value;
    }

    /**
     * Gets the value of the cotacao property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCotacao() {
        return cotacao;
    }

    /**
     * Sets the value of the cotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCotacao(Double value) {
        this.cotacao = value;
    }

    /**
     * Gets the value of the acordo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcordo() {
        return acordo;
    }

    /**
     * Sets the value of the acordo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcordo(String value) {
        this.acordo = value;
    }

    /**
     * Gets the value of the totalTarifaPax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTarifaPax() {
        return totalTarifaPax;
    }

    /**
     * Sets the value of the totalTarifaPax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTarifaPax(Double value) {
        this.totalTarifaPax = value;
    }

    /**
     * Gets the value of the taxaFee property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaFee() {
        return taxaFee;
    }

    /**
     * Sets the value of the taxaFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaFee(Double value) {
        this.taxaFee = value;
    }

    /**
     * Gets the value of the valorFullFare property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorFullFare() {
        return valorFullFare;
    }

    /**
     * Sets the value of the valorFullFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorFullFare(Double value) {
        this.valorFullFare = value;
    }

}
