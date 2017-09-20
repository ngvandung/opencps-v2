//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.15 at 02:33:21 PM ICT 
//


package org.opencps.api.serviceconfig.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceConfigId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceInfoId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainCode " type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="govAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="govAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forCitizen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceConfig", propOrder = {
    "serviceConfigId",
    "createDate",
    "modifiedDate",
    "serviceInfoId",
    "serviceCode",
    "serviceName",
    "domainCode0020",
    "domainName",
    "govAgencyCode",
    "govAgencyName",
    "serviceInstruction",
    "serviceLevel",
    "serviceUrl",
    "forCitizen",
    "forBusiness",
    "postalService",
    "registration"
})
public class ServiceConfig {

    protected Integer serviceConfigId;
    protected String createDate;
    protected String modifiedDate;
    protected Integer serviceInfoId;
    protected String serviceCode;
    protected String serviceName;
    @XmlElement(name = "domainCode ")
    protected String domainCode0020;
    protected String domainName;
    protected String govAgencyCode;
    protected String govAgencyName;
    protected String serviceInstruction;
    protected String serviceLevel;
    protected String serviceUrl;
    protected String forCitizen;
    protected String forBusiness;
    protected String postalService;
    protected String registration;

    /**
     * Gets the value of the serviceConfigId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceConfigId() {
        return serviceConfigId;
    }

    /**
     * Sets the value of the serviceConfigId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceConfigId(Integer value) {
        this.serviceConfigId = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the serviceInfoId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceInfoId() {
        return serviceInfoId;
    }

    /**
     * Sets the value of the serviceInfoId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceInfoId(Integer value) {
        this.serviceInfoId = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the domainCode0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainCode_0020() {
        return domainCode0020;
    }

    /**
     * Sets the value of the domainCode0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainCode_0020(String value) {
        this.domainCode0020 = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the govAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovAgencyCode() {
        return govAgencyCode;
    }

    /**
     * Sets the value of the govAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovAgencyCode(String value) {
        this.govAgencyCode = value;
    }

    /**
     * Gets the value of the govAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovAgencyName() {
        return govAgencyName;
    }

    /**
     * Sets the value of the govAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovAgencyName(String value) {
        this.govAgencyName = value;
    }

    /**
     * Gets the value of the serviceInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInstruction() {
        return serviceInstruction;
    }

    /**
     * Sets the value of the serviceInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInstruction(String value) {
        this.serviceInstruction = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the serviceUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUrl() {
        return serviceUrl;
    }

    /**
     * Sets the value of the serviceUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUrl(String value) {
        this.serviceUrl = value;
    }

    /**
     * Gets the value of the forCitizen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForCitizen() {
        return forCitizen;
    }

    /**
     * Sets the value of the forCitizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForCitizen(String value) {
        this.forCitizen = value;
    }

    /**
     * Gets the value of the forBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForBusiness() {
        return forBusiness;
    }

    /**
     * Sets the value of the forBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForBusiness(String value) {
        this.forBusiness = value;
    }

    /**
     * Gets the value of the postalService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalService() {
        return postalService;
    }

    /**
     * Sets the value of the postalService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalService(String value) {
        this.postalService = value;
    }

    /**
     * Gets the value of the registration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistration(String value) {
        this.registration = value;
    }

}