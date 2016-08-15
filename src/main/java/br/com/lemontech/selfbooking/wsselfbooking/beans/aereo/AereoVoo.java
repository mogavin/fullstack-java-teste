
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
 * <p>Java class for aereoVoo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the idAereoVoo property.
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
     * Sets the value of the idAereoVoo property.
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
     * Gets the value of the origem property.
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
     * Sets the value of the origem property.
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
     * Gets the value of the dataSaida property.
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
     * Sets the value of the dataSaida property.
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
     * Gets the value of the destino property.
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
     * Sets the value of the destino property.
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
     * Gets the value of the dataChegada property.
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
     * Sets the value of the dataChegada property.
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
     * Gets the value of the cia property.
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
     * Sets the value of the cia property.
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
     * Gets the value of the ciaOperacao property.
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
     * Sets the value of the ciaOperacao property.
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
     * Gets the value of the aeronave property.
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
     * Sets the value of the aeronave property.
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
     * Gets the value of the numeroVoo property.
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
     * Sets the value of the numeroVoo property.
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
     * Gets the value of the milhas property.
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
     * Sets the value of the milhas property.
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
     * Gets the value of the aereoDetalheBaseTarifa property.
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
     * Sets the value of the aereoDetalheBaseTarifa property.
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
     * Gets the value of the idClasse property.
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
     * Sets the value of the idClasse property.
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
     * Gets the value of the localizadorCia property.
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
     * Sets the value of the localizadorCia property.
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
     * Gets the value of the tipoVoo property.
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
     * Sets the value of the tipoVoo property.
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
