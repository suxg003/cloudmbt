package com.forezp.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hyc.model.Tuser;
import com.hyc.utils.BaseResp;

@FeignClient(value = "service-demo", fallback = PhoneSendMessageServiceImp.class)
public interface PhoneSendMessageService {
	@RequestMapping(value = "/util/sendMessage", method = RequestMethod.GET)
	public String getsendMessage(@RequestParam("phone") String phone,@RequestParam("type") String type,
			@RequestParam("os") String os,@RequestParam("ver") String ver,@RequestParam("message") String message);
}
