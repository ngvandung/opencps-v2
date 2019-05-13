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

package org.opencps.synchronization.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import org.opencps.synchronization.model.PushCollection;
import org.opencps.synchronization.service.PushCollectionLocalService;
import org.opencps.synchronization.service.persistence.DictCollectionTempPersistence;
import org.opencps.synchronization.service.persistence.DictGroupTempPersistence;
import org.opencps.synchronization.service.persistence.DictItemGroupTempPersistence;
import org.opencps.synchronization.service.persistence.DictItemTempPersistence;
import org.opencps.synchronization.service.persistence.PushCollectionPersistence;
import org.opencps.synchronization.service.persistence.PushDictGroupPersistence;
import org.opencps.synchronization.service.persistence.PushDictItemPersistence;
import org.opencps.synchronization.service.persistence.SyncQueuePersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the push collection local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.opencps.synchronization.service.impl.PushCollectionLocalServiceImpl}.
 * </p>
 *
 * @author trungdk
 * @see org.opencps.synchronization.service.impl.PushCollectionLocalServiceImpl
 * @see org.opencps.synchronization.service.PushCollectionLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class PushCollectionLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements PushCollectionLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.opencps.synchronization.service.PushCollectionLocalServiceUtil} to access the push collection local service.
	 */

	/**
	 * Adds the push collection to the database. Also notifies the appropriate model listeners.
	 *
	 * @param pushCollection the push collection
	 * @return the push collection that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PushCollection addPushCollection(PushCollection pushCollection) {
		pushCollection.setNew(true);

		return pushCollectionPersistence.update(pushCollection);
	}

	/**
	 * Creates a new push collection with the primary key. Does not add the push collection to the database.
	 *
	 * @param pushCollectionId the primary key for the new push collection
	 * @return the new push collection
	 */
	@Override
	public PushCollection createPushCollection(long pushCollectionId) {
		return pushCollectionPersistence.create(pushCollectionId);
	}

	/**
	 * Deletes the push collection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pushCollectionId the primary key of the push collection
	 * @return the push collection that was removed
	 * @throws PortalException if a push collection with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PushCollection deletePushCollection(long pushCollectionId)
		throws PortalException {
		return pushCollectionPersistence.remove(pushCollectionId);
	}

	/**
	 * Deletes the push collection from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pushCollection the push collection
	 * @return the push collection that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PushCollection deletePushCollection(PushCollection pushCollection) {
		return pushCollectionPersistence.remove(pushCollection);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(PushCollection.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return pushCollectionPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.synchronization.model.impl.PushCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return pushCollectionPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.synchronization.model.impl.PushCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return pushCollectionPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return pushCollectionPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return pushCollectionPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public PushCollection fetchPushCollection(long pushCollectionId) {
		return pushCollectionPersistence.fetchByPrimaryKey(pushCollectionId);
	}

	/**
	 * Returns the push collection matching the UUID and group.
	 *
	 * @param uuid the push collection's UUID
	 * @param groupId the primary key of the group
	 * @return the matching push collection, or <code>null</code> if a matching push collection could not be found
	 */
	@Override
	public PushCollection fetchPushCollectionByUuidAndGroupId(String uuid,
		long groupId) {
		return pushCollectionPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the push collection with the primary key.
	 *
	 * @param pushCollectionId the primary key of the push collection
	 * @return the push collection
	 * @throws PortalException if a push collection with the primary key could not be found
	 */
	@Override
	public PushCollection getPushCollection(long pushCollectionId)
		throws PortalException {
		return pushCollectionPersistence.findByPrimaryKey(pushCollectionId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(pushCollectionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PushCollection.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("pushCollectionId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(pushCollectionLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(PushCollection.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"pushCollectionId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(pushCollectionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PushCollection.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("pushCollectionId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {
		final ExportActionableDynamicQuery exportActionableDynamicQuery = new ExportActionableDynamicQuery() {
				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary = portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(stagedModelType,
						modelAdditionCount);

					long modelDeletionCount = ExportImportHelperUtil.getModelDeletionCount(portletDataContext,
							stagedModelType);

					manifestSummary.addModelDeletionCount(stagedModelType,
						modelDeletionCount);

					return modelAdditionCount;
				}
			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(dynamicQuery,
						"modifiedDate");
				}
			});

		exportActionableDynamicQuery.setCompanyId(portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<PushCollection>() {
				@Override
				public void performAction(PushCollection pushCollection)
					throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(portletDataContext,
						pushCollection);
				}
			});
		exportActionableDynamicQuery.setStagedModelType(new StagedModelType(
				PortalUtil.getClassNameId(PushCollection.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return pushCollectionLocalService.deletePushCollection((PushCollection)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return pushCollectionPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the push collections matching the UUID and company.
	 *
	 * @param uuid the UUID of the push collections
	 * @param companyId the primary key of the company
	 * @return the matching push collections, or an empty list if no matches were found
	 */
	@Override
	public List<PushCollection> getPushCollectionsByUuidAndCompanyId(
		String uuid, long companyId) {
		return pushCollectionPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of push collections matching the UUID and company.
	 *
	 * @param uuid the UUID of the push collections
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of push collections
	 * @param end the upper bound of the range of push collections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching push collections, or an empty list if no matches were found
	 */
	@Override
	public List<PushCollection> getPushCollectionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<PushCollection> orderByComparator) {
		return pushCollectionPersistence.findByUuid_C(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	 * Returns the push collection matching the UUID and group.
	 *
	 * @param uuid the push collection's UUID
	 * @param groupId the primary key of the group
	 * @return the matching push collection
	 * @throws PortalException if a matching push collection could not be found
	 */
	@Override
	public PushCollection getPushCollectionByUuidAndGroupId(String uuid,
		long groupId) throws PortalException {
		return pushCollectionPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the push collections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.synchronization.model.impl.PushCollectionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of push collections
	 * @param end the upper bound of the range of push collections (not inclusive)
	 * @return the range of push collections
	 */
	@Override
	public List<PushCollection> getPushCollections(int start, int end) {
		return pushCollectionPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of push collections.
	 *
	 * @return the number of push collections
	 */
	@Override
	public int getPushCollectionsCount() {
		return pushCollectionPersistence.countAll();
	}

	/**
	 * Updates the push collection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param pushCollection the push collection
	 * @return the push collection that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PushCollection updatePushCollection(PushCollection pushCollection) {
		return pushCollectionPersistence.update(pushCollection);
	}

	/**
	 * Returns the dict collection temp local service.
	 *
	 * @return the dict collection temp local service
	 */
	public org.opencps.synchronization.service.DictCollectionTempLocalService getDictCollectionTempLocalService() {
		return dictCollectionTempLocalService;
	}

	/**
	 * Sets the dict collection temp local service.
	 *
	 * @param dictCollectionTempLocalService the dict collection temp local service
	 */
	public void setDictCollectionTempLocalService(
		org.opencps.synchronization.service.DictCollectionTempLocalService dictCollectionTempLocalService) {
		this.dictCollectionTempLocalService = dictCollectionTempLocalService;
	}

	/**
	 * Returns the dict collection temp persistence.
	 *
	 * @return the dict collection temp persistence
	 */
	public DictCollectionTempPersistence getDictCollectionTempPersistence() {
		return dictCollectionTempPersistence;
	}

	/**
	 * Sets the dict collection temp persistence.
	 *
	 * @param dictCollectionTempPersistence the dict collection temp persistence
	 */
	public void setDictCollectionTempPersistence(
		DictCollectionTempPersistence dictCollectionTempPersistence) {
		this.dictCollectionTempPersistence = dictCollectionTempPersistence;
	}

	/**
	 * Returns the dict group temp local service.
	 *
	 * @return the dict group temp local service
	 */
	public org.opencps.synchronization.service.DictGroupTempLocalService getDictGroupTempLocalService() {
		return dictGroupTempLocalService;
	}

	/**
	 * Sets the dict group temp local service.
	 *
	 * @param dictGroupTempLocalService the dict group temp local service
	 */
	public void setDictGroupTempLocalService(
		org.opencps.synchronization.service.DictGroupTempLocalService dictGroupTempLocalService) {
		this.dictGroupTempLocalService = dictGroupTempLocalService;
	}

	/**
	 * Returns the dict group temp persistence.
	 *
	 * @return the dict group temp persistence
	 */
	public DictGroupTempPersistence getDictGroupTempPersistence() {
		return dictGroupTempPersistence;
	}

	/**
	 * Sets the dict group temp persistence.
	 *
	 * @param dictGroupTempPersistence the dict group temp persistence
	 */
	public void setDictGroupTempPersistence(
		DictGroupTempPersistence dictGroupTempPersistence) {
		this.dictGroupTempPersistence = dictGroupTempPersistence;
	}

	/**
	 * Returns the dict item group temp local service.
	 *
	 * @return the dict item group temp local service
	 */
	public org.opencps.synchronization.service.DictItemGroupTempLocalService getDictItemGroupTempLocalService() {
		return dictItemGroupTempLocalService;
	}

	/**
	 * Sets the dict item group temp local service.
	 *
	 * @param dictItemGroupTempLocalService the dict item group temp local service
	 */
	public void setDictItemGroupTempLocalService(
		org.opencps.synchronization.service.DictItemGroupTempLocalService dictItemGroupTempLocalService) {
		this.dictItemGroupTempLocalService = dictItemGroupTempLocalService;
	}

	/**
	 * Returns the dict item group temp persistence.
	 *
	 * @return the dict item group temp persistence
	 */
	public DictItemGroupTempPersistence getDictItemGroupTempPersistence() {
		return dictItemGroupTempPersistence;
	}

	/**
	 * Sets the dict item group temp persistence.
	 *
	 * @param dictItemGroupTempPersistence the dict item group temp persistence
	 */
	public void setDictItemGroupTempPersistence(
		DictItemGroupTempPersistence dictItemGroupTempPersistence) {
		this.dictItemGroupTempPersistence = dictItemGroupTempPersistence;
	}

	/**
	 * Returns the dict item temp local service.
	 *
	 * @return the dict item temp local service
	 */
	public org.opencps.synchronization.service.DictItemTempLocalService getDictItemTempLocalService() {
		return dictItemTempLocalService;
	}

	/**
	 * Sets the dict item temp local service.
	 *
	 * @param dictItemTempLocalService the dict item temp local service
	 */
	public void setDictItemTempLocalService(
		org.opencps.synchronization.service.DictItemTempLocalService dictItemTempLocalService) {
		this.dictItemTempLocalService = dictItemTempLocalService;
	}

	/**
	 * Returns the dict item temp persistence.
	 *
	 * @return the dict item temp persistence
	 */
	public DictItemTempPersistence getDictItemTempPersistence() {
		return dictItemTempPersistence;
	}

	/**
	 * Sets the dict item temp persistence.
	 *
	 * @param dictItemTempPersistence the dict item temp persistence
	 */
	public void setDictItemTempPersistence(
		DictItemTempPersistence dictItemTempPersistence) {
		this.dictItemTempPersistence = dictItemTempPersistence;
	}

	/**
	 * Returns the push collection local service.
	 *
	 * @return the push collection local service
	 */
	public PushCollectionLocalService getPushCollectionLocalService() {
		return pushCollectionLocalService;
	}

	/**
	 * Sets the push collection local service.
	 *
	 * @param pushCollectionLocalService the push collection local service
	 */
	public void setPushCollectionLocalService(
		PushCollectionLocalService pushCollectionLocalService) {
		this.pushCollectionLocalService = pushCollectionLocalService;
	}

	/**
	 * Returns the push collection persistence.
	 *
	 * @return the push collection persistence
	 */
	public PushCollectionPersistence getPushCollectionPersistence() {
		return pushCollectionPersistence;
	}

	/**
	 * Sets the push collection persistence.
	 *
	 * @param pushCollectionPersistence the push collection persistence
	 */
	public void setPushCollectionPersistence(
		PushCollectionPersistence pushCollectionPersistence) {
		this.pushCollectionPersistence = pushCollectionPersistence;
	}

	/**
	 * Returns the push dict group local service.
	 *
	 * @return the push dict group local service
	 */
	public org.opencps.synchronization.service.PushDictGroupLocalService getPushDictGroupLocalService() {
		return pushDictGroupLocalService;
	}

	/**
	 * Sets the push dict group local service.
	 *
	 * @param pushDictGroupLocalService the push dict group local service
	 */
	public void setPushDictGroupLocalService(
		org.opencps.synchronization.service.PushDictGroupLocalService pushDictGroupLocalService) {
		this.pushDictGroupLocalService = pushDictGroupLocalService;
	}

	/**
	 * Returns the push dict group persistence.
	 *
	 * @return the push dict group persistence
	 */
	public PushDictGroupPersistence getPushDictGroupPersistence() {
		return pushDictGroupPersistence;
	}

	/**
	 * Sets the push dict group persistence.
	 *
	 * @param pushDictGroupPersistence the push dict group persistence
	 */
	public void setPushDictGroupPersistence(
		PushDictGroupPersistence pushDictGroupPersistence) {
		this.pushDictGroupPersistence = pushDictGroupPersistence;
	}

	/**
	 * Returns the push dict item local service.
	 *
	 * @return the push dict item local service
	 */
	public org.opencps.synchronization.service.PushDictItemLocalService getPushDictItemLocalService() {
		return pushDictItemLocalService;
	}

	/**
	 * Sets the push dict item local service.
	 *
	 * @param pushDictItemLocalService the push dict item local service
	 */
	public void setPushDictItemLocalService(
		org.opencps.synchronization.service.PushDictItemLocalService pushDictItemLocalService) {
		this.pushDictItemLocalService = pushDictItemLocalService;
	}

	/**
	 * Returns the push dict item persistence.
	 *
	 * @return the push dict item persistence
	 */
	public PushDictItemPersistence getPushDictItemPersistence() {
		return pushDictItemPersistence;
	}

	/**
	 * Sets the push dict item persistence.
	 *
	 * @param pushDictItemPersistence the push dict item persistence
	 */
	public void setPushDictItemPersistence(
		PushDictItemPersistence pushDictItemPersistence) {
		this.pushDictItemPersistence = pushDictItemPersistence;
	}

	/**
	 * Returns the sync queue local service.
	 *
	 * @return the sync queue local service
	 */
	public org.opencps.synchronization.service.SyncQueueLocalService getSyncQueueLocalService() {
		return syncQueueLocalService;
	}

	/**
	 * Sets the sync queue local service.
	 *
	 * @param syncQueueLocalService the sync queue local service
	 */
	public void setSyncQueueLocalService(
		org.opencps.synchronization.service.SyncQueueLocalService syncQueueLocalService) {
		this.syncQueueLocalService = syncQueueLocalService;
	}

	/**
	 * Returns the sync queue persistence.
	 *
	 * @return the sync queue persistence
	 */
	public SyncQueuePersistence getSyncQueuePersistence() {
		return syncQueuePersistence;
	}

	/**
	 * Sets the sync queue persistence.
	 *
	 * @param syncQueuePersistence the sync queue persistence
	 */
	public void setSyncQueuePersistence(
		SyncQueuePersistence syncQueuePersistence) {
		this.syncQueuePersistence = syncQueuePersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("org.opencps.synchronization.model.PushCollection",
			pushCollectionLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"org.opencps.synchronization.model.PushCollection");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PushCollectionLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return PushCollection.class;
	}

	protected String getModelClassName() {
		return PushCollection.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = pushCollectionPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.opencps.synchronization.service.DictCollectionTempLocalService.class)
	protected org.opencps.synchronization.service.DictCollectionTempLocalService dictCollectionTempLocalService;
	@BeanReference(type = DictCollectionTempPersistence.class)
	protected DictCollectionTempPersistence dictCollectionTempPersistence;
	@BeanReference(type = org.opencps.synchronization.service.DictGroupTempLocalService.class)
	protected org.opencps.synchronization.service.DictGroupTempLocalService dictGroupTempLocalService;
	@BeanReference(type = DictGroupTempPersistence.class)
	protected DictGroupTempPersistence dictGroupTempPersistence;
	@BeanReference(type = org.opencps.synchronization.service.DictItemGroupTempLocalService.class)
	protected org.opencps.synchronization.service.DictItemGroupTempLocalService dictItemGroupTempLocalService;
	@BeanReference(type = DictItemGroupTempPersistence.class)
	protected DictItemGroupTempPersistence dictItemGroupTempPersistence;
	@BeanReference(type = org.opencps.synchronization.service.DictItemTempLocalService.class)
	protected org.opencps.synchronization.service.DictItemTempLocalService dictItemTempLocalService;
	@BeanReference(type = DictItemTempPersistence.class)
	protected DictItemTempPersistence dictItemTempPersistence;
	@BeanReference(type = PushCollectionLocalService.class)
	protected PushCollectionLocalService pushCollectionLocalService;
	@BeanReference(type = PushCollectionPersistence.class)
	protected PushCollectionPersistence pushCollectionPersistence;
	@BeanReference(type = org.opencps.synchronization.service.PushDictGroupLocalService.class)
	protected org.opencps.synchronization.service.PushDictGroupLocalService pushDictGroupLocalService;
	@BeanReference(type = PushDictGroupPersistence.class)
	protected PushDictGroupPersistence pushDictGroupPersistence;
	@BeanReference(type = org.opencps.synchronization.service.PushDictItemLocalService.class)
	protected org.opencps.synchronization.service.PushDictItemLocalService pushDictItemLocalService;
	@BeanReference(type = PushDictItemPersistence.class)
	protected PushDictItemPersistence pushDictItemPersistence;
	@BeanReference(type = org.opencps.synchronization.service.SyncQueueLocalService.class)
	protected org.opencps.synchronization.service.SyncQueueLocalService syncQueueLocalService;
	@BeanReference(type = SyncQueuePersistence.class)
	protected SyncQueuePersistence syncQueuePersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}