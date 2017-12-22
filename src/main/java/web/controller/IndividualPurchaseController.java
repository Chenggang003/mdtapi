package web.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.domain.IndividualPurchase;
import web.service.IndividualPurchaseBO;

@RestController
@RequestMapping(value="/individualPurchase")
public class IndividualPurchaseController {
	private static final Log log = LogFactory.getLog(IndividualPurchaseController.class);

	@Autowired
	private IndividualPurchaseBO individualPurchaseBO;
	 /**
	   * 查询
	   */
	  @GetMapping(value="/query")
	  public List<IndividualPurchase> getAll() {
		  List<IndividualPurchase> infoList = new ArrayList<>();
		  infoList = individualPurchaseBO.getAll() ;
		  return infoList;
	  }
	  
	  @PostMapping(value="/queryOne}")
	  public IndividualPurchase getOne(@PathVariable String uuid) {
		  System.out.println(uuid);
		  IndividualPurchase infoList = new IndividualPurchase();
		  infoList = individualPurchaseBO.getOne(uuid) ;
		  return infoList;

	  }

	  /**
	   * 增加
	   */
	  @PostMapping(value="/insert")
	  public String insert(@RequestBody IndividualPurchase vo) {
		 try {
			 System.out.println(vo);
		     individualPurchaseBO.insert(vo);

		} catch (Exception e) {
		     return "FAIL";
		}
	     return "SUCCESS";
	  }

	  /**
	   * 更新
	   */
	  @PutMapping(value="/update")
	  public String update(@RequestBody IndividualPurchase vo){
			 try {
			     individualPurchaseBO.update(vo);
			} catch (Exception e) {
			     return "FAIL";
			}
		     return "SUCCESS";
	  }

	  /**
	   * 删除
	   */
	  @DeleteMapping(value="/deleteRecord/{uuid}")
	  public String delete(@PathVariable String uuid) {
		  System.out.println(uuid);
		  try {
			  individualPurchaseBO.delete(uuid) ;
		} catch (Exception e) {
			log.error("IndividualPurchaseController deleteRecord:",e);
			return "fail";
		}
	    return "success";
	  }

	public IndividualPurchaseBO getIndividualPurchaseBO() {
		return individualPurchaseBO;
	}

	public void setIndividualPurchaseBO(IndividualPurchaseBO individualPurchaseBO) {
		this.individualPurchaseBO = individualPurchaseBO;
	}
	  
}
