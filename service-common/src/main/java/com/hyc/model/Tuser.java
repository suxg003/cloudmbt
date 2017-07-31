package com.hyc.model;
/**
 * 用户实体
 * @author hyc123
 *
 */
public class Tuser {
/*
	 `user_id` varchar(40) NOT NULL,
	  `user_name` varchar(20) NOT NULL,
	  `user_age` varchar(20) NOT NULL
*/	
	private String userid;
	
	private String username;
	
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
