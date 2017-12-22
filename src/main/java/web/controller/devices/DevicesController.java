package web.controller.devices;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import web.common.Result;
import web.common.ResultCode;
import web.service.devices.DevicesService;

@RestController
public class DevicesController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private DevicesService devicesService;
	
	@PostMapping("/getDevicesList")
	public Result getDevicesList(@RequestBody Map<String, String> map){
		Result result = null;
		try {
			result = devicesService.getDevicesList(map);
		} catch (Exception e) {
			result = Result.build(ResultCode.SERVER_INNER_ERROR, ResultCode.SERVER_INNER_ERROR_DESC);
			logger.error("web.controller.devices.DevicesController getDevicesList", e);
			e.printStackTrace();
		}
		return result;
	}
}
