package com.hyc.test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.MessageFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.hyc.ServiceDemoApplication;
import com.hyc.utils.phone253.com.chuanglan.sms.request.SmsSendRequest;
import com.hyc.utils.phone253.com.chuanglan.sms.response.SmsSendResponse;
import com.hyc.utils.phone253.com.chuanglan.sms.util.ChuangLanSmsUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServiceDemoApplication.class)
public class MessageTest {
	Logger log = LoggerFactory.getLogger(MessageTest.class);
	@Value("${ckmessage}")
	private String ckmessage;

	 
	@Test
	public void fmTest() {
		String[] s = new String[3];
		s[0] = "1111";
		String jkphoneMessage = MessageFormat.format(ckmessage, s);
		log.info("##################"+ jkphoneMessage);
	}

	// 注册短信发送的参数
	/*
	 * seMap.put("mobile",phone); seMap.put("content", content);
	 * seMap.put("type", "ver");
	 */
	@Value("${smsSingleRequestServerUrl}")
	private String smsSingleRequestServerUrl;

	@Value("${ver_account}")
	private String ver_account;

	@Value("${ver_pdw}")
	private String ver_pdw;

	@Value("${sms_message}")
	private String sms_message;

	@Test
	public void sendPhoneMessageTest() {

		/**
		 * 发短信
		 */
			String type = "ver"; // 短信类型ver:验证类 nt:通知类 mt:营销类
			String account =ver_account; // 发送短信的账号(非登录账号) (示例:N987654)
			String pwd =ver_pdw; // 发送短信的密码(非登录密码)
			String phone = "18911798523"; // 短信接收号码,多个号码用英文,隔开
			String msg = "很额很额很啊"; // 您的签名+短信内容
			String smsg = "";
			try {
				smsg = URLEncoder.encode(msg, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			SmsSendRequest smsSingleRequest = new SmsSendRequest(account, pwd,
					smsg, phone);
			String requestJson = JSON.toJSONString(smsSingleRequest);
			this.log.info("【253云通讯】request: " + requestJson + ", url: "
					+ smsSingleRequestServerUrl);
			String response = ChuangLanSmsUtil.sendSmsByPost(
					smsSingleRequestServerUrl, requestJson);
			this.log.info("【253云通讯】response:" + response);
			SmsSendResponse smsSingleResponse = JSON.parseObject(response,
					SmsSendResponse.class);
			log.info("MMMMMMMMMMBBBBBBBBB"+smsSingleResponse.getCode());
			 if(smsSingleResponse.getCode().equals("0")) {
				 log.info("MMMM1");
			} else {
				log.info("");
			}
		}
	}

