
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for parametrizacaoCentroDeCustoAprovacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parametrizacaoCentroDeCustoAprovacao">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoAprovacaoRef">
 *       &lt;sequence>
 *         &lt;element name="vencimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="periodoViagemFinal" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="valorAlcadaInicial" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="valorAlcadaFinal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacaoCentroDeCustoAprovacao", propOrder = {
    "vencimento",
    "periodoViagemFinal",
    "valorAlcadaInicial",
    "valorAlcadaFinal"
})
public class ParametrizacaoCentroDeCustoAprovacao
    extends ParametrizacaoCentroDeCustoAprovacaoRef
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimento;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodoViagemFinal;
    @XmlElement(defaultValue = "0")
    protected Double valorAlcadaInicial;
    @XmlElement(defaultValue = "0")
    protected Double valorAlcadaFinal;

    /**
     * Gets the value of the vencimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimento() {
        return vencimento;
    }

    /**
     * Sets the value of the vencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimento(XMLGregorianCalendar value) {
        this.vencimento = value;
    }

    /**
     * Gets the value of the periodoViagemFinal property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodoViagemFinal() {
        return periodoViagemFinal;
    }

    /**
     * Sets the value of the periodoViagemFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodoViagemFinal(XMLGregorianCalendar value) {
        this.periodoViagemFinal = value;
    }

    /**
     * Gets the value of the valorAlcadaInicial property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorAlcadaInicial() {
        return valorAlcadaInicial;
    }

    /**
     * Sets the value of the valorAlcadaInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorAlcadaInicial(Double value) {
        this.valorAlcadaInicial = value;
    }

    /**
     * Gets the value of the valorAlcadaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorAlcadaFinal() {
        return valorAlcadaFinal;
    }

    /**
     * Sets the value of the valorAlcadaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorAlcadaFinal(Double value) {
        this.valorAlcadaFinal = value;
    }

}
