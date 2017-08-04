package com.forezp.web;

import com.forezp.service.SchedualServiceHi;
import com.hyc.model.Tuser;
import com.hyc.utils.BaseResp;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class HiController {
	Logger log = org.slf4j.LoggerFactory.getLogger(HiController.class);
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public BaseResp<Tuser> sayHi(@RequestParam String id){
    	   //TODO
    	//前置业务参数
    	//........id
    	//.......
    	//
    	BaseResp<Tuser> baseResp= schedualServiceHi.getById(id);
    	//......
    	//....后续封装返回其他结果集
    	//.......
    	
    	return baseResp;
    }
    @RequestMapping(value = "/useradd",method = RequestMethod.GET)
    public BaseResp<Tuser> useradd(String userid,String userage,String username){
    	   //TODO
    	//前置业务参数
    	//........id
    	//.......
    	//
    	Tuser t=new Tuser();
    	t.setUserage(userage);
    	t.setUserid(userid);
    	t.setUsername(username);
    	BaseResp<Tuser> baseResp= schedualServiceHi.addTuser(t);
    	//......
    	//....后续封装返回其他结果集
    	//.......
    	
    	return baseResp;
    }
    
}
