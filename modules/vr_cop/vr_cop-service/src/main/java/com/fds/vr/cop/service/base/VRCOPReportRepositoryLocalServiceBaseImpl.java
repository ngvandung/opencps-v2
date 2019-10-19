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

package com.fds.vr.cop.service.base;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.cop.model.VRCOPReportRepository;
import com.fds.vr.cop.service.VRCOPReportRepositoryLocalService;
import com.fds.vr.cop.service.persistence.VRCOPProductTypePersistence;
import com.fds.vr.cop.service.persistence.VRCOPProductionPlantEmployeePersistence;
import com.fds.vr.cop.service.persistence.VRCOPProductionPlantEquipmentPersistence;
import com.fds.vr.cop.service.persistence.VRCOPProductionPlantProdEquipmentPersistence;
import com.fds.vr.cop.service.persistence.VRCOPReportAttachPersistence;
import com.fds.vr.cop.service.persistence.VRCOPReportRepositoryPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
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

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the vrcop report repository local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.fds.vr.cop.service.impl.VRCOPReportRepositoryLocalServiceImpl}.
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see com.fds.vr.cop.service.impl.VRCOPReportRepositoryLocalServiceImpl
 * @see com.fds.vr.cop.service.VRCOPReportRepositoryLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class VRCOPReportRepositoryLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements VRCOPReportRepositoryLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.fds.vr.cop.service.VRCOPReportRepositoryLocalServiceUtil} to access the vrcop report repository local service.
	 */

	/**
	 * Adds the vrcop report repository to the database. Also notifies the appropriate model listeners.
	 *
	 * @param vrcopReportRepository the vrcop report repository
	 * @return the vrcop report repository that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public VRCOPReportRepository addVRCOPReportRepository(
		VRCOPReportRepository vrcopReportRepository) {
		vrcopReportRepository.setNew(true);

		return vrcopReportRepositoryPersistence.update(vrcopReportRepository);
	}

	/**
	 * Creates a new vrcop report repository with the primary key. Does not add the vrcop report repository to the database.
	 *
	 * @param id the primary key for the new vrcop report repository
	 * @return the new vrcop report repository
	 */
	@Override
	public VRCOPReportRepository createVRCOPReportRepository(long id) {
		return vrcopReportRepositoryPersistence.create(id);
	}

	/**
	 * Deletes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the vrcop report repository
	 * @return the vrcop report repository that was removed
	 * @throws PortalException if a vrcop report repository with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public VRCOPReportRepository deleteVRCOPReportRepository(long id)
		throws PortalException {
		return vrcopReportRepositoryPersistence.remove(id);
	}

	/**
	 * Deletes the vrcop report repository from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vrcopReportRepository the vrcop report repository
	 * @return the vrcop report repository that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public VRCOPReportRepository deleteVRCOPReportRepository(
		VRCOPReportRepository vrcopReportRepository) {
		return vrcopReportRepositoryPersistence.remove(vrcopReportRepository);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(VRCOPReportRepository.class,
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
		return vrcopReportRepositoryPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return vrcopReportRepositoryPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return vrcopReportRepositoryPersistence.findWithDynamicQuery(dynamicQuery,
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
		return vrcopReportRepositoryPersistence.countWithDynamicQuery(dynamicQuery);
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
		return vrcopReportRepositoryPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public VRCOPReportRepository fetchVRCOPReportRepository(long id) {
		return vrcopReportRepositoryPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the vrcop report repository with the primary key.
	 *
	 * @param id the primary key of the vrcop report repository
	 * @return the vrcop report repository
	 * @throws PortalException if a vrcop report repository with the primary key could not be found
	 */
	@Override
	public VRCOPReportRepository getVRCOPReportRepository(long id)
		throws PortalException {
		return vrcopReportRepositoryPersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(vrcopReportRepositoryLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(VRCOPReportRepository.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(vrcopReportRepositoryLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(VRCOPReportRepository.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(vrcopReportRepositoryLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(VRCOPReportRepository.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return vrcopReportRepositoryLocalService.deleteVRCOPReportRepository((VRCOPReportRepository)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return vrcopReportRepositoryPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the vrcop report repositories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of vrcop report repositories
	 * @param end the upper bound of the range of vrcop report repositories (not inclusive)
	 * @return the range of vrcop report repositories
	 */
	@Override
	public List<VRCOPReportRepository> getVRCOPReportRepositories(int start,
		int end) {
		return vrcopReportRepositoryPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of vrcop report repositories.
	 *
	 * @return the number of vrcop report repositories
	 */
	@Override
	public int getVRCOPReportRepositoriesCount() {
		return vrcopReportRepositoryPersistence.countAll();
	}

	/**
	 * Updates the vrcop report repository in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param vrcopReportRepository the vrcop report repository
	 * @return the vrcop report repository that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public VRCOPReportRepository updateVRCOPReportRepository(
		VRCOPReportRepository vrcopReportRepository) {
		return vrcopReportRepositoryPersistence.update(vrcopReportRepository);
	}

	/**
	 * Returns the vrcop production plant employee local service.
	 *
	 * @return the vrcop production plant employee local service
	 */
	public com.fds.vr.cop.service.VRCOPProductionPlantEmployeeLocalService getVRCOPProductionPlantEmployeeLocalService() {
		return vrcopProductionPlantEmployeeLocalService;
	}

	/**
	 * Sets the vrcop production plant employee local service.
	 *
	 * @param vrcopProductionPlantEmployeeLocalService the vrcop production plant employee local service
	 */
	public void setVRCOPProductionPlantEmployeeLocalService(
		com.fds.vr.cop.service.VRCOPProductionPlantEmployeeLocalService vrcopProductionPlantEmployeeLocalService) {
		this.vrcopProductionPlantEmployeeLocalService = vrcopProductionPlantEmployeeLocalService;
	}

	/**
	 * Returns the vrcop production plant employee persistence.
	 *
	 * @return the vrcop production plant employee persistence
	 */
	public VRCOPProductionPlantEmployeePersistence getVRCOPProductionPlantEmployeePersistence() {
		return vrcopProductionPlantEmployeePersistence;
	}

	/**
	 * Sets the vrcop production plant employee persistence.
	 *
	 * @param vrcopProductionPlantEmployeePersistence the vrcop production plant employee persistence
	 */
	public void setVRCOPProductionPlantEmployeePersistence(
		VRCOPProductionPlantEmployeePersistence vrcopProductionPlantEmployeePersistence) {
		this.vrcopProductionPlantEmployeePersistence = vrcopProductionPlantEmployeePersistence;
	}

	/**
	 * Returns the vrcop production plant equipment local service.
	 *
	 * @return the vrcop production plant equipment local service
	 */
	public com.fds.vr.cop.service.VRCOPProductionPlantEquipmentLocalService getVRCOPProductionPlantEquipmentLocalService() {
		return vrcopProductionPlantEquipmentLocalService;
	}

	/**
	 * Sets the vrcop production plant equipment local service.
	 *
	 * @param vrcopProductionPlantEquipmentLocalService the vrcop production plant equipment local service
	 */
	public void setVRCOPProductionPlantEquipmentLocalService(
		com.fds.vr.cop.service.VRCOPProductionPlantEquipmentLocalService vrcopProductionPlantEquipmentLocalService) {
		this.vrcopProductionPlantEquipmentLocalService = vrcopProductionPlantEquipmentLocalService;
	}

	/**
	 * Returns the vrcop production plant equipment persistence.
	 *
	 * @return the vrcop production plant equipment persistence
	 */
	public VRCOPProductionPlantEquipmentPersistence getVRCOPProductionPlantEquipmentPersistence() {
		return vrcopProductionPlantEquipmentPersistence;
	}

	/**
	 * Sets the vrcop production plant equipment persistence.
	 *
	 * @param vrcopProductionPlantEquipmentPersistence the vrcop production plant equipment persistence
	 */
	public void setVRCOPProductionPlantEquipmentPersistence(
		VRCOPProductionPlantEquipmentPersistence vrcopProductionPlantEquipmentPersistence) {
		this.vrcopProductionPlantEquipmentPersistence = vrcopProductionPlantEquipmentPersistence;
	}

	/**
	 * Returns the vrcop production plant prod equipment local service.
	 *
	 * @return the vrcop production plant prod equipment local service
	 */
	public com.fds.vr.cop.service.VRCOPProductionPlantProdEquipmentLocalService getVRCOPProductionPlantProdEquipmentLocalService() {
		return vrcopProductionPlantProdEquipmentLocalService;
	}

	/**
	 * Sets the vrcop production plant prod equipment local service.
	 *
	 * @param vrcopProductionPlantProdEquipmentLocalService the vrcop production plant prod equipment local service
	 */
	public void setVRCOPProductionPlantProdEquipmentLocalService(
		com.fds.vr.cop.service.VRCOPProductionPlantProdEquipmentLocalService vrcopProductionPlantProdEquipmentLocalService) {
		this.vrcopProductionPlantProdEquipmentLocalService = vrcopProductionPlantProdEquipmentLocalService;
	}

	/**
	 * Returns the vrcop production plant prod equipment persistence.
	 *
	 * @return the vrcop production plant prod equipment persistence
	 */
	public VRCOPProductionPlantProdEquipmentPersistence getVRCOPProductionPlantProdEquipmentPersistence() {
		return vrcopProductionPlantProdEquipmentPersistence;
	}

	/**
	 * Sets the vrcop production plant prod equipment persistence.
	 *
	 * @param vrcopProductionPlantProdEquipmentPersistence the vrcop production plant prod equipment persistence
	 */
	public void setVRCOPProductionPlantProdEquipmentPersistence(
		VRCOPProductionPlantProdEquipmentPersistence vrcopProductionPlantProdEquipmentPersistence) {
		this.vrcopProductionPlantProdEquipmentPersistence = vrcopProductionPlantProdEquipmentPersistence;
	}

	/**
	 * Returns the vrcop product type local service.
	 *
	 * @return the vrcop product type local service
	 */
	public com.fds.vr.cop.service.VRCOPProductTypeLocalService getVRCOPProductTypeLocalService() {
		return vrcopProductTypeLocalService;
	}

	/**
	 * Sets the vrcop product type local service.
	 *
	 * @param vrcopProductTypeLocalService the vrcop product type local service
	 */
	public void setVRCOPProductTypeLocalService(
		com.fds.vr.cop.service.VRCOPProductTypeLocalService vrcopProductTypeLocalService) {
		this.vrcopProductTypeLocalService = vrcopProductTypeLocalService;
	}

	/**
	 * Returns the vrcop product type persistence.
	 *
	 * @return the vrcop product type persistence
	 */
	public VRCOPProductTypePersistence getVRCOPProductTypePersistence() {
		return vrcopProductTypePersistence;
	}

	/**
	 * Sets the vrcop product type persistence.
	 *
	 * @param vrcopProductTypePersistence the vrcop product type persistence
	 */
	public void setVRCOPProductTypePersistence(
		VRCOPProductTypePersistence vrcopProductTypePersistence) {
		this.vrcopProductTypePersistence = vrcopProductTypePersistence;
	}

	/**
	 * Returns the vrcop report attach local service.
	 *
	 * @return the vrcop report attach local service
	 */
	public com.fds.vr.cop.service.VRCOPReportAttachLocalService getVRCOPReportAttachLocalService() {
		return vrcopReportAttachLocalService;
	}

	/**
	 * Sets the vrcop report attach local service.
	 *
	 * @param vrcopReportAttachLocalService the vrcop report attach local service
	 */
	public void setVRCOPReportAttachLocalService(
		com.fds.vr.cop.service.VRCOPReportAttachLocalService vrcopReportAttachLocalService) {
		this.vrcopReportAttachLocalService = vrcopReportAttachLocalService;
	}

	/**
	 * Returns the vrcop report attach persistence.
	 *
	 * @return the vrcop report attach persistence
	 */
	public VRCOPReportAttachPersistence getVRCOPReportAttachPersistence() {
		return vrcopReportAttachPersistence;
	}

	/**
	 * Sets the vrcop report attach persistence.
	 *
	 * @param vrcopReportAttachPersistence the vrcop report attach persistence
	 */
	public void setVRCOPReportAttachPersistence(
		VRCOPReportAttachPersistence vrcopReportAttachPersistence) {
		this.vrcopReportAttachPersistence = vrcopReportAttachPersistence;
	}

	/**
	 * Returns the vrcop report repository local service.
	 *
	 * @return the vrcop report repository local service
	 */
	public VRCOPReportRepositoryLocalService getVRCOPReportRepositoryLocalService() {
		return vrcopReportRepositoryLocalService;
	}

	/**
	 * Sets the vrcop report repository local service.
	 *
	 * @param vrcopReportRepositoryLocalService the vrcop report repository local service
	 */
	public void setVRCOPReportRepositoryLocalService(
		VRCOPReportRepositoryLocalService vrcopReportRepositoryLocalService) {
		this.vrcopReportRepositoryLocalService = vrcopReportRepositoryLocalService;
	}

	/**
	 * Returns the vrcop report repository persistence.
	 *
	 * @return the vrcop report repository persistence
	 */
	public VRCOPReportRepositoryPersistence getVRCOPReportRepositoryPersistence() {
		return vrcopReportRepositoryPersistence;
	}

	/**
	 * Sets the vrcop report repository persistence.
	 *
	 * @param vrcopReportRepositoryPersistence the vrcop report repository persistence
	 */
	public void setVRCOPReportRepositoryPersistence(
		VRCOPReportRepositoryPersistence vrcopReportRepositoryPersistence) {
		this.vrcopReportRepositoryPersistence = vrcopReportRepositoryPersistence;
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
		persistedModelLocalServiceRegistry.register("com.fds.vr.cop.model.VRCOPReportRepository",
			vrcopReportRepositoryLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.fds.vr.cop.model.VRCOPReportRepository");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return VRCOPReportRepositoryLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return VRCOPReportRepository.class;
	}

	protected String getModelClassName() {
		return VRCOPReportRepository.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = vrcopReportRepositoryPersistence.getDataSource();

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

	@BeanReference(type = com.fds.vr.cop.service.VRCOPProductionPlantEmployeeLocalService.class)
	protected com.fds.vr.cop.service.VRCOPProductionPlantEmployeeLocalService vrcopProductionPlantEmployeeLocalService;
	@BeanReference(type = VRCOPProductionPlantEmployeePersistence.class)
	protected VRCOPProductionPlantEmployeePersistence vrcopProductionPlantEmployeePersistence;
	@BeanReference(type = com.fds.vr.cop.service.VRCOPProductionPlantEquipmentLocalService.class)
	protected com.fds.vr.cop.service.VRCOPProductionPlantEquipmentLocalService vrcopProductionPlantEquipmentLocalService;
	@BeanReference(type = VRCOPProductionPlantEquipmentPersistence.class)
	protected VRCOPProductionPlantEquipmentPersistence vrcopProductionPlantEquipmentPersistence;
	@BeanReference(type = com.fds.vr.cop.service.VRCOPProductionPlantProdEquipmentLocalService.class)
	protected com.fds.vr.cop.service.VRCOPProductionPlantProdEquipmentLocalService vrcopProductionPlantProdEquipmentLocalService;
	@BeanReference(type = VRCOPProductionPlantProdEquipmentPersistence.class)
	protected VRCOPProductionPlantProdEquipmentPersistence vrcopProductionPlantProdEquipmentPersistence;
	@BeanReference(type = com.fds.vr.cop.service.VRCOPProductTypeLocalService.class)
	protected com.fds.vr.cop.service.VRCOPProductTypeLocalService vrcopProductTypeLocalService;
	@BeanReference(type = VRCOPProductTypePersistence.class)
	protected VRCOPProductTypePersistence vrcopProductTypePersistence;
	@BeanReference(type = com.fds.vr.cop.service.VRCOPReportAttachLocalService.class)
	protected com.fds.vr.cop.service.VRCOPReportAttachLocalService vrcopReportAttachLocalService;
	@BeanReference(type = VRCOPReportAttachPersistence.class)
	protected VRCOPReportAttachPersistence vrcopReportAttachPersistence;
	@BeanReference(type = VRCOPReportRepositoryLocalService.class)
	protected VRCOPReportRepositoryLocalService vrcopReportRepositoryLocalService;
	@BeanReference(type = VRCOPReportRepositoryPersistence.class)
	protected VRCOPReportRepositoryPersistence vrcopReportRepositoryPersistence;
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