package web.domain;

import java.util.Date;

public class Brand {
    private String brandSysId;

    private String brandName;

    private Date creationTime;

    private Date updateTime;

    public String getBrandSysId() {
        return brandSysId;
    }

    public void setBrandSysId(String brandSysId) {
        this.brandSysId = brandSysId == null ? null : brandSysId.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
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