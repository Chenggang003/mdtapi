package web.domain;

import java.util.Date;

public class Customer {
    private String customerSysId;

    private String type;

    private String email;

    private String facebookId;

    private String pswd;

    private String mobilePhone;

    private Date creationTime;

    private Date updateTime;

    private CustomerInfo customerInfo ;
    
    private CustomerRegisterDevice customerRegisterDevice ;
    
    private String region ;
    
    
    public String getCustomerSysId() {
        return customerSysId;
    }

    public void setCustomerSysId(String customerSysId) {
        this.customerSysId = customerSysId == null ? null : customerSysId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId == null ? null : facebookId.trim();
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd == null ? null : pswd.trim();
    }  

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}


	public CustomerRegisterDevice getCustomerRegisterDevice() {
		return customerRegisterDevice;
	}

	public void setCustomerRegisterDevice(CustomerRegisterDevice customerRegisterDevice) {
		this.customerRegisterDevice = customerRegisterDevice;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "Customer [customerSysId=" + customerSysId + ", type=" + type + ", email=" + email + ", facebookId="
				+ facebookId + ", pswd=" + pswd + ", mobilePhone=" + mobilePhone + ", creationTime=" + creationTime
				+ ", updateTime=" + updateTime + ", customerInfo=" + customerInfo + ", customerRegisterDevice="
				+ customerRegisterDevice + ", region=" + region + "]";
	}
    
    
}