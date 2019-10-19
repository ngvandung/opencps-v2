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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for VRCOPProductionPlantProdEquipment. This utility wraps
 * {@link com.fds.vr.cop.service.impl.VRCOPProductionPlantProdEquipmentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author HoangLeTrongNhan
 * @see VRCOPProductionPlantProdEquipmentLocalService
 * @see com.fds.vr.cop.service.base.VRCOPProductionPlantProdEquipmentLocalServiceBaseImpl
 * @see com.fds.vr.cop.service.impl.VRCOPProductionPlantProdEquipmentLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantProdEquipmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.cop.service.impl.VRCOPProductionPlantProdEquipmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vrcop production plant prod equipment to the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantProdEquipment the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment that was added
	*/
	public static com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment addVRCOPProductionPlantProdEquipment(
		com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		return getService()
				   .addVRCOPProductionPlantProdEquipment(vrcopProductionPlantProdEquipment);
	}

	/**
	* Creates a new vrcop production plant prod equipment with the primary key. Does not add the vrcop production plant prod equipment to the database.
	*
	* @param id the primary key for the new vrcop production plant prod equipment
	* @return the new vrcop production plant prod equipment
	*/
	public static com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment createVRCOPProductionPlantProdEquipment(
		long id) {
		return getService().createVRCOPProductionPlantProdEquipment(id);
	}

	/**
	* Deletes the vrcop production plant prod equipment from the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantProdEquipment the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment that was removed
	*/
	public static com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment deleteVRCOPProductionPlantProdEquipment(
		com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		return getService()
				   .deleteVRCOPProductionPlantProdEquipment(vrcopProductionPlantProdEquipment);
	}

	/**
	* Deletes the vrcop production plant prod equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment that was removed
	* @throws PortalException if a vrcop production plant prod equipment with the primary key could not be found
	*/
	public static com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment deleteVRCOPProductionPlantProdEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRCOPProductionPlantProdEquipment(id);
	}

	public static com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment fetchVRCOPProductionPlantProdEquipment(
		long id) {
		return getService().fetchVRCOPProductionPlantProdEquipment(id);
	}

	/**
	* Returns the vrcop production plant prod equipment with the primary key.
	*
	* @param id the primary key of the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment
	* @throws PortalException if a vrcop production plant prod equipment with the primary key could not be found
	*/
	public static com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment getVRCOPProductionPlantProdEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRCOPProductionPlantProdEquipment(id);
	}

	/**
	* Updates the vrcop production plant prod equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantProdEquipment the vrcop production plant prod equipment
	* @return the vrcop production plant prod equipment that was updated
	*/
	public static com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment updateVRCOPProductionPlantProdEquipment(
		com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment vrcopProductionPlantProdEquipment) {
		return getService()
				   .updateVRCOPProductionPlantProdEquipment(vrcopProductionPlantProdEquipment);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vrcop production plant prod equipments.
	*
	* @return the number of vrcop production plant prod equipments
	*/
	public static int getVRCOPProductionPlantProdEquipmentsCount() {
		return getService().getVRCOPProductionPlantProdEquipmentsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.fds.vr.cop.xmlmodel.VRCOPProductionPlantProdEquipmentModel> getListBy(
		java.lang.String COPReportNo) {
		return getService().getListBy(COPReportNo);
	}

	/**
	* Returns a range of all the vrcop production plant prod equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.cop.model.impl.VRCOPProductionPlantProdEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant prod equipments
	* @param end the upper bound of the range of vrcop production plant prod equipments (not inclusive)
	* @return the range of vrcop production plant prod equipments
	*/
	public static java.util.List<com.fds.vr.cop.model.VRCOPProductionPlantProdEquipment> getVRCOPProductionPlantProdEquipments(
		int start, int end) {
		return getService().getVRCOPProductionPlantProdEquipments(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static VRCOPProductionPlantProdEquipmentLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPProductionPlantProdEquipmentLocalService, VRCOPProductionPlantProdEquipmentLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPProductionPlantProdEquipmentLocalService.class);
}