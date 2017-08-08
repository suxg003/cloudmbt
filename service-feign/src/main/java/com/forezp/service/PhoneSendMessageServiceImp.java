package com.forezp.service;

import org.slf4j.Logger;



public class PhoneSendMessageServiceImp implements PhoneSendMessageService {
	Logger log = org.slf4j.LoggerFactory.getLogger(PhoneSendMessageServiceImp.class);
	@Override
	public String getsendMessage(String phone, String action,
			String os, String ver,String message) {
		log.info("短信生产端异常！！！！！");
		
		return "2";
	}
}
