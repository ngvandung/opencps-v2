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

package com.fds.vr.business.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for VRCOPProductionPlantEquipment. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRCOPProductionPlantEquipmentLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRCOPProductionPlantEquipmentLocalService
 * @see com.fds.vr.business.service.base.VRCOPProductionPlantEquipmentLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRCOPProductionPlantEquipmentLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRCOPProductionPlantEquipmentLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRCOPProductionPlantEquipmentLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vrcop production plant equipment to the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantEquipment the vrcop production plant equipment
	* @return the vrcop production plant equipment that was added
	*/
	public static com.fds.vr.business.model.VRCOPProductionPlantEquipment addVRCOPProductionPlantEquipment(
		com.fds.vr.business.model.VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		return getService()
				   .addVRCOPProductionPlantEquipment(vrcopProductionPlantEquipment);
	}

	/**
	* Creates a new vrcop production plant equipment with the primary key. Does not add the vrcop production plant equipment to the database.
	*
	* @param id the primary key for the new vrcop production plant equipment
	* @return the new vrcop production plant equipment
	*/
	public static com.fds.vr.business.model.VRCOPProductionPlantEquipment createVRCOPProductionPlantEquipment(
		long id) {
		return getService().createVRCOPProductionPlantEquipment(id);
	}

	/**
	* Deletes the vrcop production plant equipment from the database. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantEquipment the vrcop production plant equipment
	* @return the vrcop production plant equipment that was removed
	*/
	public static com.fds.vr.business.model.VRCOPProductionPlantEquipment deleteVRCOPProductionPlantEquipment(
		com.fds.vr.business.model.VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		return getService()
				   .deleteVRCOPProductionPlantEquipment(vrcopProductionPlantEquipment);
	}

	/**
	* Deletes the vrcop production plant equipment with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vrcop production plant equipment
	* @return the vrcop production plant equipment that was removed
	* @throws PortalException if a vrcop production plant equipment with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRCOPProductionPlantEquipment deleteVRCOPProductionPlantEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRCOPProductionPlantEquipment(id);
	}

	public static com.fds.vr.business.model.VRCOPProductionPlantEquipment fetchVRCOPProductionPlantEquipment(
		long id) {
		return getService().fetchVRCOPProductionPlantEquipment(id);
	}

	/**
	* Returns the vrcop production plant equipment with the primary key.
	*
	* @param id the primary key of the vrcop production plant equipment
	* @return the vrcop production plant equipment
	* @throws PortalException if a vrcop production plant equipment with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRCOPProductionPlantEquipment getVRCOPProductionPlantEquipment(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRCOPProductionPlantEquipment(id);
	}

	public static com.fds.vr.business.model.VRCOPProductionPlantEquipment updateCOPProductionPlantEquipment(
		java.util.Map<java.lang.String, java.lang.String> mapValues, int mtCore) {
		return getService().updateCOPProductionPlantEquipment(mapValues, mtCore);
	}

	/**
	* Updates the vrcop production plant equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrcopProductionPlantEquipment the vrcop production plant equipment
	* @return the vrcop production plant equipment that was updated
	*/
	public static com.fds.vr.business.model.VRCOPProductionPlantEquipment updateVRCOPProductionPlantEquipment(
		com.fds.vr.business.model.VRCOPProductionPlantEquipment vrcopProductionPlantEquipment) {
		return getService()
				   .updateVRCOPProductionPlantEquipment(vrcopProductionPlantEquipment);
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
	* Returns the number of vrcop production plant equipments.
	*
	* @return the number of vrcop production plant equipments
	*/
	public static int getVRCOPProductionPlantEquipmentsCount() {
		return getService().getVRCOPProductionPlantEquipmentsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRCOPProductionPlantEquipment> findBycopReportNo(
		long mtCore, java.lang.String copReportNo)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycopReportNo(mtCore, copReportNo);
	}

	public static java.util.List<com.fds.vr.business.model.VRCOPProductionPlantEquipment> findBycopReportRepositoryID(
		long mtCore, long copReportRepositoryID)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findBycopReportRepositoryID(mtCore, copReportRepositoryID);
	}

	/**
	* Returns a range of all the vrcop production plant equipments.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRCOPProductionPlantEquipmentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vrcop production plant equipments
	* @param end the upper bound of the range of vrcop production plant equipments (not inclusive)
	* @return the range of vrcop production plant equipments
	*/
	public static java.util.List<com.fds.vr.business.model.VRCOPProductionPlantEquipment> getVRCOPProductionPlantEquipments(
		int start, int end) {
		return getService().getVRCOPProductionPlantEquipments(start, end);
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

	public static VRCOPProductionPlantEquipmentLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRCOPProductionPlantEquipmentLocalService, VRCOPProductionPlantEquipmentLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRCOPProductionPlantEquipmentLocalService.class);
}