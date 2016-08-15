
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aereoDetalheBaseTarifa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aereoDetalheBaseTarifa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baseTarifaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classeTarifaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereoDetalheBaseTarifa", propOrder = {
    "baseTarifaria",
    "classeTarifaria"
})
public class AereoDetalheBaseTarifa {

    protected String baseTarifaria;
    protected String classeTarifaria;

    /**
     * Gets the value of the baseTarifaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTarifaria() {
        return baseTarifaria;
    }

    /**
     * Sets the value of the baseTarifaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTarifaria(String value) {
        this.baseTarifaria = value;
    }

    /**
     * Gets the value of the classeTarifaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasseTarifaria() {
        return classeTarifaria;
    }

    /**
     * Sets the value of the classeTarifaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasseTarifaria(String value) {
        this.classeTarifaria = value;
    }

}
