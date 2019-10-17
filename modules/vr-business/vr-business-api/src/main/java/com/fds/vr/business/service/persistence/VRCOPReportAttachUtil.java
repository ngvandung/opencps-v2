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

package com.fds.vr.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VRCOPReportAttach;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the vrcop report attach service. This utility wraps {@link com.fds.vr.business.service.persistence.impl.VRCOPReportAttachPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see VRCOPReportAttachPersistence
 * @see com.fds.vr.business.service.persistence.impl.VRCOPReportAttachPersistenceImpl
 * @generated
 */
@ProviderType
public class VRCOPReportAttachUtil {
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
	public static void clearCache(VRCOPReportAttach vrcopReportAttach) {
		getPersistence().clearCache(vrcopReportAttach);
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
	public static List<VRCOPReportAttach> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VRCOPReportAttach> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VRCOPReportAttach> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VRCOPReportAttach update(VRCOPReportAttach vrcopReportAttach) {
		return getPersistence().update(vrcopReportAttach);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VRCOPReportAttach update(
		VRCOPReportAttach vrcopReportAttach, ServiceContext serviceContext) {
		return getPersistence().update(vrcopReportAttach, serviceContext);
	}

	/**
	* Returns all the vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the matching vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID);
	}

	/**
	* Returns a range of all the vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @return the range of matching vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end);
	}

	/**
	* Returns an ordered range of all the vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID, int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID,
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop report attach in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report attach
	* @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	*/
	public static VRCOPReportAttach findBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportAttachException {
		return getPersistence()
				   .findBycopReportRepositoryID_First(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the first vrcop report attach in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	*/
	public static VRCOPReportAttach fetchBycopReportRepositoryID_First(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportRepositoryID_First(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the last vrcop report attach in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report attach
	* @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	*/
	public static VRCOPReportAttach findBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportAttachException {
		return getPersistence()
				   .findBycopReportRepositoryID_Last(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the last vrcop report attach in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	*/
	public static VRCOPReportAttach fetchBycopReportRepositoryID_Last(
		long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportRepositoryID_Last(mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Returns the vrcop report attachs before and after the current vrcop report attach in the ordered set where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param id the primary key of the current vrcop report attach
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report attach
	* @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	*/
	public static VRCOPReportAttach[] findBycopReportRepositoryID_PrevAndNext(
		long id, long mtCore, long copReportRepositoryID,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportAttachException {
		return getPersistence()
				   .findBycopReportRepositoryID_PrevAndNext(id, mtCore,
			copReportRepositoryID, orderByComparator);
	}

	/**
	* Removes all the vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	*/
	public static void removeBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		getPersistence()
			.removeBycopReportRepositoryID(mtCore, copReportRepositoryID);
	}

	/**
	* Returns the number of vrcop report attachs where mtCore = &#63; and copReportRepositoryID = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportRepositoryID the cop report repository ID
	* @return the number of matching vrcop report attachs
	*/
	public static int countBycopReportRepositoryID(long mtCore,
		long copReportRepositoryID) {
		return getPersistence()
				   .countBycopReportRepositoryID(mtCore, copReportRepositoryID);
	}

	/**
	* Returns all the vrcop report attachs where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the matching vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		return getPersistence().findBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns a range of all the vrcop report attachs where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @return the range of matching vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end);
	}

	/**
	* Returns an ordered range of all the vrcop report attachs where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop report attachs where mtCore = &#63; and copReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findBycopReportNo(long mtCore,
		java.lang.String copReportNo, int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycopReportNo(mtCore, copReportNo, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first vrcop report attach in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report attach
	* @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	*/
	public static VRCOPReportAttach findBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportAttachException {
		return getPersistence()
				   .findBycopReportNo_First(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the first vrcop report attach in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	*/
	public static VRCOPReportAttach fetchBycopReportNo_First(long mtCore,
		java.lang.String copReportNo,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportNo_First(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the last vrcop report attach in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report attach
	* @throws NoSuchVRCOPReportAttachException if a matching vrcop report attach could not be found
	*/
	public static VRCOPReportAttach findBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportAttachException {
		return getPersistence()
				   .findBycopReportNo_Last(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the last vrcop report attach in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop report attach, or <code>null</code> if a matching vrcop report attach could not be found
	*/
	public static VRCOPReportAttach fetchBycopReportNo_Last(long mtCore,
		java.lang.String copReportNo,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return getPersistence()
				   .fetchBycopReportNo_Last(mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Returns the vrcop report attachs before and after the current vrcop report attach in the ordered set where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param id the primary key of the current vrcop report attach
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop report attach
	* @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	*/
	public static VRCOPReportAttach[] findBycopReportNo_PrevAndNext(long id,
		long mtCore, java.lang.String copReportNo,
		OrderByComparator<VRCOPReportAttach> orderByComparator)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportAttachException {
		return getPersistence()
				   .findBycopReportNo_PrevAndNext(id, mtCore, copReportNo,
			orderByComparator);
	}

	/**
	* Removes all the vrcop report attachs where mtCore = &#63; and copReportNo = &#63; from the database.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	*/
	public static void removeBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		getPersistence().removeBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Returns the number of vrcop report attachs where mtCore = &#63; and copReportNo = &#63;.
	*
	* @param mtCore the mt core
	* @param copReportNo the cop report no
	* @return the number of matching vrcop report attachs
	*/
	public static int countBycopReportNo(long mtCore,
		java.lang.String copReportNo) {
		return getPersistence().countBycopReportNo(mtCore, copReportNo);
	}

	/**
	* Caches the vrcop report attach in the entity cache if it is enabled.
	*
	* @param vrcopReportAttach the vrcop report attach
	*/
	public static void cacheResult(VRCOPReportAttach vrcopReportAttach) {
		getPersistence().cacheResult(vrcopReportAttach);
	}

	/**
	* Caches the vrcop report attachs in the entity cache if it is enabled.
	*
	* @param vrcopReportAttachs the vrcop report attachs
	*/
	public static void cacheResult(List<VRCOPReportAttach> vrcopReportAttachs) {
		getPersistence().cacheResult(vrcopReportAttachs);
	}

	/**
	* Creates a new vrcop report attach with the primary key. Does not add the vrcop report attach to the database.
	*
	* @param id the primary key for the new vrcop report attach
	* @return the new vrcop report attach
	*/
	public static VRCOPReportAttach create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the vrcop report attach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop report attach
	* @return the vrcop report attach that was removed
	* @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	*/
	public static VRCOPReportAttach remove(long id)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportAttachException {
		return getPersistence().remove(id);
	}

	public static VRCOPReportAttach updateImpl(
		VRCOPReportAttach vrcopReportAttach) {
		return getPersistence().updateImpl(vrcopReportAttach);
	}

	/**
	* Returns the vrcop report attach with the primary key or throws a {@link NoSuchVRCOPReportAttachException} if it could not be found.
	*
	* @param id the primary key of the vrcop report attach
	* @return the vrcop report attach
	* @throws NoSuchVRCOPReportAttachException if a vrcop report attach with the primary key could not be found
	*/
	public static VRCOPReportAttach findByPrimaryKey(long id)
		throws com.fds.vr.business.exception.NoSuchVRCOPReportAttachException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the vrcop report attach with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop report attach
	* @return the vrcop report attach, or <code>null</code> if a vrcop report attach with the primary key could not be found
	*/
	public static VRCOPReportAttach fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, VRCOPReportAttach> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the vrcop report attachs.
	*
	* @return the vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the vrcop report attachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @return the range of vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the vrcop report attachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findAll(int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the vrcop report attachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPReportAttachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop report attachs
	* @param end the upper bound of the range of vrcop report attachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop report attachs
	*/
	public static List<VRCOPReportAttach> findAll(int start, int end,
		OrderByComparator<VRCOPReportAttach> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the vrcop report attachs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of vrcop report attachs.
	*
	* @return the number of vrcop report attachs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static VRCOPReportAttachPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPReportAttachPersistence, VRCOPReportAttachPersistence> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPReportAttachPersistence.class);
}