
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacaoRef;


/**
 * <p>Java class for deletarParametrizacaoViajanteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletarParametrizacaoViajanteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametrizacaoViajanteAprovacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoViajanteAprovacaoRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletarParametrizacaoViajanteRequest", propOrder = {
    "parametrizacaoViajanteAprovacaoRef"
})
public class DeletarParametrizacaoViajanteRequest {

    @XmlElement(required = true)
    protected ParametrizacaoViajanteAprovacaoRef parametrizacaoViajanteAprovacaoRef;

    /**
     * Gets the value of the parametrizacaoViajanteAprovacaoRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoViajanteAprovacaoRef }
     *     
     */
    public ParametrizacaoViajanteAprovacaoRef getParametrizacaoViajanteAprovacaoRef() {
        return parametrizacaoViajanteAprovacaoRef;
    }

    /**
     * Sets the value of the parametrizacaoViajanteAprovacaoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoViajanteAprovacaoRef }
     *     
     */
    public void setParametrizacaoViajanteAprovacaoRef(ParametrizacaoViajanteAprovacaoRef value) {
        this.parametrizacaoViajanteAprovacaoRef = value;
    }

}
