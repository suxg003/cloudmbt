package com.hyc.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyc.model.Tuser;
import com.hyc.service.TuserService;
import com.hyc.utils.BaseResp;
import com.hyc.utils.ResultStatus;
/**
 * 
 * @author hyc123
 *
 */
@RestController
public class TuserController {
    @Resource
    private TuserService tuserService;

    @RequestMapping("/888/{id}")
    public BaseResp<Tuser> getById(@PathVariable("id")String id){
  
        return new BaseResp<>(ResultStatus.SUCCESS,tuserService.findById(id));
    }
    
    @RequestMapping("/tuesr/add")
    public BaseResp<Tuser> addUser(Tuser user){
    	BaseResp<Tuser> baseResp;
    	try{
    	tuserService.addUser(user);
    	 baseResp=new BaseResp<Tuser>(ResultStatus.SUCCESS);
    	}catch(Exception e){
    		e.printStackTrace();
    		 baseResp=new BaseResp<Tuser>(ResultStatus.error_create_failed);	
    	}
    	return  baseResp;
    }
    
    
    
    
}
