package com.hyc.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * 用户实体
 * 
 * @author hyc123
 *
 */
@TableName(value = "t_user")
public class Tuser {
	/*
	 * `user_id` varchar(40) NOT NULL, `user_name` varchar(20) NOT NULL,
	 * `user_age` varchar(20) NOT NULL
	 */@TableField("user_id")
	private String userid;
	@TableField("user_name")
	private String username;
	@TableField("user_age")
	private String userage;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserage() {
		return userage;
	}

	public void setUserage(String userage) {
		this.userage = userage;
	}
}
