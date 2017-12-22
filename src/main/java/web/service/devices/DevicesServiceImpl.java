package web.service.devices;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.common.ConfigSet;
import web.common.Result;
import web.common.ResultCode;
import web.common.StrUtils;
import web.domain.Device;
import web.mapper.devices.DevicesMapper;

@Service
public class DevicesServiceImpl implements DevicesService {
	
	@Autowired
	private DevicesMapper devicesMapper;

	@Override
	public Result getDevicesList(Map<String, String> map) throws Exception {
		String brand = StrUtils.trim(map.get("brand"));
		String region = StrUtils.trim(map.get("region"));
		String status = StrUtils.trim(map.get("status"));
		String regionV = ConfigSet.getConfig(StrUtils.nvl(region,""));
		if (regionV == null || "".equals(regionV)) {
			regionV = region;
		}
		String code = "";
		String codeDesc = "";
		if(!StrUtils.isEmpty(brand) && !StrUtils.isEmpty(region) && !StrUtils.isEmpty(status)){
			boolean brandFlag = devicesMapper.findSearchBrandCondition(brand);
			boolean regionFlag = devicesMapper.findSearchRegionCondition(region);
			boolean statusFlag = checkStatus(status);//1或0
			if (!brandFlag) {
				code += "," + ResultCode.BRAND_NOT_EXIST;
				codeDesc += "|" + ResultCode.BRAND_NOT_EXIST_DESC;
			}
			if (!regionFlag) {
				code += "," + ResultCode.REGION_NOT_EXIST;
				codeDesc += "|" + ResultCode.REGION_NOT_EXIST_DESC;
			}
			if (!statusFlag) {
				code += "," + ResultCode.STATUS_ERROR;
				codeDesc += "|" + ResultCode.STATUS_ERROR_DESC;
			}
			if (code.equals("")) {
				code = ResultCode.SYNC_SUCCESS;
				codeDesc += "|" + ResultCode.SYNC_SUCCESS_DESC;
			}else{
				code = code.substring(1);
				codeDesc = codeDesc.substring(1);
			}
		}else{
			code = ResultCode.BRAND_REGION_STATUS_EMPTY;
			codeDesc = ResultCode.BRAND_REGION_STATUS_EMPTY_DESC;
		}
		Result result = null;
		if (code.equals(ResultCode.SYNC_SUCCESS)) {
			List<Map<String,Object>> devicesList = devicesMapper.getDevicesList(brand,region,status);
			result = Result.build(ResultCode.SYNC_SUCCESS,ResultCode.SYNC_SUCCESS_DESC,devicesList);
		}else{
			result = Result.build(code,codeDesc);
		}
		return result;
	}

	@Override
	public Device getDevicesSysIdById(Integer id) throws Exception {
		return devicesMapper.getDevicesSysIdById(id);
	}

	@Override
	public Device getDevicesSysIdByName(String name) throws Exception {
		return devicesMapper.getDevicesSysIdByName(name);
	}

	/**
	 * @param status
	 * @return
	 * status为0或1
	 */
	private boolean checkStatus(String status) {
		boolean flag = false;
		if (!StrUtils.isEmpty(status) && ("1".equals(status) || "0".equals(status))) {
			flag = true;
		}
		return flag;
	}
}
