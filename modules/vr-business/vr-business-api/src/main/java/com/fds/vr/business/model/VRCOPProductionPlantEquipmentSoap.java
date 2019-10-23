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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author LamTV
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEquipmentSoap implements Serializable {
	public static VRCOPProductionPlantEquipmentSoap toSoapModel(
		VRCOPProductionPlantEquipment model) {
		VRCOPProductionPlantEquipmentSoap soapModel = new VRCOPProductionPlantEquipmentSoap();

		soapModel.setId(model.getId());
		soapModel.setMtCore(model.getMtCore());
		soapModel.setCopReportRepositoryID(model.getCopReportRepositoryID());
		soapModel.setCopReportNo(model.getCopReportNo());
		soapModel.setSequenceNo(model.getSequenceNo());
		soapModel.setEquipmentCode(model.getEquipmentCode());
		soapModel.setEquipmentName(model.getEquipmentName());
		soapModel.setEquipmentType(model.getEquipmentType());
		soapModel.setTrademark(model.getTrademark());
		soapModel.setTrademarkName(model.getTrademarkName());
		soapModel.setCommercialName(model.getCommercialName());
		soapModel.setModelCode(model.getModelCode());
		soapModel.setDesignSymbolNo(model.getDesignSymbolNo());
		soapModel.setProductionCountryCode(model.getProductionCountryCode());
		soapModel.setEquipmentStatus(model.getEquipmentStatus());
		soapModel.setExpireDate(model.getExpireDate());
		soapModel.setNotes(model.getNotes());
		soapModel.setModifyDate(model.getModifyDate());
		soapModel.setSyncDate(model.getSyncDate());
		soapModel.setEquipmentSerialNo(model.getEquipmentSerialNo());
		soapModel.setProductionYear(model.getProductionYear());
		soapModel.setRegistrationYear(model.getRegistrationYear());
		soapModel.setMarkupXCG(model.getMarkupXCG());
		soapModel.setMarkupXCGNK(model.getMarkupXCGNK());
		soapModel.setMarkupSMRM(model.getMarkupSMRM());
		soapModel.setMarkupXCH(model.getMarkupXCH());
		soapModel.setMarkupXCN(model.getMarkupXCN());
		soapModel.setMarkupXMY(model.getMarkupXMY());
		soapModel.setMarkupXDD(model.getMarkupXDD());
		soapModel.setTestingResult(model.getTestingResult());
		soapModel.setDescription(model.getDescription());
		soapModel.setInspectionRecordNumber(model.getInspectionRecordNumber());
		soapModel.setInspectionRecordDate(model.getInspectionRecordDate());
		soapModel.setExpiredDate(model.getExpiredDate());
		soapModel.setExpiredStatus(model.getExpiredStatus());
		soapModel.setStampTestingNo(model.getStampTestingNo());
		soapModel.setDossierId(model.getDossierId());
		soapModel.setDossierIdCTN(model.getDossierIdCTN());
		soapModel.setDossierNo(model.getDossierNo());
		soapModel.setProductionPlantId(model.getProductionPlantId());
		soapModel.setProductionPlantCode(model.getProductionPlantCode());

		return soapModel;
	}

	public static VRCOPProductionPlantEquipmentSoap[] toSoapModels(
		VRCOPProductionPlantEquipment[] models) {
		VRCOPProductionPlantEquipmentSoap[] soapModels = new VRCOPProductionPlantEquipmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VRCOPProductionPlantEquipmentSoap[][] toSoapModels(
		VRCOPProductionPlantEquipment[][] models) {
		VRCOPProductionPlantEquipmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VRCOPProductionPlantEquipmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VRCOPProductionPlantEquipmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VRCOPProductionPlantEquipmentSoap[] toSoapModels(
		List<VRCOPProductionPlantEquipment> models) {
		List<VRCOPProductionPlantEquipmentSoap> soapModels = new ArrayList<VRCOPProductionPlantEquipmentSoap>(models.size());

		for (VRCOPProductionPlantEquipment model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VRCOPProductionPlantEquipmentSoap[soapModels.size()]);
	}

	public VRCOPProductionPlantEquipmentSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getMtCore() {
		return _mtCore;
	}

	public void setMtCore(long mtCore) {
		_mtCore = mtCore;
	}

	public long getCopReportRepositoryID() {
		return _copReportRepositoryID;
	}

	public void setCopReportRepositoryID(long copReportRepositoryID) {
		_copReportRepositoryID = copReportRepositoryID;
	}

	public String getCopReportNo() {
		return _copReportNo;
	}

	public void setCopReportNo(String copReportNo) {
		_copReportNo = copReportNo;
	}

	public long getSequenceNo() {
		return _sequenceNo;
	}

	public void setSequenceNo(long sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	public String getEquipmentCode() {
		return _equipmentCode;
	}

	public void setEquipmentCode(String equipmentCode) {
		_equipmentCode = equipmentCode;
	}

	public String getEquipmentName() {
		return _equipmentName;
	}

	public void setEquipmentName(String equipmentName) {
		_equipmentName = equipmentName;
	}

	public String getEquipmentType() {
		return _equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		_equipmentType = equipmentType;
	}

	public String getTrademark() {
		return _trademark;
	}

	public void setTrademark(String trademark) {
		_trademark = trademark;
	}

	public String getTrademarkName() {
		return _trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		_trademarkName = trademarkName;
	}

	public String getCommercialName() {
		return _commercialName;
	}

	public void setCommercialName(String commercialName) {
		_commercialName = commercialName;
	}

	public String getModelCode() {
		return _modelCode;
	}

	public void setModelCode(String modelCode) {
		_modelCode = modelCode;
	}

	public String getDesignSymbolNo() {
		return _designSymbolNo;
	}

	public void setDesignSymbolNo(String designSymbolNo) {
		_designSymbolNo = designSymbolNo;
	}

	public String getProductionCountryCode() {
		return _productionCountryCode;
	}

	public void setProductionCountryCode(String productionCountryCode) {
		_productionCountryCode = productionCountryCode;
	}

	public String getEquipmentStatus() {
		return _equipmentStatus;
	}

	public void setEquipmentStatus(String equipmentStatus) {
		_equipmentStatus = equipmentStatus;
	}

	public Date getExpireDate() {
		return _expireDate;
	}

	public void setExpireDate(Date expireDate) {
		_expireDate = expireDate;
	}

	public String getNotes() {
		return _notes;
	}

	public void setNotes(String notes) {
		_notes = notes;
	}

	public Date getModifyDate() {
		return _modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		_modifyDate = modifyDate;
	}

	public Date getSyncDate() {
		return _syncDate;
	}

	public void setSyncDate(Date syncDate) {
		_syncDate = syncDate;
	}

	public String getEquipmentSerialNo() {
		return _equipmentSerialNo;
	}

	public void setEquipmentSerialNo(String equipmentSerialNo) {
		_equipmentSerialNo = equipmentSerialNo;
	}

	public Date getProductionYear() {
		return _productionYear;
	}

	public void setProductionYear(Date productionYear) {
		_productionYear = productionYear;
	}

	public Date getRegistrationYear() {
		return _registrationYear;
	}

	public void setRegistrationYear(Date registrationYear) {
		_registrationYear = registrationYear;
	}

	public long getMarkupXCG() {
		return _markupXCG;
	}

	public void setMarkupXCG(long markupXCG) {
		_markupXCG = markupXCG;
	}

	public long getMarkupXCGNK() {
		return _markupXCGNK;
	}

	public void setMarkupXCGNK(long markupXCGNK) {
		_markupXCGNK = markupXCGNK;
	}

	public long getMarkupSMRM() {
		return _markupSMRM;
	}

	public void setMarkupSMRM(long markupSMRM) {
		_markupSMRM = markupSMRM;
	}

	public long getMarkupXCH() {
		return _markupXCH;
	}

	public void setMarkupXCH(long markupXCH) {
		_markupXCH = markupXCH;
	}

	public long getMarkupXCN() {
		return _markupXCN;
	}

	public void setMarkupXCN(long markupXCN) {
		_markupXCN = markupXCN;
	}

	public long getMarkupXMY() {
		return _markupXMY;
	}

	public void setMarkupXMY(long markupXMY) {
		_markupXMY = markupXMY;
	}

	public long getMarkupXDD() {
		return _markupXDD;
	}

	public void setMarkupXDD(long markupXDD) {
		_markupXDD = markupXDD;
	}

	public int getTestingResult() {
		return _testingResult;
	}

	public void setTestingResult(int testingResult) {
		_testingResult = testingResult;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getInspectionRecordNumber() {
		return _inspectionRecordNumber;
	}

	public void setInspectionRecordNumber(String inspectionRecordNumber) {
		_inspectionRecordNumber = inspectionRecordNumber;
	}

	public Date getInspectionRecordDate() {
		return _inspectionRecordDate;
	}

	public void setInspectionRecordDate(Date inspectionRecordDate) {
		_inspectionRecordDate = inspectionRecordDate;
	}

	public Date getExpiredDate() {
		return _expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		_expiredDate = expiredDate;
	}

	public int getExpiredStatus() {
		return _expiredStatus;
	}

	public void setExpiredStatus(int expiredStatus) {
		_expiredStatus = expiredStatus;
	}

	public String getStampTestingNo() {
		return _stampTestingNo;
	}

	public void setStampTestingNo(String stampTestingNo) {
		_stampTestingNo = stampTestingNo;
	}

	public long getDossierId() {
		return _dossierId;
	}

	public void setDossierId(long dossierId) {
		_dossierId = dossierId;
	}

	public String getDossierIdCTN() {
		return _dossierIdCTN;
	}

	public void setDossierIdCTN(String dossierIdCTN) {
		_dossierIdCTN = dossierIdCTN;
	}

	public String getDossierNo() {
		return _dossierNo;
	}

	public void setDossierNo(String dossierNo) {
		_dossierNo = dossierNo;
	}

	public long getProductionPlantId() {
		return _productionPlantId;
	}

	public void setProductionPlantId(long productionPlantId) {
		_productionPlantId = productionPlantId;
	}

	public String getProductionPlantCode() {
		return _productionPlantCode;
	}

	public void setProductionPlantCode(String productionPlantCode) {
		_productionPlantCode = productionPlantCode;
	}

	private long _id;
	private long _mtCore;
	private long _copReportRepositoryID;
	private String _copReportNo;
	private long _sequenceNo;
	private String _equipmentCode;
	private String _equipmentName;
	private String _equipmentType;
	private String _trademark;
	private String _trademarkName;
	private String _commercialName;
	private String _modelCode;
	private String _designSymbolNo;
	private String _productionCountryCode;
	private String _equipmentStatus;
	private Date _expireDate;
	private String _notes;
	private Date _modifyDate;
	private Date _syncDate;
	private String _equipmentSerialNo;
	private Date _productionYear;
	private Date _registrationYear;
	private long _markupXCG;
	private long _markupXCGNK;
	private long _markupSMRM;
	private long _markupXCH;
	private long _markupXCN;
	private long _markupXMY;
	private long _markupXDD;
	private int _testingResult;
	private String _description;
	private String _inspectionRecordNumber;
	private Date _inspectionRecordDate;
	private Date _expiredDate;
	private int _expiredStatus;
	private String _stampTestingNo;
	private long _dossierId;
	private String _dossierIdCTN;
	private String _dossierNo;
	private long _productionPlantId;
	private String _productionPlantCode;
}