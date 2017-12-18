package web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import web.domain.IndividualPurchase;

public interface IndividualPurchaseMapper {
	
	public static String QUERY_SFITWAREAUTH_MIC = "SELECT * FROM softwareauth WHERE type = '2'" ;

	
    @Select("SELECT * FROM softwareauth WHERE type = '2'")
    @Results({
        @Result(property = "uuid",  column = "uuid"),
        @Result(property = "companyID", column = "company_id"),
        @Result(property = "applicant", column = "gulid"),
        @Result(property = "qty", column = "qty"),
        @Result(property = "applicationDocumentNumber", column = "emp_no"),
        @Result(property = "empName", column = "emp_name"),
        @Result(property = "commodity", column = "model_number"),
        @Result(property = "virtualGroup", column = "virtual_software_name"),
        @Result(property = "assetNumber", column = "asset_number"),
        @Result(property = "type", column = "type"),
        @Result(property = "authRemark", column = "update_gulid")
    })
    List<IndividualPurchase> getAll();

    @Select("SELECT * FROM softwareauth WHERE uuid = #{id}")
    @Results({
        @Result(property = "uuid",  column = "uuid"),
        @Result(property = "companyID", column = "company_id"),
        @Result(property = "applicant", column = "gulid"),
        @Result(property = "qty", column = "qty"),
        @Result(property = "applicationDocumentNumber", column = "emp_no"),
        @Result(property = "empName", column = "emp_name"),
        @Result(property = "commodity", column = "model_number"),
        @Result(property = "virtualGroup", column = "virtual_software_name"),
        @Result(property = "assetNumber", column = "asset_number"),
        @Result(property = "type", column = "type"),
        @Result(property = "authRemark", column = "update_gulid")
    })
    IndividualPurchase getOne(String id);
    @Insert("INSERT INTO softwareauth(gulid,asset_desc,qty,deptno,emp_no,emp_name,model_number,vs_uuid,virtual_software_name,asset_number,type,company_id,update_gulid,uuid,auth_remark) VALUES(#{applicant},#{commodity},#{qty},'1000','ad_empno','chinese_fullname',#{specification},#{virtualGroup},#{virtualGroupValue},#{applicationDocumentNumber},'2',#{companyID},'adam.guan',UUID(),#{authRemark})")
    void insert(IndividualPurchase individualPurchase);

    @Update("UPDATE softwareauth set gulid = #{applicant},asset_desc = #{commodity},qty = #{qty},deptno = 'department_id',emp_no = 'ad_empno',emp_name = 'chinese_fullname',model_number =#{specification},vs_uuid=#{virtualGroup} ,virtual_software_name =#{virtualGroupValue},asset_number = #{applicationDocumentNumber},type='2',update_gulid='adam.guan',company_id=#{companyID},auth_remark=#{authRemark} WHERE uuid = #{uuid}")
    void update(IndividualPurchase individualPurchase);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(String id);
}
