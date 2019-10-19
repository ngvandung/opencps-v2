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

package com.fds.vr.cop.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link VRCOPReportAttach}.
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPReportAttach
 * @generated
 */
@ProviderType
public class VRCOPReportAttachWrapper implements VRCOPReportAttach,
	ModelWrapper<VRCOPReportAttach> {
	public VRCOPReportAttachWrapper(VRCOPReportAttach vrcopReportAttach) {
		_vrcopReportAttach = vrcopReportAttach;
	}

	@Override
	public Class<?> getModelClass() {
		return VRCOPReportAttach.class;
	}

	@Override
	public String getModelClassName() {
		return VRCOPReportAttach.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mtCore", getMtCore());
		attributes.put("COPReportRepositoryID", getCOPReportRepositoryID());
		attributes.put("COPReportNo", getCOPReportNo());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("docName", getDocName());
		attributes.put("docNo", getDocNo());
		attributes.put("remarks", getRemarks());
		attributes.put("modifyDate", getModifyDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer mtCore = (Integer)attributes.get("mtCore");

		if (mtCore != null) {
			setMtCore(mtCore);
		}

		Long COPReportRepositoryID = (Long)attributes.get(
				"COPReportRepositoryID");

		if (COPReportRepositoryID != null) {
			setCOPReportRepositoryID(COPReportRepositoryID);
		}

		String COPReportNo = (String)attributes.get("COPReportNo");

		if (COPReportNo != null) {
			setCOPReportNo(COPReportNo);
		}

		Long sequenceNo = (Long)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String docName = (String)attributes.get("docName");

		if (docName != null) {
			setDocName(docName);
		}

		String docNo = (String)attributes.get("docNo");

		if (docNo != null) {
			setDocNo(docNo);
		}

		String remarks = (String)attributes.get("remarks");

		if (remarks != null) {
			setRemarks(remarks);
		}

		Date modifyDate = (Date)attributes.get("modifyDate");

		if (modifyDate != null) {
			setModifyDate(modifyDate);
		}
	}

	@Override
	public VRCOPReportAttach toEscapedModel() {
		return new VRCOPReportAttachWrapper(_vrcopReportAttach.toEscapedModel());
	}

	@Override
	public VRCOPReportAttach toUnescapedModel() {
		return new VRCOPReportAttachWrapper(_vrcopReportAttach.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _vrcopReportAttach.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _vrcopReportAttach.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _vrcopReportAttach.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _vrcopReportAttach.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<VRCOPReportAttach> toCacheModel() {
		return _vrcopReportAttach.toCacheModel();
	}

	@Override
	public int compareTo(VRCOPReportAttach vrcopReportAttach) {
		return _vrcopReportAttach.compareTo(vrcopReportAttach);
	}

	/**
	* Returns the mt core of this vrcop report attach.
	*
	* @return the mt core of this vrcop report attach
	*/
	@Override
	public int getMtCore() {
		return _vrcopReportAttach.getMtCore();
	}

	@Override
	public int hashCode() {
		return _vrcopReportAttach.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vrcopReportAttach.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new VRCOPReportAttachWrapper((VRCOPReportAttach)_vrcopReportAttach.clone());
	}

	/**
	* Returns the cop report no of this vrcop report attach.
	*
	* @return the cop report no of this vrcop report attach
	*/
	@Override
	public java.lang.String getCOPReportNo() {
		return _vrcopReportAttach.getCOPReportNo();
	}

	/**
	* Returns the doc name of this vrcop report attach.
	*
	* @return the doc name of this vrcop report attach
	*/
	@Override
	public java.lang.String getDocName() {
		return _vrcopReportAttach.getDocName();
	}

	/**
	* Returns the doc no of this vrcop report attach.
	*
	* @return the doc no of this vrcop report attach
	*/
	@Override
	public java.lang.String getDocNo() {
		return _vrcopReportAttach.getDocNo();
	}

	/**
	* Returns the remarks of this vrcop report attach.
	*
	* @return the remarks of this vrcop report attach
	*/
	@Override
	public java.lang.String getRemarks() {
		return _vrcopReportAttach.getRemarks();
	}

	@Override
	public java.lang.String toString() {
		return _vrcopReportAttach.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _vrcopReportAttach.toXmlString();
	}

	/**
	* Returns the modify date of this vrcop report attach.
	*
	* @return the modify date of this vrcop report attach
	*/
	@Override
	public Date getModifyDate() {
		return _vrcopReportAttach.getModifyDate();
	}

	/**
	* Returns the cop report repository ID of this vrcop report attach.
	*
	* @return the cop report repository ID of this vrcop report attach
	*/
	@Override
	public long getCOPReportRepositoryID() {
		return _vrcopReportAttach.getCOPReportRepositoryID();
	}

	/**
	* Returns the ID of this vrcop report attach.
	*
	* @return the ID of this vrcop report attach
	*/
	@Override
	public long getId() {
		return _vrcopReportAttach.getId();
	}

	/**
	* Returns the primary key of this vrcop report attach.
	*
	* @return the primary key of this vrcop report attach
	*/
	@Override
	public long getPrimaryKey() {
		return _vrcopReportAttach.getPrimaryKey();
	}

	/**
	* Returns the sequence no of this vrcop report attach.
	*
	* @return the sequence no of this vrcop report attach
	*/
	@Override
	public long getSequenceNo() {
		return _vrcopReportAttach.getSequenceNo();
	}

	@Override
	public void persist() {
		_vrcopReportAttach.persist();
	}

	/**
	* Sets the cop report no of this vrcop report attach.
	*
	* @param COPReportNo the cop report no of this vrcop report attach
	*/
	@Override
	public void setCOPReportNo(java.lang.String COPReportNo) {
		_vrcopReportAttach.setCOPReportNo(COPReportNo);
	}

	/**
	* Sets the cop report repository ID of this vrcop report attach.
	*
	* @param COPReportRepositoryID the cop report repository ID of this vrcop report attach
	*/
	@Override
	public void setCOPReportRepositoryID(long COPReportRepositoryID) {
		_vrcopReportAttach.setCOPReportRepositoryID(COPReportRepositoryID);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_vrcopReportAttach.setCachedModel(cachedModel);
	}

	/**
	* Sets the doc name of this vrcop report attach.
	*
	* @param docName the doc name of this vrcop report attach
	*/
	@Override
	public void setDocName(java.lang.String docName) {
		_vrcopReportAttach.setDocName(docName);
	}

	/**
	* Sets the doc no of this vrcop report attach.
	*
	* @param docNo the doc no of this vrcop report attach
	*/
	@Override
	public void setDocNo(java.lang.String docNo) {
		_vrcopReportAttach.setDocNo(docNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_vrcopReportAttach.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_vrcopReportAttach.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_vrcopReportAttach.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the ID of this vrcop report attach.
	*
	* @param id the ID of this vrcop report attach
	*/
	@Override
	public void setId(long id) {
		_vrcopReportAttach.setId(id);
	}

	/**
	* Sets the modify date of this vrcop report attach.
	*
	* @param modifyDate the modify date of this vrcop report attach
	*/
	@Override
	public void setModifyDate(Date modifyDate) {
		_vrcopReportAttach.setModifyDate(modifyDate);
	}

	/**
	* Sets the mt core of this vrcop report attach.
	*
	* @param mtCore the mt core of this vrcop report attach
	*/
	@Override
	public void setMtCore(int mtCore) {
		_vrcopReportAttach.setMtCore(mtCore);
	}

	@Override
	public void setNew(boolean n) {
		_vrcopReportAttach.setNew(n);
	}

	/**
	* Sets the primary key of this vrcop report attach.
	*
	* @param primaryKey the primary key of this vrcop report attach
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_vrcopReportAttach.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_vrcopReportAttach.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the remarks of this vrcop report attach.
	*
	* @param remarks the remarks of this vrcop report attach
	*/
	@Override
	public void setRemarks(java.lang.String remarks) {
		_vrcopReportAttach.setRemarks(remarks);
	}

	/**
	* Sets the sequence no of this vrcop report attach.
	*
	* @param sequenceNo the sequence no of this vrcop report attach
	*/
	@Override
	public void setSequenceNo(long sequenceNo) {
		_vrcopReportAttach.setSequenceNo(sequenceNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRCOPReportAttachWrapper)) {
			return false;
		}

		VRCOPReportAttachWrapper vrcopReportAttachWrapper = (VRCOPReportAttachWrapper)obj;

		if (Objects.equals(_vrcopReportAttach,
					vrcopReportAttachWrapper._vrcopReportAttach)) {
			return true;
		}

		return false;
	}

	@Override
	public VRCOPReportAttach getWrappedModel() {
		return _vrcopReportAttach;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _vrcopReportAttach.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _vrcopReportAttach.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_vrcopReportAttach.resetOriginalValues();
	}

	private final VRCOPReportAttach _vrcopReportAttach;
}