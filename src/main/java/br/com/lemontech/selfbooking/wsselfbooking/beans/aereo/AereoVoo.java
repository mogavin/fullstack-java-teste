
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de aereoVoo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aereoVoo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAereoVoo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataSaida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataChegada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cia" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}cia" minOccurs="0"/>
 *         &lt;element name="ciaOperacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}cia" minOccurs="0"/>
 *         &lt;element name="aeronave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroVoo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="milhas" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="aereoDetalheParada" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoDetalheParada" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="assento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoVooAssento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="aereoDetalheBaseTarifa" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}aereoDetalheBaseTarifa" minOccurs="0"/>
 *         &lt;element name="idClasse" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="localizadorCia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoVoo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereoVoo", propOrder = {
    "idAereoVoo",
    "origem",
    "dataSaida",
    "destino",
    "dataChegada",
    "cia",
    "ciaOperacao",
    "aeronave",
    "numeroVoo",
    "milhas",
    "aereoDetalheParada",
    "assento",
    "aereoDetalheBaseTarifa",
    "idClasse",
    "localizadorCia",
    "tipoVoo"
})
public class AereoVoo {

    protected Integer idAereoVoo;
    protected String origem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSaida;
    protected String destino;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataChegada;
    protected Cia cia;
    protected Cia ciaOperacao;
    protected String aeronave;
    protected String numeroVoo;
    protected Double milhas;
    @XmlElement(nillable = true)
    protected List<AereoDetalheParada> aereoDetalheParada;
    @XmlElement(nillable = true)
    protected List<AereoVooAssento> assento;
    protected AereoDetalheBaseTarifa aereoDetalheBaseTarifa;
    protected Integer idClasse;
    protected String localizadorCia;
    protected String tipoVoo;

    /**
     * Obtém o valor da propriedade idAereoVoo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAereoVoo() {
        return idAereoVoo;
    }

    /**
     * Define o valor da propriedade idAereoVoo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAereoVoo(Integer value) {
        this.idAereoVoo = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigem(String value) {
        this.origem = value;
    }

    /**
     * Obtém o valor da propriedade dataSaida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSaida() {
        return dataSaida;
    }

    /**
     * Define o valor da propriedade dataSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSaida(XMLGregorianCalendar value) {
        this.dataSaida = value;
    }

    /**
     * Obtém o valor da propriedade destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define o valor da propriedade destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtém o valor da propriedade dataChegada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataChegada() {
        return dataChegada;
    }

    /**
     * Define o valor da propriedade dataChegada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataChegada(XMLGregorianCalendar value) {
        this.dataChegada = value;
    }

    /**
     * Obtém o valor da propriedade cia.
     * 
     * @return
     *     possible object is
     *     {@link Cia }
     *     
     */
    public Cia getCia() {
        return cia;
    }

    /**
     * Define o valor da propriedade cia.
     * 
     * @param value
     *     allowed object is
     *     {@link Cia }
     *     
     */
    public void setCia(Cia value) {
        this.cia = value;
    }

    /**
     * Obtém o valor da propriedade ciaOperacao.
     * 
     * @return
     *     possible object is
     *     {@link Cia }
     *     
     */
    public Cia getCiaOperacao() {
        return ciaOperacao;
    }

    /**
     * Define o valor da propriedade ciaOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Cia }
     *     
     */
    public void setCiaOperacao(Cia value) {
        this.ciaOperacao = value;
    }

    /**
     * Obtém o valor da propriedade aeronave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeronave() {
        return aeronave;
    }

    /**
     * Define o valor da propriedade aeronave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeronave(String value) {
        this.aeronave = value;
    }

    /**
     * Obtém o valor da propriedade numeroVoo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroVoo() {
        return numeroVoo;
    }

    /**
     * Define o valor da propriedade numeroVoo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroVoo(String value) {
        this.numeroVoo = value;
    }

    /**
     * Obtém o valor da propriedade milhas.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMilhas() {
        return milhas;
    }

    /**
     * Define o valor da propriedade milhas.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMilhas(Double value) {
        this.milhas = value;
    }

    /**
     * Gets the value of the aereoDetalheParada property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aereoDetalheParada property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAereoDetalheParada().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AereoDetalheParada }
     * 
     * 
     */
    public List<AereoDetalheParada> getAereoDetalheParada() {
        if (aereoDetalheParada == null) {
            aereoDetalheParada = new ArrayList<AereoDetalheParada>();
        }
        return this.aereoDetalheParada;
    }

    /**
     * Gets the value of the assento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AereoVooAssento }
     * 
     * 
     */
    public List<AereoVooAssento> getAssento() {
        if (assento == null) {
            assento = new ArrayList<AereoVooAssento>();
        }
        return this.assento;
    }

    /**
     * Obtém o valor da propriedade aereoDetalheBaseTarifa.
     * 
     * @return
     *     possible object is
     *     {@link AereoDetalheBaseTarifa }
     *     
     */
    public AereoDetalheBaseTarifa getAereoDetalheBaseTarifa() {
        return aereoDetalheBaseTarifa;
    }

    /**
     * Define o valor da propriedade aereoDetalheBaseTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link AereoDetalheBaseTarifa }
     *     
     */
    public void setAereoDetalheBaseTarifa(AereoDetalheBaseTarifa value) {
        this.aereoDetalheBaseTarifa = value;
    }

    /**
     * Obtém o valor da propriedade idClasse.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClasse() {
        return idClasse;
    }

    /**
     * Define o valor da propriedade idClasse.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClasse(Integer value) {
        this.idClasse = value;
    }

    /**
     * Obtém o valor da propriedade localizadorCia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizadorCia() {
        return localizadorCia;
    }

    /**
     * Define o valor da propriedade localizadorCia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizadorCia(String value) {
        this.localizadorCia = value;
    }

    /**
     * Obtém o valor da propriedade tipoVoo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVoo() {
        return tipoVoo;
    }

    /**
     * Define o valor da propriedade tipoVoo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVoo(String value) {
        this.tipoVoo = value;
    }

}
