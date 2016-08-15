
package br.com.lemontech.selfbooking.wsselfbooking.beans.traslado;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for traslados complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="traslados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="traslados" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/traslado}traslado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "traslados", propOrder = {
    "traslados"
})
public class Traslados {

    protected List<Traslado> traslados;

    /**
     * Gets the value of the traslados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traslados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraslados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traslado }
     * 
     * 
     */
    public List<Traslado> getTraslados() {
        if (traslados == null) {
            traslados = new ArrayList<Traslado>();
        }
        return this.traslados;
    }

}
