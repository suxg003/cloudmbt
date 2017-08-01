package com.quick.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hyc.model.Tuser;
import com.quick.service.TuserService;
import com.quick.utils.BaseResp;
import com.quick.utils.ResultStatus;
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
    
}
