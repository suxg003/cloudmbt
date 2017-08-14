package com.forezp.web.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.forezp.service.UserRegisterService;
import com.hyc.exception.AppException;
import com.hyc.utils.Base64;

/**
 * <p>
 * 注册表 前端控制器
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@RestController
public class UserRegisterInfoController {

	private static final Object UserInfo = null;
	@Autowired
	UserRegisterService userRegisterService;

	@RequestMapping("/userregisterinfo")
	public Map doLocalService(HttpServletRequest request,
			@RequestParam("phone") String phone,
			@RequestParam("code") String code,
			@RequestParam("pass_word") String pass_word,
			@RequestParam("channel_no") String channel_no,
			String first_spread_channel, String second_spread_channel,
			String third_spread_channel, String spread_user_id,
			String parent_spread_user_id, String spread_link) {
		String ip = request.getHeader("X-Forwarded-For");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		ip = ip.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : ip;
		Map map=userRegisterService.doLocalService(ip, phone, code, pass_word,
					channel_no, first_spread_channel, second_spread_channel,
					third_spread_channel, spread_user_id,
					parent_spread_user_id, spread_link);
		/*	map.put("code", "100000");
			map.put("message", "登录成功");
			map.put("loginUser", UserInfo);*/
 
		String jsonString = JSON.toJSONString(map);
		Map _post_data_map = new HashMap();
		_post_data_map.put("_post_data_", Base64.encode(jsonString.getBytes()));
		return _post_data_map;
	}
}