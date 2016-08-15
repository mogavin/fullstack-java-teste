
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
 * <p>Java class for solicitacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the idSolicitacao property.
     * 
     */
    public int getIdSolicitacao() {
        return idSolicitacao;
    }

    /**
     * Sets the value of the idSolicitacao property.
     * 
     */
    public void setIdSolicitacao(int value) {
        this.idSolicitacao = value;
    }

    /**
     * Gets the value of the localVenda property.
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
     * Sets the value of the localVenda property.
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
     * Gets the value of the dataAprovacao property.
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
     * Sets the value of the dataAprovacao property.
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
     * Gets the value of the descricaoCentroCusto property.
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
     * Sets the value of the descricaoCentroCusto property.
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
     * Gets the value of the descricaoSubCentroCusto property.
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
     * Sets the value of the descricaoSubCentroCusto property.
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
     * Gets the value of the dataCriacaoSv property.
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
     * Sets the value of the dataCriacaoSv property.
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
     * Gets the value of the codigoAutorizacaoViagem property.
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
     * Sets the value of the codigoAutorizacaoViagem property.
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
     * Gets the value of the codigoClienteFranquia property.
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
     * Sets the value of the codigoClienteFranquia property.
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
     * Gets the value of the solicitante property.
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
     * Sets the value of the solicitante property.
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
     * Gets the value of the aprovador property.
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
     * Sets the value of the aprovador property.
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
     * Gets the value of the atendimento property.
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
     * Sets the value of the atendimento property.
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
     * Gets the value of the dataConclusao property.
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
     * Sets the value of the dataConclusao property.
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
     * Gets the value of the regional property.
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
     * Sets the value of the regional property.
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
     * Gets the value of the centroDeCusto property.
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
     * Sets the value of the centroDeCusto property.
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
     * Gets the value of the subCentroDeCusto property.
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
     * Sets the value of the subCentroDeCusto property.
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
     * Gets the value of the contaContabil property.
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
     * Sets the value of the contaContabil property.
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
     * Gets the value of the nacional property.
     * 
     */
    public boolean isNacional() {
        return nacional;
    }

    /**
     * Sets the value of the nacional property.
     * 
     */
    public void setNacional(boolean value) {
        this.nacional = value;
    }

    /**
     * Gets the value of the codigoCliente property.
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
     * Sets the value of the codigoCliente property.
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
     * Gets the value of the passageiros property.
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
     * Sets the value of the passageiros property.
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
     * Gets the value of the aereos property.
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
     * Sets the value of the aereos property.
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
     * Gets the value of the hoteis property.
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
     * Sets the value of the hoteis property.
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
     * Gets the value of the carros property.
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
     * Sets the value of the carros property.
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
     * Gets the value of the outros property.
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
     * Sets the value of the outros property.
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
     * Gets the value of the motivoViagem property.
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
     * Sets the value of the motivoViagem property.
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
     * Gets the value of the adiantamento property.
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
     * Sets the value of the adiantamento property.
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
     * Gets the value of the moedaAdiantamento property.
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
     * Sets the value of the moedaAdiantamento property.
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
     * Gets the value of the controleCliente property.
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
     * Sets the value of the controleCliente property.
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
     * Gets the value of the totais property.
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
     * Sets the value of the totais property.
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
     * Gets the value of the statusSolicitacao property.
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
     * Sets the value of the statusSolicitacao property.
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
     * Gets the value of the identificadoresIntegracao property.
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
     * Sets the value of the identificadoresIntegracao property.
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
     * Gets the value of the autoConclusao property.
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
     * Sets the value of the autoConclusao property.
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
     * Gets the value of the rateios property.
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
     * Sets the value of the rateios property.
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
     * Gets the value of the codigoUnidadeNegocio property.
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
     * Sets the value of the codigoUnidadeNegocio property.
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
     * Gets the value of the unidadeNegocio property.
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
     * Sets the value of the unidadeNegocio property.
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
     * Gets the value of the idCliente property.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Gets the value of the seguros property.
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
     * Sets the value of the seguros property.
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
     * Gets the value of the agencia property.
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
     * Sets the value of the agencia property.
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
     * Gets the value of the filial property.
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
     * Sets the value of the filial property.
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
     * Gets the value of the instrucoesFaturamento property.
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
     * Sets the value of the instrucoesFaturamento property.
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
     * Gets the value of the frontOffice property.
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
     * Sets the value of the frontOffice property.
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
     * Gets the value of the complementoMotivoViagem property.
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
     * Sets the value of the complementoMotivoViagem property.
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
     * Gets the value of the pontoVenda property.
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
     * Sets the value of the pontoVenda property.
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
     * Gets the value of the observacao property.
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
     * Sets the value of the observacao property.
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
     * Gets the value of the justificativaPrazoMinimo property.
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
     * Sets the value of the justificativaPrazoMinimo property.
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
     * Gets the value of the complementoJustificativaPrazoMinimo property.
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
     * Sets the value of the complementoJustificativaPrazoMinimo property.
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
     * Gets the value of the traslados property.
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
     * Sets the value of the traslados property.
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
     * Gets the value of the tipoSolicitacao property.
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
     * Sets the value of the tipoSolicitacao property.
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
     * Gets the value of the idSolicitacaoPrincipal property.
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
     * Sets the value of the idSolicitacaoPrincipal property.
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
     * Gets the value of the projeto property.
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
     * Sets the value of the projeto property.
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
     * Gets the value of the contaContabilAereo property.
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
     * Sets the value of the contaContabilAereo property.
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
     * Gets the value of the contaContabilHotel property.
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
     * Sets the value of the contaContabilHotel property.
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
     * Gets the value of the contaContabilCarro property.
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
     * Sets the value of the contaContabilCarro property.
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
     * Gets the value of the contaContabilSeguro property.
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
     * Sets the value of the contaContabilSeguro property.
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
     * Gets the value of the contaContabilOutro property.
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
     * Sets the value of the contaContabilOutro property.
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
     * Gets the value of the contaContabilTraslado property.
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
     * Sets the value of the contaContabilTraslado property.
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
     * Gets the value of the descricaoProjeto property.
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
     * Sets the value of the descricaoProjeto property.
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
     * Gets the value of the aprovadorResponsavel property.
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
     * Sets the value of the aprovadorResponsavel property.
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
