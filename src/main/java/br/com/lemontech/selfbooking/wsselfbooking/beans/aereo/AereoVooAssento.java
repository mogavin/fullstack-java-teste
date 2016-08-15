
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aereoVooAssento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aereoVooAssento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passageiroRef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="assento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereoVooAssento", propOrder = {
    "passageiroRef",
    "assento"
})
public class AereoVooAssento {

    protected Integer passageiroRef;
    protected String assento;

    /**
     * Gets the value of the passageiroRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassageiroRef() {
        return passageiroRef;
    }

    /**
     * Sets the value of the passageiroRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassageiroRef(Integer value) {
        this.passageiroRef = value;
    }

    /**
     * Gets the value of the assento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssento() {
        return assento;
    }

    /**
     * Sets the value of the assento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssento(String value) {
        this.assento = value;
    }

}
