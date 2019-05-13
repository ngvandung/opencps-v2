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

package org.opencps.dossiermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import org.opencps.dossiermgt.model.ProcessPlugin;
import org.opencps.dossiermgt.model.ProcessPluginModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ProcessPlugin service. Represents a row in the &quot;opencps_process_plugin&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link ProcessPluginModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProcessPluginImpl}.
 * </p>
 *
 * @author huymq
 * @see ProcessPluginImpl
 * @see ProcessPlugin
 * @see ProcessPluginModel
 * @generated
 */
@ProviderType
public class ProcessPluginModelImpl extends BaseModelImpl<ProcessPlugin>
	implements ProcessPluginModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a process plugin model instance should use the {@link ProcessPlugin} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_process_plugin";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "processPluginId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "stepCode", Types.VARCHAR },
			{ "serviceProcessId", Types.BIGINT },
			{ "pluginName", Types.VARCHAR },
			{ "sequenceNo", Types.VARCHAR },
			{ "pluginForm", Types.VARCHAR },
			{ "sampleData", Types.VARCHAR },
			{ "autoRun", Types.BOOLEAN }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("processPluginId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("stepCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("serviceProcessId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("pluginName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sequenceNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("pluginForm", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sampleData", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("autoRun", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE = "create table opencps_process_plugin (uuid_ VARCHAR(75) null,processPluginId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,stepCode VARCHAR(75) null,serviceProcessId LONG,pluginName VARCHAR(75) null,sequenceNo VARCHAR(75) null,pluginForm VARCHAR(75) null,sampleData VARCHAR(75) null,autoRun BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table opencps_process_plugin";
	public static final String ORDER_BY_JPQL = " ORDER BY processPlugin.processPluginId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_process_plugin.processPluginId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.dossiermgt.model.ProcessPlugin"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.dossiermgt.model.ProcessPlugin"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.opencps.dossiermgt.model.ProcessPlugin"),
			true);
	public static final long AUTORUN_COLUMN_BITMASK = 1L;
	public static final long COMPANYID_COLUMN_BITMASK = 2L;
	public static final long GROUPID_COLUMN_BITMASK = 4L;
	public static final long SERVICEPROCESSID_COLUMN_BITMASK = 8L;
	public static final long STEPCODE_COLUMN_BITMASK = 16L;
	public static final long UUID_COLUMN_BITMASK = 32L;
	public static final long PROCESSPLUGINID_COLUMN_BITMASK = 64L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(org.opencps.backend.dossiermgt.service.util.ServiceProps.get(
				"lock.expiration.time.org.opencps.dossiermgt.model.ProcessPlugin"));

	public ProcessPluginModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _processPluginId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setProcessPluginId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _processPluginId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ProcessPlugin.class;
	}

	@Override
	public String getModelClassName() {
		return ProcessPlugin.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("processPluginId", getProcessPluginId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("stepCode", getStepCode());
		attributes.put("serviceProcessId", getServiceProcessId());
		attributes.put("pluginName", getPluginName());
		attributes.put("sequenceNo", getSequenceNo());
		attributes.put("pluginForm", getPluginForm());
		attributes.put("sampleData", getSampleData());
		attributes.put("autoRun", getAutoRun());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long processPluginId = (Long)attributes.get("processPluginId");

		if (processPluginId != null) {
			setProcessPluginId(processPluginId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String stepCode = (String)attributes.get("stepCode");

		if (stepCode != null) {
			setStepCode(stepCode);
		}

		Long serviceProcessId = (Long)attributes.get("serviceProcessId");

		if (serviceProcessId != null) {
			setServiceProcessId(serviceProcessId);
		}

		String pluginName = (String)attributes.get("pluginName");

		if (pluginName != null) {
			setPluginName(pluginName);
		}

		String sequenceNo = (String)attributes.get("sequenceNo");

		if (sequenceNo != null) {
			setSequenceNo(sequenceNo);
		}

		String pluginForm = (String)attributes.get("pluginForm");

		if (pluginForm != null) {
			setPluginForm(pluginForm);
		}

		String sampleData = (String)attributes.get("sampleData");

		if (sampleData != null) {
			setSampleData(sampleData);
		}

		Boolean autoRun = (Boolean)attributes.get("autoRun");

		if (autoRun != null) {
			setAutoRun(autoRun);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getProcessPluginId() {
		return _processPluginId;
	}

	@Override
	public void setProcessPluginId(long processPluginId) {
		_processPluginId = processPluginId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@Override
	public String getStepCode() {
		if (_stepCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _stepCode;
		}
	}

	@Override
	public void setStepCode(String stepCode) {
		_columnBitmask |= STEPCODE_COLUMN_BITMASK;

		if (_originalStepCode == null) {
			_originalStepCode = _stepCode;
		}

		_stepCode = stepCode;
	}

	public String getOriginalStepCode() {
		return GetterUtil.getString(_originalStepCode);
	}

	@Override
	public long getServiceProcessId() {
		return _serviceProcessId;
	}

	@Override
	public void setServiceProcessId(long serviceProcessId) {
		_columnBitmask |= SERVICEPROCESSID_COLUMN_BITMASK;

		if (!_setOriginalServiceProcessId) {
			_setOriginalServiceProcessId = true;

			_originalServiceProcessId = _serviceProcessId;
		}

		_serviceProcessId = serviceProcessId;
	}

	public long getOriginalServiceProcessId() {
		return _originalServiceProcessId;
	}

	@Override
	public String getPluginName() {
		if (_pluginName == null) {
			return StringPool.BLANK;
		}
		else {
			return _pluginName;
		}
	}

	@Override
	public void setPluginName(String pluginName) {
		_pluginName = pluginName;
	}

	@Override
	public String getSequenceNo() {
		if (_sequenceNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _sequenceNo;
		}
	}

	@Override
	public void setSequenceNo(String sequenceNo) {
		_sequenceNo = sequenceNo;
	}

	@Override
	public String getPluginForm() {
		if (_pluginForm == null) {
			return StringPool.BLANK;
		}
		else {
			return _pluginForm;
		}
	}

	@Override
	public void setPluginForm(String pluginForm) {
		_pluginForm = pluginForm;
	}

	@Override
	public String getSampleData() {
		if (_sampleData == null) {
			return StringPool.BLANK;
		}
		else {
			return _sampleData;
		}
	}

	@Override
	public void setSampleData(String sampleData) {
		_sampleData = sampleData;
	}

	@Override
	public boolean getAutoRun() {
		return _autoRun;
	}

	@Override
	public boolean isAutoRun() {
		return _autoRun;
	}

	@Override
	public void setAutoRun(boolean autoRun) {
		_columnBitmask |= AUTORUN_COLUMN_BITMASK;

		if (!_setOriginalAutoRun) {
			_setOriginalAutoRun = true;

			_originalAutoRun = _autoRun;
		}

		_autoRun = autoRun;
	}

	public boolean getOriginalAutoRun() {
		return _originalAutoRun;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				ProcessPlugin.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ProcessPlugin.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ProcessPlugin toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ProcessPlugin)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ProcessPluginImpl processPluginImpl = new ProcessPluginImpl();

		processPluginImpl.setUuid(getUuid());
		processPluginImpl.setProcessPluginId(getProcessPluginId());
		processPluginImpl.setCompanyId(getCompanyId());
		processPluginImpl.setGroupId(getGroupId());
		processPluginImpl.setUserId(getUserId());
		processPluginImpl.setUserName(getUserName());
		processPluginImpl.setCreateDate(getCreateDate());
		processPluginImpl.setModifiedDate(getModifiedDate());
		processPluginImpl.setStepCode(getStepCode());
		processPluginImpl.setServiceProcessId(getServiceProcessId());
		processPluginImpl.setPluginName(getPluginName());
		processPluginImpl.setSequenceNo(getSequenceNo());
		processPluginImpl.setPluginForm(getPluginForm());
		processPluginImpl.setSampleData(getSampleData());
		processPluginImpl.setAutoRun(getAutoRun());

		processPluginImpl.resetOriginalValues();

		return processPluginImpl;
	}

	@Override
	public int compareTo(ProcessPlugin processPlugin) {
		long primaryKey = processPlugin.getPrimaryKey();

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

		if (!(obj instanceof ProcessPlugin)) {
			return false;
		}

		ProcessPlugin processPlugin = (ProcessPlugin)obj;

		long primaryKey = processPlugin.getPrimaryKey();

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
		ProcessPluginModelImpl processPluginModelImpl = this;

		processPluginModelImpl._originalUuid = processPluginModelImpl._uuid;

		processPluginModelImpl._originalCompanyId = processPluginModelImpl._companyId;

		processPluginModelImpl._setOriginalCompanyId = false;

		processPluginModelImpl._originalGroupId = processPluginModelImpl._groupId;

		processPluginModelImpl._setOriginalGroupId = false;

		processPluginModelImpl._setModifiedDate = false;

		processPluginModelImpl._originalStepCode = processPluginModelImpl._stepCode;

		processPluginModelImpl._originalServiceProcessId = processPluginModelImpl._serviceProcessId;

		processPluginModelImpl._setOriginalServiceProcessId = false;

		processPluginModelImpl._originalAutoRun = processPluginModelImpl._autoRun;

		processPluginModelImpl._setOriginalAutoRun = false;

		processPluginModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ProcessPlugin> toCacheModel() {
		ProcessPluginCacheModel processPluginCacheModel = new ProcessPluginCacheModel();

		processPluginCacheModel.uuid = getUuid();

		String uuid = processPluginCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			processPluginCacheModel.uuid = null;
		}

		processPluginCacheModel.processPluginId = getProcessPluginId();

		processPluginCacheModel.companyId = getCompanyId();

		processPluginCacheModel.groupId = getGroupId();

		processPluginCacheModel.userId = getUserId();

		processPluginCacheModel.userName = getUserName();

		String userName = processPluginCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			processPluginCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			processPluginCacheModel.createDate = createDate.getTime();
		}
		else {
			processPluginCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			processPluginCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			processPluginCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		processPluginCacheModel.stepCode = getStepCode();

		String stepCode = processPluginCacheModel.stepCode;

		if ((stepCode != null) && (stepCode.length() == 0)) {
			processPluginCacheModel.stepCode = null;
		}

		processPluginCacheModel.serviceProcessId = getServiceProcessId();

		processPluginCacheModel.pluginName = getPluginName();

		String pluginName = processPluginCacheModel.pluginName;

		if ((pluginName != null) && (pluginName.length() == 0)) {
			processPluginCacheModel.pluginName = null;
		}

		processPluginCacheModel.sequenceNo = getSequenceNo();

		String sequenceNo = processPluginCacheModel.sequenceNo;

		if ((sequenceNo != null) && (sequenceNo.length() == 0)) {
			processPluginCacheModel.sequenceNo = null;
		}

		processPluginCacheModel.pluginForm = getPluginForm();

		String pluginForm = processPluginCacheModel.pluginForm;

		if ((pluginForm != null) && (pluginForm.length() == 0)) {
			processPluginCacheModel.pluginForm = null;
		}

		processPluginCacheModel.sampleData = getSampleData();

		String sampleData = processPluginCacheModel.sampleData;

		if ((sampleData != null) && (sampleData.length() == 0)) {
			processPluginCacheModel.sampleData = null;
		}

		processPluginCacheModel.autoRun = getAutoRun();

		return processPluginCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", processPluginId=");
		sb.append(getProcessPluginId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", stepCode=");
		sb.append(getStepCode());
		sb.append(", serviceProcessId=");
		sb.append(getServiceProcessId());
		sb.append(", pluginName=");
		sb.append(getPluginName());
		sb.append(", sequenceNo=");
		sb.append(getSequenceNo());
		sb.append(", pluginForm=");
		sb.append(getPluginForm());
		sb.append(", sampleData=");
		sb.append(getSampleData());
		sb.append(", autoRun=");
		sb.append(getAutoRun());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("org.opencps.dossiermgt.model.ProcessPlugin");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>processPluginId</column-name><column-value><![CDATA[");
		sb.append(getProcessPluginId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stepCode</column-name><column-value><![CDATA[");
		sb.append(getStepCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceProcessId</column-name><column-value><![CDATA[");
		sb.append(getServiceProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pluginName</column-name><column-value><![CDATA[");
		sb.append(getPluginName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sequenceNo</column-name><column-value><![CDATA[");
		sb.append(getSequenceNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pluginForm</column-name><column-value><![CDATA[");
		sb.append(getPluginForm());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sampleData</column-name><column-value><![CDATA[");
		sb.append(getSampleData());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>autoRun</column-name><column-value><![CDATA[");
		sb.append(getAutoRun());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = ProcessPlugin.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			ProcessPlugin.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _processPluginId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _stepCode;
	private String _originalStepCode;
	private long _serviceProcessId;
	private long _originalServiceProcessId;
	private boolean _setOriginalServiceProcessId;
	private String _pluginName;
	private String _sequenceNo;
	private String _pluginForm;
	private String _sampleData;
	private boolean _autoRun;
	private boolean _originalAutoRun;
	private boolean _setOriginalAutoRun;
	private long _columnBitmask;
	private ProcessPlugin _escapedModel;
}