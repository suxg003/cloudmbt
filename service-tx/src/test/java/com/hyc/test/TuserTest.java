package com.hyc.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hyc.ServiceDemoApplication;
import com.hyc.model.Tuser;
import com.hyc.service.TuserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServiceDemoApplication.class)
public class TuserTest {
	@Autowired
	private TuserService tusService;

	/**
	 * 测试类
	 */
	@Test
	public void testAddUser() {
		Tuser user = new Tuser();
		user.setUserage("181");
		user.setUserid("101111");
		user.setUsername("pl");
		tusService.addUser(user);
	}

	@Test
	public void testQueryByIdTuser() {
		List<Tuser> list = this.tusService.findById("1111");
		for (Tuser tuser : list)
			System.out.println(tuser.getUsername() + "--------"
					+ tuser.getUserid());
	}

}
