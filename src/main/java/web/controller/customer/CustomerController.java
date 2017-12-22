package web.controller.customer;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import web.common.PasswordHelper;
import web.common.Result;
import web.common.ResultCode;
import web.common.StrUtils;
import web.common.UUIDUtils;
import web.domain.Customer;
import web.domain.CustomerInfo;
import web.domain.CustomerRegisterDevice;
import web.domain.Device;
import web.service.customer.CustomerService;
import web.service.customerRegisterDevice.CustomerRegisterDeviceService;
import web.service.devices.DevicesService;

@RestController
public class CustomerController {
	private final Logger logger = LoggerFactory.getLogger(getClass());  	
	@Autowired
	private CustomerService customerService;
	@Autowired
	private DevicesService devicesService;
	@Autowired 
	private Environment env;
	@Autowired
	private CustomerRegisterDeviceService customerRegisterDeviceService;


	@PostMapping
	@Transactional
	public Result createCustomer (@RequestBody Customer customer){
		try {
			if (StringUtils.isBlank(customer.getEmail())||StringUtils.isBlank(customer.getPswd()) ||StringUtils.isBlank(customer.getRegion())) {
				return Result.build(ResultCode.PROFILES_REQUIRED_ERROR, "many customer’s profiles that it’s required Items, but it’s empty");
			}
			if (!StrUtils.isEmail(customer.getEmail())) {
				return Result.build(ResultCode.EMAIL_FORMAT_ERROR, "E-Mail format error");	
			}
			
			int emailNum = customerService.existEmai(customer.getEmail()) ;
			
			if (emailNum>0) {
				return Result.build(ResultCode.EMAIL_EXIST, " E-Mail exist");
			}
			String regionName = env.getProperty(customer.getRegion()) ;
			
			if (StringUtils.isBlank(regionName)) {
				regionName = customer.getRegion() ;
			}
			String regionSysIdString = customerService.regionIdByName(regionName);

			if (StringUtils.isBlank(regionSysIdString)) {
				return Result.build(ResultCode.REGION_NOT_EXIST, "Region does not exist");	
			}
			CustomerInfo customerInfo = customer.getCustomerInfo();
			customerInfo.setRegionSysId(regionSysIdString);
			String uuid = UUIDUtils.getUUID();
			customer.setCustomerSysId(uuid);
			customer.setPswd(getEncriptPwd(customer.getPswd()));
			customerService.createCustomer(customer);
			CustomerRegisterDevice customerRegisterDevice = customer.getCustomerRegisterDevice();
			if (customerRegisterDevice!=null) {
				if (StringUtils.isBlank(customerRegisterDevice.getDeviceId().toString())&&StringUtils.isBlank(customerRegisterDevice.getDeviceName())||StringUtils.isBlank(customerRegisterDevice.getSn())) {
					return Result.build(ResultCode.DEVICE_REQUIRED_ERROR, "Device required items can't be empty! And deviceId or deviceName must exist");		
				}
				Device device = new Device() ;
				if (StringUtils.isNotBlank(customerRegisterDevice.getDeviceId().toString())) {
					device = devicesService.getDevicesSysIdById(customerRegisterDevice.getDeviceId());
					if (device==null) {
						device = devicesService.getDevicesSysIdByName(customerRegisterDevice.getDeviceName());
					}
					if (device==null) {
						return Result.build(ResultCode.DEVICE_REQUIRED_ERROR, "Device required items can't be empty! And deviceId or deviceName must exist");			
					}	
				}else {
					device = devicesService.getDevicesSysIdByName(customerRegisterDevice.getDeviceName());
					if (device==null) {
						return Result.build(ResultCode.DEVICE_REQUIRED_ERROR, "Device required items can't be empty! And deviceId or deviceName must exist");			
					}
				}
				customerRegisterDevice.setDeviceSysId(device.getDeviceSysId());
				customerRegisterDevice.setDeviceName(device.getDeviceSysId());
				customerRegisterDevice.setCustomerSysId(uuid);
				customerRegisterDeviceService.insert(customerRegisterDevice);
				customerInfo.setIsVip("1");
			}else {
				customerInfo.setIsVip("0");
			}
			if (StringUtils.isNotBlank(customerInfo.getGender())&&customerInfo.getGender().equals("male")) {
				customerInfo.setGender("1");
			}else {
				customerInfo.setGender("0");
			}
			if (StringUtils.isNotBlank(customerInfo.getReceiveNews())&&customerInfo.getReceiveNews().equalsIgnoreCase("Y")) {
				customerInfo.setReceiveNews("1");
			}else {
				customerInfo.setReceiveNews("0");
			}
			customerInfo.setCustomerSysId(uuid);
			customerService.createCustomerInfo(customerInfo);
		} catch (Exception e) {
			logger.error("CustomerController createCustomer fail ...", e);
			return Result.build(ResultCode.SERVER_INNER_ERROR, "server inner error");
		}
		return Result.build(ResultCode.SYNC_SUCCESS, ResultCode.SYNC_SUCCESS_DESC);
		
	}
	
	public String getEncriptPwd(String password){
		if(password.indexOf(":")!=-1 && password.length()==35){
			return password;
		}else{
			return PasswordHelper.ssoEncrypt(password, "");
		}
	}
	
	/**
	 * @param customer
	 * @return
	 * 重置客户密码
	 */
	@PutMapping("/resetCustomerPassword")
	public Result resetCustomerPassword(@RequestBody Map<String,String> map){
		Result result = null;
		try {
			result = customerService.resetCustomerPassword(map);
		} catch (Exception e) {
			result = Result.build(ResultCode.SERVER_INNER_ERROR,ResultCode.SERVER_INNER_ERROR_DESC);
			logger.error("web.controller.customer.CustomerController resetCustomerPassword", e);
		}
		return result;
	}
	
	/**
	 * @param customer
	 * @return
	 * 修改密码
	 */
	@PutMapping("/updateCustomerPassword")
	public Result updateCustomerPassword(@RequestBody Map<String,String> map){
		Result result = null;
		try {
			result = customerService.updateCustomerPassword(map);
		} catch (Exception e) {
			result = Result.build(ResultCode.SERVER_INNER_ERROR,ResultCode.SERVER_INNER_ERROR_DESC);
			logger.error("web.controller.customer.CustomerController updateCustomerPassword", e);
		}
		return result;
	}
	
		/**
	 * @param map
	 * @return
	 * 更新客户的email
	 */
	@PutMapping("/updateCustomerEmail")
	public Result updateCustomerEmail(@RequestBody Map<String,String> map){
		Result result = null;
		try {
			result = customerService.updateCustomerEmail(map);
		} catch (Exception e) {
			result = Result.build(ResultCode.SERVER_INNER_ERROR,ResultCode.SERVER_INNER_ERROR_DESC);
			logger.error("web.controller.customer.CustomerController updateCustomerEmail", e);
		}
		return result;
	}
}
