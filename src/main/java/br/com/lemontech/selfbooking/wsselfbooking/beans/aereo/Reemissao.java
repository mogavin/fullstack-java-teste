
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoColetaMulta;


/**
 * <p>Java class for reemissao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reemissao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bilheteOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bilheteReemissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credito" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="multa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="documentoMulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoColetaMulta" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoColetaMulta" minOccurs="0"/>
 *         &lt;element name="taxaColeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reemissao", propOrder = {
    "bilheteOriginal",
    "bilheteReemissao",
    "credito",
    "multa",
    "documentoMulta",
    "documentoCredito",
    "tipoColetaMulta",
    "taxaColeta"
})
public class Reemissao {

    protected String bilheteOriginal;
    protected String bilheteReemissao;
    protected Double credito;
    protected Double multa;
    protected String documentoMulta;
    protected String documentoCredito;
    protected TipoColetaMulta tipoColetaMulta;
    protected String taxaColeta;

    /**
     * Gets the value of the bilheteOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilheteOriginal() {
        return bilheteOriginal;
    }

    /**
     * Sets the value of the bilheteOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilheteOriginal(String value) {
        this.bilheteOriginal = value;
    }

    /**
     * Gets the value of the bilheteReemissao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilheteReemissao() {
        return bilheteReemissao;
    }

    /**
     * Sets the value of the bilheteReemissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilheteReemissao(String value) {
        this.bilheteReemissao = value;
    }

    /**
     * Gets the value of the credito property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCredito() {
        return credito;
    }

    /**
     * Sets the value of the credito property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCredito(Double value) {
        this.credito = value;
    }

    /**
     * Gets the value of the multa property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMulta() {
        return multa;
    }

    /**
     * Sets the value of the multa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMulta(Double value) {
        this.multa = value;
    }

    /**
     * Gets the value of the documentoMulta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoMulta() {
        return documentoMulta;
    }

    /**
     * Sets the value of the documentoMulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoMulta(String value) {
        this.documentoMulta = value;
    }

    /**
     * Gets the value of the documentoCredito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoCredito() {
        return documentoCredito;
    }

    /**
     * Sets the value of the documentoCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoCredito(String value) {
        this.documentoCredito = value;
    }

    /**
     * Gets the value of the tipoColetaMulta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoColetaMulta }
     *     
     */
    public TipoColetaMulta getTipoColetaMulta() {
        return tipoColetaMulta;
    }

    /**
     * Sets the value of the tipoColetaMulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoColetaMulta }
     *     
     */
    public void setTipoColetaMulta(TipoColetaMulta value) {
        this.tipoColetaMulta = value;
    }

    /**
     * Gets the value of the taxaColeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxaColeta() {
        return taxaColeta;
    }

    /**
     * Sets the value of the taxaColeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxaColeta(String value) {
        this.taxaColeta = value;
    }

}
