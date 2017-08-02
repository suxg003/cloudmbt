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
@TableName("sys_app_channel")
public class SysAppChannel implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 
	 */
	@TableField(value="app_deviceId")
	private String appDeviceid;

	/**
	 * 
	 */
	@TableField(value="app_channel")
	private String appChannel;

	/**
	 * 
	 */
	@TableField(value="credit_datetime")
	private Date creditDatetime;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAppDeviceid() {
		return appDeviceid;
	}

	public void setAppDeviceid(String appDeviceid) {
		this.appDeviceid = appDeviceid;
	}

	public String getAppChannel() {
		return appChannel;
	}

	public void setAppChannel(String appChannel) {
		this.appChannel = appChannel;
	}

	public Date getCreditDatetime() {
		return creditDatetime;
	}

	public void setCreditDatetime(Date creditDatetime) {
		this.creditDatetime = creditDatetime;
	}

}
