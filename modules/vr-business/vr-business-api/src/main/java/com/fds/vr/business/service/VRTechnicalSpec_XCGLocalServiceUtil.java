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
 * Provides the local service utility for VRTechnicalSpec_XCG. This utility wraps
 * {@link com.fds.vr.business.service.impl.VRTechnicalSpec_XCGLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VRTechnicalSpec_XCGLocalService
 * @see com.fds.vr.business.service.base.VRTechnicalSpec_XCGLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VRTechnicalSpec_XCGLocalServiceImpl
 * @generated
 */
@ProviderType
public class VRTechnicalSpec_XCGLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VRTechnicalSpec_XCGLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr technical spec_xcg to the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCG the vr technical spec_xcg
	* @return the vr technical spec_xcg that was added
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCG addVRTechnicalSpec_XCG(
		com.fds.vr.business.model.VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		return getService().addVRTechnicalSpec_XCG(vrTechnicalSpec_XCG);
	}

	/**
	* Creates a new vr technical spec_xcg with the primary key. Does not add the vr technical spec_xcg to the database.
	*
	* @param id the primary key for the new vr technical spec_xcg
	* @return the new vr technical spec_xcg
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCG createVRTechnicalSpec_XCG(
		long id) {
		return getService().createVRTechnicalSpec_XCG(id);
	}

	/**
	* Deletes the vr technical spec_xcg from the database. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCG the vr technical spec_xcg
	* @return the vr technical spec_xcg that was removed
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCG deleteVRTechnicalSpec_XCG(
		com.fds.vr.business.model.VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		return getService().deleteVRTechnicalSpec_XCG(vrTechnicalSpec_XCG);
	}

	/**
	* Deletes the vr technical spec_xcg with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr technical spec_xcg
	* @return the vr technical spec_xcg that was removed
	* @throws PortalException if a vr technical spec_xcg with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCG deleteVRTechnicalSpec_XCG(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVRTechnicalSpec_XCG(id);
	}

	public static com.fds.vr.business.model.VRTechnicalSpec_XCG fetchVRTechnicalSpec_XCG(
		long id) {
		return getService().fetchVRTechnicalSpec_XCG(id);
	}

	/**
	* Returns the vr technical spec_xcg with the primary key.
	*
	* @param id the primary key of the vr technical spec_xcg
	* @return the vr technical spec_xcg
	* @throws PortalException if a vr technical spec_xcg with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCG getVRTechnicalSpec_XCG(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVRTechnicalSpec_XCG(id);
	}

	/**
	* Updates the vr technical spec_xcg in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrTechnicalSpec_XCG the vr technical spec_xcg
	* @return the vr technical spec_xcg that was updated
	*/
	public static com.fds.vr.business.model.VRTechnicalSpec_XCG updateVRTechnicalSpec_XCG(
		com.fds.vr.business.model.VRTechnicalSpec_XCG vrTechnicalSpec_XCG) {
		return getService().updateVRTechnicalSpec_XCG(vrTechnicalSpec_XCG);
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
	* Returns the number of vr technical spec_xcgs.
	*
	* @return the number of vr technical spec_xcgs
	*/
	public static int getVRTechnicalSpec_XCGsCount() {
		return getService().getVRTechnicalSpec_XCGsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCG> adminProcessData(
		com.liferay.portal.kernel.json.JSONArray arrayData, long dossierId,
		long mtCore, long vehicleTypeCertificateId) {
		return getService()
				   .adminProcessData(arrayData, dossierId, mtCore,
			vehicleTypeCertificateId);
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCG> findByConvertAssembleId(
		long convertAssembleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByConvertAssembleId(convertAssembleId);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCG> findByDeliverableCode(
		java.lang.String deliverableCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDeliverableCode(deliverableCode);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCG> findByDossierId(
		long dossierId, int start, int end) {
		return getService().findByDossierId(dossierId, start, end);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCG> findByDossierId(
		long dossierId, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDossierId(dossierId, mtCore);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCG> findByDossierIdCTN(
		java.lang.String dossierIdCTN)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDossierIdCTN(dossierIdCTN);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCG> findByDossierNo(
		java.lang.String dossierNo, long mtCore)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDossierNo(dossierNo, mtCore);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCG> findByReferenceUid(
		java.lang.String referenceUid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByReferenceUid(referenceUid);
	}

	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCG> findByVehicleCertificateId(
		long vehiclerCertificateId, int start, int end) {
		return getService()
				   .findByVehicleCertificateId(vehiclerCertificateId, start, end);
	}

	/**
	* Returns a range of all the vr technical spec_xcgs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VRTechnicalSpec_XCGModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr technical spec_xcgs
	* @param end the upper bound of the range of vr technical spec_xcgs (not inclusive)
	* @return the range of vr technical spec_xcgs
	*/
	public static java.util.List<com.fds.vr.business.model.VRTechnicalSpec_XCG> getVRTechnicalSpec_XCGs(
		int start, int end) {
		return getService().getVRTechnicalSpec_XCGs(start, end);
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

	public static VRTechnicalSpec_XCGLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VRTechnicalSpec_XCGLocalService, VRTechnicalSpec_XCGLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VRTechnicalSpec_XCGLocalService.class);
}