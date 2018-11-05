//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.02 at 03:43:56 PM ICT 
//


package org.opencps.thirdparty.system.nsw.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KetQuaXuLy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KetQuaXuLy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="so_gp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="so_tn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="noi_dung" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ngay_xu_ly">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{4}-[01][0-9]-[0-3][0-9] [0-2][0-9]:[0-5][0-9]:[0-6][0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="don_vi_xu_ly">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="250"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="link_congvan">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KetQuaXuLy", propOrder = {
    "soGp",
    "soTn",
    "noiDung",
    "ngayXuLy",
    "donViXuLy",
    "linkCongvan"
})
public class KetQuaXuLy {

    @XmlElement(name = "so_gp")
    protected String soGp;
    @XmlElement(name = "so_tn")
    protected String soTn;
    @XmlElement(name = "noi_dung")
    protected String noiDung;
    @XmlElement(name = "ngay_xu_ly", required = true)
    protected String ngayXuLy;
    @XmlElement(name = "don_vi_xu_ly", required = true)
    protected String donViXuLy;
    @XmlElement(name = "link_congvan", required = true)
    protected String linkCongvan;

    /**
     * Gets the value of the soGp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoGp() {
        return soGp;
    }

    /**
     * Sets the value of the soGp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoGp(String value) {
        this.soGp = value;
    }

    /**
     * Gets the value of the soTn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoTn() {
        return soTn;
    }

    /**
     * Sets the value of the soTn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoTn(String value) {
        this.soTn = value;
    }

    /**
     * Gets the value of the noiDung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * Sets the value of the noiDung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoiDung(String value) {
        this.noiDung = value;
    }

    /**
     * Gets the value of the ngayXuLy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNgayXuLy() {
        return ngayXuLy;
    }

    /**
     * Sets the value of the ngayXuLy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNgayXuLy(String value) {
        this.ngayXuLy = value;
    }

    /**
     * Gets the value of the donViXuLy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonViXuLy() {
        return donViXuLy;
    }

    /**
     * Sets the value of the donViXuLy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonViXuLy(String value) {
        this.donViXuLy = value;
    }

    /**
     * Gets the value of the linkCongvan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkCongvan() {
        return linkCongvan;
    }

    /**
     * Sets the value of the linkCongvan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkCongvan(String value) {
        this.linkCongvan = value;
    }

}
