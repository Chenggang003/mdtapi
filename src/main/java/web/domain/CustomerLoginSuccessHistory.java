package web.domain;

import java.util.Date;

public class CustomerLoginSuccessHistory {
    private String customerLoginSuccessHistorySysId;

    private String customerSysId;

    private Date loginTime;

    private String sourceIp;

    private String browser;

    private String acceptLanguage;

    private String forwardUrl;

    private String customerAccount;

    private String serverPort;

    public String getCustomerLoginSuccessHistorySysId() {
        return customerLoginSuccessHistorySysId;
    }

    public void setCustomerLoginSuccessHistorySysId(String customerLoginSuccessHistorySysId) {
        this.customerLoginSuccessHistorySysId = customerLoginSuccessHistorySysId == null ? null : customerLoginSuccessHistorySysId.trim();
    }

    public String getCustomerSysId() {
        return customerSysId;
    }

    public void setCustomerSysId(String customerSysId) {
        this.customerSysId = customerSysId == null ? null : customerSysId.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp == null ? null : sourceIp.trim();
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser == null ? null : browser.trim();
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage == null ? null : acceptLanguage.trim();
    }

    public String getForwardUrl() {
        return forwardUrl;
    }

    public void setForwardUrl(String forwardUrl) {
        this.forwardUrl = forwardUrl == null ? null : forwardUrl.trim();
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount == null ? null : customerAccount.trim();
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort == null ? null : serverPort.trim();
    }
}