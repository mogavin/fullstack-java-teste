
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de instrucoesFaturamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade caixaPostalPagtoFaturado.
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
     * Define o valor da propriedade caixaPostalPagtoFaturado.
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
     * Obtém o valor da propriedade cidadePagtoFaturado.
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
     * Define o valor da propriedade cidadePagtoFaturado.
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
     * Obtém o valor da propriedade estadoPagtoFaturado.
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
     * Define o valor da propriedade estadoPagtoFaturado.
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
     * Obtém o valor da propriedade paisPagtoFaturado.
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
     * Define o valor da propriedade paisPagtoFaturado.
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
     * Obtém o valor da propriedade cepPagtoFaturado.
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
     * Define o valor da propriedade cepPagtoFaturado.
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
     * Obtém o valor da propriedade emailPagtoFaturado.
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
     * Define o valor da propriedade emailPagtoFaturado.
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
     * Obtém o valor da propriedade caixaPostalPagtoCartao.
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
     * Define o valor da propriedade caixaPostalPagtoCartao.
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
     * Obtém o valor da propriedade cidadePagtoCartao.
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
     * Define o valor da propriedade cidadePagtoCartao.
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
     * Obtém o valor da propriedade estadoPagtoCartao.
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
     * Define o valor da propriedade estadoPagtoCartao.
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
     * Obtém o valor da propriedade paisPagtoCartao.
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
     * Define o valor da propriedade paisPagtoCartao.
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
     * Obtém o valor da propriedade cepPagtoCartao.
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
     * Define o valor da propriedade cepPagtoCartao.
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
     * Obtém o valor da propriedade emailPagtoCartao.
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
     * Define o valor da propriedade emailPagtoCartao.
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
