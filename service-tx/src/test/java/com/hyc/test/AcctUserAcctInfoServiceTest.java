package com.hyc.test;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hyc.ServiceDemoApplication;
import com.hyc.model.AcctUserAcctInfo;
import com.hyc.service.impl.AcctUserAcctInfoServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServiceDemoApplication.class)
public class AcctUserAcctInfoServiceTest {
	@Autowired 
	AcctUserAcctInfoServiceImpl acctUserAcctInfoServiceImpl;
	@Test
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

}
