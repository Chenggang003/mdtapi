package web.domain;

import java.util.Date;

public class Device {
    private String deviceSysId;

    private Integer deviceId;

    private String deviceName;

    private String categorySysId;

    private String cateidMicc;

    private String status;

    private Date creationTime;

    private Date updateTime;

    public String getDeviceSysId() {
        return deviceSysId;
    }

    public void setDeviceSysId(String deviceSysId) {
        this.deviceSysId = deviceSysId == null ? null : deviceSysId.trim();
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    public String getCategorySysId() {
        return categorySysId;
    }

    public void setCategorySysId(String categorySysId) {
        this.categorySysId = categorySysId == null ? null : categorySysId.trim();
    }

    public String getCateidMicc() {
        return cateidMicc;
    }

    public void setCateidMicc(String cateidMicc) {
        this.cateidMicc = cateidMicc == null ? null : cateidMicc.trim();
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