
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de pesquisarSolicitacaoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade idSolicitacaoRef.
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
     * Define o valor da propriedade idSolicitacaoRef.
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
     * Obtém o valor da propriedade exibirCancelados.
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
     * Define o valor da propriedade exibirCancelados.
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
     * Obtém o valor da propriedade exibirPendentesAprovacao.
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
     * Define o valor da propriedade exibirPendentesAprovacao.
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
     * Obtém o valor da propriedade dataInicial.
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
     * Define o valor da propriedade dataInicial.
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
     * Obtém o valor da propriedade dataFinal.
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
     * Define o valor da propriedade dataFinal.
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
     * Obtém o valor da propriedade registroInicial.
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
     * Define o valor da propriedade registroInicial.
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
     * Obtém o valor da propriedade quantidadeRegistros.
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
     * Define o valor da propriedade quantidadeRegistros.
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
     * Obtém o valor da propriedade sincronizado.
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
     * Define o valor da propriedade sincronizado.
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
     * Obtém o valor da propriedade exibirRemarks.
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
     * Define o valor da propriedade exibirRemarks.
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
