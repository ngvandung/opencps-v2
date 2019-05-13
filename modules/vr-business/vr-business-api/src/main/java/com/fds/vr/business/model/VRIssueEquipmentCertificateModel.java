/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fds.vr.business.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the VRIssueEquipmentCertificate service. Represents a row in the &quot;vr_issue_equipmentcertificate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRIssueEquipmentCertificateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRIssueEquipmentCertificateImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRIssueEquipmentCertificate
 * @see com.fds.vr.business.model.impl.VRIssueEquipmentCertificateImpl
 * @see com.fds.vr.business.model.impl.VRIssueEquipmentCertificateModelImpl
 * @generated
 */
@ProviderType
public interface VRIssueEquipmentCertificateModel extends BaseModel<VRIssueEquipmentCertificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr issue equipment certificate model instance should use the {@link VRIssueEquipmentCertificate} interface instead.
	 */

	/**
	 * Returns the primary key of this vr issue equipment certificate.
	 *
	 * @return the primary key of this vr issue equipment certificate
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr issue equipment certificate.
	 *
	 * @param primaryKey the primary key of this vr issue equipment certificate
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr issue equipment certificate.
	 *
	 * @return the ID of this vr issue equipment certificate
	 */
	public long getId();

	/**
	 * Sets the ID of this vr issue equipment certificate.
	 *
	 * @param id the ID of this vr issue equipment certificate
	 */
	public void setId(long id);

	/**
	 * Returns the mtcore of this vr issue equipment certificate.
	 *
	 * @return the mtcore of this vr issue equipment certificate
	 */
	public int getMtcore();

	/**
	 * Sets the mtcore of this vr issue equipment certificate.
	 *
	 * @param mtcore the mtcore of this vr issue equipment certificate
	 */
	public void setMtcore(int mtcore);

	/**
	 * Returns the issue ID of this vr issue equipment certificate.
	 *
	 * @return the issue ID of this vr issue equipment certificate
	 */
	public long getIssueId();

	/**
	 * Sets the issue ID of this vr issue equipment certificate.
	 *
	 * @param issueId the issue ID of this vr issue equipment certificate
	 */
	public void setIssueId(long issueId);

	/**
	 * Returns the issue vehicle certificate ID of this vr issue equipment certificate.
	 *
	 * @return the issue vehicle certificate ID of this vr issue equipment certificate
	 */
	public long getIssueVehicleCertificateId();

	/**
	 * Sets the issue vehicle certificate ID of this vr issue equipment certificate.
	 *
	 * @param issueVehicleCertificateId the issue vehicle certificate ID of this vr issue equipment certificate
	 */
	public void setIssueVehicleCertificateId(long issueVehicleCertificateId);

	/**
	 * Returns the vehiclecertificaterecordno of this vr issue equipment certificate.
	 *
	 * @return the vehiclecertificaterecordno of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getVehiclecertificaterecordno();

	/**
	 * Sets the vehiclecertificaterecordno of this vr issue equipment certificate.
	 *
	 * @param vehiclecertificaterecordno the vehiclecertificaterecordno of this vr issue equipment certificate
	 */
	public void setVehiclecertificaterecordno(String vehiclecertificaterecordno);

	/**
	 * Returns the equipment name of this vr issue equipment certificate.
	 *
	 * @return the equipment name of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getEquipmentName();

	/**
	 * Sets the equipment name of this vr issue equipment certificate.
	 *
	 * @param equipmentName the equipment name of this vr issue equipment certificate
	 */
	public void setEquipmentName(String equipmentName);

	/**
	 * Returns the equipment type of this vr issue equipment certificate.
	 *
	 * @return the equipment type of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getEquipmentType();

	/**
	 * Sets the equipment type of this vr issue equipment certificate.
	 *
	 * @param equipmentType the equipment type of this vr issue equipment certificate
	 */
	public void setEquipmentType(String equipmentType);

	/**
	 * Returns the equipment certificate type of this vr issue equipment certificate.
	 *
	 * @return the equipment certificate type of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getEquipmentCertificateType();

	/**
	 * Sets the equipment certificate type of this vr issue equipment certificate.
	 *
	 * @param equipmentCertificateType the equipment certificate type of this vr issue equipment certificate
	 */
	public void setEquipmentCertificateType(String equipmentCertificateType);

	/**
	 * Returns the equipment document no of this vr issue equipment certificate.
	 *
	 * @return the equipment document no of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getEquipmentDocumentNo();

	/**
	 * Sets the equipment document no of this vr issue equipment certificate.
	 *
	 * @param equipmentDocumentNo the equipment document no of this vr issue equipment certificate
	 */
	public void setEquipmentDocumentNo(String equipmentDocumentNo);

	/**
	 * Returns the equipment certificate record no of this vr issue equipment certificate.
	 *
	 * @return the equipment certificate record no of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getEquipmentCertificateRecordNo();

	/**
	 * Sets the equipment certificate record no of this vr issue equipment certificate.
	 *
	 * @param equipmentCertificateRecordNo the equipment certificate record no of this vr issue equipment certificate
	 */
	public void setEquipmentCertificateRecordNo(
		String equipmentCertificateRecordNo);

	/**
	 * Returns the equipment exam record no of this vr issue equipment certificate.
	 *
	 * @return the equipment exam record no of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getEquipmentExamRecordNo();

	/**
	 * Sets the equipment exam record no of this vr issue equipment certificate.
	 *
	 * @param equipmentExamRecordNo the equipment exam record no of this vr issue equipment certificate
	 */
	public void setEquipmentExamRecordNo(String equipmentExamRecordNo);

	/**
	 * Returns the equipment certificate record ID of this vr issue equipment certificate.
	 *
	 * @return the equipment certificate record ID of this vr issue equipment certificate
	 */
	public int getEquipmentCertificateRecordId();

	/**
	 * Sets the equipment certificate record ID of this vr issue equipment certificate.
	 *
	 * @param EquipmentCertificateRecordId the equipment certificate record ID of this vr issue equipment certificate
	 */
	public void setEquipmentCertificateRecordId(
		int EquipmentCertificateRecordId);

	/**
	 * Returns the total quantity of this vr issue equipment certificate.
	 *
	 * @return the total quantity of this vr issue equipment certificate
	 */
	public int getTotalQuantity();

	/**
	 * Sets the total quantity of this vr issue equipment certificate.
	 *
	 * @param TotalQuantity the total quantity of this vr issue equipment certificate
	 */
	public void setTotalQuantity(int TotalQuantity);

	/**
	 * Returns the total product used of this vr issue equipment certificate.
	 *
	 * @return the total product used of this vr issue equipment certificate
	 */
	public int getTotalProductUsed();

	/**
	 * Sets the total product used of this vr issue equipment certificate.
	 *
	 * @param TotalProductUsed the total product used of this vr issue equipment certificate
	 */
	public void setTotalProductUsed(int TotalProductUsed);

	/**
	 * Returns the total in use of this vr issue equipment certificate.
	 *
	 * @return the total in use of this vr issue equipment certificate
	 */
	public int getTotalInUse();

	/**
	 * Sets the total in use of this vr issue equipment certificate.
	 *
	 * @param TotalInUse the total in use of this vr issue equipment certificate
	 */
	public void setTotalInUse(int TotalInUse);

	/**
	 * Returns the total not used of this vr issue equipment certificate.
	 *
	 * @return the total not used of this vr issue equipment certificate
	 */
	public int getTotalNotUsed();

	/**
	 * Sets the total not used of this vr issue equipment certificate.
	 *
	 * @param TotalNotUsed the total not used of this vr issue equipment certificate
	 */
	public void setTotalNotUsed(int TotalNotUsed);

	/**
	 * Returns the applicant no of this vr issue equipment certificate.
	 *
	 * @return the applicant no of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getApplicantNo();

	/**
	 * Sets the applicant no of this vr issue equipment certificate.
	 *
	 * @param applicantNo the applicant no of this vr issue equipment certificate
	 */
	public void setApplicantNo(String applicantNo);

	/**
	 * Returns the applicantname of this vr issue equipment certificate.
	 *
	 * @return the applicantname of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getApplicantname();

	/**
	 * Sets the applicantname of this vr issue equipment certificate.
	 *
	 * @param applicantname the applicantname of this vr issue equipment certificate
	 */
	public void setApplicantname(String applicantname);

	/**
	 * Returns the applicantaddress of this vr issue equipment certificate.
	 *
	 * @return the applicantaddress of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getApplicantaddress();

	/**
	 * Sets the applicantaddress of this vr issue equipment certificate.
	 *
	 * @param applicantaddress the applicantaddress of this vr issue equipment certificate
	 */
	public void setApplicantaddress(String applicantaddress);

	/**
	 * Returns the productionplantname of this vr issue equipment certificate.
	 *
	 * @return the productionplantname of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getProductionplantname();

	/**
	 * Sets the productionplantname of this vr issue equipment certificate.
	 *
	 * @param productionplantname the productionplantname of this vr issue equipment certificate
	 */
	public void setProductionplantname(String productionplantname);

	/**
	 * Returns the productionplantaddress of this vr issue equipment certificate.
	 *
	 * @return the productionplantaddress of this vr issue equipment certificate
	 */
	@AutoEscape
	public String getProductionplantaddress();

	/**
	 * Sets the productionplantaddress of this vr issue equipment certificate.
	 *
	 * @param productionplantaddress the productionplantaddress of this vr issue equipment certificate
	 */
	public void setProductionplantaddress(String productionplantaddress);

	/**
	 * Returns the modify date of this vr issue equipment certificate.
	 *
	 * @return the modify date of this vr issue equipment certificate
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr issue equipment certificate.
	 *
	 * @param modifyDate the modify date of this vr issue equipment certificate
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr issue equipment certificate.
	 *
	 * @return the sync date of this vr issue equipment certificate
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr issue equipment certificate.
	 *
	 * @param syncDate the sync date of this vr issue equipment certificate
	 */
	public void setSyncDate(Date syncDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRIssueEquipmentCertificate> toCacheModel();

	@Override
	public VRIssueEquipmentCertificate toEscapedModel();

	@Override
	public VRIssueEquipmentCertificate toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}