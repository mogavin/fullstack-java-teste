
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem;


/**
 * <p>Java class for parametrizacaoCentroDeCustoAprovacaoRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametrizacaoCentroDeCustoAprovacaoRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="funcionarioRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/>
 *         &lt;choice>
 *           &lt;element name="centroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef"/>
 *           &lt;element name="subCentroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}subCentroDeCustoRef"/>
 *         &lt;/choice>
 *         &lt;element name="nivelDeAprovacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoDeViagemDaAprocacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoViagem" minOccurs="0"/>
 *         &lt;element name="tipoDePassageiro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoPassageiro" minOccurs="0"/>
 *         &lt;element name="aprovaSomenteAprovador" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="aprovaSomenteDentroDaPolitica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="periodoViagemInicial" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacaoCentroDeCustoAprovacaoRef", propOrder = {
    "funcionarioRef",
    "centroDeCustoRef",
    "subCentroDeCustoRef",
    "nivelDeAprovacao",
    "tipoDeViagemDaAprocacao",
    "tipoDePassageiro",
    "aprovaSomenteAprovador",
    "aprovaSomenteDentroDaPolitica",
    "periodoViagemInicial"
})
@XmlSeeAlso({
    ParametrizacaoCentroDeCustoAprovacao.class
})
public class ParametrizacaoCentroDeCustoAprovacaoRef {

    @XmlElement(required = true)
    protected FuncionarioRef funcionarioRef;
    protected CentroDeCustoRef centroDeCustoRef;
    protected SubCentroDeCustoRef subCentroDeCustoRef;
    @XmlElement(defaultValue = "0")
    protected Integer nivelDeAprovacao;
    @XmlElement(defaultValue = "TODOS")
    protected TipoViagem tipoDeViagemDaAprocacao;
    @XmlElement(defaultValue = "TODOS")
    protected TipoPassageiro tipoDePassageiro;
    @XmlElement(defaultValue = "false")
    protected Boolean aprovaSomenteAprovador;
    @XmlElement(defaultValue = "false")
    protected Boolean aprovaSomenteDentroDaPolitica;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodoViagemInicial;

    /**
     * Gets the value of the funcionarioRef property.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }

    /**
     * Sets the value of the funcionarioRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioRef(FuncionarioRef value) {
        this.funcionarioRef = value;
    }

    /**
     * Gets the value of the centroDeCustoRef property.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }

    /**
     * Sets the value of the centroDeCustoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public void setCentroDeCustoRef(CentroDeCustoRef value) {
        this.centroDeCustoRef = value;
    }

    /**
     * Gets the value of the subCentroDeCustoRef property.
     * 
     * @return
     *     possible object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }

    /**
     * Sets the value of the subCentroDeCustoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public void setSubCentroDeCustoRef(SubCentroDeCustoRef value) {
        this.subCentroDeCustoRef = value;
    }

    /**
     * Gets the value of the nivelDeAprovacao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelDeAprovacao() {
        return nivelDeAprovacao;
    }

    /**
     * Sets the value of the nivelDeAprovacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelDeAprovacao(Integer value) {
        this.nivelDeAprovacao = value;
    }

    /**
     * Gets the value of the tipoDeViagemDaAprocacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoViagem }
     *     
     */
    public TipoViagem getTipoDeViagemDaAprocacao() {
        return tipoDeViagemDaAprocacao;
    }

    /**
     * Sets the value of the tipoDeViagemDaAprocacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoViagem }
     *     
     */
    public void setTipoDeViagemDaAprocacao(TipoViagem value) {
        this.tipoDeViagemDaAprocacao = value;
    }

    /**
     * Gets the value of the tipoDePassageiro property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPassageiro }
     *     
     */
    public TipoPassageiro getTipoDePassageiro() {
        return tipoDePassageiro;
    }

    /**
     * Sets the value of the tipoDePassageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPassageiro }
     *     
     */
    public void setTipoDePassageiro(TipoPassageiro value) {
        this.tipoDePassageiro = value;
    }

    /**
     * Gets the value of the aprovaSomenteAprovador property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAprovaSomenteAprovador() {
        return aprovaSomenteAprovador;
    }

    /**
     * Sets the value of the aprovaSomenteAprovador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAprovaSomenteAprovador(Boolean value) {
        this.aprovaSomenteAprovador = value;
    }

    /**
     * Gets the value of the aprovaSomenteDentroDaPolitica property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAprovaSomenteDentroDaPolitica() {
        return aprovaSomenteDentroDaPolitica;
    }

    /**
     * Sets the value of the aprovaSomenteDentroDaPolitica property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAprovaSomenteDentroDaPolitica(Boolean value) {
        this.aprovaSomenteDentroDaPolitica = value;
    }

    /**
     * Gets the value of the periodoViagemInicial property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodoViagemInicial() {
        return periodoViagemInicial;
    }

    /**
     * Sets the value of the periodoViagemInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodoViagemInicial(XMLGregorianCalendar value) {
        this.periodoViagemInicial = value;
    }

}
