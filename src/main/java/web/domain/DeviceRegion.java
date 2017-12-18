package web.domain;

import java.util.Date;

public class DeviceRegion {
    private String deviceRegionSysId;

    private String deviceSysId;

    private String regionSysId;

    private Date creationTime;

    private Date updateTime;

    public String getDeviceRegionSysId() {
        return deviceRegionSysId;
    }

    public void setDeviceRegionSysId(String deviceRegionSysId) {
        this.deviceRegionSysId = deviceRegionSysId == null ? null : deviceRegionSysId.trim();
    }

    public String getDeviceSysId() {
        return deviceSysId;
    }

    public void setDeviceSysId(String deviceSysId) {
        this.deviceSysId = deviceSysId == null ? null : deviceSysId.trim();
    }

    public String getRegionSysId() {
        return regionSysId;
    }

    public void setRegionSysId(String regionSysId) {
        this.regionSysId = regionSysId == null ? null : regionSysId.trim();
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