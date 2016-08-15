
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
 * <p>Java class for hotel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
    protected CategoriaApartamento categoriaApartamento;
    protected String nomeEmissor;
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
    protected Regime regime;
    protected TipoTarifa tipoTarifa;
    protected Integer quantidadeTipoTarifa;
    protected Double tarifa;
    protected Double valorCambio;
    protected Double earlyCheckin;
    protected Double lateCheckout;
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
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the codigoApartamento property.
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
     * Sets the value of the codigoApartamento property.
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
     * Gets the value of the nome property.
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
     * Sets the value of the nome property.
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
     * Gets the value of the tipoApartamento property.
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
     * Sets the value of the tipoApartamento property.
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
     * Gets the value of the source property.
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
     * Sets the value of the source property.
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
     * Gets the value of the codigoHotelSource property.
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
     * Sets the value of the codigoHotelSource property.
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
     * Gets the value of the checkIn property.
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
     * Sets the value of the checkIn property.
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
     * Gets the value of the checkOut property.
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
     * Sets the value of the checkOut property.
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
     * Gets the value of the localizador property.
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
     * Sets the value of the localizador property.
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
     * Gets the value of the codigoEmissor property.
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
     * Sets the value of the codigoEmissor property.
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
     * Gets the value of the codigoReservador property.
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
     * Sets the value of the codigoReservador property.
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
     * Gets the value of the nomeReservador property.
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
     * Sets the value of the nomeReservador property.
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
     * Gets the value of the dataReserva property.
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
     * Sets the value of the dataReserva property.
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
     * Gets the value of the moeda property.
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
     * Sets the value of the moeda property.
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
     * Gets the value of the diaria property.
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
     * Sets the value of the diaria property.
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
     * Gets the value of the taxa property.
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
     * Sets the value of the taxa property.
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
     * Gets the value of the titularCartao property.
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
     * Sets the value of the titularCartao property.
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
     * Gets the value of the cartaoVirtual property.
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
     * Sets the value of the cartaoVirtual property.
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
     * Gets the value of the formaPagamento property.
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
     * Sets the value of the formaPagamento property.
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
     * Gets the value of the justificativaMaiorTarifa property.
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
     * Sets the value of the justificativaMaiorTarifa property.
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
     * Gets the value of the local property.
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
     * Sets the value of the local property.
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
     * Gets the value of the cidade property.
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
     * Sets the value of the cidade property.
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
     * Gets the value of the codigoFornecedor property.
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
     * Sets the value of the codigoFornecedor property.
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
     * Gets the value of the nacional property.
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
     * Sets the value of the nacional property.
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
     * Gets the value of the voucher property.
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
     * Sets the value of the voucher property.
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
     * Gets the value of the codigoReserva property.
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
     * Sets the value of the codigoReserva property.
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
     * Gets the value of the codigoJustificativaMaiorTarifa property.
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
     * Sets the value of the codigoJustificativaMaiorTarifa property.
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
     * Gets the value of the identificadorBackOfficeTipoProduto property.
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
     * Sets the value of the identificadorBackOfficeTipoProduto property.
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
     * Gets the value of the remarks property.
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
     * Sets the value of the remarks property.
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
     * Gets the value of the statusCancelamento property.
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
     * Sets the value of the statusCancelamento property.
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
     * Gets the value of the taxaCancelamento property.
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
     * Sets the value of the taxaCancelamento property.
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
     * Gets the value of the dataModificacaoStatusCancelamento property.
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
     * Sets the value of the dataModificacaoStatusCancelamento property.
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
     * Gets the value of the usuarioModificouStatusCancelamento property.
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
     * Sets the value of the usuarioModificouStatusCancelamento property.
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
     * Gets the value of the categoriaApartamento property.
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
     * Sets the value of the categoriaApartamento property.
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
     * Gets the value of the nomeEmissor property.
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
     * Sets the value of the nomeEmissor property.
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
     * Gets the value of the garantiaNoShow property.
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
     * Sets the value of the garantiaNoShow property.
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
     * Gets the value of the titularCartaoNoShow property.
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
     * Sets the value of the titularCartaoNoShow property.
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
     * Gets the value of the cartaoVirtualNoShow property.
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
     * Sets the value of the cartaoVirtualNoShow property.
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
     * Gets the value of the formaPagamentoGarantiaNoShow property.
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
     * Sets the value of the formaPagamentoGarantiaNoShow property.
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
     * Gets the value of the itensFaturamentoHotel property.
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
     * Sets the value of the itensFaturamentoHotel property.
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
     * Gets the value of the totalHotel property.
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
     * Sets the value of the totalHotel property.
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
     * Gets the value of the cancelado property.
     * 
     */
    public boolean isCancelado() {
        return cancelado;
    }

    /**
     * Sets the value of the cancelado property.
     * 
     */
    public void setCancelado(boolean value) {
        this.cancelado = value;
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
     * Gets the value of the taxaFee property.
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
     * Sets the value of the taxaFee property.
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
     * Gets the value of the selfbook property.
     * 
     */
    public boolean isSelfbook() {
        return selfbook;
    }

    /**
     * Sets the value of the selfbook property.
     * 
     */
    public void setSelfbook(boolean value) {
        this.selfbook = value;
    }

    /**
     * Gets the value of the tarifaComissionada property.
     * 
     */
    public boolean isTarifaComissionada() {
        return tarifaComissionada;
    }

    /**
     * Sets the value of the tarifaComissionada property.
     * 
     */
    public void setTarifaComissionada(boolean value) {
        this.tarifaComissionada = value;
    }

    /**
     * Gets the value of the regime property.
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
     * Sets the value of the regime property.
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
     * Gets the value of the tipoTarifa property.
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
     * Sets the value of the tipoTarifa property.
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
     * Gets the value of the quantidadeTipoTarifa property.
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
     * Sets the value of the quantidadeTipoTarifa property.
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
     * Gets the value of the tarifa property.
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
     * Sets the value of the tarifa property.
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
     * Gets the value of the valorCambio property.
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
     * Sets the value of the valorCambio property.
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
     * Gets the value of the earlyCheckin property.
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
     * Sets the value of the earlyCheckin property.
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
     * Gets the value of the lateCheckout property.
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
     * Sets the value of the lateCheckout property.
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
     * Gets the value of the planoAlimentar property.
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
     * Sets the value of the planoAlimentar property.
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
     * Gets the value of the quantidadePlanoAlimentar property.
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
     * Sets the value of the quantidadePlanoAlimentar property.
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
     * Gets the value of the valorPlanoAlimentar property.
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
     * Sets the value of the valorPlanoAlimentar property.
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
     * Gets the value of the prazoCancelamento property.
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
     * Sets the value of the prazoCancelamento property.
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
     * Gets the value of the consolidadora property.
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
     * Sets the value of the consolidadora property.
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
     * Gets the value of the online property.
     * 
     */
    public boolean isOnline() {
        return online;
    }

    /**
     * Sets the value of the online property.
     * 
     */
    public void setOnline(boolean value) {
        this.online = value;
    }

    /**
     * Gets the value of the dataConfirmacaoReserva property.
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
     * Sets the value of the dataConfirmacaoReserva property.
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
     * Gets the value of the moedaBase property.
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
     * Sets the value of the moedaBase property.
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
     * Gets the value of the diariaBase property.
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
     * Sets the value of the diariaBase property.
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
     * Gets the value of the taxaBase property.
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
     * Sets the value of the taxaBase property.
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
     * Gets the value of the earlyCheckinBase property.
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
     * Sets the value of the earlyCheckinBase property.
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
     * Gets the value of the lateCheckoutBase property.
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
     * Sets the value of the lateCheckoutBase property.
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
     * Gets the value of the agenteOnline property.
     * 
     */
    public boolean isAgenteOnline() {
        return agenteOnline;
    }

    /**
     * Sets the value of the agenteOnline property.
     * 
     */
    public void setAgenteOnline(boolean value) {
        this.agenteOnline = value;
    }

    /**
     * Gets the value of the importado property.
     * 
     */
    public boolean isImportado() {
        return importado;
    }

    /**
     * Sets the value of the importado property.
     * 
     */
    public void setImportado(boolean value) {
        this.importado = value;
    }

    /**
     * Gets the value of the telefone property.
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
     * Sets the value of the telefone property.
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
     * Gets the value of the pais property.
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
     * Sets the value of the pais property.
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
     * Gets the value of the estado property.
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
     * Sets the value of the estado property.
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
