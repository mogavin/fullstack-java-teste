
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contaContabilRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contaContabilRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="regionalRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}regionalRef"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="aereo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             &lt;element name="hotel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             &lt;element name="carro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             &lt;element name="seguro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             &lt;element name="outro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             &lt;element name="traslado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contaContabilRef", propOrder = {
    "codigo",
    "regionalRef",
    "aereo",
    "hotel",
    "carro",
    "seguro",
    "outro",
    "traslado"
})
@XmlSeeAlso({
    ContaContabil.class
})
public class ContaContabilRef {

    @XmlElement(required = true)
    protected String codigo;
    protected RegionalRef regionalRef;
    protected Boolean aereo;
    protected Boolean hotel;
    protected Boolean carro;
    protected Boolean seguro;
    protected Boolean outro;
    protected Boolean traslado;

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
     * Gets the value of the regionalRef property.
     * 
     * @return
     *     possible object is
     *     {@link RegionalRef }
     *     
     */
    public RegionalRef getRegionalRef() {
        return regionalRef;
    }

    /**
     * Sets the value of the regionalRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalRef }
     *     
     */
    public void setRegionalRef(RegionalRef value) {
        this.regionalRef = value;
    }

    /**
     * Gets the value of the aereo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAereo() {
        return aereo;
    }

    /**
     * Sets the value of the aereo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAereo(Boolean value) {
        this.aereo = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHotel(Boolean value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the carro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCarro() {
        return carro;
    }

    /**
     * Sets the value of the carro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCarro(Boolean value) {
        this.carro = value;
    }

    /**
     * Gets the value of the seguro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeguro() {
        return seguro;
    }

    /**
     * Sets the value of the seguro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeguro(Boolean value) {
        this.seguro = value;
    }

    /**
     * Gets the value of the outro property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutro() {
        return outro;
    }

    /**
     * Sets the value of the outro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutro(Boolean value) {
        this.outro = value;
    }

    /**
     * Gets the value of the traslado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTraslado() {
        return traslado;
    }

    /**
     * Sets the value of the traslado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTraslado(Boolean value) {
        this.traslado = value;
    }

}
