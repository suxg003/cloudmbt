package com.forezp.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-demo")
public interface UserRegisterService {
	/**
	 * 用户注册接口
	 * @param ip
	 * @param phone
	 * @param code
	 * @param pass_word
	 * @param channel_no
	 * @param first_spread_channel
	 * @param second_spread_channel
	 * @param third_spread_channel
	 * @param spread_user_id
	 * @param parent_spread_user_id
	 * @param spread_link
	 * @return
	 */
	@RequestMapping(value = "/userregisterinfo/regis", method = RequestMethod.GET)
	public String doLocalService(
			@RequestParam("ip") String ip,
			@RequestParam("phone") String phone,
			@RequestParam("code") String code,
			@RequestParam("pass_word") String pass_word,
			@RequestParam("channel_no") String channel_no,
			@RequestParam("first_spread_channel") String first_spread_channel,
			@RequestParam("second_spread_channel") String second_spread_channel,
			@RequestParam("third_spread_channel") String third_spread_channel,
			@RequestParam("spread_user_id") String spread_user_id,
			@RequestParam("parent_spread_user_id") String parent_spread_user_id,
			@RequestParam("spread_link") String spread_link);

}
