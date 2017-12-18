package web.controller.devices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import web.common.Result;
import web.service.devices.DevicesService;

@RestController
public class DevicesController {
	
	@Autowired
	private DevicesService devicesService;
	
	public Result getDevicesList(){
		try {
			devicesService.getDevicesList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
