package com.hyc.test;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hyc.ServiceDemoApplication;
import com.hyc.model.UserRegisterInfo;
import com.hyc.service.impl.AcctUserAcctInfoServiceImpl;
import com.hyc.service.impl.UserRegisterInfoServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServiceDemoApplication.class)
public class AcctUserAcctInfoServiceTest {
	Logger log = org.slf4j.LoggerFactory
			.getLogger(AcctUserAcctInfoServiceTest.class);
	@Autowired
	AcctUserAcctInfoServiceImpl acctUserAcctInfoServiceImpl;
	@Autowired
	UserRegisterInfoServiceImpl userRegisterInfoServiceImpl;

	/*@Test
	public void saveTest() {

		Date currentTime = new Date();
		AcctUserAcctInfo record = new AcctUserAcctInfo();

		record.setUserId(1111111);
		record.setChannelNo("channel_no");
		record.setCreditAmount(new BigDecimal(0));
		record.setLoanAmount(new BigDecimal(0));
		record.setBorrowAmount(new BigDecimal(0));
		record.setCreateDateTime(currentTime);
		record.setUpdateTime(currentTime);
		acctUserAcctInfoServiceImpl.insert(record);
	}
*/
	@Test
	public void registerSaveTest() {
		/*UserRegisterInfo userRegisterInfo = new UserRegisterInfo();
		userRegisterInfo.setRegIp("123.12");// 注册ip
		userRegisterInfo.setRegAddress("朝阳区");// 注册所在地
		userRegisterInfo.setPassWord("88888");// 密码
		userRegisterInfo.setRegTime(new Date());// 注册时间
		userRegisterInfoServiceImpl.insert(userRegisterInfo);
		log.info("@@@@@@@@@@@" + userRegisterInfo.getUserId());*/
		String s="123";
//		log.info("@@@@@@@"+StringUtils.defaultString(s));
	}
	
	@Test
	public void queryregister(){
		List<UserRegisterInfo> list=	userRegisterInfoServiceImpl.selectList(new EntityWrapper<UserRegisterInfo>().eq("reg_ip","123.12"));
	log.info("%%%%%%%%%%"+list.size());
	log.info("%%%%%%%"+list.get(0).getUserId());
	}

}
