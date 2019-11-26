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

import com.fds.vr.business.model.VRActionconfig;
import com.fds.vr.business.model.VRActionconfigModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the VRActionconfig service. Represents a row in the &quot;VRActionconfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link VRActionconfigModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VRActionconfigImpl}.
 * </p>
 *
 * @author LamTV
 * @see VRActionconfigImpl
 * @see VRActionconfig
 * @see VRActionconfigModel
 * @generated
 */
@ProviderType
public class VRActionconfigModelImpl extends BaseModelImpl<VRActionconfig>
	implements VRActionconfigModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vr actionconfig model instance should use the {@link VRActionconfig} interface instead.
	 */
	public static final String TABLE_NAME = "VRActionconfig";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "actionCode", Types.VARCHAR },
			{ "processNo", Types.VARCHAR },
			{ "status", Types.INTEGER },
			{ "vehicleClass", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id_", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("actionCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("processNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("vehicleClass", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table VRActionconfig (id_ LONG not null primary key,actionCode VARCHAR(75) null,processNo VARCHAR(75) null,status INTEGER,vehicleClass VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table VRActionconfig";
	public static final String ORDER_BY_JPQL = " ORDER BY vrActionconfig.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY VRActionconfig.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.fds.vr.business.model.VRActionconfig"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.fds.vr.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.fds.vr.business.model.VRActionconfig"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.fds.vr.service.util.ServiceProps.get(
				"lock.expiration.time.com.fds.vr.business.model.VRActionconfig"));

	public VRActionconfigModelImpl() {
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
		return VRActionconfig.class;
	}

	@Override
	public String getModelClassName() {
		return VRActionconfig.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("actionCode", getActionCode());
		attributes.put("processNo", getProcessNo());
		attributes.put("status", getStatus());
		attributes.put("vehicleClass", getVehicleClass());

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

		String actionCode = (String)attributes.get("actionCode");

		if (actionCode != null) {
			setActionCode(actionCode);
		}

		String processNo = (String)attributes.get("processNo");

		if (processNo != null) {
			setProcessNo(processNo);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		String vehicleClass = (String)attributes.get("vehicleClass");

		if (vehicleClass != null) {
			setVehicleClass(vehicleClass);
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
	public String getActionCode() {
		if (_actionCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _actionCode;
		}
	}

	@Override
	public void setActionCode(String actionCode) {
		_actionCode = actionCode;
	}

	@Override
	public String getProcessNo() {
		if (_processNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _processNo;
		}
	}

	@Override
	public void setProcessNo(String processNo) {
		_processNo = processNo;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	@Override
	public String getVehicleClass() {
		if (_vehicleClass == null) {
			return StringPool.BLANK;
		}
		else {
			return _vehicleClass;
		}
	}

	@Override
	public void setVehicleClass(String vehicleClass) {
		_vehicleClass = vehicleClass;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			VRActionconfig.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public VRActionconfig toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (VRActionconfig)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VRActionconfigImpl vrActionconfigImpl = new VRActionconfigImpl();

		vrActionconfigImpl.setId(getId());
		vrActionconfigImpl.setActionCode(getActionCode());
		vrActionconfigImpl.setProcessNo(getProcessNo());
		vrActionconfigImpl.setStatus(getStatus());
		vrActionconfigImpl.setVehicleClass(getVehicleClass());

		vrActionconfigImpl.resetOriginalValues();

		return vrActionconfigImpl;
	}

	@Override
	public int compareTo(VRActionconfig vrActionconfig) {
		long primaryKey = vrActionconfig.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRActionconfig)) {
			return false;
		}

		VRActionconfig vrActionconfig = (VRActionconfig)obj;

		long primaryKey = vrActionconfig.getPrimaryKey();

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
	}

	@Override
	public CacheModel<VRActionconfig> toCacheModel() {
		VRActionconfigCacheModel vrActionconfigCacheModel = new VRActionconfigCacheModel();

		vrActionconfigCacheModel.id = getId();

		vrActionconfigCacheModel.actionCode = getActionCode();

		String actionCode = vrActionconfigCacheModel.actionCode;

		if ((actionCode != null) && (actionCode.length() == 0)) {
			vrActionconfigCacheModel.actionCode = null;
		}

		vrActionconfigCacheModel.processNo = getProcessNo();

		String processNo = vrActionconfigCacheModel.processNo;

		if ((processNo != null) && (processNo.length() == 0)) {
			vrActionconfigCacheModel.processNo = null;
		}

		vrActionconfigCacheModel.status = getStatus();

		vrActionconfigCacheModel.vehicleClass = getVehicleClass();

		String vehicleClass = vrActionconfigCacheModel.vehicleClass;

		if ((vehicleClass != null) && (vehicleClass.length() == 0)) {
			vrActionconfigCacheModel.vehicleClass = null;
		}

		return vrActionconfigCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", actionCode=");
		sb.append(getActionCode());
		sb.append(", processNo=");
		sb.append(getProcessNo());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", vehicleClass=");
		sb.append(getVehicleClass());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.fds.vr.business.model.VRActionconfig");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>actionCode</column-name><column-value><![CDATA[");
		sb.append(getActionCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processNo</column-name><column-value><![CDATA[");
		sb.append(getProcessNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vehicleClass</column-name><column-value><![CDATA[");
		sb.append(getVehicleClass());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = VRActionconfig.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			VRActionconfig.class
		};
	private long _id;
	private String _actionCode;
	private String _processNo;
	private int _status;
	private String _vehicleClass;
	private VRActionconfig _escapedModel;
}