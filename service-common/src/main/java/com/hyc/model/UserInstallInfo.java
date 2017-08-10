package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * app安装记录表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("user_install_info")
public class UserInstallInfo implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.AUTO)
	private String id;

	/**
	 * 客户端类型：主客户端、马甲客户端
	 */
	@TableField(value="app_type")
	private String appType;

	/**
	 * 应用市场：IOS应用市场、安卓应用市场
	 */
	@TableField(value="app_store")
	private String appStore;

	/**
	 * 渠道：安卓渠道包名、ios积分墙渠道名
	 */
	@TableField(value="app_channel")
	private String appChannel;

	/**
	 * 
	 */
	@TableField(value="device_id")
	private String deviceId;

	/**
	 * 终端操作系统(ios、安卓)
	 */
	@TableField(value="app_system")
	private String appSystem;

	/**
	 * 客户端版本号
	 */
	@TableField(value="app_version")
	private String appVersion;

	/**
	 * 手机型号
	 */
	@TableField(value="mobile_type")
	private String mobileType;

	/**
	 * 手机分辨率
	 */
	@TableField(value="mobile_resolution")
	private String mobileResolution;

	/**
	 * 安装时间
	 */
	@TableField(value="install_time")
	private String installTime;

	/**
	 * 首次启动APP时，捕获的公网IP
	 */
	private String ip;

	/**
	 * 首次启动APP时捕获定位位置
	 */
	private String address;



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppType() {
		return appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
	}

	public String getAppStore() {
		return appStore;
	}

	public void setAppStore(String appStore) {
		this.appStore = appStore;
	}

	public String getAppChannel() {
		return appChannel;
	}

	public void setAppChannel(String appChannel) {
		this.appChannel = appChannel;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getAppSystem() {
		return appSystem;
	}

	public void setAppSystem(String appSystem) {
		this.appSystem = appSystem;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getMobileType() {
		return mobileType;
	}

	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

	public String getMobileResolution() {
		return mobileResolution;
	}

	public void setMobileResolution(String mobileResolution) {
		this.mobileResolution = mobileResolution;
	}

	public String getInstallTime() {
		return installTime;
	}

	public void setInstallTime(String installTime) {
		this.installTime = installTime;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
