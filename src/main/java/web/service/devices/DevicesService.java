package web.service.devices;

import web.domain.Device;

import java.util.Map;

import web.common.Result;


public interface DevicesService {

	public Result getDevicesList(Map<String, String> map) throws Exception;

	public Device getDevicesSysIdById(Integer id) throws Exception;
	
	public Device getDevicesSysIdByName(String name) throws Exception;

}
