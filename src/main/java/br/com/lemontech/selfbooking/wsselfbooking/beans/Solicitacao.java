
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.aereo.Aereos;
import br.com.lemontech.selfbooking.wsselfbooking.beans.carro.Carros;
import br.com.lemontech.selfbooking.wsselfbooking.beans.hotel.Hoteis;
import br.com.lemontech.selfbooking.wsselfbooking.beans.outro.Outros;
import br.com.lemontech.selfbooking.wsselfbooking.beans.seguro.Seguros;
import br.com.lemontech.selfbooking.wsselfbooking.beans.traslado.Traslados;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.IdentificadoresIntegracao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusSolicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao;


/**
 * <p>Classe Java de solicitacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="solicitacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSolicitacao" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="localVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAprovacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="descricaoCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoSubCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCriacaoSv" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="codigoAutorizacaoViagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoClienteFranquia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solicitante" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiro" minOccurs="0"/>
 *         &lt;element name="aprovador" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiro" minOccurs="0"/>
 *         &lt;element name="atendimento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}atendimento" minOccurs="0"/>
 *         &lt;element name="dataConclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="regional" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="centroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="subCentroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="contaContabil" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="nacional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="codigoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passageiros" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiros" minOccurs="0"/>
 *         &lt;element name="aereos" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereos" minOccurs="0"/>
 *         &lt;element name="hoteis" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/hotel}hoteis" minOccurs="0"/>
 *         &lt;element name="carros" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro}carros" minOccurs="0"/>
 *         &lt;element name="outros" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/outro}outros" minOccurs="0"/>
 *         &lt;element name="motivoViagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adiantamento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="moedaAdiantamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controleCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totais" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}totais" minOccurs="0"/>
 *         &lt;element name="statusSolicitacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}statusSolicitacao" minOccurs="0"/>
 *         &lt;element name="identificadoresIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}identificadoresIntegracao" minOccurs="0"/>
 *         &lt;element name="autoConclusao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rateios" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}rateios" minOccurs="0"/>
 *         &lt;element name="codigoUnidadeNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unidadeNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seguros" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/seguro}seguros" minOccurs="0"/>
 *         &lt;element name="agencia" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}agencia" minOccurs="0"/>
 *         &lt;element name="filial" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}filial" minOccurs="0"/>
 *         &lt;element name="instrucoesFaturamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}instrucoesFaturamento" minOccurs="0"/>
 *         &lt;element name="frontOffice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="complementoMotivoViagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pontoVenda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}pontoVenda" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="justificativaPrazoMinimo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementoJustificativaPrazoMinimo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traslados" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/traslado}traslados" minOccurs="0"/>
 *         &lt;element name="tipoSolicitacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoSolicitacao" minOccurs="0"/>
 *         &lt;element name="idSolicitacaoPrincipal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="projeto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="contaContabilAereo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="contaContabilHotel" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="contaContabilCarro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="contaContabilSeguro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="contaContabilOutro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="contaContabilTraslado" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/>
 *         &lt;element name="descricaoProjeto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aprovadorResponsavel" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiro" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacao", propOrder = {
    "idSolicitacao",
    "localVenda",
    "dataAprovacao",
    "descricaoCentroCusto",
    "descricaoSubCentroCusto",
    "dataCriacaoSv",
    "codigoAutorizacaoViagem",
    "codigoClienteFranquia",
    "solicitante",
    "aprovador",
    "atendimento",
    "dataConclusao",
    "regional",
    "centroDeCusto",
    "subCentroDeCusto",
    "contaContabil",
    "nacional",
    "codigoCliente",
    "passageiros",
    "aereos",
    "hoteis",
    "carros",
    "outros",
    "motivoViagem",
    "adiantamento",
    "moedaAdiantamento",
    "controleCliente",
    "totais",
    "statusSolicitacao",
    "identificadoresIntegracao",
    "autoConclusao",
    "rateios",
    "codigoUnidadeNegocio",
    "unidadeNegocio",
    "idCliente",
    "seguros",
    "agencia",
    "filial",
    "instrucoesFaturamento",
    "frontOffice",
    "complementoMotivoViagem",
    "pontoVenda",
    "observacao",
    "justificativaPrazoMinimo",
    "complementoJustificativaPrazoMinimo",
    "traslados",
    "tipoSolicitacao",
    "idSolicitacaoPrincipal",
    "projeto",
    "contaContabilAereo",
    "contaContabilHotel",
    "contaContabilCarro",
    "contaContabilSeguro",
    "contaContabilOutro",
    "contaContabilTraslado",
    "descricaoProjeto",
    "aprovadorResponsavel"
})
public class Solicitacao {

    protected int idSolicitacao;
    protected String localVenda;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAprovacao;
    protected String descricaoCentroCusto;
    protected String descricaoSubCentroCusto;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCriacaoSv;
    protected String codigoAutorizacaoViagem;
    protected String codigoClienteFranquia;
    protected Passageiro solicitante;
    protected Passageiro aprovador;
    protected Atendimento atendimento;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataConclusao;
    protected String regional;
    protected String centroDeCusto;
    protected String subCentroDeCusto;
    protected String contaContabil;
    protected boolean nacional;
    protected String codigoCliente;
    protected Passageiros passageiros;
    protected Aereos aereos;
    protected Hoteis hoteis;
    protected Carros carros;
    protected Outros outros;
    protected String motivoViagem;
    protected Double adiantamento;
    protected String moedaAdiantamento;
    protected String controleCliente;
    protected Totais totais;
    @XmlSchemaType(name = "string")
    protected StatusSolicitacao statusSolicitacao;
    protected IdentificadoresIntegracao identificadoresIntegracao;
    protected Boolean autoConclusao;
    protected Rateios rateios;
    protected String codigoUnidadeNegocio;
    protected String unidadeNegocio;
    protected int idCliente;
    protected Seguros seguros;
    protected Agencia agencia;
    protected Filial filial;
    protected InstrucoesFaturamento instrucoesFaturamento;
    protected Boolean frontOffice;
    protected String complementoMotivoViagem;
    protected PontoVenda pontoVenda;
    protected String observacao;
    protected String justificativaPrazoMinimo;
    protected String complementoJustificativaPrazoMinimo;
    protected Traslados traslados;
    @XmlSchemaType(name = "string")
    protected TipoSolicitacao tipoSolicitacao;
    protected Integer idSolicitacaoPrincipal;
    protected String projeto;
    protected String contaContabilAereo;
    protected String contaContabilHotel;
    protected String contaContabilCarro;
    protected String contaContabilSeguro;
    protected String contaContabilOutro;
    protected String contaContabilTraslado;
    protected String descricaoProjeto;
    protected Passageiro aprovadorResponsavel;

    /**
     * Obtém o valor da propriedade idSolicitacao.
     * 
     */
    public int getIdSolicitacao() {
        return idSolicitacao;
    }

    /**
     * Define o valor da propriedade idSolicitacao.
     * 
     */
    public void setIdSolicitacao(int value) {
        this.idSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade localVenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalVenda() {
        return localVenda;
    }

    /**
     * Define o valor da propriedade localVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalVenda(String value) {
        this.localVenda = value;
    }

    /**
     * Obtém o valor da propriedade dataAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAprovacao() {
        return dataAprovacao;
    }

    /**
     * Define o valor da propriedade dataAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAprovacao(XMLGregorianCalendar value) {
        this.dataAprovacao = value;
    }

    /**
     * Obtém o valor da propriedade descricaoCentroCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoCentroCusto() {
        return descricaoCentroCusto;
    }

    /**
     * Define o valor da propriedade descricaoCentroCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoCentroCusto(String value) {
        this.descricaoCentroCusto = value;
    }

    /**
     * Obtém o valor da propriedade descricaoSubCentroCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoSubCentroCusto() {
        return descricaoSubCentroCusto;
    }

    /**
     * Define o valor da propriedade descricaoSubCentroCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoSubCentroCusto(String value) {
        this.descricaoSubCentroCusto = value;
    }

    /**
     * Obtém o valor da propriedade dataCriacaoSv.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCriacaoSv() {
        return dataCriacaoSv;
    }

    /**
     * Define o valor da propriedade dataCriacaoSv.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacaoSv(XMLGregorianCalendar value) {
        this.dataCriacaoSv = value;
    }

    /**
     * Obtém o valor da propriedade codigoAutorizacaoViagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAutorizacaoViagem() {
        return codigoAutorizacaoViagem;
    }

    /**
     * Define o valor da propriedade codigoAutorizacaoViagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAutorizacaoViagem(String value) {
        this.codigoAutorizacaoViagem = value;
    }

    /**
     * Obtém o valor da propriedade codigoClienteFranquia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClienteFranquia() {
        return codigoClienteFranquia;
    }

    /**
     * Define o valor da propriedade codigoClienteFranquia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClienteFranquia(String value) {
        this.codigoClienteFranquia = value;
    }

    /**
     * Obtém o valor da propriedade solicitante.
     * 
     * @return
     *     possible object is
     *     {@link Passageiro }
     *     
     */
    public Passageiro getSolicitante() {
        return solicitante;
    }

    /**
     * Define o valor da propriedade solicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiro }
     *     
     */
    public void setSolicitante(Passageiro value) {
        this.solicitante = value;
    }

    /**
     * Obtém o valor da propriedade aprovador.
     * 
     * @return
     *     possible object is
     *     {@link Passageiro }
     *     
     */
    public Passageiro getAprovador() {
        return aprovador;
    }

    /**
     * Define o valor da propriedade aprovador.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiro }
     *     
     */
    public void setAprovador(Passageiro value) {
        this.aprovador = value;
    }

    /**
     * Obtém o valor da propriedade atendimento.
     * 
     * @return
     *     possible object is
     *     {@link Atendimento }
     *     
     */
    public Atendimento getAtendimento() {
        return atendimento;
    }

    /**
     * Define o valor da propriedade atendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Atendimento }
     *     
     */
    public void setAtendimento(Atendimento value) {
        this.atendimento = value;
    }

    /**
     * Obtém o valor da propriedade dataConclusao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataConclusao() {
        return dataConclusao;
    }

    /**
     * Define o valor da propriedade dataConclusao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataConclusao(XMLGregorianCalendar value) {
        this.dataConclusao = value;
    }

    /**
     * Obtém o valor da propriedade regional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegional() {
        return regional;
    }

    /**
     * Define o valor da propriedade regional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegional(String value) {
        this.regional = value;
    }

    /**
     * Obtém o valor da propriedade centroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroDeCusto() {
        return centroDeCusto;
    }

    /**
     * Define o valor da propriedade centroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroDeCusto(String value) {
        this.centroDeCusto = value;
    }

    /**
     * Obtém o valor da propriedade subCentroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCentroDeCusto() {
        return subCentroDeCusto;
    }

    /**
     * Define o valor da propriedade subCentroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCentroDeCusto(String value) {
        this.subCentroDeCusto = value;
    }

    /**
     * Obtém o valor da propriedade contaContabil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaContabil() {
        return contaContabil;
    }

    /**
     * Define o valor da propriedade contaContabil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaContabil(String value) {
        this.contaContabil = value;
    }

    /**
     * Obtém o valor da propriedade nacional.
     * 
     */
    public boolean isNacional() {
        return nacional;
    }

    /**
     * Define o valor da propriedade nacional.
     * 
     */
    public void setNacional(boolean value) {
        this.nacional = value;
    }

    /**
     * Obtém o valor da propriedade codigoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Define o valor da propriedade codigoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCliente(String value) {
        this.codigoCliente = value;
    }

    /**
     * Obtém o valor da propriedade passageiros.
     * 
     * @return
     *     possible object is
     *     {@link Passageiros }
     *     
     */
    public Passageiros getPassageiros() {
        return passageiros;
    }

    /**
     * Define o valor da propriedade passageiros.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiros }
     *     
     */
    public void setPassageiros(Passageiros value) {
        this.passageiros = value;
    }

    /**
     * Obtém o valor da propriedade aereos.
     * 
     * @return
     *     possible object is
     *     {@link Aereos }
     *     
     */
    public Aereos getAereos() {
        return aereos;
    }

    /**
     * Define o valor da propriedade aereos.
     * 
     * @param value
     *     allowed object is
     *     {@link Aereos }
     *     
     */
    public void setAereos(Aereos value) {
        this.aereos = value;
    }

    /**
     * Obtém o valor da propriedade hoteis.
     * 
     * @return
     *     possible object is
     *     {@link Hoteis }
     *     
     */
    public Hoteis getHoteis() {
        return hoteis;
    }

    /**
     * Define o valor da propriedade hoteis.
     * 
     * @param value
     *     allowed object is
     *     {@link Hoteis }
     *     
     */
    public void setHoteis(Hoteis value) {
        this.hoteis = value;
    }

    /**
     * Obtém o valor da propriedade carros.
     * 
     * @return
     *     possible object is
     *     {@link Carros }
     *     
     */
    public Carros getCarros() {
        return carros;
    }

    /**
     * Define o valor da propriedade carros.
     * 
     * @param value
     *     allowed object is
     *     {@link Carros }
     *     
     */
    public void setCarros(Carros value) {
        this.carros = value;
    }

    /**
     * Obtém o valor da propriedade outros.
     * 
     * @return
     *     possible object is
     *     {@link Outros }
     *     
     */
    public Outros getOutros() {
        return outros;
    }

    /**
     * Define o valor da propriedade outros.
     * 
     * @param value
     *     allowed object is
     *     {@link Outros }
     *     
     */
    public void setOutros(Outros value) {
        this.outros = value;
    }

    /**
     * Obtém o valor da propriedade motivoViagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoViagem() {
        return motivoViagem;
    }

    /**
     * Define o valor da propriedade motivoViagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoViagem(String value) {
        this.motivoViagem = value;
    }

    /**
     * Obtém o valor da propriedade adiantamento.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAdiantamento() {
        return adiantamento;
    }

    /**
     * Define o valor da propriedade adiantamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAdiantamento(Double value) {
        this.adiantamento = value;
    }

    /**
     * Obtém o valor da propriedade moedaAdiantamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoedaAdiantamento() {
        return moedaAdiantamento;
    }

    /**
     * Define o valor da propriedade moedaAdiantamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoedaAdiantamento(String value) {
        this.moedaAdiantamento = value;
    }

    /**
     * Obtém o valor da propriedade controleCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControleCliente() {
        return controleCliente;
    }

    /**
     * Define o valor da propriedade controleCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControleCliente(String value) {
        this.controleCliente = value;
    }

    /**
     * Obtém o valor da propriedade totais.
     * 
     * @return
     *     possible object is
     *     {@link Totais }
     *     
     */
    public Totais getTotais() {
        return totais;
    }

    /**
     * Define o valor da propriedade totais.
     * 
     * @param value
     *     allowed object is
     *     {@link Totais }
     *     
     */
    public void setTotais(Totais value) {
        this.totais = value;
    }

    /**
     * Obtém o valor da propriedade statusSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link StatusSolicitacao }
     *     
     */
    public StatusSolicitacao getStatusSolicitacao() {
        return statusSolicitacao;
    }

    /**
     * Define o valor da propriedade statusSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusSolicitacao }
     *     
     */
    public void setStatusSolicitacao(StatusSolicitacao value) {
        this.statusSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade identificadoresIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadoresIntegracao }
     *     
     */
    public IdentificadoresIntegracao getIdentificadoresIntegracao() {
        return identificadoresIntegracao;
    }

    /**
     * Define o valor da propriedade identificadoresIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadoresIntegracao }
     *     
     */
    public void setIdentificadoresIntegracao(IdentificadoresIntegracao value) {
        this.identificadoresIntegracao = value;
    }

    /**
     * Obtém o valor da propriedade autoConclusao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoConclusao() {
        return autoConclusao;
    }

    /**
     * Define o valor da propriedade autoConclusao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoConclusao(Boolean value) {
        this.autoConclusao = value;
    }

    /**
     * Obtém o valor da propriedade rateios.
     * 
     * @return
     *     possible object is
     *     {@link Rateios }
     *     
     */
    public Rateios getRateios() {
        return rateios;
    }

    /**
     * Define o valor da propriedade rateios.
     * 
     * @param value
     *     allowed object is
     *     {@link Rateios }
     *     
     */
    public void setRateios(Rateios value) {
        this.rateios = value;
    }

    /**
     * Obtém o valor da propriedade codigoUnidadeNegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoUnidadeNegocio() {
        return codigoUnidadeNegocio;
    }

    /**
     * Define o valor da propriedade codigoUnidadeNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoUnidadeNegocio(String value) {
        this.codigoUnidadeNegocio = value;
    }

    /**
     * Obtém o valor da propriedade unidadeNegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeNegocio() {
        return unidadeNegocio;
    }

    /**
     * Define o valor da propriedade unidadeNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeNegocio(String value) {
        this.unidadeNegocio = value;
    }

    /**
     * Obtém o valor da propriedade idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define o valor da propriedade idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Obtém o valor da propriedade seguros.
     * 
     * @return
     *     possible object is
     *     {@link Seguros }
     *     
     */
    public Seguros getSeguros() {
        return seguros;
    }

    /**
     * Define o valor da propriedade seguros.
     * 
     * @param value
     *     allowed object is
     *     {@link Seguros }
     *     
     */
    public void setSeguros(Seguros value) {
        this.seguros = value;
    }

    /**
     * Obtém o valor da propriedade agencia.
     * 
     * @return
     *     possible object is
     *     {@link Agencia }
     *     
     */
    public Agencia getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Agencia }
     *     
     */
    public void setAgencia(Agencia value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade filial.
     * 
     * @return
     *     possible object is
     *     {@link Filial }
     *     
     */
    public Filial getFilial() {
        return filial;
    }

    /**
     * Define o valor da propriedade filial.
     * 
     * @param value
     *     allowed object is
     *     {@link Filial }
     *     
     */
    public void setFilial(Filial value) {
        this.filial = value;
    }

    /**
     * Obtém o valor da propriedade instrucoesFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link InstrucoesFaturamento }
     *     
     */
    public InstrucoesFaturamento getInstrucoesFaturamento() {
        return instrucoesFaturamento;
    }

    /**
     * Define o valor da propriedade instrucoesFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrucoesFaturamento }
     *     
     */
    public void setInstrucoesFaturamento(InstrucoesFaturamento value) {
        this.instrucoesFaturamento = value;
    }

    /**
     * Obtém o valor da propriedade frontOffice.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrontOffice() {
        return frontOffice;
    }

    /**
     * Define o valor da propriedade frontOffice.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrontOffice(Boolean value) {
        this.frontOffice = value;
    }

    /**
     * Obtém o valor da propriedade complementoMotivoViagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoMotivoViagem() {
        return complementoMotivoViagem;
    }

    /**
     * Define o valor da propriedade complementoMotivoViagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoMotivoViagem(String value) {
        this.complementoMotivoViagem = value;
    }

    /**
     * Obtém o valor da propriedade pontoVenda.
     * 
     * @return
     *     possible object is
     *     {@link PontoVenda }
     *     
     */
    public PontoVenda getPontoVenda() {
        return pontoVenda;
    }

    /**
     * Define o valor da propriedade pontoVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link PontoVenda }
     *     
     */
    public void setPontoVenda(PontoVenda value) {
        this.pontoVenda = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obtém o valor da propriedade justificativaPrazoMinimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaPrazoMinimo() {
        return justificativaPrazoMinimo;
    }

    /**
     * Define o valor da propriedade justificativaPrazoMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaPrazoMinimo(String value) {
        this.justificativaPrazoMinimo = value;
    }

    /**
     * Obtém o valor da propriedade complementoJustificativaPrazoMinimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoJustificativaPrazoMinimo() {
        return complementoJustificativaPrazoMinimo;
    }

    /**
     * Define o valor da propriedade complementoJustificativaPrazoMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoJustificativaPrazoMinimo(String value) {
        this.complementoJustificativaPrazoMinimo = value;
    }

    /**
     * Obtém o valor da propriedade traslados.
     * 
     * @return
     *     possible object is
     *     {@link Traslados }
     *     
     */
    public Traslados getTraslados() {
        return traslados;
    }

    /**
     * Define o valor da propriedade traslados.
     * 
     * @param value
     *     allowed object is
     *     {@link Traslados }
     *     
     */
    public void setTraslados(Traslados value) {
        this.traslados = value;
    }

    /**
     * Obtém o valor da propriedade tipoSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link TipoSolicitacao }
     *     
     */
    public TipoSolicitacao getTipoSolicitacao() {
        return tipoSolicitacao;
    }

    /**
     * Define o valor da propriedade tipoSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSolicitacao }
     *     
     */
    public void setTipoSolicitacao(TipoSolicitacao value) {
        this.tipoSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade idSolicitacaoPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSolicitacaoPrincipal() {
        return idSolicitacaoPrincipal;
    }

    /**
     * Define o valor da propriedade idSolicitacaoPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSolicitacaoPrincipal(Integer value) {
        this.idSolicitacaoPrincipal = value;
    }

    /**
     * Obtém o valor da propriedade projeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjeto() {
        return projeto;
    }

    /**
     * Define o valor da propriedade projeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjeto(String value) {
        this.projeto = value;
    }

    /**
     * Obtém o valor da propriedade contaContabilAereo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaContabilAereo() {
        return contaContabilAereo;
    }

    /**
     * Define o valor da propriedade contaContabilAereo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaContabilAereo(String value) {
        this.contaContabilAereo = value;
    }

    /**
     * Obtém o valor da propriedade contaContabilHotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaContabilHotel() {
        return contaContabilHotel;
    }

    /**
     * Define o valor da propriedade contaContabilHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaContabilHotel(String value) {
        this.contaContabilHotel = value;
    }

    /**
     * Obtém o valor da propriedade contaContabilCarro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaContabilCarro() {
        return contaContabilCarro;
    }

    /**
     * Define o valor da propriedade contaContabilCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaContabilCarro(String value) {
        this.contaContabilCarro = value;
    }

    /**
     * Obtém o valor da propriedade contaContabilSeguro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaContabilSeguro() {
        return contaContabilSeguro;
    }

    /**
     * Define o valor da propriedade contaContabilSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaContabilSeguro(String value) {
        this.contaContabilSeguro = value;
    }

    /**
     * Obtém o valor da propriedade contaContabilOutro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaContabilOutro() {
        return contaContabilOutro;
    }

    /**
     * Define o valor da propriedade contaContabilOutro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaContabilOutro(String value) {
        this.contaContabilOutro = value;
    }

    /**
     * Obtém o valor da propriedade contaContabilTraslado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaContabilTraslado() {
        return contaContabilTraslado;
    }

    /**
     * Define o valor da propriedade contaContabilTraslado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaContabilTraslado(String value) {
        this.contaContabilTraslado = value;
    }

    /**
     * Obtém o valor da propriedade descricaoProjeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoProjeto() {
        return descricaoProjeto;
    }

    /**
     * Define o valor da propriedade descricaoProjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoProjeto(String value) {
        this.descricaoProjeto = value;
    }

    /**
     * Obtém o valor da propriedade aprovadorResponsavel.
     * 
     * @return
     *     possible object is
     *     {@link Passageiro }
     *     
     */
    public Passageiro getAprovadorResponsavel() {
        return aprovadorResponsavel;
    }

    /**
     * Define o valor da propriedade aprovadorResponsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiro }
     *     
     */
    public void setAprovadorResponsavel(Passageiro value) {
        this.aprovadorResponsavel = value;
    }

}
