
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao;


/**
 * <p>Classe Java de identificadorIntegracaoRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="identificadorIntegracaoRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorIntegracao">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipoIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoIntegracao"/>
 *         &lt;element name="tipoConector" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nomeConector" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idSolicitacaoRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="idAereoRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="idHotelRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="idCarroRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="idOutroRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="idSeguroRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="idTrasladoRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificadorIntegracaoRef", propOrder = {
    "identificadorIntegracao",
    "tipoIntegracao",
    "tipoConector",
    "nomeConector",
    "idSolicitacaoRef",
    "idAereoRef",
    "idHotelRef",
    "idCarroRef",
    "idOutroRef",
    "idSeguroRef",
    "idTrasladoRef"
})
public class IdentificadorIntegracaoRef {

    @XmlElement(required = true)
    protected String identificadorIntegracao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoIntegracao tipoIntegracao;
    @XmlElement(required = true)
    protected String tipoConector;
    @XmlElement(required = true)
    protected String nomeConector;
    protected int idSolicitacaoRef;
    protected Integer idAereoRef;
    protected Integer idHotelRef;
    protected Integer idCarroRef;
    protected Integer idOutroRef;
    protected Integer idSeguroRef;
    protected Integer idTrasladoRef;

    /**
     * Obtém o valor da propriedade identificadorIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }

    /**
     * Define o valor da propriedade identificadorIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorIntegracao(String value) {
        this.identificadorIntegracao = value;
    }

    /**
     * Obtém o valor da propriedade tipoIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link TipoIntegracao }
     *     
     */
    public TipoIntegracao getTipoIntegracao() {
        return tipoIntegracao;
    }

    /**
     * Define o valor da propriedade tipoIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIntegracao }
     *     
     */
    public void setTipoIntegracao(TipoIntegracao value) {
        this.tipoIntegracao = value;
    }

    /**
     * Obtém o valor da propriedade tipoConector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoConector() {
        return tipoConector;
    }

    /**
     * Define o valor da propriedade tipoConector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoConector(String value) {
        this.tipoConector = value;
    }

    /**
     * Obtém o valor da propriedade nomeConector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConector() {
        return nomeConector;
    }

    /**
     * Define o valor da propriedade nomeConector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConector(String value) {
        this.nomeConector = value;
    }

    /**
     * Obtém o valor da propriedade idSolicitacaoRef.
     * 
     */
    public int getIdSolicitacaoRef() {
        return idSolicitacaoRef;
    }

    /**
     * Define o valor da propriedade idSolicitacaoRef.
     * 
     */
    public void setIdSolicitacaoRef(int value) {
        this.idSolicitacaoRef = value;
    }

    /**
     * Obtém o valor da propriedade idAereoRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAereoRef() {
        return idAereoRef;
    }

    /**
     * Define o valor da propriedade idAereoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAereoRef(Integer value) {
        this.idAereoRef = value;
    }

    /**
     * Obtém o valor da propriedade idHotelRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdHotelRef() {
        return idHotelRef;
    }

    /**
     * Define o valor da propriedade idHotelRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdHotelRef(Integer value) {
        this.idHotelRef = value;
    }

    /**
     * Obtém o valor da propriedade idCarroRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCarroRef() {
        return idCarroRef;
    }

    /**
     * Define o valor da propriedade idCarroRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCarroRef(Integer value) {
        this.idCarroRef = value;
    }

    /**
     * Obtém o valor da propriedade idOutroRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOutroRef() {
        return idOutroRef;
    }

    /**
     * Define o valor da propriedade idOutroRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOutroRef(Integer value) {
        this.idOutroRef = value;
    }

    /**
     * Obtém o valor da propriedade idSeguroRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSeguroRef() {
        return idSeguroRef;
    }

    /**
     * Define o valor da propriedade idSeguroRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSeguroRef(Integer value) {
        this.idSeguroRef = value;
    }

    /**
     * Obtém o valor da propriedade idTrasladoRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTrasladoRef() {
        return idTrasladoRef;
    }

    /**
     * Define o valor da propriedade idTrasladoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTrasladoRef(Integer value) {
        this.idTrasladoRef = value;
    }

}
