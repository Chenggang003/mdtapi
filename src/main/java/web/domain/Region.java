package web.domain;

import java.util.Date;

public class Region {
    private String regionSysId;

    private String regionName;

    private String description;

    private Date creationTime;

    private Date updateTime;

    public String getRegionSysId() {
        return regionSysId;
    }

    public void setRegionSysId(String regionSysId) {
        this.regionSysId = regionSysId == null ? null : regionSysId.trim();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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