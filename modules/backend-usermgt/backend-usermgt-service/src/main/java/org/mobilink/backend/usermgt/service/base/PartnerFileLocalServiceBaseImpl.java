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

package org.mobilink.backend.usermgt.service.base;

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

import org.mobilink.backend.usermgt.model.PartnerFile;
import org.mobilink.backend.usermgt.service.PartnerFileLocalService;
import org.mobilink.backend.usermgt.service.persistence.ContactGroupPersistence;
import org.mobilink.backend.usermgt.service.persistence.ContactPersistence;
import org.mobilink.backend.usermgt.service.persistence.EmployeeFilePersistence;
import org.mobilink.backend.usermgt.service.persistence.EmployeeJobPosPersistence;
import org.mobilink.backend.usermgt.service.persistence.EmployeePersistence;
import org.mobilink.backend.usermgt.service.persistence.JobPosPersistence;
import org.mobilink.backend.usermgt.service.persistence.JoinSiteStatusPersistence;
import org.mobilink.backend.usermgt.service.persistence.OfficeSitePersistence;
import org.mobilink.backend.usermgt.service.persistence.PartnerFilePersistence;
import org.mobilink.backend.usermgt.service.persistence.PartnerPersistence;
import org.mobilink.backend.usermgt.service.persistence.WorkingUnitPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the partner file local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.mobilink.backend.usermgt.service.impl.PartnerFileLocalServiceImpl}.
 * </p>
 *
 * @author Binhth
 * @see org.mobilink.backend.usermgt.service.impl.PartnerFileLocalServiceImpl
 * @see org.mobilink.backend.usermgt.service.PartnerFileLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class PartnerFileLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements PartnerFileLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.mobilink.backend.usermgt.service.PartnerFileLocalServiceUtil} to access the partner file local service.
	 */

	/**
	 * Adds the partner file to the database. Also notifies the appropriate model listeners.
	 *
	 * @param partnerFile the partner file
	 * @return the partner file that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PartnerFile addPartnerFile(PartnerFile partnerFile) {
		partnerFile.setNew(true);

		return partnerFilePersistence.update(partnerFile);
	}

	/**
	 * Creates a new partner file with the primary key. Does not add the partner file to the database.
	 *
	 * @param partnerFileId the primary key for the new partner file
	 * @return the new partner file
	 */
	@Override
	public PartnerFile createPartnerFile(long partnerFileId) {
		return partnerFilePersistence.create(partnerFileId);
	}

	/**
	 * Deletes the partner file with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param partnerFileId the primary key of the partner file
	 * @return the partner file that was removed
	 * @throws PortalException if a partner file with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PartnerFile deletePartnerFile(long partnerFileId)
		throws PortalException {
		return partnerFilePersistence.remove(partnerFileId);
	}

	/**
	 * Deletes the partner file from the database. Also notifies the appropriate model listeners.
	 *
	 * @param partnerFile the partner file
	 * @return the partner file that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PartnerFile deletePartnerFile(PartnerFile partnerFile) {
		return partnerFilePersistence.remove(partnerFile);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(PartnerFile.class,
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
		return partnerFilePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.mobilink.backend.usermgt.model.impl.PartnerFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return partnerFilePersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.mobilink.backend.usermgt.model.impl.PartnerFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return partnerFilePersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return partnerFilePersistence.countWithDynamicQuery(dynamicQuery);
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
		return partnerFilePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public PartnerFile fetchPartnerFile(long partnerFileId) {
		return partnerFilePersistence.fetchByPrimaryKey(partnerFileId);
	}

	/**
	 * Returns the partner file matching the UUID and group.
	 *
	 * @param uuid the partner file's UUID
	 * @param groupId the primary key of the group
	 * @return the matching partner file, or <code>null</code> if a matching partner file could not be found
	 */
	@Override
	public PartnerFile fetchPartnerFileByUuidAndGroupId(String uuid,
		long groupId) {
		return partnerFilePersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the partner file with the primary key.
	 *
	 * @param partnerFileId the primary key of the partner file
	 * @return the partner file
	 * @throws PortalException if a partner file with the primary key could not be found
	 */
	@Override
	public PartnerFile getPartnerFile(long partnerFileId)
		throws PortalException {
		return partnerFilePersistence.findByPrimaryKey(partnerFileId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(partnerFileLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PartnerFile.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("partnerFileId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(partnerFileLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(PartnerFile.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"partnerFileId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(partnerFileLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(PartnerFile.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("partnerFileId");
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

		exportActionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<PartnerFile>() {
				@Override
				public void performAction(PartnerFile partnerFile)
					throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(portletDataContext,
						partnerFile);
				}
			});
		exportActionableDynamicQuery.setStagedModelType(new StagedModelType(
				PortalUtil.getClassNameId(PartnerFile.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return partnerFileLocalService.deletePartnerFile((PartnerFile)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return partnerFilePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the partner files matching the UUID and company.
	 *
	 * @param uuid the UUID of the partner files
	 * @param companyId the primary key of the company
	 * @return the matching partner files, or an empty list if no matches were found
	 */
	@Override
	public List<PartnerFile> getPartnerFilesByUuidAndCompanyId(String uuid,
		long companyId) {
		return partnerFilePersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of partner files matching the UUID and company.
	 *
	 * @param uuid the UUID of the partner files
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of partner files
	 * @param end the upper bound of the range of partner files (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching partner files, or an empty list if no matches were found
	 */
	@Override
	public List<PartnerFile> getPartnerFilesByUuidAndCompanyId(String uuid,
		long companyId, int start, int end,
		OrderByComparator<PartnerFile> orderByComparator) {
		return partnerFilePersistence.findByUuid_C(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	 * Returns the partner file matching the UUID and group.
	 *
	 * @param uuid the partner file's UUID
	 * @param groupId the primary key of the group
	 * @return the matching partner file
	 * @throws PortalException if a matching partner file could not be found
	 */
	@Override
	public PartnerFile getPartnerFileByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {
		return partnerFilePersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the partner files.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.mobilink.backend.usermgt.model.impl.PartnerFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of partner files
	 * @param end the upper bound of the range of partner files (not inclusive)
	 * @return the range of partner files
	 */
	@Override
	public List<PartnerFile> getPartnerFiles(int start, int end) {
		return partnerFilePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of partner files.
	 *
	 * @return the number of partner files
	 */
	@Override
	public int getPartnerFilesCount() {
		return partnerFilePersistence.countAll();
	}

	/**
	 * Updates the partner file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param partnerFile the partner file
	 * @return the partner file that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PartnerFile updatePartnerFile(PartnerFile partnerFile) {
		return partnerFilePersistence.update(partnerFile);
	}

	/**
	 * Returns the contact local service.
	 *
	 * @return the contact local service
	 */
	public org.mobilink.backend.usermgt.service.ContactLocalService getContactLocalService() {
		return contactLocalService;
	}

	/**
	 * Sets the contact local service.
	 *
	 * @param contactLocalService the contact local service
	 */
	public void setContactLocalService(
		org.mobilink.backend.usermgt.service.ContactLocalService contactLocalService) {
		this.contactLocalService = contactLocalService;
	}

	/**
	 * Returns the contact persistence.
	 *
	 * @return the contact persistence
	 */
	public ContactPersistence getContactPersistence() {
		return contactPersistence;
	}

	/**
	 * Sets the contact persistence.
	 *
	 * @param contactPersistence the contact persistence
	 */
	public void setContactPersistence(ContactPersistence contactPersistence) {
		this.contactPersistence = contactPersistence;
	}

	/**
	 * Returns the contact group local service.
	 *
	 * @return the contact group local service
	 */
	public org.mobilink.backend.usermgt.service.ContactGroupLocalService getContactGroupLocalService() {
		return contactGroupLocalService;
	}

	/**
	 * Sets the contact group local service.
	 *
	 * @param contactGroupLocalService the contact group local service
	 */
	public void setContactGroupLocalService(
		org.mobilink.backend.usermgt.service.ContactGroupLocalService contactGroupLocalService) {
		this.contactGroupLocalService = contactGroupLocalService;
	}

	/**
	 * Returns the contact group persistence.
	 *
	 * @return the contact group persistence
	 */
	public ContactGroupPersistence getContactGroupPersistence() {
		return contactGroupPersistence;
	}

	/**
	 * Sets the contact group persistence.
	 *
	 * @param contactGroupPersistence the contact group persistence
	 */
	public void setContactGroupPersistence(
		ContactGroupPersistence contactGroupPersistence) {
		this.contactGroupPersistence = contactGroupPersistence;
	}

	/**
	 * Returns the employee local service.
	 *
	 * @return the employee local service
	 */
	public org.mobilink.backend.usermgt.service.EmployeeLocalService getEmployeeLocalService() {
		return employeeLocalService;
	}

	/**
	 * Sets the employee local service.
	 *
	 * @param employeeLocalService the employee local service
	 */
	public void setEmployeeLocalService(
		org.mobilink.backend.usermgt.service.EmployeeLocalService employeeLocalService) {
		this.employeeLocalService = employeeLocalService;
	}

	/**
	 * Returns the employee persistence.
	 *
	 * @return the employee persistence
	 */
	public EmployeePersistence getEmployeePersistence() {
		return employeePersistence;
	}

	/**
	 * Sets the employee persistence.
	 *
	 * @param employeePersistence the employee persistence
	 */
	public void setEmployeePersistence(EmployeePersistence employeePersistence) {
		this.employeePersistence = employeePersistence;
	}

	/**
	 * Returns the employee file local service.
	 *
	 * @return the employee file local service
	 */
	public org.mobilink.backend.usermgt.service.EmployeeFileLocalService getEmployeeFileLocalService() {
		return employeeFileLocalService;
	}

	/**
	 * Sets the employee file local service.
	 *
	 * @param employeeFileLocalService the employee file local service
	 */
	public void setEmployeeFileLocalService(
		org.mobilink.backend.usermgt.service.EmployeeFileLocalService employeeFileLocalService) {
		this.employeeFileLocalService = employeeFileLocalService;
	}

	/**
	 * Returns the employee file persistence.
	 *
	 * @return the employee file persistence
	 */
	public EmployeeFilePersistence getEmployeeFilePersistence() {
		return employeeFilePersistence;
	}

	/**
	 * Sets the employee file persistence.
	 *
	 * @param employeeFilePersistence the employee file persistence
	 */
	public void setEmployeeFilePersistence(
		EmployeeFilePersistence employeeFilePersistence) {
		this.employeeFilePersistence = employeeFilePersistence;
	}

	/**
	 * Returns the employee job pos local service.
	 *
	 * @return the employee job pos local service
	 */
	public org.mobilink.backend.usermgt.service.EmployeeJobPosLocalService getEmployeeJobPosLocalService() {
		return employeeJobPosLocalService;
	}

	/**
	 * Sets the employee job pos local service.
	 *
	 * @param employeeJobPosLocalService the employee job pos local service
	 */
	public void setEmployeeJobPosLocalService(
		org.mobilink.backend.usermgt.service.EmployeeJobPosLocalService employeeJobPosLocalService) {
		this.employeeJobPosLocalService = employeeJobPosLocalService;
	}

	/**
	 * Returns the employee job pos persistence.
	 *
	 * @return the employee job pos persistence
	 */
	public EmployeeJobPosPersistence getEmployeeJobPosPersistence() {
		return employeeJobPosPersistence;
	}

	/**
	 * Sets the employee job pos persistence.
	 *
	 * @param employeeJobPosPersistence the employee job pos persistence
	 */
	public void setEmployeeJobPosPersistence(
		EmployeeJobPosPersistence employeeJobPosPersistence) {
		this.employeeJobPosPersistence = employeeJobPosPersistence;
	}

	/**
	 * Returns the job pos local service.
	 *
	 * @return the job pos local service
	 */
	public org.mobilink.backend.usermgt.service.JobPosLocalService getJobPosLocalService() {
		return jobPosLocalService;
	}

	/**
	 * Sets the job pos local service.
	 *
	 * @param jobPosLocalService the job pos local service
	 */
	public void setJobPosLocalService(
		org.mobilink.backend.usermgt.service.JobPosLocalService jobPosLocalService) {
		this.jobPosLocalService = jobPosLocalService;
	}

	/**
	 * Returns the job pos persistence.
	 *
	 * @return the job pos persistence
	 */
	public JobPosPersistence getJobPosPersistence() {
		return jobPosPersistence;
	}

	/**
	 * Sets the job pos persistence.
	 *
	 * @param jobPosPersistence the job pos persistence
	 */
	public void setJobPosPersistence(JobPosPersistence jobPosPersistence) {
		this.jobPosPersistence = jobPosPersistence;
	}

	/**
	 * Returns the join site status local service.
	 *
	 * @return the join site status local service
	 */
	public org.mobilink.backend.usermgt.service.JoinSiteStatusLocalService getJoinSiteStatusLocalService() {
		return joinSiteStatusLocalService;
	}

	/**
	 * Sets the join site status local service.
	 *
	 * @param joinSiteStatusLocalService the join site status local service
	 */
	public void setJoinSiteStatusLocalService(
		org.mobilink.backend.usermgt.service.JoinSiteStatusLocalService joinSiteStatusLocalService) {
		this.joinSiteStatusLocalService = joinSiteStatusLocalService;
	}

	/**
	 * Returns the join site status persistence.
	 *
	 * @return the join site status persistence
	 */
	public JoinSiteStatusPersistence getJoinSiteStatusPersistence() {
		return joinSiteStatusPersistence;
	}

	/**
	 * Sets the join site status persistence.
	 *
	 * @param joinSiteStatusPersistence the join site status persistence
	 */
	public void setJoinSiteStatusPersistence(
		JoinSiteStatusPersistence joinSiteStatusPersistence) {
		this.joinSiteStatusPersistence = joinSiteStatusPersistence;
	}

	/**
	 * Returns the office site local service.
	 *
	 * @return the office site local service
	 */
	public org.mobilink.backend.usermgt.service.OfficeSiteLocalService getOfficeSiteLocalService() {
		return officeSiteLocalService;
	}

	/**
	 * Sets the office site local service.
	 *
	 * @param officeSiteLocalService the office site local service
	 */
	public void setOfficeSiteLocalService(
		org.mobilink.backend.usermgt.service.OfficeSiteLocalService officeSiteLocalService) {
		this.officeSiteLocalService = officeSiteLocalService;
	}

	/**
	 * Returns the office site persistence.
	 *
	 * @return the office site persistence
	 */
	public OfficeSitePersistence getOfficeSitePersistence() {
		return officeSitePersistence;
	}

	/**
	 * Sets the office site persistence.
	 *
	 * @param officeSitePersistence the office site persistence
	 */
	public void setOfficeSitePersistence(
		OfficeSitePersistence officeSitePersistence) {
		this.officeSitePersistence = officeSitePersistence;
	}

	/**
	 * Returns the partner local service.
	 *
	 * @return the partner local service
	 */
	public org.mobilink.backend.usermgt.service.PartnerLocalService getPartnerLocalService() {
		return partnerLocalService;
	}

	/**
	 * Sets the partner local service.
	 *
	 * @param partnerLocalService the partner local service
	 */
	public void setPartnerLocalService(
		org.mobilink.backend.usermgt.service.PartnerLocalService partnerLocalService) {
		this.partnerLocalService = partnerLocalService;
	}

	/**
	 * Returns the partner persistence.
	 *
	 * @return the partner persistence
	 */
	public PartnerPersistence getPartnerPersistence() {
		return partnerPersistence;
	}

	/**
	 * Sets the partner persistence.
	 *
	 * @param partnerPersistence the partner persistence
	 */
	public void setPartnerPersistence(PartnerPersistence partnerPersistence) {
		this.partnerPersistence = partnerPersistence;
	}

	/**
	 * Returns the partner file local service.
	 *
	 * @return the partner file local service
	 */
	public PartnerFileLocalService getPartnerFileLocalService() {
		return partnerFileLocalService;
	}

	/**
	 * Sets the partner file local service.
	 *
	 * @param partnerFileLocalService the partner file local service
	 */
	public void setPartnerFileLocalService(
		PartnerFileLocalService partnerFileLocalService) {
		this.partnerFileLocalService = partnerFileLocalService;
	}

	/**
	 * Returns the partner file persistence.
	 *
	 * @return the partner file persistence
	 */
	public PartnerFilePersistence getPartnerFilePersistence() {
		return partnerFilePersistence;
	}

	/**
	 * Sets the partner file persistence.
	 *
	 * @param partnerFilePersistence the partner file persistence
	 */
	public void setPartnerFilePersistence(
		PartnerFilePersistence partnerFilePersistence) {
		this.partnerFilePersistence = partnerFilePersistence;
	}

	/**
	 * Returns the working unit local service.
	 *
	 * @return the working unit local service
	 */
	public org.mobilink.backend.usermgt.service.WorkingUnitLocalService getWorkingUnitLocalService() {
		return workingUnitLocalService;
	}

	/**
	 * Sets the working unit local service.
	 *
	 * @param workingUnitLocalService the working unit local service
	 */
	public void setWorkingUnitLocalService(
		org.mobilink.backend.usermgt.service.WorkingUnitLocalService workingUnitLocalService) {
		this.workingUnitLocalService = workingUnitLocalService;
	}

	/**
	 * Returns the working unit persistence.
	 *
	 * @return the working unit persistence
	 */
	public WorkingUnitPersistence getWorkingUnitPersistence() {
		return workingUnitPersistence;
	}

	/**
	 * Sets the working unit persistence.
	 *
	 * @param workingUnitPersistence the working unit persistence
	 */
	public void setWorkingUnitPersistence(
		WorkingUnitPersistence workingUnitPersistence) {
		this.workingUnitPersistence = workingUnitPersistence;
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
		persistedModelLocalServiceRegistry.register("org.mobilink.backend.usermgt.model.PartnerFile",
			partnerFileLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"org.mobilink.backend.usermgt.model.PartnerFile");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return PartnerFileLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return PartnerFile.class;
	}

	protected String getModelClassName() {
		return PartnerFile.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = partnerFilePersistence.getDataSource();

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

	@BeanReference(type = org.mobilink.backend.usermgt.service.ContactLocalService.class)
	protected org.mobilink.backend.usermgt.service.ContactLocalService contactLocalService;
	@BeanReference(type = ContactPersistence.class)
	protected ContactPersistence contactPersistence;
	@BeanReference(type = org.mobilink.backend.usermgt.service.ContactGroupLocalService.class)
	protected org.mobilink.backend.usermgt.service.ContactGroupLocalService contactGroupLocalService;
	@BeanReference(type = ContactGroupPersistence.class)
	protected ContactGroupPersistence contactGroupPersistence;
	@BeanReference(type = org.mobilink.backend.usermgt.service.EmployeeLocalService.class)
	protected org.mobilink.backend.usermgt.service.EmployeeLocalService employeeLocalService;
	@BeanReference(type = EmployeePersistence.class)
	protected EmployeePersistence employeePersistence;
	@BeanReference(type = org.mobilink.backend.usermgt.service.EmployeeFileLocalService.class)
	protected org.mobilink.backend.usermgt.service.EmployeeFileLocalService employeeFileLocalService;
	@BeanReference(type = EmployeeFilePersistence.class)
	protected EmployeeFilePersistence employeeFilePersistence;
	@BeanReference(type = org.mobilink.backend.usermgt.service.EmployeeJobPosLocalService.class)
	protected org.mobilink.backend.usermgt.service.EmployeeJobPosLocalService employeeJobPosLocalService;
	@BeanReference(type = EmployeeJobPosPersistence.class)
	protected EmployeeJobPosPersistence employeeJobPosPersistence;
	@BeanReference(type = org.mobilink.backend.usermgt.service.JobPosLocalService.class)
	protected org.mobilink.backend.usermgt.service.JobPosLocalService jobPosLocalService;
	@BeanReference(type = JobPosPersistence.class)
	protected JobPosPersistence jobPosPersistence;
	@BeanReference(type = org.mobilink.backend.usermgt.service.JoinSiteStatusLocalService.class)
	protected org.mobilink.backend.usermgt.service.JoinSiteStatusLocalService joinSiteStatusLocalService;
	@BeanReference(type = JoinSiteStatusPersistence.class)
	protected JoinSiteStatusPersistence joinSiteStatusPersistence;
	@BeanReference(type = org.mobilink.backend.usermgt.service.OfficeSiteLocalService.class)
	protected org.mobilink.backend.usermgt.service.OfficeSiteLocalService officeSiteLocalService;
	@BeanReference(type = OfficeSitePersistence.class)
	protected OfficeSitePersistence officeSitePersistence;
	@BeanReference(type = org.mobilink.backend.usermgt.service.PartnerLocalService.class)
	protected org.mobilink.backend.usermgt.service.PartnerLocalService partnerLocalService;
	@BeanReference(type = PartnerPersistence.class)
	protected PartnerPersistence partnerPersistence;
	@BeanReference(type = PartnerFileLocalService.class)
	protected PartnerFileLocalService partnerFileLocalService;
	@BeanReference(type = PartnerFilePersistence.class)
	protected PartnerFilePersistence partnerFilePersistence;
	@BeanReference(type = org.mobilink.backend.usermgt.service.WorkingUnitLocalService.class)
	protected org.mobilink.backend.usermgt.service.WorkingUnitLocalService workingUnitLocalService;
	@BeanReference(type = WorkingUnitPersistence.class)
	protected WorkingUnitPersistence workingUnitPersistence;
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