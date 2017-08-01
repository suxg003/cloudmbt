package com.hyc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hyc.model.Tuser;
import com.quick.ServiceDemoApplication;
import com.quick.service.TuserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServiceDemoApplication.class)
public class TuserTest {
	@Autowired
	private TuserService tusService;

	/**
	 * 测试类
	 */
	@Test
	public void queryByIdTuser() {
		Tuser tuser = this.tusService.findById("111");
		System.out
				.println(tuser.getUsername() + "--------" + tuser.getUserid());
	}

}
