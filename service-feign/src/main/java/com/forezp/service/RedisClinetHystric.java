package com.forezp.service;

import org.slf4j.Logger;


public class RedisClinetHystric implements RedisClinetService{
	Logger log = org.slf4j.LoggerFactory.getLogger(RedisClinetHystric.class);
	@Override
	public void putedisData(String key, String value, String time) {
		// TODO Auto-generated method stub
		log.info("redis 服务端连接错误");
	}

}
