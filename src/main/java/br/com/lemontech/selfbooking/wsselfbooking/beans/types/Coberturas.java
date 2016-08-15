
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coberturas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coberturas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cobertura" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}cobertura" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coberturas", propOrder = {
    "cobertura"
})
public class Coberturas {

    protected List<Cobertura> cobertura;

    /**
     * Gets the value of the cobertura property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobertura property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCobertura().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cobertura }
     * 
     * 
     */
    public List<Cobertura> getCobertura() {
        if (cobertura == null) {
            cobertura = new ArrayList<Cobertura>();
        }
        return this.cobertura;
    }

}
