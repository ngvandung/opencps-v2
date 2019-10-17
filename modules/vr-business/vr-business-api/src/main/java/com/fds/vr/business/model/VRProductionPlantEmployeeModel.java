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
 * The base model interface for the VRProductionPlantEmployee service. Represents a row in the &quot;vr_productionplantemployee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.fds.vr.business.model.impl.VRProductionPlantEmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.fds.vr.business.model.impl.VRProductionPlantEmployeeImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRProductionPlantEmployee
 * @see com.fds.vr.business.model.impl.VRProductionPlantEmployeeImpl
 * @see com.fds.vr.business.model.impl.VRProductionPlantEmployeeModelImpl
 * @generated
 */
@ProviderType
public interface VRProductionPlantEmployeeModel extends BaseModel<VRProductionPlantEmployee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a vr production plant employee model instance should use the {@link VRProductionPlantEmployee} interface instead.
	 */

	/**
	 * Returns the primary key of this vr production plant employee.
	 *
	 * @return the primary key of this vr production plant employee
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this vr production plant employee.
	 *
	 * @param primaryKey the primary key of this vr production plant employee
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this vr production plant employee.
	 *
	 * @return the ID of this vr production plant employee
	 */
	public long getId();

	/**
	 * Sets the ID of this vr production plant employee.
	 *
	 * @param id the ID of this vr production plant employee
	 */
	public void setId(long id);

	/**
	 * Returns the mt core of this vr production plant employee.
	 *
	 * @return the mt core of this vr production plant employee
	 */
	public long getMtCore();

	/**
	 * Sets the mt core of this vr production plant employee.
	 *
	 * @param mtCore the mt core of this vr production plant employee
	 */
	public void setMtCore(long mtCore);

	/**
	 * Returns the product plant ID of this vr production plant employee.
	 *
	 * @return the product plant ID of this vr production plant employee
	 */
	public long getProductPlantID();

	/**
	 * Sets the product plant ID of this vr production plant employee.
	 *
	 * @param productPlantID the product plant ID of this vr production plant employee
	 */
	public void setProductPlantID(long productPlantID);

	/**
	 * Returns the sequence no of this vr production plant employee.
	 *
	 * @return the sequence no of this vr production plant employee
	 */
	public long getSequenceNo();

	/**
	 * Sets the sequence no of this vr production plant employee.
	 *
	 * @param sequenceNo the sequence no of this vr production plant employee
	 */
	public void setSequenceNo(long sequenceNo);

	/**
	 * Returns the employee name of this vr production plant employee.
	 *
	 * @return the employee name of this vr production plant employee
	 */
	@AutoEscape
	public String getEmployeeName();

	/**
	 * Sets the employee name of this vr production plant employee.
	 *
	 * @param employeeName the employee name of this vr production plant employee
	 */
	public void setEmployeeName(String employeeName);

	/**
	 * Returns the employee certificate no of this vr production plant employee.
	 *
	 * @return the employee certificate no of this vr production plant employee
	 */
	@AutoEscape
	public String getEmployeeCertificateNo();

	/**
	 * Sets the employee certificate no of this vr production plant employee.
	 *
	 * @param employeeCertificateNo the employee certificate no of this vr production plant employee
	 */
	public void setEmployeeCertificateNo(String employeeCertificateNo);

	/**
	 * Returns the trainning at of this vr production plant employee.
	 *
	 * @return the trainning at of this vr production plant employee
	 */
	@AutoEscape
	public String getTrainningAt();

	/**
	 * Sets the trainning at of this vr production plant employee.
	 *
	 * @param trainningAt the trainning at of this vr production plant employee
	 */
	public void setTrainningAt(String trainningAt);

	/**
	 * Returns the modify date of this vr production plant employee.
	 *
	 * @return the modify date of this vr production plant employee
	 */
	public Date getModifyDate();

	/**
	 * Sets the modify date of this vr production plant employee.
	 *
	 * @param modifyDate the modify date of this vr production plant employee
	 */
	public void setModifyDate(Date modifyDate);

	/**
	 * Returns the sync date of this vr production plant employee.
	 *
	 * @return the sync date of this vr production plant employee
	 */
	public Date getSyncDate();

	/**
	 * Sets the sync date of this vr production plant employee.
	 *
	 * @param syncDate the sync date of this vr production plant employee
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
	public int compareTo(VRProductionPlantEmployee vrProductionPlantEmployee);

	@Override
	public int hashCode();

	@Override
	public CacheModel<VRProductionPlantEmployee> toCacheModel();

	@Override
	public VRProductionPlantEmployee toEscapedModel();

	@Override
	public VRProductionPlantEmployee toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}