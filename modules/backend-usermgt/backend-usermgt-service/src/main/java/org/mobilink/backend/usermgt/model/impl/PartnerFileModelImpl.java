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

package org.mobilink.backend.usermgt.model.impl;

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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import org.mobilink.backend.usermgt.model.PartnerFile;
import org.mobilink.backend.usermgt.model.PartnerFileModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the PartnerFile service. Represents a row in the &quot;m_partnerFile&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link PartnerFileModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PartnerFileImpl}.
 * </p>
 *
 * @author Binhth
 * @see PartnerFileImpl
 * @see PartnerFile
 * @see PartnerFileModel
 * @generated
 */
@ProviderType
public class PartnerFileModelImpl extends BaseModelImpl<PartnerFile>
	implements PartnerFileModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a partner file model instance should use the {@link PartnerFile} interface instead.
	 */
	public static final String TABLE_NAME = "m_partnerFile";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "partnerFileId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "partnerId", Types.BIGINT },
			{ "fileEntryId", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("partnerFileId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("partnerId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("fileEntryId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table m_partnerFile (uuid_ VARCHAR(75) null,partnerFileId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,partnerId LONG,fileEntryId LONG)";
	public static final String TABLE_SQL_DROP = "drop table m_partnerFile";
	public static final String ORDER_BY_JPQL = " ORDER BY partnerFile.createDate ASC";
	public static final String ORDER_BY_SQL = " ORDER BY m_partnerFile.createDate ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(backend.usermgt.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.org.mobilink.backend.usermgt.model.PartnerFile"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(backend.usermgt.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.org.mobilink.backend.usermgt.model.PartnerFile"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(backend.usermgt.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.org.mobilink.backend.usermgt.model.PartnerFile"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long UUID_COLUMN_BITMASK = 4L;
	public static final long CREATEDATE_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(backend.usermgt.service.util.ServiceProps.get(
				"lock.expiration.time.org.mobilink.backend.usermgt.model.PartnerFile"));

	public PartnerFileModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _partnerFileId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPartnerFileId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _partnerFileId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return PartnerFile.class;
	}

	@Override
	public String getModelClassName() {
		return PartnerFile.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("partnerFileId", getPartnerFileId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("partnerId", getPartnerId());
		attributes.put("fileEntryId", getFileEntryId());

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

		Long partnerFileId = (Long)attributes.get("partnerFileId");

		if (partnerFileId != null) {
			setPartnerFileId(partnerFileId);
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

		Long partnerId = (Long)attributes.get("partnerId");

		if (partnerId != null) {
			setPartnerId(partnerId);
		}

		Long fileEntryId = (Long)attributes.get("fileEntryId");

		if (fileEntryId != null) {
			setFileEntryId(fileEntryId);
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
	public long getPartnerFileId() {
		return _partnerFileId;
	}

	@Override
	public void setPartnerFileId(long partnerFileId) {
		_partnerFileId = partnerFileId;
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
		_columnBitmask = -1L;

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
	public long getPartnerId() {
		return _partnerId;
	}

	@Override
	public void setPartnerId(long partnerId) {
		_partnerId = partnerId;
	}

	@Override
	public long getFileEntryId() {
		return _fileEntryId;
	}

	@Override
	public void setFileEntryId(long fileEntryId) {
		_fileEntryId = fileEntryId;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				PartnerFile.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			PartnerFile.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public PartnerFile toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (PartnerFile)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PartnerFileImpl partnerFileImpl = new PartnerFileImpl();

		partnerFileImpl.setUuid(getUuid());
		partnerFileImpl.setPartnerFileId(getPartnerFileId());
		partnerFileImpl.setCompanyId(getCompanyId());
		partnerFileImpl.setGroupId(getGroupId());
		partnerFileImpl.setUserId(getUserId());
		partnerFileImpl.setUserName(getUserName());
		partnerFileImpl.setCreateDate(getCreateDate());
		partnerFileImpl.setModifiedDate(getModifiedDate());
		partnerFileImpl.setPartnerId(getPartnerId());
		partnerFileImpl.setFileEntryId(getFileEntryId());

		partnerFileImpl.resetOriginalValues();

		return partnerFileImpl;
	}

	@Override
	public int compareTo(PartnerFile partnerFile) {
		int value = 0;

		value = DateUtil.compareTo(getCreateDate(), partnerFile.getCreateDate());

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

		if (!(obj instanceof PartnerFile)) {
			return false;
		}

		PartnerFile partnerFile = (PartnerFile)obj;

		long primaryKey = partnerFile.getPrimaryKey();

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
		PartnerFileModelImpl partnerFileModelImpl = this;

		partnerFileModelImpl._originalUuid = partnerFileModelImpl._uuid;

		partnerFileModelImpl._originalCompanyId = partnerFileModelImpl._companyId;

		partnerFileModelImpl._setOriginalCompanyId = false;

		partnerFileModelImpl._originalGroupId = partnerFileModelImpl._groupId;

		partnerFileModelImpl._setOriginalGroupId = false;

		partnerFileModelImpl._setModifiedDate = false;

		partnerFileModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<PartnerFile> toCacheModel() {
		PartnerFileCacheModel partnerFileCacheModel = new PartnerFileCacheModel();

		partnerFileCacheModel.uuid = getUuid();

		String uuid = partnerFileCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			partnerFileCacheModel.uuid = null;
		}

		partnerFileCacheModel.partnerFileId = getPartnerFileId();

		partnerFileCacheModel.companyId = getCompanyId();

		partnerFileCacheModel.groupId = getGroupId();

		partnerFileCacheModel.userId = getUserId();

		partnerFileCacheModel.userName = getUserName();

		String userName = partnerFileCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			partnerFileCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			partnerFileCacheModel.createDate = createDate.getTime();
		}
		else {
			partnerFileCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			partnerFileCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			partnerFileCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		partnerFileCacheModel.partnerId = getPartnerId();

		partnerFileCacheModel.fileEntryId = getFileEntryId();

		return partnerFileCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", partnerFileId=");
		sb.append(getPartnerFileId());
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
		sb.append(", partnerId=");
		sb.append(getPartnerId());
		sb.append(", fileEntryId=");
		sb.append(getFileEntryId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.mobilink.backend.usermgt.model.PartnerFile");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>partnerFileId</column-name><column-value><![CDATA[");
		sb.append(getPartnerFileId());
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
			"<column><column-name>partnerId</column-name><column-value><![CDATA[");
		sb.append(getPartnerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fileEntryId</column-name><column-value><![CDATA[");
		sb.append(getFileEntryId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = PartnerFile.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			PartnerFile.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _partnerFileId;
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
	private long _partnerId;
	private long _fileEntryId;
	private long _columnBitmask;
	private PartnerFile _escapedModel;
}