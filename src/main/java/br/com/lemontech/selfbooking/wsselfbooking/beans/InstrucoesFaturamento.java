
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for instrucoesFaturamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="instrucoesFaturamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caixaPostalPagtoFaturado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidadePagtoFaturado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoPagtoFaturado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisPagtoFaturado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepPagtoFaturado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailPagtoFaturado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caixaPostalPagtoCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidadePagtoCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoPagtoCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paisPagtoCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cepPagtoCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailPagtoCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instrucoesFaturamento", propOrder = {
    "caixaPostalPagtoFaturado",
    "cidadePagtoFaturado",
    "estadoPagtoFaturado",
    "paisPagtoFaturado",
    "cepPagtoFaturado",
    "emailPagtoFaturado",
    "caixaPostalPagtoCartao",
    "cidadePagtoCartao",
    "estadoPagtoCartao",
    "paisPagtoCartao",
    "cepPagtoCartao",
    "emailPagtoCartao"
})
public class InstrucoesFaturamento {

    protected String caixaPostalPagtoFaturado;
    protected String cidadePagtoFaturado;
    protected String estadoPagtoFaturado;
    protected String paisPagtoFaturado;
    protected String cepPagtoFaturado;
    protected String emailPagtoFaturado;
    protected String caixaPostalPagtoCartao;
    protected String cidadePagtoCartao;
    protected String estadoPagtoCartao;
    protected String paisPagtoCartao;
    protected String cepPagtoCartao;
    protected String emailPagtoCartao;

    /**
     * Gets the value of the caixaPostalPagtoFaturado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaixaPostalPagtoFaturado() {
        return caixaPostalPagtoFaturado;
    }

    /**
     * Sets the value of the caixaPostalPagtoFaturado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaixaPostalPagtoFaturado(String value) {
        this.caixaPostalPagtoFaturado = value;
    }

    /**
     * Gets the value of the cidadePagtoFaturado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadePagtoFaturado() {
        return cidadePagtoFaturado;
    }

    /**
     * Sets the value of the cidadePagtoFaturado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadePagtoFaturado(String value) {
        this.cidadePagtoFaturado = value;
    }

    /**
     * Gets the value of the estadoPagtoFaturado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoPagtoFaturado() {
        return estadoPagtoFaturado;
    }

    /**
     * Sets the value of the estadoPagtoFaturado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoPagtoFaturado(String value) {
        this.estadoPagtoFaturado = value;
    }

    /**
     * Gets the value of the paisPagtoFaturado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisPagtoFaturado() {
        return paisPagtoFaturado;
    }

    /**
     * Sets the value of the paisPagtoFaturado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisPagtoFaturado(String value) {
        this.paisPagtoFaturado = value;
    }

    /**
     * Gets the value of the cepPagtoFaturado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepPagtoFaturado() {
        return cepPagtoFaturado;
    }

    /**
     * Sets the value of the cepPagtoFaturado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepPagtoFaturado(String value) {
        this.cepPagtoFaturado = value;
    }

    /**
     * Gets the value of the emailPagtoFaturado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPagtoFaturado() {
        return emailPagtoFaturado;
    }

    /**
     * Sets the value of the emailPagtoFaturado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPagtoFaturado(String value) {
        this.emailPagtoFaturado = value;
    }

    /**
     * Gets the value of the caixaPostalPagtoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaixaPostalPagtoCartao() {
        return caixaPostalPagtoCartao;
    }

    /**
     * Sets the value of the caixaPostalPagtoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaixaPostalPagtoCartao(String value) {
        this.caixaPostalPagtoCartao = value;
    }

    /**
     * Gets the value of the cidadePagtoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadePagtoCartao() {
        return cidadePagtoCartao;
    }

    /**
     * Sets the value of the cidadePagtoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadePagtoCartao(String value) {
        this.cidadePagtoCartao = value;
    }

    /**
     * Gets the value of the estadoPagtoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoPagtoCartao() {
        return estadoPagtoCartao;
    }

    /**
     * Sets the value of the estadoPagtoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoPagtoCartao(String value) {
        this.estadoPagtoCartao = value;
    }

    /**
     * Gets the value of the paisPagtoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisPagtoCartao() {
        return paisPagtoCartao;
    }

    /**
     * Sets the value of the paisPagtoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisPagtoCartao(String value) {
        this.paisPagtoCartao = value;
    }

    /**
     * Gets the value of the cepPagtoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepPagtoCartao() {
        return cepPagtoCartao;
    }

    /**
     * Sets the value of the cepPagtoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepPagtoCartao(String value) {
        this.cepPagtoCartao = value;
    }

    /**
     * Gets the value of the emailPagtoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPagtoCartao() {
        return emailPagtoCartao;
    }

    /**
     * Sets the value of the emailPagtoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPagtoCartao(String value) {
        this.emailPagtoCartao = value;
    }

}
