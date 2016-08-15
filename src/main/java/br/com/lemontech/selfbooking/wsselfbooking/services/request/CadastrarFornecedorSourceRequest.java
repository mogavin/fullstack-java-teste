
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorRef;


/**
 * <p>Java class for cadastrarFornecedorSourceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarFornecedorSourceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idFornecedorSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fornecedorRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}fornecedorRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarFornecedorSourceRequest", propOrder = {
    "source",
    "idFornecedorSource",
    "fornecedorRef"
})
public class CadastrarFornecedorSourceRequest {

    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String idFornecedorSource;
    @XmlElement(required = true)
    protected FornecedorRef fornecedorRef;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the idFornecedorSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFornecedorSource() {
        return idFornecedorSource;
    }

    /**
     * Sets the value of the idFornecedorSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFornecedorSource(String value) {
        this.idFornecedorSource = value;
    }

    /**
     * Gets the value of the fornecedorRef property.
     * 
     * @return
     *     possible object is
     *     {@link FornecedorRef }
     *     
     */
    public FornecedorRef getFornecedorRef() {
        return fornecedorRef;
    }

    /**
     * Sets the value of the fornecedorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FornecedorRef }
     *     
     */
    public void setFornecedorRef(FornecedorRef value) {
        this.fornecedorRef = value;
    }

}
