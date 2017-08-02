package com.hyc.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 业务序列号信息表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_biz_serial")
public class SysBizSerial implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 业务号
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="biz_key")
	private String bizKey;

	/**
	 * 业务名称
	 */
	@TableField(value="biz_name")
	private String bizName;

	/**
	 * 流水号：默认值为1
	 */
	@TableField(value="biz_serial_no")
	private BigDecimal bizSerialNo;

	/**
	 * 前缀
	 */
	@TableField(value="biz_prefix")
	private String bizPrefix;

	/**
	 * 流水号日期
	 */
	@TableField(value="biz_date")
	private String bizDate;

	/**
	 * 是否拼接日期：0：否；1：是
	 */
	@TableField(value="is_append")
	private String isAppend;

	/**
	 * 流水号位数
	 */
	@TableField(value="serial_num")
	private BigDecimal serialNum;

	/**
	 * 业务描述
	 */
	@TableField(value="biz_remark")
	private String bizRemark;



	public String getBizKey() {
		return bizKey;
	}

	public void setBizKey(String bizKey) {
		this.bizKey = bizKey;
	}

	public String getBizName() {
		return bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
	}

	public BigDecimal getBizSerialNo() {
		return bizSerialNo;
	}

	public void setBizSerialNo(BigDecimal bizSerialNo) {
		this.bizSerialNo = bizSerialNo;
	}

	public String getBizPrefix() {
		return bizPrefix;
	}

	public void setBizPrefix(String bizPrefix) {
		this.bizPrefix = bizPrefix;
	}

	public String getBizDate() {
		return bizDate;
	}

	public void setBizDate(String bizDate) {
		this.bizDate = bizDate;
	}

	public String getIsAppend() {
		return isAppend;
	}

	public void setIsAppend(String isAppend) {
		this.isAppend = isAppend;
	}

	public BigDecimal getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(BigDecimal serialNum) {
		this.serialNum = serialNum;
	}

	public String getBizRemark() {
		return bizRemark;
	}

	public void setBizRemark(String bizRemark) {
		this.bizRemark = bizRemark;
	}

}
