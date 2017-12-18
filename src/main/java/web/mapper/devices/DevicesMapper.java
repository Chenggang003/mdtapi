package web.mapper.devices;

import org.apache.ibatis.annotations.Select;

public interface DevicesMapper {
	
	@Select("select CATEGORY_NAME, MODEL_NAME, MODEL_ID, STATUS from DEVICE WHERE UPPER(brand) = #{brand} AND UPPER(region_name) = #{region} AND STATUS = #{status} ORDER BY CATEGORY_NAME, MODEL_NAME")
	public void getDevicesList() throws Exception;

}
