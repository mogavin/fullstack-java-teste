
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilAereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilFuncionario;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCadastroFuncionario;


/**
 * <p>Classe Java de configuracaoFuncionario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
    @XmlSchemaType(name = "string")
    protected TipoCadastroFuncionario tipoCadastro;
    protected String categoriaHospedagem;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerfilFuncionario perfilFuncionario;
    @XmlSchemaType(name = "string")
    protected PerfilAereo perfilAereo;
    @XmlSchemaType(name = "string")
    protected PerfilHospedagem perfilHospedagem;
    @XmlElement(defaultValue = "false")
    protected Boolean visualizaSaldoBudgetAprovacao;
    @XmlElement(defaultValue = "false")
    protected Boolean aprovaBudgetNegativo;

    /**
     * Obtém o valor da propriedade autoAprova.
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
     * Define o valor da propriedade autoAprova.
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
     * Obtém o valor da propriedade solicitaParaTodos.
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
     * Define o valor da propriedade solicitaParaTodos.
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
     * Obtém o valor da propriedade preAprovaTodos.
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
     * Define o valor da propriedade preAprovaTodos.
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
     * Obtém o valor da propriedade forcaDeVenda.
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
     * Define o valor da propriedade forcaDeVenda.
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
     * Obtém o valor da propriedade nivelHierarquico.
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
     * Define o valor da propriedade nivelHierarquico.
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
     * Obtém o valor da propriedade tipoCadastro.
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
     * Define o valor da propriedade tipoCadastro.
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
     * Obtém o valor da propriedade categoriaHospedagem.
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
     * Define o valor da propriedade categoriaHospedagem.
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
     * Obtém o valor da propriedade perfilFuncionario.
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
     * Define o valor da propriedade perfilFuncionario.
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
     * Obtém o valor da propriedade perfilAereo.
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
     * Define o valor da propriedade perfilAereo.
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
     * Obtém o valor da propriedade perfilHospedagem.
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
     * Define o valor da propriedade perfilHospedagem.
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
     * Obtém o valor da propriedade visualizaSaldoBudgetAprovacao.
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
     * Define o valor da propriedade visualizaSaldoBudgetAprovacao.
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
     * Obtém o valor da propriedade aprovaBudgetNegativo.
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
     * Define o valor da propriedade aprovaBudgetNegativo.
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
