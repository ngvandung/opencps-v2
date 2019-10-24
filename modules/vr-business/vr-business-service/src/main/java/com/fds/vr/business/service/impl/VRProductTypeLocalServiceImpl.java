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

package com.fds.vr.business.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fds.vr.business.action.util.ActionUtil;
import com.fds.vr.business.action.util.ConvertFormatDate;
import com.fds.vr.business.model.VRProductType;
import com.fds.vr.business.model.VRProductionPlantProdEquipment;
import com.fds.vr.business.model.impl.VRProductTypeImpl;
import com.fds.vr.business.model.impl.VRProductionPlantProdEquipmentImpl;
import com.fds.vr.business.service.base.VRProductTypeLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the vr product type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.fds.vr.business.service.VRProductTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see VRProductTypeLocalServiceBaseImpl
 * @see com.fds.vr.business.service.VRProductTypeLocalServiceUtil
 */
@ProviderType
public class VRProductTypeLocalServiceImpl
	extends VRProductTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.fds.vr.business.service.VRProductTypeLocalServiceUtil} to access the vr product type local service.
	 */
	
	public List<VRProductType> findByproductPlantID(long mtCore, long productPlantID) throws PortalException, SystemException {
		try {
			return vrProductTypePersistence.findByproductPlantID(mtCore, productPlantID);
		} catch (Exception e) {
			_log.error(e);
		}
		return new ArrayList<VRProductType>();
		
	}

	public void deleteByproductPlantId(long mtCore, long productPlantId) {

		vrProductTypePersistence.removeByproductPlantID(mtCore, productPlantId);
	}

	public VRProductType updateProductType(Map<String, String> mapValues, int mtCore) {
		
		Date now = new Date();

		long vrProductTypeId = counterLocalService.increment(VRProductType.class.getName());

		VRProductType object = vrProductTypePersistence.create(vrProductTypeId);

		/// Add audit fields
		object.setSyncDate(now);
		object.setModifyDate(now);

		// Add other fields
		object.setMtCore(mtCore);
		object.setProductPlantID(Long.valueOf(mapValues.get("productPlantId")));
		object.setSequenceNo(Long.valueOf(mapValues.get("sequenceNo")));
		object.setVehicleClass(mapValues.get("vehicleClass"));
		object.setVehicleTypeCode(mapValues.get("vehicleTypeCode"));
		object.setVehicleTypeDescription(mapValues.get("vehicleTypeDescription"));
		object.setProductClassificationCode(mapValues.get("productClassificationCode"));
		object.setProductClassificationDescription(mapValues.get("productClassificationDescription"));
		object.setTrademark(mapValues.get("trademark"));
		object.setTrademarkName(mapValues.get("trademarkName"));
		object.setCommercialName(mapValues.get("commercialName"));
		object.setModelCode(mapValues.get("modelCode"));
		object.setDesignSymbolNo(mapValues.get("designSymbolNo"));

		return vrProductTypePersistence.update(object);
	}
	
	/*
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		return vrProductTypeFinder.findData(sql, columnNames, dataTypes, modelClazz, modelClassName, start, end);
	}

	public long counData(String sql) throws SystemException {

		return vrProductTypeFinder.countData(sql);
	}
	*/
	
	public JSONArray findByProductionPlanCode(String productionPlantCode,String productClassificationCode) throws SystemException, PortalException{
		
		JSONArray result = JSONFactoryUtil.createJSONArray();
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		
		List<VRProductType> dataList = vrProductTypePersistence.findByPPC_PCC(productionPlantCode,productClassificationCode);
		
		for(VRProductType data:dataList) {
			
			jsonObject = JSONFactoryUtil.createJSONObject();
			
			jsonObject = ActionUtil.object2Json(data, VRProductTypeImpl.class, StringPool.BLANK);
			
			if(Validator.isNotNull(jsonObject)) {
				result.put(jsonObject);
			}
		}
		return result;
	}
	private Log _log = LogFactoryUtil.getLog(VRProductTypeLocalServiceImpl.class);
}