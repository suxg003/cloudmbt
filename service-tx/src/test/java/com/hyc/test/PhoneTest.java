package com.hyc.test;

import java.text.MessageFormat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hyc.ServiceDemoApplication;
import com.hyc.utils.phone253.com.chuanglan.sms.util.Phone253SendService;
/**
 * 调用测试
 * @author hyc123
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServiceDemoApplication.class)
public class PhoneTest {
	Logger log = LoggerFactory.getLogger(PhoneTest.class);
	@Autowired
	Phone253SendService phone253SendService;
	@Value("${regist_user}")
	String  regist_user;  //用户注册
	
	@Test
	public void phoneTest() {
/*//		String flag =phone253SendUtil.sendMessage("ver", "18911798523",
//				"晚上到底吃什么好");
 * 
*/	
		String[] s = new String[3];
		s[0] = "1111";
		String jkphoneMessage = MessageFormat.format(regist_user, s);
		log.info("@@@@@@@@@@@@"+jkphoneMessage );
		/*String flag =phone253SendService.sendMessage("ver", "18911798523",jkphoneMessage);
		log.info("hen hao hen hao  hen hao a " + flag);*/
	}
}
