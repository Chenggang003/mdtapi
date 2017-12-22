package web.service.customer;

import java.util.Map;

import web.common.Result;
import web.domain.Customer;
import web.domain.CustomerInfo;
public interface CustomerService {
	
    void createCustomer(Customer customer)throws Exception ;
    
    void createCustomerInfo(CustomerInfo customerInfo)throws Exception ;
    
    int existEmai(String email) throws Exception ;
   
    String regionIdByName(String regionName) throws Exception ;

	public Result resetCustomerPassword(Map<String,String> map) throws Exception;

	public Result updateCustomerPassword(Map<String,String> map) throws Exception;
	
	public Result updateCustomerEmail(Map<String, String> map) throws Exception;

}
