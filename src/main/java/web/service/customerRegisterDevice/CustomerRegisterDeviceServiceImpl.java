package web.service.customerRegisterDevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.common.UUIDUtils;
import web.domain.CustomerRegisterDevice;
import web.mapper.customerRegisterDevice.CustomerRegisterDeviceMapper;
@Service
public class CustomerRegisterDeviceServiceImpl implements CustomerRegisterDeviceService {
	@Autowired
	private CustomerRegisterDeviceMapper customerRegisterDeviceMapper;
	@Override
	public void insert(CustomerRegisterDevice customerRegisterDevice) throws Exception {
		customerRegisterDevice.setCustomerRegisterDeviceSysId(UUIDUtils.getUUID());
		customerRegisterDeviceMapper.insert(customerRegisterDevice);
	}

}
