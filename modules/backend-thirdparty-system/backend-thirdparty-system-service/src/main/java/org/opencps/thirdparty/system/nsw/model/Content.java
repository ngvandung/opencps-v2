//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.02 at 10:59:13 AM ICT 
//


package org.opencps.thirdparty.system.nsw.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}DS_Loi" minOccurs="0"/>
 *         &lt;element ref="{}KetQuaXuLy" minOccurs="0"/>
 *         &lt;element ref="{}Phanhoi_Yeucau_Sua" minOccurs="0"/>
 *         &lt;element ref="{}VLInterRoadTransportLicence" minOccurs="0"/>
 *         &lt;element ref="{}VLCrossBorderTransportPermit" minOccurs="0"/>
 *         &lt;element ref="{}ApprovalOfVLFixRoadTransport" minOccurs="0"/>
 *         &lt;element ref="{}ApprovalOfVLStopTransport" minOccurs="0"/>
 *         &lt;element ref="{}ApprovalOfVLAdjustFrequency" minOccurs="0"/>
 *         &lt;element ref="{}VTOfficialTransportPermit" minOccurs="0"/>
 *         &lt;element ref="{}ApprovalOfVTFixRoadTransport" minOccurs="0"/>
 *         &lt;element ref="{}CLVCommercialCrossBorderTransportPermit" minOccurs="0"/>
 *         &lt;element ref="{}CLVNonCommercialCrossBorderTransportPermit" minOccurs="0"/>
 *         &lt;element ref="{}ApprovalOfCLVFixRoadTransport" minOccurs="0"/>
 *         &lt;element ref="{}GMSInterRoadTransportLicence" minOccurs="0"/>
 *         &lt;element ref="{}GMSCrossBorderTransportPermit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Content", propOrder = {
    "dsLoi",
    "ketQuaXuLy",
    "phanhoiYeucauSua",
    "vlInterRoadTransportLicence",
    "vlCrossBorderTransportPermit",
    "approvalOfVLFixRoadTransport",
    "approvalOfVLStopTransport",
    "approvalOfVLAdjustFrequency",
    "vtOfficialTransportPermit",
    "approvalOfVTFixRoadTransport",
    "clvCommercialCrossBorderTransportPermit",
    "clvNonCommercialCrossBorderTransportPermit",
    "approvalOfCLVFixRoadTransport",
    "gmsInterRoadTransportLicence",
    "gmsCrossBorderTransportPermit"
})
public class Content {

    @XmlElement(name = "DS_Loi")
    protected DSLoi dsLoi;
    @XmlElement(name = "KetQuaXuLy")
    protected KetQuaXuLy ketQuaXuLy;
    @XmlElement(name = "Phanhoi_Yeucau_Sua")
    protected PhanhoiYeucauSua phanhoiYeucauSua;
    @XmlElement(name = "VLInterRoadTransportLicence")
    protected VLInterRoadTransportLicence vlInterRoadTransportLicence;
    @XmlElement(name = "VLCrossBorderTransportPermit")
    protected VLCrossBorderTransportPermit vlCrossBorderTransportPermit;
    @XmlElement(name = "ApprovalOfVLFixRoadTransport")
    protected ApprovalOfVLFixRoadTransport approvalOfVLFixRoadTransport;
    @XmlElement(name = "ApprovalOfVLStopTransport")
    protected ApprovalOfVLStopTransport approvalOfVLStopTransport;
    @XmlElement(name = "ApprovalOfVLAdjustFrequency")
    protected ApprovalOfVLAdjustFrequency approvalOfVLAdjustFrequency;
    @XmlElement(name = "VTOfficialTransportPermit")
    protected VTOfficialTransportPermit vtOfficialTransportPermit;
    @XmlElement(name = "ApprovalOfVTFixRoadTransport")
    protected ApprovalOfVTFixRoadTransport approvalOfVTFixRoadTransport;
    @XmlElement(name = "CLVCommercialCrossBorderTransportPermit")
    protected CLVCommercialCrossBorderTransportPermit clvCommercialCrossBorderTransportPermit;
    @XmlElement(name = "CLVNonCommercialCrossBorderTransportPermit")
    protected CLVNonCommercialCrossBorderTransportPermit clvNonCommercialCrossBorderTransportPermit;
    @XmlElement(name = "ApprovalOfCLVFixRoadTransport")
    protected ApprovalOfCLVFixRoadTransport approvalOfCLVFixRoadTransport;
    @XmlElement(name = "GMSInterRoadTransportLicence")
    protected GMSInterRoadTransportLicence gmsInterRoadTransportLicence;
    @XmlElement(name = "GMSCrossBorderTransportPermit")
    protected GMSCrossBorderTransportPermit gmsCrossBorderTransportPermit;

    /**
     * Gets the value of the dsLoi property.
     * 
     * @return
     *     possible object is
     *     {@link DSLoi }
     *     
     */
    public DSLoi getDSLoi() {
        return dsLoi;
    }

    /**
     * Sets the value of the dsLoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link DSLoi }
     *     
     */
    public void setDSLoi(DSLoi value) {
        this.dsLoi = value;
    }

    /**
     * Gets the value of the ketQuaXuLy property.
     * 
     * @return
     *     possible object is
     *     {@link KetQuaXuLy }
     *     
     */
    public KetQuaXuLy getKetQuaXuLy() {
        return ketQuaXuLy;
    }

    /**
     * Sets the value of the ketQuaXuLy property.
     * 
     * @param value
     *     allowed object is
     *     {@link KetQuaXuLy }
     *     
     */
    public void setKetQuaXuLy(KetQuaXuLy value) {
        this.ketQuaXuLy = value;
    }

    /**
     * Gets the value of the phanhoiYeucauSua property.
     * 
     * @return
     *     possible object is
     *     {@link PhanhoiYeucauSua }
     *     
     */
    public PhanhoiYeucauSua getPhanhoiYeucauSua() {
        return phanhoiYeucauSua;
    }

    /**
     * Sets the value of the phanhoiYeucauSua property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhanhoiYeucauSua }
     *     
     */
    public void setPhanhoiYeucauSua(PhanhoiYeucauSua value) {
        this.phanhoiYeucauSua = value;
    }

    /**
     * Gets the value of the vlInterRoadTransportLicence property.
     * 
     * @return
     *     possible object is
     *     {@link VLInterRoadTransportLicence }
     *     
     */
    public VLInterRoadTransportLicence getVLInterRoadTransportLicence() {
        return vlInterRoadTransportLicence;
    }

    /**
     * Sets the value of the vlInterRoadTransportLicence property.
     * 
     * @param value
     *     allowed object is
     *     {@link VLInterRoadTransportLicence }
     *     
     */
    public void setVLInterRoadTransportLicence(VLInterRoadTransportLicence value) {
        this.vlInterRoadTransportLicence = value;
    }

    /**
     * Gets the value of the vlCrossBorderTransportPermit property.
     * 
     * @return
     *     possible object is
     *     {@link VLCrossBorderTransportPermit }
     *     
     */
    public VLCrossBorderTransportPermit getVLCrossBorderTransportPermit() {
        return vlCrossBorderTransportPermit;
    }

    /**
     * Sets the value of the vlCrossBorderTransportPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link VLCrossBorderTransportPermit }
     *     
     */
    public void setVLCrossBorderTransportPermit(VLCrossBorderTransportPermit value) {
        this.vlCrossBorderTransportPermit = value;
    }

    /**
     * Gets the value of the approvalOfVLFixRoadTransport property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalOfVLFixRoadTransport }
     *     
     */
    public ApprovalOfVLFixRoadTransport getApprovalOfVLFixRoadTransport() {
        return approvalOfVLFixRoadTransport;
    }

    /**
     * Sets the value of the approvalOfVLFixRoadTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalOfVLFixRoadTransport }
     *     
     */
    public void setApprovalOfVLFixRoadTransport(ApprovalOfVLFixRoadTransport value) {
        this.approvalOfVLFixRoadTransport = value;
    }

    /**
     * Gets the value of the approvalOfVLStopTransport property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalOfVLStopTransport }
     *     
     */
    public ApprovalOfVLStopTransport getApprovalOfVLStopTransport() {
        return approvalOfVLStopTransport;
    }

    /**
     * Sets the value of the approvalOfVLStopTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalOfVLStopTransport }
     *     
     */
    public void setApprovalOfVLStopTransport(ApprovalOfVLStopTransport value) {
        this.approvalOfVLStopTransport = value;
    }

    /**
     * Gets the value of the approvalOfVLAdjustFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalOfVLAdjustFrequency }
     *     
     */
    public ApprovalOfVLAdjustFrequency getApprovalOfVLAdjustFrequency() {
        return approvalOfVLAdjustFrequency;
    }

    /**
     * Sets the value of the approvalOfVLAdjustFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalOfVLAdjustFrequency }
     *     
     */
    public void setApprovalOfVLAdjustFrequency(ApprovalOfVLAdjustFrequency value) {
        this.approvalOfVLAdjustFrequency = value;
    }

    /**
     * Gets the value of the vtOfficialTransportPermit property.
     * 
     * @return
     *     possible object is
     *     {@link VTOfficialTransportPermit }
     *     
     */
    public VTOfficialTransportPermit getVTOfficialTransportPermit() {
        return vtOfficialTransportPermit;
    }

    /**
     * Sets the value of the vtOfficialTransportPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link VTOfficialTransportPermit }
     *     
     */
    public void setVTOfficialTransportPermit(VTOfficialTransportPermit value) {
        this.vtOfficialTransportPermit = value;
    }

    /**
     * Gets the value of the approvalOfVTFixRoadTransport property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalOfVTFixRoadTransport }
     *     
     */
    public ApprovalOfVTFixRoadTransport getApprovalOfVTFixRoadTransport() {
        return approvalOfVTFixRoadTransport;
    }

    /**
     * Sets the value of the approvalOfVTFixRoadTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalOfVTFixRoadTransport }
     *     
     */
    public void setApprovalOfVTFixRoadTransport(ApprovalOfVTFixRoadTransport value) {
        this.approvalOfVTFixRoadTransport = value;
    }

    /**
     * Gets the value of the clvCommercialCrossBorderTransportPermit property.
     * 
     * @return
     *     possible object is
     *     {@link CLVCommercialCrossBorderTransportPermit }
     *     
     */
    public CLVCommercialCrossBorderTransportPermit getCLVCommercialCrossBorderTransportPermit() {
        return clvCommercialCrossBorderTransportPermit;
    }

    /**
     * Sets the value of the clvCommercialCrossBorderTransportPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLVCommercialCrossBorderTransportPermit }
     *     
     */
    public void setCLVCommercialCrossBorderTransportPermit(CLVCommercialCrossBorderTransportPermit value) {
        this.clvCommercialCrossBorderTransportPermit = value;
    }

    /**
     * Gets the value of the clvNonCommercialCrossBorderTransportPermit property.
     * 
     * @return
     *     possible object is
     *     {@link CLVNonCommercialCrossBorderTransportPermit }
     *     
     */
    public CLVNonCommercialCrossBorderTransportPermit getCLVNonCommercialCrossBorderTransportPermit() {
        return clvNonCommercialCrossBorderTransportPermit;
    }

    /**
     * Sets the value of the clvNonCommercialCrossBorderTransportPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLVNonCommercialCrossBorderTransportPermit }
     *     
     */
    public void setCLVNonCommercialCrossBorderTransportPermit(CLVNonCommercialCrossBorderTransportPermit value) {
        this.clvNonCommercialCrossBorderTransportPermit = value;
    }

    /**
     * Gets the value of the approvalOfCLVFixRoadTransport property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalOfCLVFixRoadTransport }
     *     
     */
    public ApprovalOfCLVFixRoadTransport getApprovalOfCLVFixRoadTransport() {
        return approvalOfCLVFixRoadTransport;
    }

    /**
     * Sets the value of the approvalOfCLVFixRoadTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalOfCLVFixRoadTransport }
     *     
     */
    public void setApprovalOfCLVFixRoadTransport(ApprovalOfCLVFixRoadTransport value) {
        this.approvalOfCLVFixRoadTransport = value;
    }

    /**
     * Gets the value of the gmsInterRoadTransportLicence property.
     * 
     * @return
     *     possible object is
     *     {@link GMSInterRoadTransportLicence }
     *     
     */
    public GMSInterRoadTransportLicence getGMSInterRoadTransportLicence() {
        return gmsInterRoadTransportLicence;
    }

    /**
     * Sets the value of the gmsInterRoadTransportLicence property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMSInterRoadTransportLicence }
     *     
     */
    public void setGMSInterRoadTransportLicence(GMSInterRoadTransportLicence value) {
        this.gmsInterRoadTransportLicence = value;
    }

    /**
     * Gets the value of the gmsCrossBorderTransportPermit property.
     * 
     * @return
     *     possible object is
     *     {@link GMSCrossBorderTransportPermit }
     *     
     */
    public GMSCrossBorderTransportPermit getGMSCrossBorderTransportPermit() {
        return gmsCrossBorderTransportPermit;
    }

    /**
     * Sets the value of the gmsCrossBorderTransportPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMSCrossBorderTransportPermit }
     *     
     */
    public void setGMSCrossBorderTransportPermit(GMSCrossBorderTransportPermit value) {
        this.gmsCrossBorderTransportPermit = value;
    }

}
