
/**
 *
 *
 *
 */


package com.hyc.rep;

import org.springframework.stereotype.Repository;

//@Repository
public class UserLoginInfoConst {

	public static final String SQL_MAP_NS = "user_login_info"; 

	public static final String PARAM_MAP_NS = "userLoginInfo"; 

	public static final String ID = "id"; 
	public static final String USER_ID = "user_id"; 
	public static final String LOGIN_TIME = "login_time"; 
	public static final String LOGIN_IP = "login_ip"; 
	public static final String LOGIN_REGION = "login_region"; 
	public static final String LOGIN_ADDRESS = "login_address"; 
	public static final String DEVICE_ID = "device_id"; 
	public static final String APP_STORE = "app_store"; 
	public static final String CHANNEL_PACKAGE = "channel_package"; 
	public static final String LOGIN_SITE = "login_site"; 
	public static final String APP_VERSION = "app_version"; 
	public static final String APP_RESOLUTION = "app_resolution"; 
	public static final String APP_SYSTEM = "app_system"; 
	public static final String TONGDUN_DEVICE_ID = "tongdun_device_id"; 


	//@Digits(integer=11, fraction=0)
	public static final String PARAM_id = "id"; 
	//@Length(max=32)
	public static final String PARAM_userId = "userId"; 
	//@Length(max=50)
	public static final String PARAM_loginIp = "loginIp"; 
	//@Length(max=100)
	public static final String PARAM_loginRegion = "loginRegion"; 
	//@Length(max=100)
	public static final String PARAM_loginAddress = "loginAddress"; 
	//@Length(max=100)
	public static final String PARAM_deviceId = "deviceId"; 
	//@Length(max=100)
	public static final String PARAM_appStore = "appStore"; 
	//@Length(max=100)
	public static final String PARAM_channelPackage = "channelPackage"; 
	//@Length(max=100)
	public static final String PARAM_loginSite = "loginSite"; 
	//@Length(max=100)
	public static final String PARAM_appVersion = "appVersion"; 
	//@Length(max=50)
	public static final String PARAM_appResolution = "appResolution"; 
	//@Length(max=2)
	public static final String PARAM_appSystem = "appSystem"; 
	//@Length(max=21845)
	public static final String PARAM_tongdunDeviceId = "tongdunDeviceId"; 

	public static final String[] SQL_MAP_PK = {ID};

	public static final String[] PARAM_MAP_PK = {PARAM_id};
}