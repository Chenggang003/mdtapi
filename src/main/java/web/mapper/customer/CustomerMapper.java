package web.mapper.customer;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import web.domain.Customer;
import web.domain.CustomerInfo;

public interface CustomerMapper {

    @Select("SELECT count(*) from CUSTOMER WHERE EMAIL = #{email}")
	int existEmai(String email)throws Exception;
	
    @Select("SELECT REGION_SYS_ID from REGION WHERE REGION_NAME = #{regionName}")
	String regionIdByName(String regionName)throws Exception;
	
	@Insert("INSERT INTO CUSTOMER (CUSTOMER_SYS_ID, TYPE, EMAIL, FACEBOOK_ID, PSWD, MOBILE_PHONE) VALUE (#{customerSysId},#{type},#{email},#{facebookId},#{pswd},#{mobilePhone})")
    void insert(Customer customer)throws Exception;

	@Insert("INSERT INTO CUSTOMER_INFO (CUTOMER_INFO_SYS_ID, CUSTOMER_SYS_ID, FIRST_NAME, LAST_NAME, GENDER, BIRTHDAY,MOBILE_PHONE,LANDLINE,COUNTRY,CITY,STREET,ZIP_CODE,REGION_SYS_ID,FROM_SYSTEM,RECEIVE_NEWS,IS_VIP) VALUE (#{customerInfoSysId},#{customerSysId},#{firstName},#{lastName},#{gender},#{birthday},#{birthday},#{landline},#{country},#{city},#{street},#{zipCode},#{regionSysId},#{fromSystem},#{receiveNews},#{isVip})")
    void insertInfo(CustomerInfo customerInfo)throws Exception;

	@Select("select PSWD from CUSTOMER where EMAIL = #{email}")
	public String getCustomerPwd(String email) throws Exception;
	
	@Update("update CUSTOMER set PSWD = #{newPassword} where EMAIL = #{email}")
	public int updateCustomerPwd(@Param("newPassword") String newPassword,@Param("email") String email) throws Exception;
	
	@Select("SELECT if(count(1)>0,true,false) from CUSTOMER where EMAIL = #{email}")
	public boolean isExistCustomerByMail(String email) throws Exception;
	
	@Select("select if(count(1)>0,true,false) from CUSTOMER where email = #{email}")
	public boolean isEmailExist(String email) throws Exception;

	@Update("update CUSTOMER set EMAIL = #{newEmail} where EMAIL = #{oldEmail}")
	public int updateCustomerEmail(@Param("newEmail") String newEmail,@Param("oldEmail") String oldEmail) throws Exception;
}
