package com.fds.vr.business.action;

import com.fds.vr.business.model.VRVehicleRecord;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.InputStream;
import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public interface VRVehicleRecordAction {

	public JSONObject createVRVehicleRecord(VRVehicleRecord object);

	public JSONObject deleteVRVehicleRecord(long id);

	JSONObject findVRVehicleRecord(User user, ServiceContext serviceContext, LinkedHashMap<String, Object> params);

	public JSONObject importVRVehicleRecord(User user, ServiceContext serviceContext, InputStream inputStream);

	public JSONObject updateVRVehicleRecord(VRVehicleRecord object);

}
