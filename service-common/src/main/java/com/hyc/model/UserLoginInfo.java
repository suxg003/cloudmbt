package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("user_login_info")
public class UserLoginInfo implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 用户id
	 */
	@TableField(value="user_id")
	private String userId;

	/**
	 * 登录时间
	 */
	@TableField(value="login_time")
	private Date loginTime;

	/**
	 * 登录ip
	 */
	@TableField(value="login_ip")
	private String loginIp;

	/**
	 * 登录地区(ip所在地区)
	 */
	@TableField(value="login_region")
	private String loginRegion;

	/**
	 * 登录位置(捕获定位位置)
	 */
	@TableField(value="login_address")
	private String loginAddress;

	/**
	 * 设备编号
	 */
	@TableField(value="device_id")
	private String deviceId;

	/**
	 * 应用市场(IOS应用市场、安卓应用市场)
	 */
	@TableField(value="app_store")
	private String appStore;

	/**
	 * 渠道包
	 */
	@TableField(value="channel_package")
	private String channelPackage;

	/**
	 * 登录站点
	 */
	@TableField(value="login_site")
	private String loginSite;

	/**
	 * 客户端版本号
	 */
	@TableField(value="app_version")
	private String appVersion;

	/**
	 * 手机分辨率
	 */
	@TableField(value="app_resolution")
	private String appResolution;

	/**
	 * 1:安卓2:ios
	 */
	@TableField(value="app_system")
	private String appSystem;

	/**
	 * 用户登录时 使用同盾sdk生成的设备id
	 */
	@TableField(value="tongdun_device_id")
	private String tongdunDeviceId;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public String getLoginRegion() {
		return loginRegion;
	}

	public void setLoginRegion(String loginRegion) {
		this.loginRegion = loginRegion;
	}

	public String getLoginAddress() {
		return loginAddress;
	}

	public void setLoginAddress(String loginAddress) {
		this.loginAddress = loginAddress;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getAppStore() {
		return appStore;
	}

	public void setAppStore(String appStore) {
		this.appStore = appStore;
	}

	public String getChannelPackage() {
		return channelPackage;
	}

	public void setChannelPackage(String channelPackage) {
		this.channelPackage = channelPackage;
	}

	public String getLoginSite() {
		return loginSite;
	}

	public void setLoginSite(String loginSite) {
		this.loginSite = loginSite;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getAppResolution() {
		return appResolution;
	}

	public void setAppResolution(String appResolution) {
		this.appResolution = appResolution;
	}

	public String getAppSystem() {
		return appSystem;
	}

	public void setAppSystem(String appSystem) {
		this.appSystem = appSystem;
	}

	public String getTongdunDeviceId() {
		return tongdunDeviceId;
	}

	public void setTongdunDeviceId(String tongdunDeviceId) {
		this.tongdunDeviceId = tongdunDeviceId;
	}

}
