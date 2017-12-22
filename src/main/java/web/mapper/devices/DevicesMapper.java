package web.mapper.devices;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import web.domain.Device;

public interface DevicesMapper {
	
	@Select("SELECT CATEGORY_NAME,DEVICE_NAME,DEVICE_ID, STATUS from (select C.CATEGORY_NAME,D.DEVICE_ID,D.DEVICE_NAME,D.STATUS,D.DEVICE_SYS_ID from (select CATEGORY_SYS_ID,CATEGORY_NAME from CATEGORY where BRAND_SYS_ID = (select BRAND_SYS_ID from BRAND where BRAND_NAME = #{brand})) C,DEVICE D where C.CATEGORY_SYS_ID = D.CATEGORY_SYS_ID AND D.STATUS = #{status}) A,DEVICE_REGION B where A.DEVICE_SYS_ID = B.DEVICE_SYS_ID AND B.REGION_SYS_ID = (select REGION_SYS_ID from REGION where REGION_NAME = #{region}) order by CATEGORY_NAME,DEVICE_NAME")
	public List<Map<String,Object>> getDevicesList(@Param("brand") String brand,@Param("region") String region,@Param("status") String status) throws Exception;
	
	@Select("select if(count(1)>0,true,false) from BRAND where BRAND_NAME = #{brand}")
	public boolean findSearchBrandCondition(String brand) throws Exception;
	
	@Select("select if(count(1)>0,true,false) from REGION where REGION_NAME = #{region}")
	public boolean findSearchRegionCondition(String region) throws Exception;
	
	@Select("SELECT DEVICE_SYS_ID,DEVICE_NAME from DEVICE WHERE DEVICE_ID = #{id}")
	public Device getDevicesSysIdById(Integer id) throws Exception;

	@Select("SELECT DEVICE_SYS_ID,DEVICE_NAME FROM DEVICE WHERE DEVICE_NAME = #{name}")
	public Device getDevicesSysIdByName(String name) throws Exception;
}
