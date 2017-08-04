package com.hyc.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hyc.ServiceDemoApplication;
import com.hyc.service.TxRedisDomainService;
import com.hyc.utils.AppMap;

/**
 * redis test
 * @author hyc123
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ServiceDemoApplication.class)
public class RedisTest {
	Logger log=LoggerFactory.getLogger(RedisTest.class);
	@Autowired
	private TxRedisDomainService txRedisDomainService;
 
	@Test
	public void redisRead() {
		AppMap appMap=new AppMap();
		Map<String, Object> in = new HashMap<String, Object>();
		 in.put("action", "read");
		 in.put("_cache_redis_key_", "regist."+"189");
		 appMap.setIn(in);
		txRedisDomainService.doService(appMap);
		log.info(appMap.getOut().get(in.get("a"))+"");
		Assert.assertEquals("test", appMap.getOut().get(in.get("_cache_redis_key_")));
	
	}
	@Test
	public void writentRedisTest() {
		AppMap appMap=new AppMap();
		Map<String, Object> in = new HashMap<String, Object>();
		 in.put("action", "write");
		 in.put("_cache_redis_key_", "regist."+"189");
		 in.put("_cache_redis_data_", "test");
		 in.put("_cache_redis_time_", 120);
		 appMap.setIn(in);
		txRedisDomainService.doService(appMap);
	}
	@Test
	public void writeRe() {
		AppMap appMap=new AppMap();
		Map<String, Object> in = new HashMap<String, Object>();
		 in.put("action", "writent");
		 in.put("_cache_redis_key_", "regist."+"199");
		 in.put("_cache_redis_data_", "test199");
		 appMap.setIn(in);
		 txRedisDomainService.doService(appMap);
		 
	}
	@Test
	public void redisRead199() {
		AppMap appMap=new AppMap();
		Map<String, Object> in = new HashMap<String, Object>();
		 in.put("action", "read");
		 in.put("_cache_redis_key_", "regist."+"199");
		 appMap.setIn(in);
		txRedisDomainService.doService(appMap);
		Assert.assertEquals("test199", appMap.getOut().get(in.get("_cache_redis_key_")));
	
	}
	
	@Test
	public void deleteRead() {
		AppMap appMap=new AppMap();
		Map<String, Object> in = new HashMap<String, Object>();
		 in.put("action", "delete");
		 in.put("_cache_redis_key_", "regist."+"189");
		 appMap.setIn(in);
			txRedisDomainService.doService(appMap);
		redisRead();
	}

	
}
