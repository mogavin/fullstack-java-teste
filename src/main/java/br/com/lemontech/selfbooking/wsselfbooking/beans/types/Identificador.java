
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identificador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identificador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoIntegracao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificador", propOrder = {
    "conector",
    "codigo",
    "tipoIntegracao"
})
public class Identificador {

    protected String conector;
    protected String codigo;
    protected TipoIntegracao tipoIntegracao;

    /**
     * Gets the value of the conector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConector() {
        return conector;
    }

    /**
     * Sets the value of the conector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConector(String value) {
        this.conector = value;
    }

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the tipoIntegracao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIntegracao }
     *     
     */
    public TipoIntegracao getTipoIntegracao() {
        return tipoIntegracao;
    }

    /**
     * Sets the value of the tipoIntegracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIntegracao }
     *     
     */
    public void setTipoIntegracao(TipoIntegracao value) {
        this.tipoIntegracao = value;
    }

}
