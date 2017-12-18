package web.service.devices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.mapper.devices.DevicesMapper;

@Service
public class DevicesServiceImpl implements DevicesService {
	
	@Autowired
	private DevicesMapper devicesMapper;

	@Override
	public void getDevicesList() throws Exception {
		devicesMapper.getDevicesList();
	}

}
