package web.domain;

import java.util.Date;

public class LoginAccount {
    private String loginAccountSysId;

    private String account;

    private String pswd;

    private Date creationTime;

    private Date updateTime;

    public String getLoginAccountSysId() {
        return loginAccountSysId;
    }

    public void setLoginAccountSysId(String loginAccountSysId) {
        this.loginAccountSysId = loginAccountSysId == null ? null : loginAccountSysId.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd == null ? null : pswd.trim();
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
}