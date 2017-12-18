package web.domain;

import java.util.Date;

public class CustomerInfoBackup {
    private String customerInfoBackupSysId;

    private String customerSysId;

    private String firstName;

    private String lastName;

    private String gender;

    private Date birthday;

    private String mobilePhone;

    private String landline;

    private String country;

    private String city;

    private String street;

    private String zipCode;

    private String regionSysId;

    private String fromSystem;

    private String receiveNews;

    private String isVip;

    private String memberType;

    private String customeridMicc;

    private String isItemsAccept;

    private Date itemsAcceptTime;

    private Date creationTime;

    private Date updateTime;

    private Date backupCreationTime;

    public String getCustomerInfoBackupSysId() {
        return customerInfoBackupSysId;
    }

    public void setCustomerInfoBackupSysId(String customerInfoBackupSysId) {
        this.customerInfoBackupSysId = customerInfoBackupSysId == null ? null : customerInfoBackupSysId.trim();
    }

    public String getCustomerSysId() {
        return customerSysId;
    }

    public void setCustomerSysId(String customerSysId) {
        this.customerSysId = customerSysId == null ? null : customerSysId.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline == null ? null : landline.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getRegionSysId() {
        return regionSysId;
    }

    public void setRegionSysId(String regionSysId) {
        this.regionSysId = regionSysId == null ? null : regionSysId.trim();
    }

    public String getFromSystem() {
        return fromSystem;
    }

    public void setFromSystem(String fromSystem) {
        this.fromSystem = fromSystem == null ? null : fromSystem.trim();
    }

    public String getReceiveNews() {
        return receiveNews;
    }

    public void setReceiveNews(String receiveNews) {
        this.receiveNews = receiveNews == null ? null : receiveNews.trim();
    }

    public String getIsVip() {
        return isVip;
    }

    public void setIsVip(String isVip) {
        this.isVip = isVip == null ? null : isVip.trim();
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType == null ? null : memberType.trim();
    }

    public String getCustomeridMicc() {
        return customeridMicc;
    }

    public void setCustomeridMicc(String customeridMicc) {
        this.customeridMicc = customeridMicc == null ? null : customeridMicc.trim();
    }

    public String getIsItemsAccept() {
        return isItemsAccept;
    }

    public void setIsItemsAccept(String isItemsAccept) {
        this.isItemsAccept = isItemsAccept == null ? null : isItemsAccept.trim();
    }

    public Date getItemsAcceptTime() {
        return itemsAcceptTime;
    }

    public void setItemsAcceptTime(Date itemsAcceptTime) {
        this.itemsAcceptTime = itemsAcceptTime;
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

    public Date getBackupCreationTime() {
        return backupCreationTime;
    }

    public void setBackupCreationTime(Date backupCreationTime) {
        this.backupCreationTime = backupCreationTime;
    }
}