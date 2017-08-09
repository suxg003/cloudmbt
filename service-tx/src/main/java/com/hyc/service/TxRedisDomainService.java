package com.hyc.service;


import java.io.Serializable;

 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hyc.utils.AppMap;

/**
 * Redis 服务接口
 * @author caolu
 *
 */
@Service
public class TxRedisDomainService  {
	public final String _cache_redis_key_ = "_cache_redis_key_";
	public final String _cache_redis_data_ = "_cache_redis_data_";
	public final String _cache_redis_time_ = "_cache_redis_time_";

	@Autowired
	private RedisTemplate<Serializable, Serializable> redisTemplate;
	
	@Transactional(rollbackFor = Throwable.class)
	public void doService(AppMap appMap) {
		String action = (String)appMap.getIn().get("action");
		if("read".equalsIgnoreCase(action)) {
			String key = (String)appMap.getIn().get(_cache_redis_key_);
			Object data = readCacheData(key);
			if(data != null) {
				appMap.getOut().put(key, data);
			}
		}else if("writent".equalsIgnoreCase(action)){
			String key = (String)appMap.getIn().get(_cache_redis_key_);
			String data = (String)appMap.getIn().get(_cache_redis_data_);
			wirteCacheDataNT(key,data);
		}else if("write".equalsIgnoreCase(action)) {
			String key = (String)appMap.getIn().get(_cache_redis_key_);
			String data = (String)appMap.getIn().get(_cache_redis_data_);
			long time = Long.valueOf((String) appMap.getIn().get(_cache_redis_time_));
			wirteCacheData(key,data,time);
		} else if("delete".equalsIgnoreCase(action)) {
			String key = (String)appMap.getIn().get(_cache_redis_key_);
			deleteCacheData(key);
		}
	}
	
	/**
	 * 写入没有时间的数据
	 * @param key
	 * @param data
	 * @param time
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void wirteCacheDataNT(final String key, final Object data ) {
		if(key == null || data == null) {
			return;
		}
		redisTemplate.execute(new RedisCallback() {
			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				byte[] serializekey = redisTemplate.getStringSerializer().serialize(key);
				byte[] serializeData = redisTemplate.getStringSerializer().serialize( (String) data);
				connection.set(serializekey, serializeData);
				return null;
			}
	    });
	}
	
	/**
	 * 写入数据
	 * @param key
	 * @param data
	 * @param time
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void wirteCacheData(final String key, final Object data ,final long time) {
		if(key == null || data == null) {
			return;
		}
		redisTemplate.execute(new RedisCallback() {
			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				byte[] serializekey = redisTemplate.getStringSerializer().serialize(key);
				byte[] serializeData = redisTemplate.getStringSerializer().serialize( (String) data);
				connection.set(serializekey, serializeData);
				if(time>0){
					connection.expire(serializekey, time);
				}
				return null;
			}
	    });
	}
	
	/**
	 * 读取数据
	 * @param key
	 * @return
	 */
	@SuppressWarnings({"unchecked", "rawtypes" })
	private Object readCacheData(final String key) {
		if(key == null) {
			return null;
		}
		return redisTemplate.execute(new RedisCallback() {
			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				byte[] serializekey = redisTemplate.getStringSerializer().serialize(key);
				if(connection.exists(serializekey)) {
					byte[] serializeData = connection.get(serializekey);
					return redisTemplate.getStringSerializer().deserialize(serializeData);
				}

				return null;
			}
	    });
	}
	
	/**
	 * 删除数据
	 * @param key
	 */
	@SuppressWarnings({"unchecked", "rawtypes" })
	private void deleteCacheData(final String key) {
		if(key == null) {
			return;
		}
		
		redisTemplate.execute(new RedisCallback() {
			@Override
			public Object doInRedis(RedisConnection connection)
					throws DataAccessException {
				byte[] serializekey = redisTemplate.getStringSerializer().serialize(key);
				if(connection.exists(serializekey)) {
					return connection.del(serializekey);
				}

				return null;
			}
	    });
	}

}
