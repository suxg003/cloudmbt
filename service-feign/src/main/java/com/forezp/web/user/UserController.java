package com.forezp.web.user;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.forezp.service.PhoneSendMessageService;
import com.forezp.web.HiController;
import com.hyc.utils.BaseResp;

/**
 * 用户相关
 * 
 * @author hyc123
 *
 */
@RestController
@RequestMapping("/api/v1.0/app/public")
public class UserController {
	Logger log = org.slf4j.LoggerFactory.getLogger(HiController.class);
	@Autowired
	PhoneSendMessageService phoneSendMessageServiceImp;
	@Value("${regist_user}")
	String regist_user; // 用户注册

	/**
	 * 6.3 获取短信验证码
	 * 
	 * @param deviceid
	 * @param appid
	 * @return
	 */
	@RequestMapping(value = "/smsauth.do", method = RequestMethod.GET)
	public BaseResp smsauth(@RequestParam String deviceid,
			@RequestParam String appid, @RequestParam String phone,
			String action, String os, String ver) {
		BaseResp br = new BaseResp();
		String[] s = new String[3];
		s[0] = "8888";
		String message = MessageFormat.format(regist_user, s);
		log.info("@@@@@@@@message=" + message);
		String flag = phoneSendMessageServiceImp.getsendMessage(phone, action,
				os, ver, message);
		log.info("###########deviceid=" + deviceid + "$$$$$$$$appid=" + appid
				+ "regist_user=" + regist_user);
		if (flag.equals("1")) {
			br.setCode(100000);
			br.setMessage("发送成功");
			br.setData(phone);
		} else {
			br.setCode(404);
			br.setMessage("发送失败");
			br.setData(phone);
		}
		return br;
	}
}
