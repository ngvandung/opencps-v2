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
 * The base model interface for the VRCOPProdEquipment service. Represents a row in the &quot;vr_copproductionplantprodequipment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRCOPProdEquipmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRCOPProdEquipmentImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRCOPProdEquipment
 * @see com.fds.vr.business.model.impl.VRCOPProdEquipmentImpl
 * @see com.fds.vr.business.model.impl.VRCOPProdEquipmentModelImpl
 * @generated
 */
@ProviderType
public interface VRCOPProdEquipmentModel extends BaseModel<VRCOPProdEquipment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vrcop prod equipment model instance should use the {@link VRCOPProdEquipment} interface instead.
	 */

	/**
	 * Returns the primary key of this vrcop prod equipment.
	 *
	 * @return the primary key of this vrcop prod equipment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vrcop prod equipment.
	 *
	 * @param primaryKey the primary key of this vrcop prod equipment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vrcop prod equipment.
	 *
	 * @return the ID of this vrcop prod equipment
	 */
	public long getId();

	/**
	 * Sets the ID of this vrcop prod equipment.
	 *
	 * @param id the ID of this vrcop prod equipment
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vrcop prod equipment.
	 *
	 * @return the mt core of this vrcop prod equipment
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vrcop prod equipment.
	 *
	 * @param mtCore the mt core of this vrcop prod equipment
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the cop report repository ID of this vrcop prod equipment.
	 *
	 * @return the cop report repository ID of this vrcop prod equipment
	 */
	public long getCopReportRepositoryID();

	/**
	 * Sets the cop report repository ID of this vrcop prod equipment.
	 *
	 * @param copReportRepositoryID the cop report repository ID of this vrcop prod equipment
	 */
	public void setCopReportRepositoryID(long copReportRepositoryID);

	/**
	 * Returns the cop report no of this vrcop prod equipment.
	 *
	 * @return the cop report no of this vrcop prod equipment
	 */
	@AutoEscape
	public String getCopReportNo();

	/**
	 * Sets the cop report no of this vrcop prod equipment.
	 *
	 * @param copReportNo the cop report no of this vrcop prod equipment
	 */
	public void setCopReportNo(String copReportNo);

	/**
	 * Returns the sequence no of this vrcop prod equipment.
	 *
	 * @return the sequence no of this vrcop prod equipment
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vrcop prod equipment.
	 *
	 * @param sequenceNo the sequence no of this vrcop prod equipment
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the equipment code of this vrcop prod equipment.
	 *
	 * @return the equipment code of this vrcop prod equipment
	 */
	@AutoEscape
	public String getEquipmentCode();

	/**
	 * Sets the equipment code of this vrcop prod equipment.
	 *
	 * @param equipmentCode the equipment code of this vrcop prod equipment
	 */
	public void setEquipmentCode(String equipmentCode);

	/**
	 * Returns the equipment name of this vrcop prod equipment.
	 *
	 * @return the equipment name of this vrcop prod equipment
	 */
	@AutoEscape
	public String getEquipmentName();

	/**
	 * Sets the equipment name of this vrcop prod equipment.
	 *
	 * @param equipmentName the equipment name of this vrcop prod equipment
	 */
	public void setEquipmentName(String equipmentName);

	/**
	 * Returns the equipment type of this vrcop prod equipment.
	 *
	 * @return the equipment type of this vrcop prod equipment
	 */
	@AutoEscape
	public String getEquipmentType();

	/**
	 * Sets the equipment type of this vrcop prod equipment.
	 *
	 * @param equipmentType the equipment type of this vrcop prod equipment
	 */
	public void setEquipmentType(String equipmentType);

	/**
	 * Returns the trademark of this vrcop prod equipment.
	 *
	 * @return the trademark of this vrcop prod equipment
	 */
	@AutoEscape
	public String getTrademark();

	/**
	 * Sets the trademark of this vrcop prod equipment.
	 *
	 * @param trademark the trademark of this vrcop prod equipment
	 */
	public void setTrademark(String trademark);

	/**
	 * Returns the trademark name of this vrcop prod equipment.
	 *
	 * @return the trademark name of this vrcop prod equipment
	 */
	@AutoEscape
	public String getTrademarkName();

	/**
	 * Sets the trademark name of this vrcop prod equipment.
	 *
	 * @param trademarkName the trademark name of this vrcop prod equipment
	 */
	public void setTrademarkName(String trademarkName);

	/**
	 * Returns the commercial name of this vrcop prod equipment.
	 *
	 * @return the commercial name of this vrcop prod equipment
	 */
	@AutoEscape
	public String getCommercialName();

	/**
	 * Sets the commercial name of this vrcop prod equipment.
	 *
	 * @param commercialName the commercial name of this vrcop prod equipment
	 */
	public void setCommercialName(String commercialName);

	/**
	 * Returns the model code of this vrcop prod equipment.
	 *
	 * @return the model code of this vrcop prod equipment
	 */
	@AutoEscape
	public String getModelCode();

	/**
	 * Sets the model code of this vrcop prod equipment.
	 *
	 * @param modelCode the model code of this vrcop prod equipment
	 */
	public void setModelCode(String modelCode);

	/**
	 * Returns the design symbol no of this vrcop prod equipment.
	 *
	 * @return the design symbol no of this vrcop prod equipment
	 */
	@AutoEscape
	public String getDesignSymbolNo();

	/**
	 * Sets the design symbol no of this vrcop prod equipment.
	 *
	 * @param designSymbolNo the design symbol no of this vrcop prod equipment
	 */
	public void setDesignSymbolNo(String designSymbolNo);

	/**
	 * Returns the production country code of this vrcop prod equipment.
	 *
	 * @return the production country code of this vrcop prod equipment
	 */
	@AutoEscape
	public String getProductionCountryCode();

	/**
	 * Sets the production country code of this vrcop prod equipment.
	 *
	 * @param productionCountryCode the production country code of this vrcop prod equipment
	 */
	public void setProductionCountryCode(String productionCountryCode);

	/**
	 * Returns the equipment status of this vrcop prod equipment.
	 *
	 * @return the equipment status of this vrcop prod equipment
	 */
	@AutoEscape
	public String getEquipmentStatus();

	/**
	 * Sets the equipment status of this vrcop prod equipment.
	 *
	 * @param equipmentStatus the equipment status of this vrcop prod equipment
	 */
	public void setEquipmentStatus(String equipmentStatus);

	/**
	 * Returns the notes of this vrcop prod equipment.
	 *
	 * @return the notes of this vrcop prod equipment
	 */
	@AutoEscape
	public String getNotes();

	/**
	 * Sets the notes of this vrcop prod equipment.
	 *
	 * @param notes the notes of this vrcop prod equipment
	 */
	public void setNotes(String notes);

	/**
	 * Returns the modify date of this vrcop prod equipment.
	 *
	 * @return the modify date of this vrcop prod equipment
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vrcop prod equipment.
	 *
	 * @param modifyDate the modify date of this vrcop prod equipment
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vrcop prod equipment.
	 *
	 * @return the sync date of this vrcop prod equipment
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vrcop prod equipment.
	 *
	 * @param syncDate the sync date of this vrcop prod equipment
	 */
	public void setSyncDate(Date syncDate);

	/**
	 * Returns the quantity of this vrcop prod equipment.
	 *
	 * @return the quantity of this vrcop prod equipment
	 */
	public int getQuantity();

	/**
	 * Sets the quantity of this vrcop prod equipment.
	 *
	 * @param quantity the quantity of this vrcop prod equipment
	 */
	public void setQuantity(int quantity);

	/**
	 * Returns the dossier ID of this vrcop prod equipment.
	 *
	 * @return the dossier ID of this vrcop prod equipment
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this vrcop prod equipment.
	 *
	 * @param dossierId the dossier ID of this vrcop prod equipment
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the dossier ID ctn of this vrcop prod equipment.
	 *
	 * @return the dossier ID ctn of this vrcop prod equipment
	 */
	@AutoEscape
	public String getDossierIdCTN();

	/**
	 * Sets the dossier ID ctn of this vrcop prod equipment.
	 *
	 * @param dossierIdCTN the dossier ID ctn of this vrcop prod equipment
	 */
	public void setDossierIdCTN(String dossierIdCTN);

	/**
	 * Returns the dossier no of this vrcop prod equipment.
	 *
	 * @return the dossier no of this vrcop prod equipment
	 */
	@AutoEscape
	public String getDossierNo();

	/**
	 * Sets the dossier no of this vrcop prod equipment.
	 *
	 * @param dossierNo the dossier no of this vrcop prod equipment
	 */
	public void setDossierNo(String dossierNo);

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
	public int compareTo(VRCOPProdEquipment vrcopProdEquipment);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRCOPProdEquipment> toCacheModel();

	@Override
	public VRCOPProdEquipment toEscapedModel();

	@Override
	public VRCOPProdEquipment toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}