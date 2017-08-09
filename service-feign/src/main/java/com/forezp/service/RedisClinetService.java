package com.forezp.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-demo", fallback = RedisClinetHystric.class)
public interface RedisClinetService {
	@RequestMapping(value = "/util/rediswrite", method = RequestMethod.GET)
	public void  putedisData(@RequestParam("key") String key,@RequestParam("value") String value,
			@RequestParam("time") String time);

 
}