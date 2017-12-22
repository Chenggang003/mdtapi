package web.mapper.customerRegisterDevice;

import org.apache.ibatis.annotations.Insert;

import web.domain.CustomerRegisterDevice;

public interface CustomerRegisterDeviceMapper {
	@Insert("INSERT INTO CUSTOMER_REGISTER_DEVICE(CUSTOMER_REGISTER_DEVICE_SYS_ID,CUSTOMER_SYS_ID,DEVICE_SYS_ID,DEVICE_NAME,SN,PURCHASE_DATE)VALUE(#{customerRegisterDeviceSysId},#{customerSysId},#{deviceSysId},#{deviceName},#{sn},#{purchaseDate}) ")
    void insert(CustomerRegisterDevice customerRegisterDevice)throws Exception;
}
