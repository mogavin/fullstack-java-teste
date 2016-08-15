
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilAereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilFuncionario;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCadastroFuncionario;


/**
 * <p>Java class for configuracaoFuncionario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="configuracaoFuncionario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoAprova" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="solicitaParaTodos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="preAprovaTodos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="forcaDeVenda" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nivelHierarquico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoCadastro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoCadastroFuncionario" minOccurs="0"/>
 *         &lt;element name="categoriaHospedagem" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="perfilFuncionario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}perfilFuncionario"/>
 *         &lt;element name="perfilAereo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}perfilAereo" minOccurs="0"/>
 *         &lt;element name="perfilHospedagem" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}perfilHospedagem" minOccurs="0"/>
 *         &lt;element name="visualizaSaldoBudgetAprovacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="aprovaBudgetNegativo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuracaoFuncionario", propOrder = {
    "autoAprova",
    "solicitaParaTodos",
    "preAprovaTodos",
    "forcaDeVenda",
    "nivelHierarquico",
    "tipoCadastro",
    "categoriaHospedagem",
    "perfilFuncionario",
    "perfilAereo",
    "perfilHospedagem",
    "visualizaSaldoBudgetAprovacao",
    "aprovaBudgetNegativo"
})
public class ConfiguracaoFuncionario {

    @XmlElement(defaultValue = "false")
    protected Boolean autoAprova;
    @XmlElement(defaultValue = "false")
    protected Boolean solicitaParaTodos;
    @XmlElement(defaultValue = "false")
    protected Boolean preAprovaTodos;
    @XmlElement(defaultValue = "false")
    protected Boolean forcaDeVenda;
    @XmlElement(defaultValue = "0")
    protected Integer nivelHierarquico;
    @XmlElement(defaultValue = "SELF_BOOKING")
    protected TipoCadastroFuncionario tipoCadastro;
    protected String categoriaHospedagem;
    @XmlElement(required = true)
    protected PerfilFuncionario perfilFuncionario;
    protected PerfilAereo perfilAereo;
    protected PerfilHospedagem perfilHospedagem;
    @XmlElement(defaultValue = "false")
    protected Boolean visualizaSaldoBudgetAprovacao;
    @XmlElement(defaultValue = "false")
    protected Boolean aprovaBudgetNegativo;

    /**
     * Gets the value of the autoAprova property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoAprova() {
        return autoAprova;
    }

    /**
     * Sets the value of the autoAprova property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoAprova(Boolean value) {
        this.autoAprova = value;
    }

    /**
     * Gets the value of the solicitaParaTodos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaParaTodos() {
        return solicitaParaTodos;
    }

    /**
     * Sets the value of the solicitaParaTodos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaParaTodos(Boolean value) {
        this.solicitaParaTodos = value;
    }

    /**
     * Gets the value of the preAprovaTodos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreAprovaTodos() {
        return preAprovaTodos;
    }

    /**
     * Sets the value of the preAprovaTodos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreAprovaTodos(Boolean value) {
        this.preAprovaTodos = value;
    }

    /**
     * Gets the value of the forcaDeVenda property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcaDeVenda() {
        return forcaDeVenda;
    }

    /**
     * Sets the value of the forcaDeVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcaDeVenda(Boolean value) {
        this.forcaDeVenda = value;
    }

    /**
     * Gets the value of the nivelHierarquico property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelHierarquico() {
        return nivelHierarquico;
    }

    /**
     * Sets the value of the nivelHierarquico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelHierarquico(Integer value) {
        this.nivelHierarquico = value;
    }

    /**
     * Gets the value of the tipoCadastro property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCadastroFuncionario }
     *     
     */
    public TipoCadastroFuncionario getTipoCadastro() {
        return tipoCadastro;
    }

    /**
     * Sets the value of the tipoCadastro property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCadastroFuncionario }
     *     
     */
    public void setTipoCadastro(TipoCadastroFuncionario value) {
        this.tipoCadastro = value;
    }

    /**
     * Gets the value of the categoriaHospedagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaHospedagem() {
        return categoriaHospedagem;
    }

    /**
     * Sets the value of the categoriaHospedagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaHospedagem(String value) {
        this.categoriaHospedagem = value;
    }

    /**
     * Gets the value of the perfilFuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link PerfilFuncionario }
     *     
     */
    public PerfilFuncionario getPerfilFuncionario() {
        return perfilFuncionario;
    }

    /**
     * Sets the value of the perfilFuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilFuncionario }
     *     
     */
    public void setPerfilFuncionario(PerfilFuncionario value) {
        this.perfilFuncionario = value;
    }

    /**
     * Gets the value of the perfilAereo property.
     * 
     * @return
     *     possible object is
     *     {@link PerfilAereo }
     *     
     */
    public PerfilAereo getPerfilAereo() {
        return perfilAereo;
    }

    /**
     * Sets the value of the perfilAereo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilAereo }
     *     
     */
    public void setPerfilAereo(PerfilAereo value) {
        this.perfilAereo = value;
    }

    /**
     * Gets the value of the perfilHospedagem property.
     * 
     * @return
     *     possible object is
     *     {@link PerfilHospedagem }
     *     
     */
    public PerfilHospedagem getPerfilHospedagem() {
        return perfilHospedagem;
    }

    /**
     * Sets the value of the perfilHospedagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilHospedagem }
     *     
     */
    public void setPerfilHospedagem(PerfilHospedagem value) {
        this.perfilHospedagem = value;
    }

    /**
     * Gets the value of the visualizaSaldoBudgetAprovacao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisualizaSaldoBudgetAprovacao() {
        return visualizaSaldoBudgetAprovacao;
    }

    /**
     * Sets the value of the visualizaSaldoBudgetAprovacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisualizaSaldoBudgetAprovacao(Boolean value) {
        this.visualizaSaldoBudgetAprovacao = value;
    }

    /**
     * Gets the value of the aprovaBudgetNegativo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAprovaBudgetNegativo() {
        return aprovaBudgetNegativo;
    }

    /**
     * Sets the value of the aprovaBudgetNegativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAprovaBudgetNegativo(Boolean value) {
        this.aprovaBudgetNegativo = value;
    }

}
