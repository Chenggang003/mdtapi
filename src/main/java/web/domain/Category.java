package web.domain;

import java.util.Date;

public class Category {
    private String categorySysId;

    private String categoryName;

    private String categoryId;

    private String brandSysId;

    private String status;

    private Date creationTime;

    private Date updateTime;

    public String getCategorySysId() {
        return categorySysId;
    }

    public void setCategorySysId(String categorySysId) {
        this.categorySysId = categorySysId == null ? null : categorySysId.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getBrandSysId() {
        return brandSysId;
    }

    public void setBrandSysId(String brandSysId) {
        this.brandSysId = brandSysId == null ? null : brandSysId.trim();
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