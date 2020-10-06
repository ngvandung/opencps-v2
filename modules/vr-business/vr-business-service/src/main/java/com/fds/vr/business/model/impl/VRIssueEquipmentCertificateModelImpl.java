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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRIssueEquipmentCertificate;
import com.fds.vr.business.model.VRIssueEquipmentCertificateModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VRIssueEquipmentCertificate service. Represents a row in the &quot;vr_issue_equipmentcertificate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VRIssueEquipmentCertificateModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VRIssueEquipmentCertificateImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRIssueEquipmentCertificateImpl
 * @see VRIssueEquipmentCertificate
 * @see VRIssueEquipmentCertificateModel
 * @generated
 */
@ProviderType
public class VRIssueEquipmentCertificateModelImpl extends BaseModelImpl<VRIssueEquipmentCertificate>
	implements VRIssueEquipmentCertificateModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vr issue equipment certificate model instance should use the {@link VRIssueEquipmentCertificate} interface instead.
	 */
	public static final String TABLE_NAME = "vr_issue_equipmentcertificate";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "mtCore", Types.BIGINT },
			{ "dossierId", Types.BIGINT },
			{ "issueId", Types.BIGINT },
			{ "issueVehicleCertificateId", Types.BIGINT },
			{ "vehicleCertificateRecordNo", Types.VARCHAR },
			{ "equipmentName", Types.VARCHAR },
			{ "equipmentType", Types.VARCHAR },
			{ "equipmentCertificateType", Types.VARCHAR },
			{ "equipmentDocumentNo", Types.VARCHAR },
			{ "equipmentCertificateRecordNo", Types.VARCHAR },
			{ "equipmentExamRecordNo", Types.VARCHAR },
			{ "EquipmentCertificateRecordId", Types.INTEGER },
			{ "TotalQuantity", Types.INTEGER },
			{ "TotalProductUsed", Types.INTEGER },
			{ "TotalInUse", Types.INTEGER },
			{ "TotalNotUsed", Types.INTEGER },
			{ "applicantNo", Types.VARCHAR },
			{ "applicantName", Types.VARCHAR },
			{ "applicantAddress", Types.VARCHAR },
			{ "productionPlantName", Types.VARCHAR },
			{ "productionPlantAddress", Types.VARCHAR },
			{ "modifyDate", Types.TIMESTAMP },
			{ "syncDate", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("mtCore", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("dossierId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("issueId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("issueVehicleCertificateId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("vehicleCertificateRecordNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentCertificateType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentDocumentNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentCertificateRecordNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("equipmentExamRecordNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("EquipmentCertificateRecordId", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("TotalQuantity", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("TotalProductUsed", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("TotalInUse", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("TotalNotUsed", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("applicantNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicantName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicantAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("productionPlantName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("productionPlantAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("modifyDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("syncDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table vr_issue_equipmentcertificate (id LONG not null primary key,mtCore LONG,dossierId LONG,issueId LONG,issueVehicleCertificateId LONG,vehicleCertificateRecordNo VARCHAR(75) null,equipmentName VARCHAR(75) null,equipmentType VARCHAR(75) null,equipmentCertificateType VARCHAR(75) null,equipmentDocumentNo VARCHAR(75) null,equipmentCertificateRecordNo VARCHAR(75) null,equipmentExamRecordNo VARCHAR(75) null,EquipmentCertificateRecordId INTEGER,TotalQuantity INTEGER,TotalProductUsed INTEGER,TotalInUse INTEGER,TotalNotUsed INTEGER,applicantNo VARCHAR(75) null,applicantName VARCHAR(75) null,applicantAddress VARCHAR(75) null,productionPlantName VARCHAR(75) null,productionPlantAddress VARCHAR(75) null,modifyDate DATE null,syncDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table vr_issue_equipmentcertificate";
	public static final String ORDER_BY_JPQL = " ORDER BY vrIssueEquipmentCertificate.syncDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY vr_issue_equipmentcertificate.syncDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.fds.vr.business.model.VRIssueEquipmentCertificate"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.fds.vr.business.model.VRIssueEquipmentCertificate"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.fds.vr.business.model.VRIssueEquipmentCertificate"),
			true);
	public static final long APPLICANTNO_COLUMN_BITMASK = 1L;
	public static final long DOSSIERID_COLUMN_BITMASK = 2L;
	public static final long ISSUEID_COLUMN_BITMASK = 4L;
	public static final long ISSUEVEHICLECERTIFICATEID_COLUMN_BITMASK = 8L;
	public static final long MTCORE_COLUMN_BITMASK = 16L;
	public static final long VEHICLECERTIFICATERECORDNO_COLUMN_BITMASK = 32L;
	public static final long SYNCDATE_COLUMN_BITMASK = 64L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.fds.vr.service.util.ServiceProps.get(
				"lock.expiration.time.com.fds.vr.business.model.VRIssueEquipmentCertificate"));

	public VRIssueEquipmentCertificateModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return VRIssueEquipmentCertificate.class;
	}

	@Override
	public String getModelClassName() {
		return VRIssueEquipmentCertificate.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("dossierId", getDossierId());
		attributes.put("issueId", getIssueId());
		attributes.put("issueVehicleCertificateId",
			getIssueVehicleCertificateId());
		attributes.put("vehicleCertificateRecordNo",
			getVehicleCertificateRecordNo());
		attributes.put("equipmentName", getEquipmentName());
		attributes.put("equipmentType", getEquipmentType());
		attributes.put("equipmentCertificateType", getEquipmentCertificateType());
		attributes.put("equipmentDocumentNo", getEquipmentDocumentNo());
		attributes.put("equipmentCertificateRecordNo",
			getEquipmentCertificateRecordNo());
		attributes.put("equipmentExamRecordNo", getEquipmentExamRecordNo());
		attributes.put("EquipmentCertificateRecordId",
			getEquipmentCertificateRecordId());
		attributes.put("TotalQuantity", getTotalQuantity());
		attributes.put("TotalProductUsed", getTotalProductUsed());
		attributes.put("TotalInUse", getTotalInUse());
		attributes.put("TotalNotUsed", getTotalNotUsed());
		attributes.put("applicantNo", getApplicantNo());
		attributes.put("applicantName", getApplicantName());
		attributes.put("applicantAddress", getApplicantAddress());
		attributes.put("productionPlantName", getProductionPlantName());
		attributes.put("productionPlantAddress", getProductionPlantAddress());
		attributes.put("modifyDate", getModifyDate());
		attributes.put("syncDate", getSyncDate());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long mtCore = (Long)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long dossierId = (Long)attributes.get("dossierId");

		if (dossierId != null) {
			setDossierId(dossierId);
		}

		Long issueId = (Long)attributes.get("issueId");

		if (issueId != null) {
			setIssueId(issueId);
		}

		Long issueVehicleCertificateId = (Long)attributes.get(
				"issueVehicleCertificateId");

		if (issueVehicleCertificateId != null) {
			setIssueVehicleCertificateId(issueVehicleCertificateId);
		}

		String vehicleCertificateRecordNo = (String)attributes.get(
				"vehicleCertificateRecordNo");

		if (vehicleCertificateRecordNo != null) {
			setVehicleCertificateRecordNo(vehicleCertificateRecordNo);
		}

		String equipmentName = (String)attributes.get("equipmentName");

		if (equipmentName != null) {
			setEquipmentName(equipmentName);
		}

		String equipmentType = (String)attributes.get("equipmentType");

		if (equipmentType != null) {
			setEquipmentType(equipmentType);
		}

		String equipmentCertificateType = (String)attributes.get(
				"equipmentCertificateType");

		if (equipmentCertificateType != null) {
			setEquipmentCertificateType(equipmentCertificateType);
		}

		String equipmentDocumentNo = (String)attributes.get(
				"equipmentDocumentNo");

		if (equipmentDocumentNo != null) {
			setEquipmentDocumentNo(equipmentDocumentNo);
		}

		String equipmentCertificateRecordNo = (String)attributes.get(
				"equipmentCertificateRecordNo");

		if (equipmentCertificateRecordNo != null) {
			setEquipmentCertificateRecordNo(equipmentCertificateRecordNo);
		}

		String equipmentExamRecordNo = (String)attributes.get(
				"equipmentExamRecordNo");

		if (equipmentExamRecordNo != null) {
			setEquipmentExamRecordNo(equipmentExamRecordNo);
		}

		Integer EquipmentCertificateRecordId = (Integer)attributes.get(
				"EquipmentCertificateRecordId");

		if (EquipmentCertificateRecordId != null) {
			setEquipmentCertificateRecordId(EquipmentCertificateRecordId);
		}

		Integer TotalQuantity = (Integer)attributes.get("TotalQuantity");

		if (TotalQuantity != null) {
			setTotalQuantity(TotalQuantity);
		}

		Integer TotalProductUsed = (Integer)attributes.get("TotalProductUsed");

		if (TotalProductUsed != null) {
			setTotalProductUsed(TotalProductUsed);
		}

		Integer TotalInUse = (Integer)attributes.get("TotalInUse");

		if (TotalInUse != null) {
			setTotalInUse(TotalInUse);
		}

		Integer TotalNotUsed = (Integer)attributes.get("TotalNotUsed");

		if (TotalNotUsed != null) {
			setTotalNotUsed(TotalNotUsed);
		}

		String applicantNo = (String)attributes.get("applicantNo");

		if (applicantNo != null) {
			setApplicantNo(applicantNo);
		}

		String applicantName = (String)attributes.get("applicantName");

		if (applicantName != null) {
			setApplicantName(applicantName);
		}

		String applicantAddress = (String)attributes.get("applicantAddress");

		if (applicantAddress != null) {
			setApplicantAddress(applicantAddress);
		}

		String productionPlantName = (String)attributes.get(
				"productionPlantName");

		if (productionPlantName != null) {
			setProductionPlantName(productionPlantName);
		}

		String productionPlantAddress = (String)attributes.get(
				"productionPlantAddress");

		if (productionPlantAddress != null) {
			setProductionPlantAddress(productionPlantAddress);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}

		Date syncDate = (Date)attributes.get("syncDate");

		if (syncDate != null) {
			setSyncDate(syncDate);
		}
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@Override
	public long getMtCore() {
		return _mtCore;
	}

	@Override
	public void setMtCore(long mtCore) {
		_columnBitmask |= MTCORE_COLUMN_BITMASK;

		if (!_setOriginalMtCore) {
			_setOriginalMtCore = true;

			_originalMtCore = _mtCore;
		}

		_mtCore = mtCore;
	}

	public long getOriginalMtCore() {
		return _originalMtCore;
	}

	@Override
	public long getDossierId() {
		return _dossierId;
	}

	@Override
	public void setDossierId(long dossierId) {
		_columnBitmask |= DOSSIERID_COLUMN_BITMASK;

		if (!_setOriginalDossierId) {
			_setOriginalDossierId = true;

			_originalDossierId = _dossierId;
		}

		_dossierId = dossierId;
	}

	public long getOriginalDossierId() {
		return _originalDossierId;
	}

	@Override
	public long getIssueId() {
		return _issueId;
	}

	@Override
	public void setIssueId(long issueId) {
		_columnBitmask |= ISSUEID_COLUMN_BITMASK;

		if (!_setOriginalIssueId) {
			_setOriginalIssueId = true;

			_originalIssueId = _issueId;
		}

		_issueId = issueId;
	}

	public long getOriginalIssueId() {
		return _originalIssueId;
	}

	@Override
	public long getIssueVehicleCertificateId() {
		return _issueVehicleCertificateId;
	}

	@Override
	public void setIssueVehicleCertificateId(long issueVehicleCertificateId) {
		_columnBitmask |= ISSUEVEHICLECERTIFICATEID_COLUMN_BITMASK;

		if (!_setOriginalIssueVehicleCertificateId) {
			_setOriginalIssueVehicleCertificateId = true;

			_originalIssueVehicleCertificateId = _issueVehicleCertificateId;
		}

		_issueVehicleCertificateId = issueVehicleCertificateId;
	}

	public long getOriginalIssueVehicleCertificateId() {
		return _originalIssueVehicleCertificateId;
	}

	@Override
	public String getVehicleCertificateRecordNo() {
		if (_vehicleCertificateRecordNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _vehicleCertificateRecordNo;
		}
	}

	@Override
	public void setVehicleCertificateRecordNo(String vehicleCertificateRecordNo) {
		_columnBitmask |= VEHICLECERTIFICATERECORDNO_COLUMN_BITMASK;

		if (_originalVehicleCertificateRecordNo == null) {
			_originalVehicleCertificateRecordNo = _vehicleCertificateRecordNo;
		}

		_vehicleCertificateRecordNo = vehicleCertificateRecordNo;
	}

	public String getOriginalVehicleCertificateRecordNo() {
		return GetterUtil.getString(_originalVehicleCertificateRecordNo);
	}

	@Override
	public String getEquipmentName() {
		if (_equipmentName == null) {
			return StringPool.BLANK;
		}
		else {
			return _equipmentName;
		}
	}

	@Override
	public void setEquipmentName(String equipmentName) {
		_equipmentName = equipmentName;
	}

	@Override
	public String getEquipmentType() {
		if (_equipmentType == null) {
			return StringPool.BLANK;
		}
		else {
			return _equipmentType;
		}
	}

	@Override
	public void setEquipmentType(String equipmentType) {
		_equipmentType = equipmentType;
	}

	@Override
	public String getEquipmentCertificateType() {
		if (_equipmentCertificateType == null) {
			return StringPool.BLANK;
		}
		else {
			return _equipmentCertificateType;
		}
	}

	@Override
	public void setEquipmentCertificateType(String equipmentCertificateType) {
		_equipmentCertificateType = equipmentCertificateType;
	}

	@Override
	public String getEquipmentDocumentNo() {
		if (_equipmentDocumentNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _equipmentDocumentNo;
		}
	}

	@Override
	public void setEquipmentDocumentNo(String equipmentDocumentNo) {
		_equipmentDocumentNo = equipmentDocumentNo;
	}

	@Override
	public String getEquipmentCertificateRecordNo() {
		if (_equipmentCertificateRecordNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _equipmentCertificateRecordNo;
		}
	}

	@Override
	public void setEquipmentCertificateRecordNo(
		String equipmentCertificateRecordNo) {
		_equipmentCertificateRecordNo = equipmentCertificateRecordNo;
	}

	@Override
	public String getEquipmentExamRecordNo() {
		if (_equipmentExamRecordNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _equipmentExamRecordNo;
		}
	}

	@Override
	public void setEquipmentExamRecordNo(String equipmentExamRecordNo) {
		_equipmentExamRecordNo = equipmentExamRecordNo;
	}

	@Override
	public int getEquipmentCertificateRecordId() {
		return _EquipmentCertificateRecordId;
	}

	@Override
	public void setEquipmentCertificateRecordId(
		int EquipmentCertificateRecordId) {
		_EquipmentCertificateRecordId = EquipmentCertificateRecordId;
	}

	@Override
	public int getTotalQuantity() {
		return _TotalQuantity;
	}

	@Override
	public void setTotalQuantity(int TotalQuantity) {
		_TotalQuantity = TotalQuantity;
	}

	@Override
	public int getTotalProductUsed() {
		return _TotalProductUsed;
	}

	@Override
	public void setTotalProductUsed(int TotalProductUsed) {
		_TotalProductUsed = TotalProductUsed;
	}

	@Override
	public int getTotalInUse() {
		return _TotalInUse;
	}

	@Override
	public void setTotalInUse(int TotalInUse) {
		_TotalInUse = TotalInUse;
	}

	@Override
	public int getTotalNotUsed() {
		return _TotalNotUsed;
	}

	@Override
	public void setTotalNotUsed(int TotalNotUsed) {
		_TotalNotUsed = TotalNotUsed;
	}

	@Override
	public String getApplicantNo() {
		if (_applicantNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _applicantNo;
		}
	}

	@Override
	public void setApplicantNo(String applicantNo) {
		_columnBitmask |= APPLICANTNO_COLUMN_BITMASK;

		if (_originalApplicantNo == null) {
			_originalApplicantNo = _applicantNo;
		}

		_applicantNo = applicantNo;
	}

	public String getOriginalApplicantNo() {
		return GetterUtil.getString(_originalApplicantNo);
	}

	@Override
	public String getApplicantName() {
		if (_applicantName == null) {
			return StringPool.BLANK;
		}
		else {
			return _applicantName;
		}
	}

	@Override
	public void setApplicantName(String applicantName) {
		_applicantName = applicantName;
	}

	@Override
	public String getApplicantAddress() {
		if (_applicantAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _applicantAddress;
		}
	}

	@Override
	public void setApplicantAddress(String applicantAddress) {
		_applicantAddress = applicantAddress;
	}

	@Override
	public String getProductionPlantName() {
		if (_productionPlantName == null) {
			return StringPool.BLANK;
		}
		else {
			return _productionPlantName;
		}
	}

	@Override
	public void setProductionPlantName(String productionPlantName) {
		_productionPlantName = productionPlantName;
	}

	@Override
	public String getProductionPlantAddress() {
		if (_productionPlantAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _productionPlantAddress;
		}
	}

	@Override
	public void setProductionPlantAddress(String productionPlantAddress) {
		_productionPlantAddress = productionPlantAddress;
	}

	@Override
	public Date getModifyDate() {
		return _modifyDate;
	}

	@Override
	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	@Override
	public Date getSyncDate() {
		return _syncDate;
	}

	@Override
	public void setSyncDate(Date syncDate) {
		_columnBitmask = -1L;

		_syncDate = syncDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VRIssueEquipmentCertificate.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VRIssueEquipmentCertificate toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VRIssueEquipmentCertificate)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VRIssueEquipmentCertificateImpl vrIssueEquipmentCertificateImpl = new VRIssueEquipmentCertificateImpl();

		vrIssueEquipmentCertificateImpl.setId(getId());
		vrIssueEquipmentCertificateImpl.setMtCore(getMtCore());
		vrIssueEquipmentCertificateImpl.setDossierId(getDossierId());
		vrIssueEquipmentCertificateImpl.setIssueId(getIssueId());
		vrIssueEquipmentCertificateImpl.setIssueVehicleCertificateId(getIssueVehicleCertificateId());
		vrIssueEquipmentCertificateImpl.setVehicleCertificateRecordNo(getVehicleCertificateRecordNo());
		vrIssueEquipmentCertificateImpl.setEquipmentName(getEquipmentName());
		vrIssueEquipmentCertificateImpl.setEquipmentType(getEquipmentType());
		vrIssueEquipmentCertificateImpl.setEquipmentCertificateType(getEquipmentCertificateType());
		vrIssueEquipmentCertificateImpl.setEquipmentDocumentNo(getEquipmentDocumentNo());
		vrIssueEquipmentCertificateImpl.setEquipmentCertificateRecordNo(getEquipmentCertificateRecordNo());
		vrIssueEquipmentCertificateImpl.setEquipmentExamRecordNo(getEquipmentExamRecordNo());
		vrIssueEquipmentCertificateImpl.setEquipmentCertificateRecordId(getEquipmentCertificateRecordId());
		vrIssueEquipmentCertificateImpl.setTotalQuantity(getTotalQuantity());
		vrIssueEquipmentCertificateImpl.setTotalProductUsed(getTotalProductUsed());
		vrIssueEquipmentCertificateImpl.setTotalInUse(getTotalInUse());
		vrIssueEquipmentCertificateImpl.setTotalNotUsed(getTotalNotUsed());
		vrIssueEquipmentCertificateImpl.setApplicantNo(getApplicantNo());
		vrIssueEquipmentCertificateImpl.setApplicantName(getApplicantName());
		vrIssueEquipmentCertificateImpl.setApplicantAddress(getApplicantAddress());
		vrIssueEquipmentCertificateImpl.setProductionPlantName(getProductionPlantName());
		vrIssueEquipmentCertificateImpl.setProductionPlantAddress(getProductionPlantAddress());
		vrIssueEquipmentCertificateImpl.setModifyDate(getModifyDate());
		vrIssueEquipmentCertificateImpl.setSyncDate(getSyncDate());

		vrIssueEquipmentCertificateImpl.resetOriginalValues();

		return vrIssueEquipmentCertificateImpl;
	}

	@Override
	public int compareTo(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate) {
		int value = 0;

		value = DateUtil.compareTo(getSyncDate(),
				vrIssueEquipmentCertificate.getSyncDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRIssueEquipmentCertificate)) {
			return false;
		}

		VRIssueEquipmentCertificate vrIssueEquipmentCertificate = (VRIssueEquipmentCertificate)obj;

		long primaryKey = vrIssueEquipmentCertificate.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		VRIssueEquipmentCertificateModelImpl vrIssueEquipmentCertificateModelImpl =
			this;

		vrIssueEquipmentCertificateModelImpl._originalMtCore = vrIssueEquipmentCertificateModelImpl._mtCore;

		vrIssueEquipmentCertificateModelImpl._setOriginalMtCore = false;

		vrIssueEquipmentCertificateModelImpl._originalDossierId = vrIssueEquipmentCertificateModelImpl._dossierId;

		vrIssueEquipmentCertificateModelImpl._setOriginalDossierId = false;

		vrIssueEquipmentCertificateModelImpl._originalIssueId = vrIssueEquipmentCertificateModelImpl._issueId;

		vrIssueEquipmentCertificateModelImpl._setOriginalIssueId = false;

		vrIssueEquipmentCertificateModelImpl._originalIssueVehicleCertificateId = vrIssueEquipmentCertificateModelImpl._issueVehicleCertificateId;

		vrIssueEquipmentCertificateModelImpl._setOriginalIssueVehicleCertificateId = false;

		vrIssueEquipmentCertificateModelImpl._originalVehicleCertificateRecordNo = vrIssueEquipmentCertificateModelImpl._vehicleCertificateRecordNo;

		vrIssueEquipmentCertificateModelImpl._originalApplicantNo = vrIssueEquipmentCertificateModelImpl._applicantNo;

		vrIssueEquipmentCertificateModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VRIssueEquipmentCertificate> toCacheModel() {
		VRIssueEquipmentCertificateCacheModel vrIssueEquipmentCertificateCacheModel =
			new VRIssueEquipmentCertificateCacheModel();

		vrIssueEquipmentCertificateCacheModel.id = getId();

		vrIssueEquipmentCertificateCacheModel.mtCore = getMtCore();

		vrIssueEquipmentCertificateCacheModel.dossierId = getDossierId();

		vrIssueEquipmentCertificateCacheModel.issueId = getIssueId();

		vrIssueEquipmentCertificateCacheModel.issueVehicleCertificateId = getIssueVehicleCertificateId();

		vrIssueEquipmentCertificateCacheModel.vehicleCertificateRecordNo = getVehicleCertificateRecordNo();

		String vehicleCertificateRecordNo = vrIssueEquipmentCertificateCacheModel.vehicleCertificateRecordNo;

		if ((vehicleCertificateRecordNo != null) &&
				(vehicleCertificateRecordNo.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.vehicleCertificateRecordNo = null;
		}

		vrIssueEquipmentCertificateCacheModel.equipmentName = getEquipmentName();

		String equipmentName = vrIssueEquipmentCertificateCacheModel.equipmentName;

		if ((equipmentName != null) && (equipmentName.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.equipmentName = null;
		}

		vrIssueEquipmentCertificateCacheModel.equipmentType = getEquipmentType();

		String equipmentType = vrIssueEquipmentCertificateCacheModel.equipmentType;

		if ((equipmentType != null) && (equipmentType.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.equipmentType = null;
		}

		vrIssueEquipmentCertificateCacheModel.equipmentCertificateType = getEquipmentCertificateType();

		String equipmentCertificateType = vrIssueEquipmentCertificateCacheModel.equipmentCertificateType;

		if ((equipmentCertificateType != null) &&
				(equipmentCertificateType.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.equipmentCertificateType = null;
		}

		vrIssueEquipmentCertificateCacheModel.equipmentDocumentNo = getEquipmentDocumentNo();

		String equipmentDocumentNo = vrIssueEquipmentCertificateCacheModel.equipmentDocumentNo;

		if ((equipmentDocumentNo != null) &&
				(equipmentDocumentNo.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.equipmentDocumentNo = null;
		}

		vrIssueEquipmentCertificateCacheModel.equipmentCertificateRecordNo = getEquipmentCertificateRecordNo();

		String equipmentCertificateRecordNo = vrIssueEquipmentCertificateCacheModel.equipmentCertificateRecordNo;

		if ((equipmentCertificateRecordNo != null) &&
				(equipmentCertificateRecordNo.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.equipmentCertificateRecordNo = null;
		}

		vrIssueEquipmentCertificateCacheModel.equipmentExamRecordNo = getEquipmentExamRecordNo();

		String equipmentExamRecordNo = vrIssueEquipmentCertificateCacheModel.equipmentExamRecordNo;

		if ((equipmentExamRecordNo != null) &&
				(equipmentExamRecordNo.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.equipmentExamRecordNo = null;
		}

		vrIssueEquipmentCertificateCacheModel.EquipmentCertificateRecordId = getEquipmentCertificateRecordId();

		vrIssueEquipmentCertificateCacheModel.TotalQuantity = getTotalQuantity();

		vrIssueEquipmentCertificateCacheModel.TotalProductUsed = getTotalProductUsed();

		vrIssueEquipmentCertificateCacheModel.TotalInUse = getTotalInUse();

		vrIssueEquipmentCertificateCacheModel.TotalNotUsed = getTotalNotUsed();

		vrIssueEquipmentCertificateCacheModel.applicantNo = getApplicantNo();

		String applicantNo = vrIssueEquipmentCertificateCacheModel.applicantNo;

		if ((applicantNo != null) && (applicantNo.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.applicantNo = null;
		}

		vrIssueEquipmentCertificateCacheModel.applicantName = getApplicantName();

		String applicantName = vrIssueEquipmentCertificateCacheModel.applicantName;

		if ((applicantName != null) && (applicantName.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.applicantName = null;
		}

		vrIssueEquipmentCertificateCacheModel.applicantAddress = getApplicantAddress();

		String applicantAddress = vrIssueEquipmentCertificateCacheModel.applicantAddress;

		if ((applicantAddress != null) && (applicantAddress.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.applicantAddress = null;
		}

		vrIssueEquipmentCertificateCacheModel.productionPlantName = getProductionPlantName();

		String productionPlantName = vrIssueEquipmentCertificateCacheModel.productionPlantName;

		if ((productionPlantName != null) &&
				(productionPlantName.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.productionPlantName = null;
		}

		vrIssueEquipmentCertificateCacheModel.productionPlantAddress = getProductionPlantAddress();

		String productionPlantAddress = vrIssueEquipmentCertificateCacheModel.productionPlantAddress;

		if ((productionPlantAddress != null) &&
				(productionPlantAddress.length() == 0)) {
			vrIssueEquipmentCertificateCacheModel.productionPlantAddress = null;
		}

		Date modifyDate = getModifyDate();

		if (modifyDate != null) {
			vrIssueEquipmentCertificateCacheModel.modifyDate = modifyDate.getTime();
		}
		else {
			vrIssueEquipmentCertificateCacheModel.modifyDate = Long.MIN_VALUE;
		}

		Date syncDate = getSyncDate();

		if (syncDate != null) {
			vrIssueEquipmentCertificateCacheModel.syncDate = syncDate.getTime();
		}
		else {
			vrIssueEquipmentCertificateCacheModel.syncDate = Long.MIN_VALUE;
		}

		return vrIssueEquipmentCertificateCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(49);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", mtCore=");
		sb.append(getMtCore());
		sb.append(", dossierId=");
		sb.append(getDossierId());
		sb.append(", issueId=");
		sb.append(getIssueId());
		sb.append(", issueVehicleCertificateId=");
		sb.append(getIssueVehicleCertificateId());
		sb.append(", vehicleCertificateRecordNo=");
		sb.append(getVehicleCertificateRecordNo());
		sb.append(", equipmentName=");
		sb.append(getEquipmentName());
		sb.append(", equipmentType=");
		sb.append(getEquipmentType());
		sb.append(", equipmentCertificateType=");
		sb.append(getEquipmentCertificateType());
		sb.append(", equipmentDocumentNo=");
		sb.append(getEquipmentDocumentNo());
		sb.append(", equipmentCertificateRecordNo=");
		sb.append(getEquipmentCertificateRecordNo());
		sb.append(", equipmentExamRecordNo=");
		sb.append(getEquipmentExamRecordNo());
		sb.append(", EquipmentCertificateRecordId=");
		sb.append(getEquipmentCertificateRecordId());
		sb.append(", TotalQuantity=");
		sb.append(getTotalQuantity());
		sb.append(", TotalProductUsed=");
		sb.append(getTotalProductUsed());
		sb.append(", TotalInUse=");
		sb.append(getTotalInUse());
		sb.append(", TotalNotUsed=");
		sb.append(getTotalNotUsed());
		sb.append(", applicantNo=");
		sb.append(getApplicantNo());
		sb.append(", applicantName=");
		sb.append(getApplicantName());
		sb.append(", applicantAddress=");
		sb.append(getApplicantAddress());
		sb.append(", productionPlantName=");
		sb.append(getProductionPlantName());
		sb.append(", productionPlantAddress=");
		sb.append(getProductionPlantAddress());
		sb.append(", modifyDate=");
		sb.append(getModifyDate());
		sb.append(", syncDate=");
		sb.append(getSyncDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(76);

		sb.append("<model><model-name>");
		sb.append("com.fds.vr.business.model.VRIssueEquipmentCertificate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mtCore</column-name><column-value><![CDATA[");
		sb.append(getMtCore());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierId</column-name><column-value><![CDATA[");
		sb.append(getDossierId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueId</column-name><column-value><![CDATA[");
		sb.append(getIssueId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issueVehicleCertificateId</column-name><column-value><![CDATA[");
		sb.append(getIssueVehicleCertificateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleCertificateRecordNo</column-name><column-value><![CDATA[");
		sb.append(getVehicleCertificateRecordNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipmentName</column-name><column-value><![CDATA[");
		sb.append(getEquipmentName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipmentType</column-name><column-value><![CDATA[");
		sb.append(getEquipmentType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipmentCertificateType</column-name><column-value><![CDATA[");
		sb.append(getEquipmentCertificateType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipmentDocumentNo</column-name><column-value><![CDATA[");
		sb.append(getEquipmentDocumentNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipmentCertificateRecordNo</column-name><column-value><![CDATA[");
		sb.append(getEquipmentCertificateRecordNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>equipmentExamRecordNo</column-name><column-value><![CDATA[");
		sb.append(getEquipmentExamRecordNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>EquipmentCertificateRecordId</column-name><column-value><![CDATA[");
		sb.append(getEquipmentCertificateRecordId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TotalQuantity</column-name><column-value><![CDATA[");
		sb.append(getTotalQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TotalProductUsed</column-name><column-value><![CDATA[");
		sb.append(getTotalProductUsed());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TotalInUse</column-name><column-value><![CDATA[");
		sb.append(getTotalInUse());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TotalNotUsed</column-name><column-value><![CDATA[");
		sb.append(getTotalNotUsed());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicantNo</column-name><column-value><![CDATA[");
		sb.append(getApplicantNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicantName</column-name><column-value><![CDATA[");
		sb.append(getApplicantName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicantAddress</column-name><column-value><![CDATA[");
		sb.append(getApplicantAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionPlantName</column-name><column-value><![CDATA[");
		sb.append(getProductionPlantName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>productionPlantAddress</column-name><column-value><![CDATA[");
		sb.append(getProductionPlantAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifyDate</column-name><column-value><![CDATA[");
		sb.append(getModifyDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>syncDate</column-name><column-value><![CDATA[");
		sb.append(getSyncDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VRIssueEquipmentCertificate.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VRIssueEquipmentCertificate.class
		};
	private long _id;
	private long _mtCore;
	private long _originalMtCore;
	private boolean _setOriginalMtCore;
	private long _dossierId;
	private long _originalDossierId;
	private boolean _setOriginalDossierId;
	private long _issueId;
	private long _originalIssueId;
	private boolean _setOriginalIssueId;
	private long _issueVehicleCertificateId;
	private long _originalIssueVehicleCertificateId;
	private boolean _setOriginalIssueVehicleCertificateId;
	private String _vehicleCertificateRecordNo;
	private String _originalVehicleCertificateRecordNo;
	private String _equipmentName;
	private String _equipmentType;
	private String _equipmentCertificateType;
	private String _equipmentDocumentNo;
	private String _equipmentCertificateRecordNo;
	private String _equipmentExamRecordNo;
	private int _EquipmentCertificateRecordId;
	private int _TotalQuantity;
	private int _TotalProductUsed;
	private int _TotalInUse;
	private int _TotalNotUsed;
	private String _applicantNo;
	private String _originalApplicantNo;
	private String _applicantName;
	private String _applicantAddress;
	private String _productionPlantName;
	private String _productionPlantAddress;
	private Date _modifyDate;
	private Date _syncDate;
	private long _columnBitmask;
	private VRIssueEquipmentCertificate _escapedModel;
}