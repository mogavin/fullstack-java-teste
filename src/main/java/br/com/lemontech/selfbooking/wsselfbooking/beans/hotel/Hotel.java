
package br.com.lemontech.selfbooking.wsselfbooking.beans.hotel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.CategoriaApartamento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.GarantiaNoShow;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.IdentificadoresIntegracao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.ItensFaturamentoHotel;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PlanoAlimentar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Regime;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remarks;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoTarifa;


/**
 * <p>Classe Java de hotel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="hotel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codigoApartamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoApartamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoApartamento" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoHotelSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkIn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="checkOut" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idRegime" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idCategApto" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diaria" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="titularCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cartaoVirtual" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="formaPagamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}formaPagamento" minOccurs="0"/>
 *         &lt;element name="idPassageiroRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="justificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nacional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorIntegracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorBackOfficeTipoProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}remarks" minOccurs="0"/>
 *         &lt;element name="statusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taxaCancelamento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dataModificacaoStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="categoriaApartamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}categoriaApartamento" minOccurs="0"/>
 *         &lt;element name="nomeEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="garantiaNoShow" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}garantiaNoShow" minOccurs="0"/>
 *         &lt;element name="titularCartaoNoShow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cartaoVirtualNoShow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="formaPagamentoGarantiaNoShow" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}formaPagamento" minOccurs="0"/>
 *         &lt;element name="itensFaturamentoHotel" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}itensFaturamentoHotel" minOccurs="0"/>
 *         &lt;element name="totalHotel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="cancelado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="identificadoresIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}identificadoresIntegracao" minOccurs="0"/>
 *         &lt;element name="taxaFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="selfbook" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tarifaComissionada" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="regime" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}regime" minOccurs="0"/>
 *         &lt;element name="tipoTarifa" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoTarifa" minOccurs="0"/>
 *         &lt;element name="quantidadeTipoTarifa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorCambio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="earlyCheckin" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lateCheckout" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="planoAlimentar" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}planoAlimentar" minOccurs="0"/>
 *         &lt;element name="quantidadePlanoAlimentar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valorPlanoAlimentar" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="prazoCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="consolidadora" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}consolidadora" minOccurs="0"/>
 *         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dataConfirmacaoReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="moedaBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diariaBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="taxaBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="earlyCheckinBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="lateCheckoutBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="agenteOnline" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="importado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hotel", propOrder = {
    "id",
    "codigoApartamento",
    "nome",
    "tipoApartamento",
    "source",
    "codigoHotelSource",
    "checkIn",
    "checkOut",
    "idRegime",
    "idCategApto",
    "localizador",
    "codigoEmissor",
    "codigoReservador",
    "nomeReservador",
    "dataReserva",
    "moeda",
    "diaria",
    "taxa",
    "titularCartao",
    "cartaoVirtual",
    "formaPagamento",
    "idPassageiroRef",
    "justificativaMaiorTarifa",
    "local",
    "cidade",
    "codigoFornecedor",
    "nacional",
    "observacao",
    "voucher",
    "codigoReserva",
    "codigoJustificativaMaiorTarifa",
    "identificadorIntegracao",
    "identificadorBackOfficeTipoProduto",
    "remarks",
    "statusCancelamento",
    "taxaCancelamento",
    "dataModificacaoStatusCancelamento",
    "usuarioModificouStatusCancelamento",
    "categoriaApartamento",
    "nomeEmissor",
    "garantiaNoShow",
    "titularCartaoNoShow",
    "cartaoVirtualNoShow",
    "formaPagamentoGarantiaNoShow",
    "itensFaturamentoHotel",
    "totalHotel",
    "cancelado",
    "identificadoresIntegracao",
    "taxaFee",
    "selfbook",
    "tarifaComissionada",
    "regime",
    "tipoTarifa",
    "quantidadeTipoTarifa",
    "tarifa",
    "valorCambio",
    "earlyCheckin",
    "lateCheckout",
    "planoAlimentar",
    "quantidadePlanoAlimentar",
    "valorPlanoAlimentar",
    "prazoCancelamento",
    "consolidadora",
    "online",
    "dataConfirmacaoReserva",
    "moedaBase",
    "diariaBase",
    "taxaBase",
    "earlyCheckinBase",
    "lateCheckoutBase",
    "agenteOnline",
    "importado",
    "telefone",
    "pais",
    "estado"
})
public class Hotel {

    protected int id;
    protected String codigoApartamento;
    protected String nome;
    @XmlSchemaType(name = "string")
    protected TipoApartamento tipoApartamento;
    protected String source;
    protected String codigoHotelSource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkIn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkOut;
    @XmlElement(nillable = true)
    protected List<Integer> idRegime;
    @XmlElement(nillable = true)
    protected List<Integer> idCategApto;
    protected String localizador;
    protected String codigoEmissor;
    protected String codigoReservador;
    protected String nomeReservador;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReserva;
    protected String moeda;
    protected Double diaria;
    protected Double taxa;
    protected String titularCartao;
    protected Boolean cartaoVirtual;
    protected FormaPagamento formaPagamento;
    @XmlElement(nillable = true)
    protected List<Integer> idPassageiroRef;
    protected String justificativaMaiorTarifa;
    protected String local;
    protected String cidade;
    protected String codigoFornecedor;
    protected Boolean nacional;
    protected String observacao;
    protected String voucher;
    protected String codigoReserva;
    protected String codigoJustificativaMaiorTarifa;
    protected String identificadorIntegracao;
    protected String identificadorBackOfficeTipoProduto;
    protected Remarks remarks;
    protected Integer statusCancelamento;
    protected Double taxaCancelamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataModificacaoStatusCancelamento;
    protected Integer usuarioModificouStatusCancelamento;
    @XmlSchemaType(name = "string")
    protected CategoriaApartamento categoriaApartamento;
    protected String nomeEmissor;
    @XmlSchemaType(name = "string")
    protected GarantiaNoShow garantiaNoShow;
    protected String titularCartaoNoShow;
    protected Boolean cartaoVirtualNoShow;
    protected FormaPagamento formaPagamentoGarantiaNoShow;
    protected ItensFaturamentoHotel itensFaturamentoHotel;
    protected Double totalHotel;
    protected boolean cancelado;
    protected IdentificadoresIntegracao identificadoresIntegracao;
    protected Double taxaFee;
    protected boolean selfbook;
    protected boolean tarifaComissionada;
    @XmlSchemaType(name = "string")
    protected Regime regime;
    @XmlSchemaType(name = "string")
    protected TipoTarifa tipoTarifa;
    protected Integer quantidadeTipoTarifa;
    protected Double tarifa;
    protected Double valorCambio;
    protected Double earlyCheckin;
    protected Double lateCheckout;
    @XmlSchemaType(name = "string")
    protected PlanoAlimentar planoAlimentar;
    protected Integer quantidadePlanoAlimentar;
    protected Double valorPlanoAlimentar;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prazoCancelamento;
    protected Consolidadora consolidadora;
    protected boolean online;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataConfirmacaoReserva;
    protected String moedaBase;
    protected Double diariaBase;
    protected Double taxaBase;
    protected Double earlyCheckinBase;
    protected Double lateCheckoutBase;
    protected boolean agenteOnline;
    protected boolean importado;
    protected String telefone;
    protected String pais;
    protected String estado;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade codigoApartamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoApartamento() {
        return codigoApartamento;
    }

    /**
     * Define o valor da propriedade codigoApartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoApartamento(String value) {
        this.codigoApartamento = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade tipoApartamento.
     * 
     * @return
     *     possible object is
     *     {@link TipoApartamento }
     *     
     */
    public TipoApartamento getTipoApartamento() {
        return tipoApartamento;
    }

    /**
     * Define o valor da propriedade tipoApartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoApartamento }
     *     
     */
    public void setTipoApartamento(TipoApartamento value) {
        this.tipoApartamento = value;
    }

    /**
     * Obtém o valor da propriedade source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Define o valor da propriedade source.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Obtém o valor da propriedade codigoHotelSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoHotelSource() {
        return codigoHotelSource;
    }

    /**
     * Define o valor da propriedade codigoHotelSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoHotelSource(String value) {
        this.codigoHotelSource = value;
    }

    /**
     * Obtém o valor da propriedade checkIn.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckIn() {
        return checkIn;
    }

    /**
     * Define o valor da propriedade checkIn.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckIn(XMLGregorianCalendar value) {
        this.checkIn = value;
    }

    /**
     * Obtém o valor da propriedade checkOut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOut() {
        return checkOut;
    }

    /**
     * Define o valor da propriedade checkOut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOut(XMLGregorianCalendar value) {
        this.checkOut = value;
    }

    /**
     * Gets the value of the idRegime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idRegime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdRegime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdRegime() {
        if (idRegime == null) {
            idRegime = new ArrayList<Integer>();
        }
        return this.idRegime;
    }

    /**
     * Gets the value of the idCategApto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idCategApto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdCategApto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdCategApto() {
        if (idCategApto == null) {
            idCategApto = new ArrayList<Integer>();
        }
        return this.idCategApto;
    }

    /**
     * Obtém o valor da propriedade localizador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizador() {
        return localizador;
    }

    /**
     * Define o valor da propriedade localizador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizador(String value) {
        this.localizador = value;
    }

    /**
     * Obtém o valor da propriedade codigoEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEmissor() {
        return codigoEmissor;
    }

    /**
     * Define o valor da propriedade codigoEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEmissor(String value) {
        this.codigoEmissor = value;
    }

    /**
     * Obtém o valor da propriedade codigoReservador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReservador() {
        return codigoReservador;
    }

    /**
     * Define o valor da propriedade codigoReservador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReservador(String value) {
        this.codigoReservador = value;
    }

    /**
     * Obtém o valor da propriedade nomeReservador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeReservador() {
        return nomeReservador;
    }

    /**
     * Define o valor da propriedade nomeReservador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeReservador(String value) {
        this.nomeReservador = value;
    }

    /**
     * Obtém o valor da propriedade dataReserva.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReserva() {
        return dataReserva;
    }

    /**
     * Define o valor da propriedade dataReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReserva(XMLGregorianCalendar value) {
        this.dataReserva = value;
    }

    /**
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoeda(String value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade diaria.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiaria() {
        return diaria;
    }

    /**
     * Define o valor da propriedade diaria.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiaria(Double value) {
        this.diaria = value;
    }

    /**
     * Obtém o valor da propriedade taxa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxa() {
        return taxa;
    }

    /**
     * Define o valor da propriedade taxa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxa(Double value) {
        this.taxa = value;
    }

    /**
     * Obtém o valor da propriedade titularCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitularCartao() {
        return titularCartao;
    }

    /**
     * Define o valor da propriedade titularCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitularCartao(String value) {
        this.titularCartao = value;
    }

    /**
     * Obtém o valor da propriedade cartaoVirtual.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCartaoVirtual() {
        return cartaoVirtual;
    }

    /**
     * Define o valor da propriedade cartaoVirtual.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCartaoVirtual(Boolean value) {
        this.cartaoVirtual = value;
    }

    /**
     * Obtém o valor da propriedade formaPagamento.
     * 
     * @return
     *     possible object is
     *     {@link FormaPagamento }
     *     
     */
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * Define o valor da propriedade formaPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link FormaPagamento }
     *     
     */
    public void setFormaPagamento(FormaPagamento value) {
        this.formaPagamento = value;
    }

    /**
     * Gets the value of the idPassageiroRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idPassageiroRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdPassageiroRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdPassageiroRef() {
        if (idPassageiroRef == null) {
            idPassageiroRef = new ArrayList<Integer>();
        }
        return this.idPassageiroRef;
    }

    /**
     * Obtém o valor da propriedade justificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaMaiorTarifa() {
        return justificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade justificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaMaiorTarifa(String value) {
        this.justificativaMaiorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocal() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocal(String value) {
        this.local = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade codigoFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    /**
     * Define o valor da propriedade codigoFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFornecedor(String value) {
        this.codigoFornecedor = value;
    }

    /**
     * Obtém o valor da propriedade nacional.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNacional() {
        return nacional;
    }

    /**
     * Define o valor da propriedade nacional.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNacional(Boolean value) {
        this.nacional = value;
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
     * Obtém o valor da propriedade voucher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucher() {
        return voucher;
    }

    /**
     * Define o valor da propriedade voucher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucher(String value) {
        this.voucher = value;
    }

    /**
     * Obtém o valor da propriedade codigoReserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReserva() {
        return codigoReserva;
    }

    /**
     * Define o valor da propriedade codigoReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReserva(String value) {
        this.codigoReserva = value;
    }

    /**
     * Obtém o valor da propriedade codigoJustificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoJustificativaMaiorTarifa() {
        return codigoJustificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade codigoJustificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoJustificativaMaiorTarifa(String value) {
        this.codigoJustificativaMaiorTarifa = value;
    }

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
     * Obtém o valor da propriedade identificadorBackOfficeTipoProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackOfficeTipoProduto() {
        return identificadorBackOfficeTipoProduto;
    }

    /**
     * Define o valor da propriedade identificadorBackOfficeTipoProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackOfficeTipoProduto(String value) {
        this.identificadorBackOfficeTipoProduto = value;
    }

    /**
     * Obtém o valor da propriedade remarks.
     * 
     * @return
     *     possible object is
     *     {@link Remarks }
     *     
     */
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * Define o valor da propriedade remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link Remarks }
     *     
     */
    public void setRemarks(Remarks value) {
        this.remarks = value;
    }

    /**
     * Obtém o valor da propriedade statusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusCancelamento() {
        return statusCancelamento;
    }

    /**
     * Define o valor da propriedade statusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusCancelamento(Integer value) {
        this.statusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade taxaCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaCancelamento() {
        return taxaCancelamento;
    }

    /**
     * Define o valor da propriedade taxaCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaCancelamento(Double value) {
        this.taxaCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade dataModificacaoStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }

    /**
     * Define o valor da propriedade dataModificacaoStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataModificacaoStatusCancelamento(XMLGregorianCalendar value) {
        this.dataModificacaoStatusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade usuarioModificouStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioModificouStatusCancelamento() {
        return usuarioModificouStatusCancelamento;
    }

    /**
     * Define o valor da propriedade usuarioModificouStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioModificouStatusCancelamento(Integer value) {
        this.usuarioModificouStatusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade categoriaApartamento.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaApartamento }
     *     
     */
    public CategoriaApartamento getCategoriaApartamento() {
        return categoriaApartamento;
    }

    /**
     * Define o valor da propriedade categoriaApartamento.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaApartamento }
     *     
     */
    public void setCategoriaApartamento(CategoriaApartamento value) {
        this.categoriaApartamento = value;
    }

    /**
     * Obtém o valor da propriedade nomeEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEmissor() {
        return nomeEmissor;
    }

    /**
     * Define o valor da propriedade nomeEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEmissor(String value) {
        this.nomeEmissor = value;
    }

    /**
     * Obtém o valor da propriedade garantiaNoShow.
     * 
     * @return
     *     possible object is
     *     {@link GarantiaNoShow }
     *     
     */
    public GarantiaNoShow getGarantiaNoShow() {
        return garantiaNoShow;
    }

    /**
     * Define o valor da propriedade garantiaNoShow.
     * 
     * @param value
     *     allowed object is
     *     {@link GarantiaNoShow }
     *     
     */
    public void setGarantiaNoShow(GarantiaNoShow value) {
        this.garantiaNoShow = value;
    }

    /**
     * Obtém o valor da propriedade titularCartaoNoShow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitularCartaoNoShow() {
        return titularCartaoNoShow;
    }

    /**
     * Define o valor da propriedade titularCartaoNoShow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitularCartaoNoShow(String value) {
        this.titularCartaoNoShow = value;
    }

    /**
     * Obtém o valor da propriedade cartaoVirtualNoShow.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCartaoVirtualNoShow() {
        return cartaoVirtualNoShow;
    }

    /**
     * Define o valor da propriedade cartaoVirtualNoShow.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCartaoVirtualNoShow(Boolean value) {
        this.cartaoVirtualNoShow = value;
    }

    /**
     * Obtém o valor da propriedade formaPagamentoGarantiaNoShow.
     * 
     * @return
     *     possible object is
     *     {@link FormaPagamento }
     *     
     */
    public FormaPagamento getFormaPagamentoGarantiaNoShow() {
        return formaPagamentoGarantiaNoShow;
    }

    /**
     * Define o valor da propriedade formaPagamentoGarantiaNoShow.
     * 
     * @param value
     *     allowed object is
     *     {@link FormaPagamento }
     *     
     */
    public void setFormaPagamentoGarantiaNoShow(FormaPagamento value) {
        this.formaPagamentoGarantiaNoShow = value;
    }

    /**
     * Obtém o valor da propriedade itensFaturamentoHotel.
     * 
     * @return
     *     possible object is
     *     {@link ItensFaturamentoHotel }
     *     
     */
    public ItensFaturamentoHotel getItensFaturamentoHotel() {
        return itensFaturamentoHotel;
    }

    /**
     * Define o valor da propriedade itensFaturamentoHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link ItensFaturamentoHotel }
     *     
     */
    public void setItensFaturamentoHotel(ItensFaturamentoHotel value) {
        this.itensFaturamentoHotel = value;
    }

    /**
     * Obtém o valor da propriedade totalHotel.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalHotel() {
        return totalHotel;
    }

    /**
     * Define o valor da propriedade totalHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalHotel(Double value) {
        this.totalHotel = value;
    }

    /**
     * Obtém o valor da propriedade cancelado.
     * 
     */
    public boolean isCancelado() {
        return cancelado;
    }

    /**
     * Define o valor da propriedade cancelado.
     * 
     */
    public void setCancelado(boolean value) {
        this.cancelado = value;
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
     * Obtém o valor da propriedade taxaFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaFee() {
        return taxaFee;
    }

    /**
     * Define o valor da propriedade taxaFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaFee(Double value) {
        this.taxaFee = value;
    }

    /**
     * Obtém o valor da propriedade selfbook.
     * 
     */
    public boolean isSelfbook() {
        return selfbook;
    }

    /**
     * Define o valor da propriedade selfbook.
     * 
     */
    public void setSelfbook(boolean value) {
        this.selfbook = value;
    }

    /**
     * Obtém o valor da propriedade tarifaComissionada.
     * 
     */
    public boolean isTarifaComissionada() {
        return tarifaComissionada;
    }

    /**
     * Define o valor da propriedade tarifaComissionada.
     * 
     */
    public void setTarifaComissionada(boolean value) {
        this.tarifaComissionada = value;
    }

    /**
     * Obtém o valor da propriedade regime.
     * 
     * @return
     *     possible object is
     *     {@link Regime }
     *     
     */
    public Regime getRegime() {
        return regime;
    }

    /**
     * Define o valor da propriedade regime.
     * 
     * @param value
     *     allowed object is
     *     {@link Regime }
     *     
     */
    public void setRegime(Regime value) {
        this.regime = value;
    }

    /**
     * Obtém o valor da propriedade tipoTarifa.
     * 
     * @return
     *     possible object is
     *     {@link TipoTarifa }
     *     
     */
    public TipoTarifa getTipoTarifa() {
        return tipoTarifa;
    }

    /**
     * Define o valor da propriedade tipoTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTarifa }
     *     
     */
    public void setTipoTarifa(TipoTarifa value) {
        this.tipoTarifa = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeTipoTarifa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeTipoTarifa() {
        return quantidadeTipoTarifa;
    }

    /**
     * Define o valor da propriedade quantidadeTipoTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeTipoTarifa(Integer value) {
        this.quantidadeTipoTarifa = value;
    }

    /**
     * Obtém o valor da propriedade tarifa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarifa() {
        return tarifa;
    }

    /**
     * Define o valor da propriedade tarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarifa(Double value) {
        this.tarifa = value;
    }

    /**
     * Obtém o valor da propriedade valorCambio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorCambio() {
        return valorCambio;
    }

    /**
     * Define o valor da propriedade valorCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorCambio(Double value) {
        this.valorCambio = value;
    }

    /**
     * Obtém o valor da propriedade earlyCheckin.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEarlyCheckin() {
        return earlyCheckin;
    }

    /**
     * Define o valor da propriedade earlyCheckin.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEarlyCheckin(Double value) {
        this.earlyCheckin = value;
    }

    /**
     * Obtém o valor da propriedade lateCheckout.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLateCheckout() {
        return lateCheckout;
    }

    /**
     * Define o valor da propriedade lateCheckout.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLateCheckout(Double value) {
        this.lateCheckout = value;
    }

    /**
     * Obtém o valor da propriedade planoAlimentar.
     * 
     * @return
     *     possible object is
     *     {@link PlanoAlimentar }
     *     
     */
    public PlanoAlimentar getPlanoAlimentar() {
        return planoAlimentar;
    }

    /**
     * Define o valor da propriedade planoAlimentar.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanoAlimentar }
     *     
     */
    public void setPlanoAlimentar(PlanoAlimentar value) {
        this.planoAlimentar = value;
    }

    /**
     * Obtém o valor da propriedade quantidadePlanoAlimentar.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadePlanoAlimentar() {
        return quantidadePlanoAlimentar;
    }

    /**
     * Define o valor da propriedade quantidadePlanoAlimentar.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadePlanoAlimentar(Integer value) {
        this.quantidadePlanoAlimentar = value;
    }

    /**
     * Obtém o valor da propriedade valorPlanoAlimentar.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorPlanoAlimentar() {
        return valorPlanoAlimentar;
    }

    /**
     * Define o valor da propriedade valorPlanoAlimentar.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorPlanoAlimentar(Double value) {
        this.valorPlanoAlimentar = value;
    }

    /**
     * Obtém o valor da propriedade prazoCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrazoCancelamento() {
        return prazoCancelamento;
    }

    /**
     * Define o valor da propriedade prazoCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrazoCancelamento(XMLGregorianCalendar value) {
        this.prazoCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade consolidadora.
     * 
     * @return
     *     possible object is
     *     {@link Consolidadora }
     *     
     */
    public Consolidadora getConsolidadora() {
        return consolidadora;
    }

    /**
     * Define o valor da propriedade consolidadora.
     * 
     * @param value
     *     allowed object is
     *     {@link Consolidadora }
     *     
     */
    public void setConsolidadora(Consolidadora value) {
        this.consolidadora = value;
    }

    /**
     * Obtém o valor da propriedade online.
     * 
     */
    public boolean isOnline() {
        return online;
    }

    /**
     * Define o valor da propriedade online.
     * 
     */
    public void setOnline(boolean value) {
        this.online = value;
    }

    /**
     * Obtém o valor da propriedade dataConfirmacaoReserva.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataConfirmacaoReserva() {
        return dataConfirmacaoReserva;
    }

    /**
     * Define o valor da propriedade dataConfirmacaoReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataConfirmacaoReserva(XMLGregorianCalendar value) {
        this.dataConfirmacaoReserva = value;
    }

    /**
     * Obtém o valor da propriedade moedaBase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoedaBase() {
        return moedaBase;
    }

    /**
     * Define o valor da propriedade moedaBase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoedaBase(String value) {
        this.moedaBase = value;
    }

    /**
     * Obtém o valor da propriedade diariaBase.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiariaBase() {
        return diariaBase;
    }

    /**
     * Define o valor da propriedade diariaBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiariaBase(Double value) {
        this.diariaBase = value;
    }

    /**
     * Obtém o valor da propriedade taxaBase.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaBase() {
        return taxaBase;
    }

    /**
     * Define o valor da propriedade taxaBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaBase(Double value) {
        this.taxaBase = value;
    }

    /**
     * Obtém o valor da propriedade earlyCheckinBase.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getEarlyCheckinBase() {
        return earlyCheckinBase;
    }

    /**
     * Define o valor da propriedade earlyCheckinBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setEarlyCheckinBase(Double value) {
        this.earlyCheckinBase = value;
    }

    /**
     * Obtém o valor da propriedade lateCheckoutBase.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLateCheckoutBase() {
        return lateCheckoutBase;
    }

    /**
     * Define o valor da propriedade lateCheckoutBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLateCheckoutBase(Double value) {
        this.lateCheckoutBase = value;
    }

    /**
     * Obtém o valor da propriedade agenteOnline.
     * 
     */
    public boolean isAgenteOnline() {
        return agenteOnline;
    }

    /**
     * Define o valor da propriedade agenteOnline.
     * 
     */
    public void setAgenteOnline(boolean value) {
        this.agenteOnline = value;
    }

    /**
     * Obtém o valor da propriedade importado.
     * 
     */
    public boolean isImportado() {
        return importado;
    }

    /**
     * Define o valor da propriedade importado.
     * 
     */
    public void setImportado(boolean value) {
        this.importado = value;
    }

    /**
     * Obtém o valor da propriedade telefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o valor da propriedade telefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone(String value) {
        this.telefone = value;
    }

    /**
     * Obtém o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtém o valor da propriedade estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define o valor da propriedade estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

}
