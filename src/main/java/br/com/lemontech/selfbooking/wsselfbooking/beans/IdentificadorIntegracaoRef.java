
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoIntegracao;


/**
 * <p>Java class for identificadorIntegracaoRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the identificadorIntegracao property.
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
     * Sets the value of the identificadorIntegracao property.
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
     * Gets the value of the tipoIntegracao property.
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
     * Sets the value of the tipoIntegracao property.
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
     * Gets the value of the tipoConector property.
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
     * Sets the value of the tipoConector property.
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
     * Gets the value of the nomeConector property.
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
     * Sets the value of the nomeConector property.
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
     * Gets the value of the idSolicitacaoRef property.
     * 
     */
    public int getIdSolicitacaoRef() {
        return idSolicitacaoRef;
    }

    /**
     * Sets the value of the idSolicitacaoRef property.
     * 
     */
    public void setIdSolicitacaoRef(int value) {
        this.idSolicitacaoRef = value;
    }

    /**
     * Gets the value of the idAereoRef property.
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
     * Sets the value of the idAereoRef property.
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
     * Gets the value of the idHotelRef property.
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
     * Sets the value of the idHotelRef property.
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
     * Gets the value of the idCarroRef property.
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
     * Sets the value of the idCarroRef property.
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
     * Gets the value of the idOutroRef property.
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
     * Sets the value of the idOutroRef property.
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
     * Gets the value of the idSeguroRef property.
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
     * Sets the value of the idSeguroRef property.
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
     * Gets the value of the idTrasladoRef property.
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
     * Sets the value of the idTrasladoRef property.
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
