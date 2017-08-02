package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 注册表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("user_register_info")
public class UserRegisterInfo implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="user_id")
	private Integer userId;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 密码
	 */
	@TableField(value="pass_word")
	private String passWord;

	/**
	 * 注册ip
	 */
	@TableField(value="reg_ip")
	private String regIp;

	/**
	 * 注册所在地(精确到地级市)
	 */
	@TableField(value="reg_address")
	private String regAddress;

	/**
	 * 注册时间
	 */
	@TableField(value="reg_time")
	private Date regTime;

	/**
	 * 推广渠道
	 */
	@TableField(value="first_spread_channel")
	private String firstSpreadChannel;

	/**
	 * 二级推广渠道
	 */
	@TableField(value="second_spread_channel")
	private String secondSpreadChannel;

	/**
	 * 三级推广渠道
	 */
	@TableField(value="third_spread_channel")
	private String thirdSpreadChannel;

	/**
	 * 直属推广员id
	 */
	@TableField(value="spread_user_id")
	private String spreadUserId;

	/**
	 * 祖系推广员id
	 */
	@TableField(value="parent_spread_user_id")
	private String parentSpreadUserId;

	/**
	 * 专属链接
	 */
	@TableField(value="spread_link")
	private String spreadLink;



	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getRegIp() {
		return regIp;
	}

	public void setRegIp(String regIp) {
		this.regIp = regIp;
	}

	public String getRegAddress() {
		return regAddress;
	}

	public void setRegAddress(String regAddress) {
		this.regAddress = regAddress;
	}

	public Date getRegTime() {
		return regTime;
	}

	public void setRegTime(Date regTime) {
		this.regTime = regTime;
	}

	public String getFirstSpreadChannel() {
		return firstSpreadChannel;
	}

	public void setFirstSpreadChannel(String firstSpreadChannel) {
		this.firstSpreadChannel = firstSpreadChannel;
	}

	public String getSecondSpreadChannel() {
		return secondSpreadChannel;
	}

	public void setSecondSpreadChannel(String secondSpreadChannel) {
		this.secondSpreadChannel = secondSpreadChannel;
	}

	public String getThirdSpreadChannel() {
		return thirdSpreadChannel;
	}

	public void setThirdSpreadChannel(String thirdSpreadChannel) {
		this.thirdSpreadChannel = thirdSpreadChannel;
	}

	public String getSpreadUserId() {
		return spreadUserId;
	}

	public void setSpreadUserId(String spreadUserId) {
		this.spreadUserId = spreadUserId;
	}

	public String getParentSpreadUserId() {
		return parentSpreadUserId;
	}

	public void setParentSpreadUserId(String parentSpreadUserId) {
		this.parentSpreadUserId = parentSpreadUserId;
	}

	public String getSpreadLink() {
		return spreadLink;
	}

	public void setSpreadLink(String spreadLink) {
		this.spreadLink = spreadLink;
	}

}
