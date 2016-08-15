
package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fornecedor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fornecedor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}fornecedorRef">
 *       &lt;sequence>
 *         &lt;element name="nomeFornecedor" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100"/>
 *         &lt;element name="razaoSocial" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100"/>
 *         &lt;element name="cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento50" minOccurs="0"/>
 *         &lt;element name="uf" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cidade" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/>
 *         &lt;element name="bairro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100"/>
 *         &lt;element name="endereco" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento255"/>
 *         &lt;element name="complementoEndereco" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento255" minOccurs="0"/>
 *         &lt;element name="ddiTelefone" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddi"/>
 *         &lt;element name="dddTelefone" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddd"/>
 *         &lt;element name="telefone" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}telefone"/>
 *         &lt;element name="ddiFax" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddi" minOccurs="0"/>
 *         &lt;element name="dddFax" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddd" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}telefone" minOccurs="0"/>
 *         &lt;element name="email" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}email"/>
 *         &lt;element name="site" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="hotel" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="carro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="outro" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="iata" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fornecedor", propOrder = {
    "nomeFornecedor",
    "razaoSocial",
    "cnpj",
    "pais",
    "uf",
    "cidade",
    "bairro",
    "endereco",
    "complementoEndereco",
    "ddiTelefone",
    "dddTelefone",
    "telefone",
    "ddiFax",
    "dddFax",
    "fax",
    "email",
    "site",
    "longitude",
    "latitude",
    "hotel",
    "carro",
    "outro",
    "ativo",
    "iata"
})
public class Fornecedor
    extends FornecedorRef
{

    @XmlElement(required = true)
    protected String nomeFornecedor;
    @XmlElement(required = true)
    protected String razaoSocial;
    protected String cnpj;
    protected String pais;
    protected String uf;
    protected String cidade;
    @XmlElement(required = true)
    protected String bairro;
    @XmlElement(required = true)
    protected String endereco;
    protected String complementoEndereco;
    @XmlElement(required = true)
    protected String ddiTelefone;
    @XmlElement(required = true)
    protected String dddTelefone;
    @XmlElement(required = true)
    protected String telefone;
    protected String ddiFax;
    protected String dddFax;
    protected String fax;
    @XmlElement(required = true)
    protected String email;
    @XmlSchemaType(name = "anyURI")
    protected String site;
    protected BigDecimal longitude;
    protected BigDecimal latitude;
    protected boolean hotel;
    protected boolean carro;
    protected boolean outro;
    protected boolean ativo;
    protected String iata;

    /**
     * Gets the value of the nomeFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    /**
     * Sets the value of the nomeFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFornecedor(String value) {
        this.nomeFornecedor = value;
    }

    /**
     * Gets the value of the razaoSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Sets the value of the razaoSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    /**
     * Gets the value of the cnpj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Sets the value of the cnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Gets the value of the cidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Gets the value of the bairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Sets the value of the bairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Gets the value of the endereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Sets the value of the endereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Gets the value of the complementoEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    /**
     * Sets the value of the complementoEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoEndereco(String value) {
        this.complementoEndereco = value;
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
     * Gets the value of the ddiFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdiFax() {
        return ddiFax;
    }

    /**
     * Sets the value of the ddiFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdiFax(String value) {
        this.ddiFax = value;
    }

    /**
     * Gets the value of the dddFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddFax() {
        return dddFax;
    }

    /**
     * Sets the value of the dddFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddFax(String value) {
        this.dddFax = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

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
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSite(String value) {
        this.site = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     */
    public boolean isHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     */
    public void setHotel(boolean value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the carro property.
     * 
     */
    public boolean isCarro() {
        return carro;
    }

    /**
     * Sets the value of the carro property.
     * 
     */
    public void setCarro(boolean value) {
        this.carro = value;
    }

    /**
     * Gets the value of the outro property.
     * 
     */
    public boolean isOutro() {
        return outro;
    }

    /**
     * Sets the value of the outro property.
     * 
     */
    public void setOutro(boolean value) {
        this.outro = value;
    }

    /**
     * Gets the value of the ativo property.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Sets the value of the ativo property.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Gets the value of the iata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIata() {
        return iata;
    }

    /**
     * Sets the value of the iata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIata(String value) {
        this.iata = value;
    }

}
