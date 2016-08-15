
package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tarifarioFornecedorOutroRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tarifarioFornecedorOutroRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorBackofficeFornecedor" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice"/>
 *         &lt;element name="identificadorBackofficeCliente" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/>
 *         &lt;element name="identificadorBackOffice" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarifarioFornecedorOutroRef", propOrder = {
    "identificadorBackofficeFornecedor",
    "identificadorBackofficeCliente",
    "identificadorBackOffice"
})
@XmlSeeAlso({
    TarifarioFornecedorOutro.class
})
public class TarifarioFornecedorOutroRef {

    @XmlElement(required = true)
    protected String identificadorBackofficeFornecedor;
    protected String identificadorBackofficeCliente;
    @XmlElement(required = true)
    protected String identificadorBackOffice;

    /**
     * Gets the value of the identificadorBackofficeFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeFornecedor() {
        return identificadorBackofficeFornecedor;
    }

    /**
     * Sets the value of the identificadorBackofficeFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeFornecedor(String value) {
        this.identificadorBackofficeFornecedor = value;
    }

    /**
     * Gets the value of the identificadorBackofficeCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }

    /**
     * Sets the value of the identificadorBackofficeCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeCliente(String value) {
        this.identificadorBackofficeCliente = value;
    }

    /**
     * Gets the value of the identificadorBackOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackOffice() {
        return identificadorBackOffice;
    }

    /**
     * Sets the value of the identificadorBackOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackOffice(String value) {
        this.identificadorBackOffice = value;
    }

}
