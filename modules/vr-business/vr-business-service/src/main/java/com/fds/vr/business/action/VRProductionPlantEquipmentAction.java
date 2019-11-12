package com.fds.vr.business.action;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VRProductionPlantEquipmentAction {
	public JSONArray findByProductionPlanCode_ProductClassificationCode(String productionPlantCode,String productClassificationCode);
	
	public boolean deleteProductionPlantEquipment(String ids);
	
	public JSONObject findVRProductionPlantEquipment(User user, ServiceContext serviceContext,
			LinkedHashMap<String, Object> params);
	
}
