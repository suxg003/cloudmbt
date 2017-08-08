package com.hyc.controller.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hyc.service.TxRedisDomainService;
import com.hyc.utils.phone253.com.chuanglan.sms.util.Phone253SendService;

@RestController
public class UserController {

	@Autowired
	private Phone253SendService phone253SendService;
	@Autowired
	private TxRedisDomainService txRedisDomainService;
	/**
	 * 生产发送短信
	 * @param type  短信类型ver:验证类 nt:通知类 mt:营销类
	 * @param phone 手机号
	 * @param message 发送的最终内容
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
