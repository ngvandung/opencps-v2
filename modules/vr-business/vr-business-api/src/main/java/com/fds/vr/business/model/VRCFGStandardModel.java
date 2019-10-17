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
 * The base model interface for the VRCFGStandard service. Represents a row in the &quot;vr_cfg_standard&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRCFGStandardModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRCFGStandardImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRCFGStandard
 * @see com.fds.vr.business.model.impl.VRCFGStandardImpl
 * @see com.fds.vr.business.model.impl.VRCFGStandardModelImpl
 * @generated
 */
@ProviderType
public interface VRCFGStandardModel extends BaseModel<VRCFGStandard> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vrcfg standard model instance should use the {@link VRCFGStandard} interface instead.
	 */

	/**
	 * Returns the primary key of this vrcfg standard.
	 *
	 * @return the primary key of this vrcfg standard
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vrcfg standard.
	 *
	 * @param primaryKey the primary key of this vrcfg standard
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vrcfg standard.
	 *
	 * @return the ID of this vrcfg standard
	 */
	public long getId();

	/**
	 * Sets the ID of this vrcfg standard.
	 *
	 * @param id the ID of this vrcfg standard
	 */
	public void setId(long id);

	/**
	 * Returns the vehicle class of this vrcfg standard.
	 *
	 * @return the vehicle class of this vrcfg standard
	 */
	@AutoEscape
	public String getVehicleClass();

	/**
	 * Sets the vehicle class of this vrcfg standard.
	 *
	 * @param vehicleClass the vehicle class of this vrcfg standard
	 */
	public void setVehicleClass(String vehicleClass);

	/**
	 * Returns the vehicle type of this vrcfg standard.
	 *
	 * @return the vehicle type of this vrcfg standard
	 */
	@AutoEscape
	public String getVehicleType();

	/**
	 * Sets the vehicle type of this vrcfg standard.
	 *
	 * @param vehicleType the vehicle type of this vrcfg standard
	 */
	public void setVehicleType(String vehicleType);

	/**
	 * Returns the standard code of this vrcfg standard.
	 *
	 * @return the standard code of this vrcfg standard
	 */
	@AutoEscape
	public String getStandardCode();

	/**
	 * Sets the standard code of this vrcfg standard.
	 *
	 * @param standardCode the standard code of this vrcfg standard
	 */
	public void setStandardCode(String standardCode);

	/**
	 * Returns the standard name of this vrcfg standard.
	 *
	 * @return the standard name of this vrcfg standard
	 */
	@AutoEscape
	public String getStandardName();

	/**
	 * Sets the standard name of this vrcfg standard.
	 *
	 * @param standardName the standard name of this vrcfg standard
	 */
	public void setStandardName(String standardName);

	/**
	 * Returns the standard description of this vrcfg standard.
	 *
	 * @return the standard description of this vrcfg standard
	 */
	@AutoEscape
	public String getStandardDescription();

	/**
	 * Sets the standard description of this vrcfg standard.
	 *
	 * @param standardDescription the standard description of this vrcfg standard
	 */
	public void setStandardDescription(String standardDescription);

	/**
	 * Returns the standard expired date of this vrcfg standard.
	 *
	 * @return the standard expired date of this vrcfg standard
	 */
	public Date getStandardExpiredDate();

	/**
	 * Sets the standard expired date of this vrcfg standard.
	 *
	 * @param standardExpiredDate the standard expired date of this vrcfg standard
	 */
	public void setStandardExpiredDate(Date standardExpiredDate);

	/**
	 * Returns the sequence no of this vrcfg standard.
	 *
	 * @return the sequence no of this vrcfg standard
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vrcfg standard.
	 *
	 * @param sequenceNo the sequence no of this vrcfg standard
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the standard type of this vrcfg standard.
	 *
	 * @return the standard type of this vrcfg standard
	 */
	@AutoEscape
	public String getStandardType();

	/**
	 * Sets the standard type of this vrcfg standard.
	 *
	 * @param standardType the standard type of this vrcfg standard
	 */
	public void setStandardType(String standardType);

	/**
	 * Returns the modify date of this vrcfg standard.
	 *
	 * @return the modify date of this vrcfg standard
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vrcfg standard.
	 *
	 * @param modifyDate the modify date of this vrcfg standard
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vrcfg standard.
	 *
	 * @return the sync date of this vrcfg standard
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vrcfg standard.
	 *
	 * @param syncDate the sync date of this vrcfg standard
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
	public int compareTo(VRCFGStandard vrcfgStandard);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRCFGStandard> toCacheModel();

	@Override
	public VRCFGStandard toEscapedModel();

	@Override
	public VRCFGStandard toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}