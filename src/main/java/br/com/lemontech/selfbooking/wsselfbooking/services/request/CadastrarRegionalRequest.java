
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Regional;


/**
 * <p>Java class for cadastrarRegionalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarRegionalRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regional" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}regional"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarRegionalRequest", propOrder = {
    "regional"
})
public class CadastrarRegionalRequest {

    @XmlElement(required = true)
    protected Regional regional;

    /**
     * Gets the value of the regional property.
     * 
     * @return
     *     possible object is
     *     {@link Regional }
     *     
     */
    public Regional getRegional() {
        return regional;
    }

    /**
     * Sets the value of the regional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Regional }
     *     
     */
    public void setRegional(Regional value) {
        this.regional = value;
    }

}
