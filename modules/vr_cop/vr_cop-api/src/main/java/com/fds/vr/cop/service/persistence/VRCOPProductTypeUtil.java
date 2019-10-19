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

import com.fds.vr.cop.model.VRCOPProductType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vrcop product type service. This utility wraps {@link com.fds.vr.cop.service.persistence.impl.VRCOPProductTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductTypePersistence
 * @see com.fds.vr.cop.service.persistence.impl.VRCOPProductTypePersistenceImpl
 * @generated
 */
@ProviderType
public class VRCOPProductTypeUtil {
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
	public static void clearCache(VRCOPProductType vrcopProductType) {
		getPersistence().clearCache(vrcopProductType);
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
	public static List<VRCOPProductType> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCOPProductType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCOPProductType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCOPProductType> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCOPProductType update(VRCOPProductType vrcopProductType) {
		return getPersistence().update(vrcopProductType);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCOPProductType update(VRCOPProductType vrcopProductType,
		ServiceContext serviceContext) {
		return getPersistence().update(vrcopProductType, serviceContext);
	}

	/**
	* Returns all the vrcop product types where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @return the matching vrcop product types
	*/
	public static List<VRCOPProductType> findByCOP_REPORT_NO(
		java.lang.String COPReportNo) {
		return getPersistence().findByCOP_REPORT_NO(COPReportNo);
	}

	/**
	* Returns a range of all the vrcop product types where COPReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param COPReportNo the cop report no
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @return the range of matching vrcop product types
	*/
	public static List<VRCOPProductType> findByCOP_REPORT_NO(
		java.lang.String COPReportNo, int start, int end) {
		return getPersistence().findByCOP_REPORT_NO(COPReportNo, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop product types where COPReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param COPReportNo the cop report no
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop product types
	*/
	public static List<VRCOPProductType> findByCOP_REPORT_NO(
		java.lang.String COPReportNo, int start, int end,
		OrderByComparator<VRCOPProductType> orderByComparator) {
		return getPersistence()
				   .findByCOP_REPORT_NO(COPReportNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop product types where COPReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param COPReportNo the cop report no
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop product types
	*/
	public static List<VRCOPProductType> findByCOP_REPORT_NO(
		java.lang.String COPReportNo, int start, int end,
		OrderByComparator<VRCOPProductType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCOP_REPORT_NO(COPReportNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop product type in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	*/
	public static VRCOPProductType findByCOP_REPORT_NO_First(
		java.lang.String COPReportNo,
		OrderByComparator<VRCOPProductType> orderByComparator)
		throws com.fds.vr.cop.exception.NoSuchVRCOPProductTypeException {
		return getPersistence()
				   .findByCOP_REPORT_NO_First(COPReportNo, orderByComparator);
	}

	/**
	* Returns the first vrcop product type in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	*/
	public static VRCOPProductType fetchByCOP_REPORT_NO_First(
		java.lang.String COPReportNo,
		OrderByComparator<VRCOPProductType> orderByComparator) {
		return getPersistence()
				   .fetchByCOP_REPORT_NO_First(COPReportNo, orderByComparator);
	}

	/**
	* Returns the last vrcop product type in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a matching vrcop product type could not be found
	*/
	public static VRCOPProductType findByCOP_REPORT_NO_Last(
		java.lang.String COPReportNo,
		OrderByComparator<VRCOPProductType> orderByComparator)
		throws com.fds.vr.cop.exception.NoSuchVRCOPProductTypeException {
		return getPersistence()
				   .findByCOP_REPORT_NO_Last(COPReportNo, orderByComparator);
	}

	/**
	* Returns the last vrcop product type in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop product type, or <code>null</code> if a matching vrcop product type could not be found
	*/
	public static VRCOPProductType fetchByCOP_REPORT_NO_Last(
		java.lang.String COPReportNo,
		OrderByComparator<VRCOPProductType> orderByComparator) {
		return getPersistence()
				   .fetchByCOP_REPORT_NO_Last(COPReportNo, orderByComparator);
	}

	/**
	* Returns the vrcop product types before and after the current vrcop product type in the ordered set where COPReportNo = &#63;.
	*
	* @param id the primary key of the current vrcop product type
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	*/
	public static VRCOPProductType[] findByCOP_REPORT_NO_PrevAndNext(long id,
		java.lang.String COPReportNo,
		OrderByComparator<VRCOPProductType> orderByComparator)
		throws com.fds.vr.cop.exception.NoSuchVRCOPProductTypeException {
		return getPersistence()
				   .findByCOP_REPORT_NO_PrevAndNext(id, COPReportNo,
			orderByComparator);
	}

	/**
	* Removes all the vrcop product types where COPReportNo = &#63; from the database.
	*
	* @param COPReportNo the cop report no
	*/
	public static void removeByCOP_REPORT_NO(java.lang.String COPReportNo) {
		getPersistence().removeByCOP_REPORT_NO(COPReportNo);
	}

	/**
	* Returns the number of vrcop product types where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @return the number of matching vrcop product types
	*/
	public static int countByCOP_REPORT_NO(java.lang.String COPReportNo) {
		return getPersistence().countByCOP_REPORT_NO(COPReportNo);
	}

	/**
	* Caches the vrcop product type in the entity cache if it is enabled.
	*
	* @param vrcopProductType the vrcop product type
	*/
	public static void cacheResult(VRCOPProductType vrcopProductType) {
		getPersistence().cacheResult(vrcopProductType);
	}

	/**
	* Caches the vrcop product types in the entity cache if it is enabled.
	*
	* @param vrcopProductTypes the vrcop product types
	*/
	public static void cacheResult(List<VRCOPProductType> vrcopProductTypes) {
		getPersistence().cacheResult(vrcopProductTypes);
	}

	/**
	* Creates a new vrcop product type with the primary key. Does not add the vrcop product type to the database.
	*
	* @param id the primary key for the new vrcop product type
	* @return the new vrcop product type
	*/
	public static VRCOPProductType create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vrcop product type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop product type
	* @return the vrcop product type that was removed
	* @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	*/
	public static VRCOPProductType remove(long id)
		throws com.fds.vr.cop.exception.NoSuchVRCOPProductTypeException {
		return getPersistence().remove(id);
	}

	public static VRCOPProductType updateImpl(VRCOPProductType vrcopProductType) {
		return getPersistence().updateImpl(vrcopProductType);
	}

	/**
	* Returns the vrcop product type with the primary key or throws a {@link NoSuchVRCOPProductTypeException} if it could not be found.
	*
	* @param id the primary key of the vrcop product type
	* @return the vrcop product type
	* @throws NoSuchVRCOPProductTypeException if a vrcop product type with the primary key could not be found
	*/
	public static VRCOPProductType findByPrimaryKey(long id)
		throws com.fds.vr.cop.exception.NoSuchVRCOPProductTypeException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vrcop product type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop product type
	* @return the vrcop product type, or <code>null</code> if a vrcop product type with the primary key could not be found
	*/
	public static VRCOPProductType fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCOPProductType> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vrcop product types.
	*
	* @return the vrcop product types
	*/
	public static List<VRCOPProductType> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vrcop product types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @return the range of vrcop product types
	*/
	public static List<VRCOPProductType> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vrcop product types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop product types
	*/
	public static List<VRCOPProductType> findAll(int start, int end,
		OrderByComparator<VRCOPProductType> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop product types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop product types
	* @param end the upper bound of the range of vrcop product types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop product types
	*/
	public static List<VRCOPProductType> findAll(int start, int end,
		OrderByComparator<VRCOPProductType> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vrcop product types from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vrcop product types.
	*
	* @return the number of vrcop product types
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VRCOPProductTypePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPProductTypePersistence, VRCOPProductTypePersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPProductTypePersistence.class);
}