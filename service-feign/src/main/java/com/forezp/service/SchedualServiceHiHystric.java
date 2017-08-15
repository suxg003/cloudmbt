package com.forezp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.hyc.model.Tuser;
import com.hyc.utils.BaseResp;

import feign.Feign;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	/*
	 * @Override public String sayHiFromClientOne(String name) { return
	 * "sorry，not call server "+name; }
	 */

	@Override
	public List<Tuser> getById(String id) {
		// TODO Auto-generated method stub
		BaseResp<Tuser> br = new BaseResp<Tuser>();
		br.setMessage("sorry，not call server");
		List<Tuser> list = new ArrayList<Tuser>();
		Tuser t = new Tuser();
		t.setUserage("100");
		t.setUserid("100");
		t.setUsername("系统连接失败");
		list.add(t);
		return list;
	}

	@Override
	public BaseResp<Tuser> addTuser(Tuser tuser) {
		BaseResp<Tuser> br = new BaseResp<Tuser>();
		br.setMessage("######sorry，not call server");
		return br;
	}

	/*@Configuration
	public class FooConfiguration {
		@Bean
		@Scope("prototype")
		public Feign.Builder feignBuilder() {
			return Feign.builder();
		}

		@Bean
		public SchedualServiceHiHystric fb() {
			return new SchedualServiceHiHystric();
		}
	}*/
}
