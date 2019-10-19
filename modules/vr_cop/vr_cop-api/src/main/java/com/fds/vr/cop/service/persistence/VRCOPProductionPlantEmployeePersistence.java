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

import com.fds.vr.cop.exception.NoSuchVRCOPProductionPlantEmployeeException;
import com.fds.vr.cop.model.VRCOPProductionPlantEmployee;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vrcop production plant employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author HoangLeTrongNhan
 * @see com.fds.vr.cop.service.persistence.impl.VRCOPProductionPlantEmployeePersistenceImpl
 * @see VRCOPProductionPlantEmployeeUtil
 * @generated
 */
@ProviderType
public interface VRCOPProductionPlantEmployeePersistence extends BasePersistence<VRCOPProductionPlantEmployee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRCOPProductionPlantEmployeeUtil} to access the vrcop production plant employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vrcop production plant employees where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @return the matching vrcop production plant employees
	*/
	public java.util.List<VRCOPProductionPlantEmployee> findByCOP_REPORT_NO(
		java.lang.String COPReportNo);

	/**
	* Returns a range of all the vrcop production plant employees where COPReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param COPReportNo the cop report no
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @return the range of matching vrcop production plant employees
	*/
	public java.util.List<VRCOPProductionPlantEmployee> findByCOP_REPORT_NO(
		java.lang.String COPReportNo, int start, int end);

	/**
	* Returns an ordered range of all the vrcop production plant employees where COPReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param COPReportNo the cop report no
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vrcop production plant employees
	*/
	public java.util.List<VRCOPProductionPlantEmployee> findByCOP_REPORT_NO(
		java.lang.String COPReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop production plant employees where COPReportNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param COPReportNo the cop report no
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vrcop production plant employees
	*/
	public java.util.List<VRCOPProductionPlantEmployee> findByCOP_REPORT_NO(
		java.lang.String COPReportNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vrcop production plant employee in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	*/
	public VRCOPProductionPlantEmployee findByCOP_REPORT_NO_First(
		java.lang.String COPReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException;

	/**
	* Returns the first vrcop production plant employee in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	*/
	public VRCOPProductionPlantEmployee fetchByCOP_REPORT_NO_First(
		java.lang.String COPReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator);

	/**
	* Returns the last vrcop production plant employee in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a matching vrcop production plant employee could not be found
	*/
	public VRCOPProductionPlantEmployee findByCOP_REPORT_NO_Last(
		java.lang.String COPReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException;

	/**
	* Returns the last vrcop production plant employee in the ordered set where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vrcop production plant employee, or <code>null</code> if a matching vrcop production plant employee could not be found
	*/
	public VRCOPProductionPlantEmployee fetchByCOP_REPORT_NO_Last(
		java.lang.String COPReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator);

	/**
	* Returns the vrcop production plant employees before and after the current vrcop production plant employee in the ordered set where COPReportNo = &#63;.
	*
	* @param id the primary key of the current vrcop production plant employee
	* @param COPReportNo the cop report no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	*/
	public VRCOPProductionPlantEmployee[] findByCOP_REPORT_NO_PrevAndNext(
		long id, java.lang.String COPReportNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator)
		throws NoSuchVRCOPProductionPlantEmployeeException;

	/**
	* Removes all the vrcop production plant employees where COPReportNo = &#63; from the database.
	*
	* @param COPReportNo the cop report no
	*/
	public void removeByCOP_REPORT_NO(java.lang.String COPReportNo);

	/**
	* Returns the number of vrcop production plant employees where COPReportNo = &#63;.
	*
	* @param COPReportNo the cop report no
	* @return the number of matching vrcop production plant employees
	*/
	public int countByCOP_REPORT_NO(java.lang.String COPReportNo);

	/**
	* Caches the vrcop production plant employee in the entity cache if it is enabled.
	*
	* @param vrcopProductionPlantEmployee the vrcop production plant employee
	*/
	public void cacheResult(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee);

	/**
	* Caches the vrcop production plant employees in the entity cache if it is enabled.
	*
	* @param vrcopProductionPlantEmployees the vrcop production plant employees
	*/
	public void cacheResult(
		java.util.List<VRCOPProductionPlantEmployee> vrcopProductionPlantEmployees);

	/**
	* Creates a new vrcop production plant employee with the primary key. Does not add the vrcop production plant employee to the database.
	*
	* @param id the primary key for the new vrcop production plant employee
	* @return the new vrcop production plant employee
	*/
	public VRCOPProductionPlantEmployee create(long id);

	/**
	* Removes the vrcop production plant employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop production plant employee
	* @return the vrcop production plant employee that was removed
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	*/
	public VRCOPProductionPlantEmployee remove(long id)
		throws NoSuchVRCOPProductionPlantEmployeeException;

	public VRCOPProductionPlantEmployee updateImpl(
		VRCOPProductionPlantEmployee vrcopProductionPlantEmployee);

	/**
	* Returns the vrcop production plant employee with the primary key or throws a {@link NoSuchVRCOPProductionPlantEmployeeException} if it could not be found.
	*
	* @param id the primary key of the vrcop production plant employee
	* @return the vrcop production plant employee
	* @throws NoSuchVRCOPProductionPlantEmployeeException if a vrcop production plant employee with the primary key could not be found
	*/
	public VRCOPProductionPlantEmployee findByPrimaryKey(long id)
		throws NoSuchVRCOPProductionPlantEmployeeException;

	/**
	* Returns the vrcop production plant employee with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vrcop production plant employee
	* @return the vrcop production plant employee, or <code>null</code> if a vrcop production plant employee with the primary key could not be found
	*/
	public VRCOPProductionPlantEmployee fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRCOPProductionPlantEmployee> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vrcop production plant employees.
	*
	* @return the vrcop production plant employees
	*/
	public java.util.List<VRCOPProductionPlantEmployee> findAll();

	/**
	* Returns a range of all the vrcop production plant employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @return the range of vrcop production plant employees
	*/
	public java.util.List<VRCOPProductionPlantEmployee> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the vrcop production plant employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vrcop production plant employees
	*/
	public java.util.List<VRCOPProductionPlantEmployee> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator);

	/**
	* Returns an ordered range of all the vrcop production plant employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vrcop production plant employees
	*/
	public java.util.List<VRCOPProductionPlantEmployee> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRCOPProductionPlantEmployee> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vrcop production plant employees from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vrcop production plant employees.
	*
	* @return the number of vrcop production plant employees
	*/
	public int countAll();
}