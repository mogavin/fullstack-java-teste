
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for pesquisarSolicitacaoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pesquisarSolicitacaoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="idSolicitacaoRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *             &lt;element name="exibirCancelados" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *             &lt;element name="exibirPendentesAprovacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="dataInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *             &lt;element name="dataFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *             &lt;element name="registroInicial">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;minInclusive value="1"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="quantidadeRegistros" minOccurs="0">
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                   &lt;maxInclusive value="50"/>
 *                   &lt;minInclusive value="1"/>
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/element>
 *             &lt;element name="sincronizado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="exibirRemarks" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarSolicitacaoRequest", propOrder = {
    "idSolicitacaoRef",
    "exibirCancelados",
    "exibirPendentesAprovacao",
    "dataInicial",
    "dataFinal",
    "registroInicial",
    "quantidadeRegistros",
    "sincronizado",
    "exibirRemarks"
})
public class PesquisarSolicitacaoRequest {

    protected Integer idSolicitacaoRef;
    @XmlElement(defaultValue = "false")
    protected Boolean exibirCancelados;
    @XmlElement(defaultValue = "false")
    protected Boolean exibirPendentesAprovacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinal;
    protected Integer registroInicial;
    @XmlElement(defaultValue = "50")
    protected Integer quantidadeRegistros;
    @XmlElement(defaultValue = "false")
    protected Boolean sincronizado;
    @XmlElement(defaultValue = "true")
    protected Boolean exibirRemarks;

    /**
     * Gets the value of the idSolicitacaoRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSolicitacaoRef() {
        return idSolicitacaoRef;
    }

    /**
     * Sets the value of the idSolicitacaoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSolicitacaoRef(Integer value) {
        this.idSolicitacaoRef = value;
    }

    /**
     * Gets the value of the exibirCancelados property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExibirCancelados() {
        return exibirCancelados;
    }

    /**
     * Sets the value of the exibirCancelados property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExibirCancelados(Boolean value) {
        this.exibirCancelados = value;
    }

    /**
     * Gets the value of the exibirPendentesAprovacao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExibirPendentesAprovacao() {
        return exibirPendentesAprovacao;
    }

    /**
     * Sets the value of the exibirPendentesAprovacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExibirPendentesAprovacao(Boolean value) {
        this.exibirPendentesAprovacao = value;
    }

    /**
     * Gets the value of the dataInicial property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicial() {
        return dataInicial;
    }

    /**
     * Sets the value of the dataInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicial(XMLGregorianCalendar value) {
        this.dataInicial = value;
    }

    /**
     * Gets the value of the dataFinal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinal() {
        return dataFinal;
    }

    /**
     * Sets the value of the dataFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinal(XMLGregorianCalendar value) {
        this.dataFinal = value;
    }

    /**
     * Gets the value of the registroInicial property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRegistroInicial() {
        return registroInicial;
    }

    /**
     * Sets the value of the registroInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRegistroInicial(Integer value) {
        this.registroInicial = value;
    }

    /**
     * Gets the value of the quantidadeRegistros property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeRegistros() {
        return quantidadeRegistros;
    }

    /**
     * Sets the value of the quantidadeRegistros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeRegistros(Integer value) {
        this.quantidadeRegistros = value;
    }

    /**
     * Gets the value of the sincronizado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSincronizado() {
        return sincronizado;
    }

    /**
     * Sets the value of the sincronizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSincronizado(Boolean value) {
        this.sincronizado = value;
    }

    /**
     * Gets the value of the exibirRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExibirRemarks() {
        return exibirRemarks;
    }

    /**
     * Sets the value of the exibirRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExibirRemarks(Boolean value) {
        this.exibirRemarks = value;
    }

}
