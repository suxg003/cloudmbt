package com.hyc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hyc.service.TxRedisDomainService;
import com.hyc.utils.AppMap;

@RestController
public class RedisController {

	@Autowired
	private TxRedisDomainService txRedisDomainService;

	/**
	 * 写入redis 操作
	 * @param key
	 * @param value
	 * @param time
	 */
	@RequestMapping("/util/rediswrite")
	public void redisWrite(@RequestParam("key") String key,
			@RequestParam("value") String value,
			@RequestParam("time") String time) {
		try {
			AppMap appMap = new AppMap();
			Map<String, Object> in = new HashMap<String, Object>();
			in.put("action", "write");
			in.put("_cache_redis_key_", key);
			in.put("_cache_redis_data_", value);
			in.put("_cache_redis_time_", time);
			appMap.setIn(in);
			txRedisDomainService.doService(appMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}