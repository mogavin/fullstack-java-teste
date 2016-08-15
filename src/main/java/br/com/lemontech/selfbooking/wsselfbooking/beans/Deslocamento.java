
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deslocamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deslocamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latitudeOrigem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longitudeOrigem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="latitudeDestino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longitudeDestino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="distanciaPercorrida" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deslocamento", propOrder = {
    "latitudeOrigem",
    "longitudeOrigem",
    "latitudeDestino",
    "longitudeDestino",
    "distanciaPercorrida"
})
public class Deslocamento {

    @XmlElement(required = true)
    protected String latitudeOrigem;
    @XmlElement(required = true)
    protected String longitudeOrigem;
    @XmlElement(required = true)
    protected String latitudeDestino;
    @XmlElement(required = true)
    protected String longitudeDestino;
    protected double distanciaPercorrida;

    /**
     * Gets the value of the latitudeOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeOrigem() {
        return latitudeOrigem;
    }

    /**
     * Sets the value of the latitudeOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeOrigem(String value) {
        this.latitudeOrigem = value;
    }

    /**
     * Gets the value of the longitudeOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudeOrigem() {
        return longitudeOrigem;
    }

    /**
     * Sets the value of the longitudeOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeOrigem(String value) {
        this.longitudeOrigem = value;
    }

    /**
     * Gets the value of the latitudeDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeDestino() {
        return latitudeDestino;
    }

    /**
     * Sets the value of the latitudeDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeDestino(String value) {
        this.latitudeDestino = value;
    }

    /**
     * Gets the value of the longitudeDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudeDestino() {
        return longitudeDestino;
    }

    /**
     * Sets the value of the longitudeDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeDestino(String value) {
        this.longitudeDestino = value;
    }

    /**
     * Gets the value of the distanciaPercorrida property.
     * 
     */
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    /**
     * Sets the value of the distanciaPercorrida property.
     * 
     */
    public void setDistanciaPercorrida(double value) {
        this.distanciaPercorrida = value;
    }

}
