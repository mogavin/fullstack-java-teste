
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pontoVenda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pontoVenda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomePontoVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codBackOffice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pccLocalVenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pontoVenda", propOrder = {
    "nomePontoVenda",
    "codBackOffice",
    "pccLocalVenda"
})
public class PontoVenda {

    protected String nomePontoVenda;
    protected int codBackOffice;
    protected String pccLocalVenda;

    /**
     * Gets the value of the nomePontoVenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePontoVenda() {
        return nomePontoVenda;
    }

    /**
     * Sets the value of the nomePontoVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePontoVenda(String value) {
        this.nomePontoVenda = value;
    }

    /**
     * Gets the value of the codBackOffice property.
     * 
     */
    public int getCodBackOffice() {
        return codBackOffice;
    }

    /**
     * Sets the value of the codBackOffice property.
     * 
     */
    public void setCodBackOffice(int value) {
        this.codBackOffice = value;
    }

    /**
     * Gets the value of the pccLocalVenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPccLocalVenda() {
        return pccLocalVenda;
    }

    /**
     * Sets the value of the pccLocalVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPccLocalVenda(String value) {
        this.pccLocalVenda = value;
    }

}
