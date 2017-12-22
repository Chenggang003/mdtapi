package web.service.customer;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.common.PasswordHelper;
import web.common.Result;
import web.common.ResultCode;
import web.common.StrUtils;
import web.common.UUIDUtils;
import web.domain.Customer;
import web.domain.CustomerInfo;
import web.mapper.customer.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService {
	public static final String WEU_RESETPWD_DEFAULT_PWD = "ddfkfVDJKkkdfdVDodf749932@___";
	
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public void createCustomer(Customer customer) throws Exception {
		customerMapper.insert(customer);
	}
	@Override
	public int existEmai(String email) throws Exception {
		return customerMapper.existEmai(email);
	}
	@Override
	public String regionIdByName(String regionName) throws Exception {
		return customerMapper.regionIdByName(regionName);
	}
	@Override
	public void createCustomerInfo(CustomerInfo customerInfo)throws Exception {
		customerInfo.setCustomerInfoSysId(UUIDUtils.getUUID());
		customerMapper.insertInfo(customerInfo);		
	}

	@Override
	public Result resetCustomerPassword(Map<String,String> map) throws Exception {
		Result result = null;
		String newPassword= StrUtils.trim(map.get("newPassword"));
		String oldPassword = StrUtils.trim(map.get("oldPassword"));
		String email = StrUtils.trim(map.get("email"));
		if (StrUtils.isEmpty(newPassword) || StrUtils.isEmpty(oldPassword)) {
			result = Result.build(ResultCode.PROFILES_REQUIRED_ERROR,ResultCode.PROFILES_REQUIRED_ERROR_DESC);
		} else {
			if (findPwdMatchMail(oldPassword,email)) {
				int i = customerMapper.updateCustomerPwd(getEncriptPwd(newPassword),StrUtils.ToDBC(email));
				if (i > 0) {
					result = Result.build(ResultCode.SYNC_SUCCESS,ResultCode.SYNC_SUCCESS_DESC);
				}
			} else {
				result = Result.build(ResultCode.OLD_PWD_OR_EMAIL_ERROR,ResultCode.OLD_PWD_OR_EMAIL_ERROR_DESC);
			}
		}
		return result;
	}

	public String getEncriptPwd(String newPassword) {
		newPassword = StrUtils.ToDBC(newPassword);
		if(newPassword.indexOf(":") != -1 && newPassword.length() == 35){
			return newPassword;
		}else{
			return PasswordHelper.ssoEncrypt(newPassword,"");
		}
	}

	private boolean findPwdMatchMail(String oldPassword, String email) throws Exception {
		String encryOldPwd = customerMapper.getCustomerPwd(StrUtils.ToDBC(email));
		boolean b = true;
		if (WEU_RESETPWD_DEFAULT_PWD.equals(oldPassword)) {
			b = true;
		} else if (StrUtils.isEmpty(encryOldPwd) || StrUtils.isEmpty(oldPassword)) {
			b = false;
		} else if (encryOldPwd.indexOf(":") != -1 && oldPassword.indexOf(":") != -1) {
			b = encryOldPwd.equals(oldPassword);
		} else if (encryOldPwd.indexOf(":") != -1) {
			String[] encryOldPwdArray = encryOldPwd.split(":");
			b = encryOldPwdArray[0].equals(PasswordHelper.encryptCode(encryOldPwdArray[1] + StrUtils.ToDBC(oldPassword)));
		} else if (oldPassword.indexOf(":") != -1) {
			String[] oldPasswordArray = oldPassword.split(":");
			b = oldPasswordArray[0].equals(PasswordHelper.encryptCode(oldPasswordArray[1] + StrUtils.ToDBC(encryOldPwd)));
		} else {
			b = encryOldPwd.equals(oldPassword);
		}
		return b;
	}

	@Override
	public Result updateCustomerPassword(Map<String,String> map) throws Exception {
		String newPwsd = StrUtils.ToDBC(StrUtils.trim(map.get("newPassword")));
		String email = StrUtils.ToDBC(StrUtils.trim(map.get("email")));
		Result result = null;
		if (StrUtils.isEmpty(newPwsd)) {
			result = Result.build(ResultCode.NEW_OR_OLD_PWD_EMPTY,ResultCode.NEW_OR_OLD_PWD_EMPTY_DESC);
		}else {
			if (isExistCustomerByMail(email)){//执行更新操作
				int i = customerMapper.updateCustomerPwd(getEncriptPwd(newPwsd), email);
				if(i > 0){
					result = Result.build(ResultCode.SYNC_SUCCESS,ResultCode.SYNC_SUCCESS_DESC);
				}
			}else{
				result = Result.build(ResultCode.EMAIL_NOT_EXIST,ResultCode.EMAIL_NOT_EXIST_DESC);
			}
		}
		return result;
	}

	private boolean isExistCustomerByMail(String email) throws Exception {
		boolean b = false;
		if (StrUtils.isNotEmpty(email)) {
			b = customerMapper.isExistCustomerByMail(email);
		}
		return b;
	}
	
	
	@Override
	public Result updateCustomerEmail(Map<String, String> map) throws Exception {
		Result result = null;
		String newEmail = StrUtils.ToDBC(StrUtils.trim(map.get("newEmail")));
		String oldEmail = StrUtils.ToDBC(StrUtils.trim(map.get("oldEmail")));
		if (StrUtils.isEmpty(newEmail) || StrUtils.isEmpty(oldEmail)) {
			result = Result.build(ResultCode.NEW_OR_OLD_EMAIL_EMPTY, ResultCode.NEW_OR_OLD_EMAIL_EMPTY_DESC);
		} else if (customerMapper.isEmailExist(newEmail)) {//新的email已经存在
			result = Result.build(ResultCode.EMAIL_EXIST, ResultCode.EMAIL_EXIST_DESC);
		} else if (!customerMapper.isEmailExist(oldEmail)) {//旧的email不存在,即不存在该账户
			result = Result.build(ResultCode.ACCOUNT_NOT_EXIST, ResultCode.ACCOUNT_NOT_EXIST_DESC);
		} else {
			int i = customerMapper.updateCustomerEmail(newEmail,oldEmail);
			if (i > 0) {
				result = Result.build(ResultCode.SYNC_SUCCESS,ResultCode.SYNC_SUCCESS_DESC);
			}
		}
		return result;
	}	
	
}
