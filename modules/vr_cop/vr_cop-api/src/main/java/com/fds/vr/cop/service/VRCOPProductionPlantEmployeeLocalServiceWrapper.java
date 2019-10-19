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

package com.fds.vr.cop.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VRCOPProductionPlantEmployeeLocalService}.
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantEmployeeLocalService
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEmployeeLocalServiceWrapper
	implements VRCOPProductionPlantEmployeeLocalService,
		ServiceWrapper<VRCOPProductionPlantEmployeeLocalService> {
	public VRCOPProductionPlantEmployeeLocalServiceWrapper(
		VRCOPProductionPlantEmployeeLocalService vrcopProductionPlantEmployeeLocalService) {
		_vrcopProductionPlantEmployeeLocalService = vrcopProductionPlantEmployeeLocalService;
	}

	/**
	* Adds the vrcop production plant employee to the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantEmployee the vrcop production plant employee
	* @return the vrcop production plant employee that was added
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantEmployee addVRCOPProductionPlantEmployee(
		com.fds.vr.cop.model.VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		return _vrcopProductionPlantEmployeeLocalService.addVRCOPProductionPlantEmployee(vrcopProductionPlantEmployee);
	}

	/**
	* Creates a new vrcop production plant employee with the primary key. Does not add the vrcop production plant employee to the database.
	*
	* @param id the primary key for the new vrcop production plant employee
	* @return the new vrcop production plant employee
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantEmployee createVRCOPProductionPlantEmployee(
		long id) {
		return _vrcopProductionPlantEmployeeLocalService.createVRCOPProductionPlantEmployee(id);
	}

	/**
	* Deletes the vrcop production plant employee from the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantEmployee the vrcop production plant employee
	* @return the vrcop production plant employee that was removed
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantEmployee deleteVRCOPProductionPlantEmployee(
		com.fds.vr.cop.model.VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		return _vrcopProductionPlantEmployeeLocalService.deleteVRCOPProductionPlantEmployee(vrcopProductionPlantEmployee);
	}

	/**
	* Deletes the vrcop production plant employee with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop production plant employee
	* @return the vrcop production plant employee that was removed
	* @throws PortalException if a vrcop production plant employee with the primary key could not be found
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantEmployee deleteVRCOPProductionPlantEmployee(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductionPlantEmployeeLocalService.deleteVRCOPProductionPlantEmployee(id);
	}

	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantEmployee fetchVRCOPProductionPlantEmployee(
		long id) {
		return _vrcopProductionPlantEmployeeLocalService.fetchVRCOPProductionPlantEmployee(id);
	}

	/**
	* Returns the vrcop production plant employee with the primary key.
	*
	* @param id the primary key of the vrcop production plant employee
	* @return the vrcop production plant employee
	* @throws PortalException if a vrcop production plant employee with the primary key could not be found
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantEmployee getVRCOPProductionPlantEmployee(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductionPlantEmployeeLocalService.getVRCOPProductionPlantEmployee(id);
	}

	/**
	* Updates the vrcop production plant employee in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantEmployee the vrcop production plant employee
	* @return the vrcop production plant employee that was updated
	*/
	@Override
	public com.fds.vr.cop.model.VRCOPProductionPlantEmployee updateVRCOPProductionPlantEmployee(
		com.fds.vr.cop.model.VRCOPProductionPlantEmployee vrcopProductionPlantEmployee) {
		return _vrcopProductionPlantEmployeeLocalService.updateVRCOPProductionPlantEmployee(vrcopProductionPlantEmployee);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _vrcopProductionPlantEmployeeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vrcopProductionPlantEmployeeLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _vrcopProductionPlantEmployeeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductionPlantEmployeeLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _vrcopProductionPlantEmployeeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vrcop production plant employees.
	*
	* @return the number of vrcop production plant employees
	*/
	@Override
	public int getVRCOPProductionPlantEmployeesCount() {
		return _vrcopProductionPlantEmployeeLocalService.getVRCOPProductionPlantEmployeesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _vrcopProductionPlantEmployeeLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vrcopProductionPlantEmployeeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _vrcopProductionPlantEmployeeLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _vrcopProductionPlantEmployeeLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.fds.vr.cop.xmlmodel.VRCOPProductionPlantEmployeeModel> getListBy(
		java.lang.String COPReportNo) {
		return _vrcopProductionPlantEmployeeLocalService.getListBy(COPReportNo);
	}

	/**
	* Returns a range of all the vrcop production plant employees.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPProductionPlantEmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant employees
	* @param end the upper bound of the range of vrcop production plant employees (not inclusive)
	* @return the range of vrcop production plant employees
	*/
	@Override
	public java.util.List<com.fds.vr.cop.model.VRCOPProductionPlantEmployee> getVRCOPProductionPlantEmployees(
		int start, int end) {
		return _vrcopProductionPlantEmployeeLocalService.getVRCOPProductionPlantEmployees(start,
			end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _vrcopProductionPlantEmployeeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _vrcopProductionPlantEmployeeLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public VRCOPProductionPlantEmployeeLocalService getWrappedService() {
		return _vrcopProductionPlantEmployeeLocalService;
	}

	@Override
	public void setWrappedService(
		VRCOPProductionPlantEmployeeLocalService vrcopProductionPlantEmployeeLocalService) {
		_vrcopProductionPlantEmployeeLocalService = vrcopProductionPlantEmployeeLocalService;
	}

	private VRCOPProductionPlantEmployeeLocalService _vrcopProductionPlantEmployeeLocalService;
}