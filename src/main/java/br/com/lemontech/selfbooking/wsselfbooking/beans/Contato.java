
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contato complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="email" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}email"/>
 *         &lt;element name="ddiTelefone" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddi" minOccurs="0"/>
 *         &lt;element name="dddTelefone" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddd"/>
 *         &lt;element name="telefone" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}telefone"/>
 *         &lt;element name="ddiCelular" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddi" minOccurs="0"/>
 *         &lt;element name="dddCelular" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddd" minOccurs="0"/>
 *         &lt;element name="celular" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}telefone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contato", propOrder = {
    "email",
    "ddiTelefone",
    "dddTelefone",
    "telefone",
    "ddiCelular",
    "dddCelular",
    "celular"
})
public class Contato {

    @XmlElement(required = true)
    protected String email;
    protected String ddiTelefone;
    @XmlElement(required = true)
    protected String dddTelefone;
    @XmlElement(required = true)
    protected String telefone;
    protected String ddiCelular;
    protected String dddCelular;
    protected String celular;

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the ddiTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdiTelefone() {
        return ddiTelefone;
    }

    /**
     * Sets the value of the ddiTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdiTelefone(String value) {
        this.ddiTelefone = value;
    }

    /**
     * Gets the value of the dddTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddTelefone() {
        return dddTelefone;
    }

    /**
     * Sets the value of the dddTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddTelefone(String value) {
        this.dddTelefone = value;
    }

    /**
     * Gets the value of the telefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Sets the value of the telefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone(String value) {
        this.telefone = value;
    }

    /**
     * Gets the value of the ddiCelular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdiCelular() {
        return ddiCelular;
    }

    /**
     * Sets the value of the ddiCelular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdiCelular(String value) {
        this.ddiCelular = value;
    }

    /**
     * Gets the value of the dddCelular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddCelular() {
        return dddCelular;
    }

    /**
     * Sets the value of the dddCelular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddCelular(String value) {
        this.dddCelular = value;
    }

    /**
     * Gets the value of the celular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Sets the value of the celular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

}
