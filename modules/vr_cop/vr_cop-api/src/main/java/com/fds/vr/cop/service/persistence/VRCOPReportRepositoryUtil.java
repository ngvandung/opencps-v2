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

package com.fds.vr.cop.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.cop.model.VRCOPReportRepository;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vrcop report repository service. This utility wraps {@link com.fds.vr.cop.service.persistence.impl.VRCOPReportRepositoryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPReportRepositoryPersistence
 * @see com.fds.vr.cop.service.persistence.impl.VRCOPReportRepositoryPersistenceImpl
 * @generated
 */
@ProviderType
public class VRCOPReportRepositoryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(VRCOPReportRepository vrcopReportRepository) {
		getPersistence().clearCache(vrcopReportRepository);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VRCOPReportRepository> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCOPReportRepository> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCOPReportRepository> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCOPReportRepository update(
		VRCOPReportRepository vrcopReportRepository) {
		return getPersistence().update(vrcopReportRepository);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCOPReportRepository update(
		VRCOPReportRepository vrcopReportRepository,
		ServiceContext serviceContext) {
		return getPersistence().update(vrcopReportRepository, serviceContext);
	}

	/**
	* Returns the vrcop report repository where COPReportNo = &#63; or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	*
	* @param COPReportNo the cop report no
	* @return the matching vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository findByCOP_REPORT_NO(
		java.lang.String COPReportNo)
		throws com.fds.vr.cop.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence().findByCOP_REPORT_NO(COPReportNo);
	}

	/**
	* Returns the vrcop report repository where COPReportNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param COPReportNo the cop report no
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByCOP_REPORT_NO(
		java.lang.String COPReportNo) {
		return getPersistence().fetchByCOP_REPORT_NO(COPReportNo);
	}

	/**
	* Returns the vrcop report repository where COPReportNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param COPReportNo the cop report no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching vrcop report repository, or <code>null</code> if a matching vrcop report repository could not be found
	*/
	public static VRCOPReportRepository fetchByCOP_REPORT_NO(
		java.lang.String COPReportNo, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByCOP_REPORT_NO(COPReportNo, retrieveFromCache);
	}

	/**
	* Removes the vrcop report repository where COPReportNo = &#63; from the database.
	*
	* @param COPReportNo the cop report no
	* @return the vrcop report repository that was removed
	*/
	public static VRCOPReportRepository removeByCOP_REPORT_NO(
		java.lang.String COPReportNo)
		throws com.fds.vr.cop.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence().removeByCOP_REPORT_NO(COPReportNo);
	}

	/**
	* Returns the number of vrcop report repositories where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @return the number of matching vrcop report repositories
	*/
	public static int countByCOP_REPORT_NO(java.lang.String COPReportNo) {
		return getPersistence().countByCOP_REPORT_NO(COPReportNo);
	}

	/**
	* Caches the vrcop report repository in the entity cache if it is enabled.
	*
	* @param vrcopReportRepository the vrcop report repository
	*/
	public static void cacheResult(VRCOPReportRepository vrcopReportRepository) {
		getPersistence().cacheResult(vrcopReportRepository);
	}

	/**
	* Caches the vrcop report repositories in the entity cache if it is enabled.
	*
	* @param vrcopReportRepositories the vrcop report repositories
	*/
	public static void cacheResult(
		List<VRCOPReportRepository> vrcopReportRepositories) {
		getPersistence().cacheResult(vrcopReportRepositories);
	}

	/**
	* Creates a new vrcop report repository with the primary key. Does not add the vrcop report repository to the database.
	*
	* @param id the primary key for the new vrcop report repository
	* @return the new vrcop report repository
	*/
	public static VRCOPReportRepository create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vrcop report repository with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository that was removed
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository remove(long id)
		throws com.fds.vr.cop.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence().remove(id);
	}

	public static VRCOPReportRepository updateImpl(
		VRCOPReportRepository vrcopReportRepository) {
		return getPersistence().updateImpl(vrcopReportRepository);
	}

	/**
	* Returns the vrcop report repository with the primary key or throws a {@link NoSuchVRCOPReportRepositoryException} if it could not be found.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository
	* @throws NoSuchVRCOPReportRepositoryException if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository findByPrimaryKey(long id)
		throws com.fds.vr.cop.exception.NoSuchVRCOPReportRepositoryException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vrcop report repository with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop report repository
	* @return the vrcop report repository, or <code>null</code> if a vrcop report repository with the primary key could not be found
	*/
	public static VRCOPReportRepository fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCOPReportRepository> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vrcop report repositories.
	*
	* @return the vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @return the range of vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findAll(int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop report repositories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportRepositoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report repositories
	* @param end the upper bound of the range of vrcop report repositories (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop report repositories
	*/
	public static List<VRCOPReportRepository> findAll(int start, int end,
		OrderByComparator<VRCOPReportRepository> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vrcop report repositories from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vrcop report repositories.
	*
	* @return the number of vrcop report repositories
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRCOPReportRepositoryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPReportRepositoryPersistence, VRCOPReportRepositoryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPReportRepositoryPersistence.class);
}