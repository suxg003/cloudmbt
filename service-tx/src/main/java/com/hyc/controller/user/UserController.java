package com.hyc.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hyc.utils.phone253.com.chuanglan.sms.util.Phone253SendService;

@RestController
public class UserController {

	@Autowired
	private Phone253SendService phone253SendService;

	/**
	 * 
	 * @param type
	 * @param phone
	 * @param message
	 * @return
	 */
	@RequestMapping("/util/sendMessage")
	public String sendMessage(@RequestParam("phone") String phone,
			@RequestParam("type") String type, @RequestParam("os") String os,
			@RequestParam("ver") String ver,
			@RequestParam("message") String message) {

		String flag = phone253SendService.sendMessage(type, phone, message);
		return flag;
	}
}
