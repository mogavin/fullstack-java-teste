
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for formaPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="formaPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parcelas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="formaPagameno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vencimentoCartao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numeroRequisicaoGov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}enumTipoFormaPagamento" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formaPagamento", propOrder = {
    "autorizacao",
    "numero",
    "parcelas",
    "valor",
    "formaPagameno",
    "vencimentoCartao",
    "numeroRequisicaoGov",
    "tipo"
})
public class FormaPagamento {

    protected String autorizacao;
    protected String numero;
    protected Integer parcelas;
    protected Double valor;
    @XmlElement(required = true)
    protected String formaPagameno;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vencimentoCartao;
    protected String numeroRequisicaoGov;
    protected EnumTipoFormaPagamento tipo;

    /**
     * Gets the value of the autorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizacao() {
        return autorizacao;
    }

    /**
     * Sets the value of the autorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizacao(String value) {
        this.autorizacao = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the parcelas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParcelas() {
        return parcelas;
    }

    /**
     * Sets the value of the parcelas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParcelas(Integer value) {
        this.parcelas = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
    }

    /**
     * Gets the value of the formaPagameno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPagameno() {
        return formaPagameno;
    }

    /**
     * Sets the value of the formaPagameno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPagameno(String value) {
        this.formaPagameno = value;
    }

    /**
     * Gets the value of the vencimentoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimentoCartao() {
        return vencimentoCartao;
    }

    /**
     * Sets the value of the vencimentoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimentoCartao(XMLGregorianCalendar value) {
        this.vencimentoCartao = value;
    }

    /**
     * Gets the value of the numeroRequisicaoGov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRequisicaoGov() {
        return numeroRequisicaoGov;
    }

    /**
     * Sets the value of the numeroRequisicaoGov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRequisicaoGov(String value) {
        this.numeroRequisicaoGov = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTipoFormaPagamento }
     *     
     */
    public EnumTipoFormaPagamento getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTipoFormaPagamento }
     *     
     */
    public void setTipo(EnumTipoFormaPagamento value) {
        this.tipo = value;
    }

}
