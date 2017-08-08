package com.hyc.utils.phone253.com.chuanglan.sms.util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.hyc.utils.phone253.com.chuanglan.sms.request.SmsSendRequest;
import com.hyc.utils.phone253.com.chuanglan.sms.response.SmsSendResponse;

@Service(value = "phone253SendService")
public class Phone253SendService {
	Logger log = LoggerFactory.getLogger(Phone253SendService.class);
	@Value("${smsSingleRequestServerUrl}")
	public String smsSingleRequestServerUrl;
	@Value("${ver_account}")
	public String ver_account;
	@Value("${ver_pdw}")
	public String ver_pdw;

	@Value("${nt_account}")
	public String nt_account;
	@Value("${nt_pdw}")
	public String nt_pdw;

	@Value("${mt_account}")
	public String mt_account;
	@Value("${mt_pdw}")
	public String mt_pdw;
	@Value("${sms_message}")
	public String sms_message;

	/**
	 * 253d短信发送工具
	 * 
	 * @param type
	 *            // 短信类型ver:验证类 nt:通知类 mt:营销类
	 * @param phone
	 *            // 短信接收号码,多个号码用英文,隔开
	 * @param msg
	 *            // 短信内容
	 * @return
	 */
	public String sendMessage(String type, String phone, String msg) {
		// 1 : 成功 2：失败
		String flag = "2";
		String accout = "";
		String pwd = "";
		/**
		 * 发短信
		 */
		switch (type) {
		case "ver":
			accout = ver_account; // 发送短信的账号(非登录账号) (示例:N987654)
			pwd = ver_pdw; // 发送短信的密码(非登录密码)
			break;
		case "nt":
			accout = nt_account; // 发送短信的账号(非登录账号) (示例:N987654)
			pwd = nt_pdw; // 发送短信的密码(非登录密码)
			break;

		case "mt":
			accout = mt_account; // 发送短信的账号(非登录账号) (示例:N987654)
			pwd = mt_pdw; // 发送短信的密码(非登录密码)
			break;
		default:
			break;
		}

		String smsg = "";
		try {
			smsg = URLEncoder.encode(msg, "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		SmsSendRequest smsSingleRequest = new SmsSendRequest(accout, pwd, smsg,
				phone);
		String requestJson = JSON.toJSONString(smsSingleRequest);
		log.info("【253云通讯】request: " + requestJson + ", url: "
				+ smsSingleRequestServerUrl);
		String response = ChuangLanSmsUtil.sendSmsByPost(
				smsSingleRequestServerUrl, requestJson);
		log.info("【253云通讯】response:" + response);
		SmsSendResponse smsSingleResponse = JSON.parseObject(response,
				SmsSendResponse.class);
		log.info("MMMMMMMMMMBBBBBBBBB" + smsSingleResponse.getCode());
		if (smsSingleResponse.getCode().equals("0")) {
			log.info("MMMM1");
			flag = "1";
		} else {
			log.info("MMMMMM2");
		}

		return flag;
	}
}