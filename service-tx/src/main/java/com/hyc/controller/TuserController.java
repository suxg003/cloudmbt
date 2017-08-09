package com.hyc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	Logger log = org.slf4j.LoggerFactory.getLogger(TuserController.class);

	@RequestMapping("/888/{id}")
	public List<Tuser> getById(@PathVariable("id") String id) {

		return   tuserService.findById(id);
	}

	@RequestMapping("/tuesr/add")
	public BaseResp<Tuser> addUser(@RequestBody Tuser user) {
		BaseResp<Tuser> baseResp;
		try {
			log.info("#############" + user.getUserid() + "#####"
					+ user.getUsername());
			tuserService.addUser(user);
			baseResp = new BaseResp<Tuser>(ResultStatus.SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			baseResp = new BaseResp<Tuser>(ResultStatus.error_create_failed);
		}
		return baseResp;
	}

}
