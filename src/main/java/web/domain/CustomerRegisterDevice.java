package web.domain;

import java.util.Date;

public class CustomerRegisterDevice {
    private String customerRegisterDeviceSysId;

    private String customerSysId;

    private String deviceSysId;

    private String deviceName;

    private String sn;

    private String uuid;

    private Date purchaseDate;

    private String invoiceNo;

    private Date invoiceDate;

    private String status;

    private Date creationTime;

    private Date updateTime;

    public String getCustomerRegisterDeviceSysId() {
        return customerRegisterDeviceSysId;
    }

    public void setCustomerRegisterDeviceSysId(String customerRegisterDeviceSysId) {
        this.customerRegisterDeviceSysId = customerRegisterDeviceSysId == null ? null : customerRegisterDeviceSysId.trim();
    }

    public String getCustomerSysId() {
        return customerSysId;
    }

    public void setCustomerSysId(String customerSysId) {
        this.customerSysId = customerSysId == null ? null : customerSysId.trim();
    }

    public String getDeviceSysId() {
        return deviceSysId;
    }

    public void setDeviceSysId(String deviceSysId) {
        this.deviceSysId = deviceSysId == null ? null : deviceSysId.trim();
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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