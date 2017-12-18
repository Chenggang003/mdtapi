package web.domain;

import java.io.Serializable;

public class IndividualPurchase implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String applicant ;
	private String virtualGroup ;
	private String virtualGroupValue ;
	private String applicationDocumentNumber ;
	private String type ;
	private String commodity ;
	private String qty ;
	private String specification ;
	private String uuid ;
	private String companyID ;
	private String empName ;
	private String authRemark ;
	private String authVersion;
	private String authDate;
	private String assetNumber;



	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getVirtualGroup() {
		return virtualGroup;
	}
	public void setVirtualGroup(String virtualGroup) {
		this.virtualGroup = virtualGroup;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getApplicationDocumentNumber() {
		return applicationDocumentNumber;
	}
	public void setApplicationDocumentNumber(String applicationDocumentNumber) {
		this.applicationDocumentNumber = applicationDocumentNumber;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	public String getVirtualGroupValue() {
		return virtualGroupValue;
	}
	public void setVirtualGroupValue(String virtualGroupValue) {
		this.virtualGroupValue = virtualGroupValue;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAuthRemark() {
		return authRemark;
	}
	public void setAuthRemark(String authRemark) {
		this.authRemark = authRemark;
	}
	public String getAuthVersion() {
		return authVersion;
	}
	public void setAuthVersion(String authVersion) {
		this.authVersion = authVersion;
	}
	public String getAuthDate() {
		return authDate;
	}
	public void setAuthDate(String authDate) {
		this.authDate = authDate;
	}
	public String getAssetNumber() {
		return assetNumber;
	}
	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}
	@Override
	public String toString() {
		return "IndividualPurchase [applicant=" + applicant + ", virtualGroup=" + virtualGroup + ", virtualGroupValue="
				+ virtualGroupValue + ", applicationDocumentNumber=" + applicationDocumentNumber + ", type=" + type
				+ ", commodity=" + commodity + ", qty=" + qty + ", specification=" + specification + ", uuid=" + uuid
				+ ", companyID=" + companyID + ", empName=" + empName + ", authRemark=" + authRemark + ", authVersion="
				+ authVersion + ", authDate=" + authDate + ", assetNumber=" + assetNumber + "]";
	}



}
