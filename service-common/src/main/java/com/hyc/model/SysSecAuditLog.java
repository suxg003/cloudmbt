package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 系统日志记录表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_sec_audit_log")
public class SysSecAuditLog implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 日志编号
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="audit_log_id")
	private String auditLogId;

	/**
	 * 操作人
	 */
	@TableField(value="user_id")
	private String userId;

	/**
	 * 客户端ip
	 */
	@TableField(value="ip_address")
	private String ipAddress;

	/**
	 * 功能编号
	 */
	@TableField(value="resource_id")
	private String resourceId;

	/**
	 * 功能名称
	 */
	@TableField(value="resource_name")
	private String resourceName;

	/**
	 * 功能url
	 */
	@TableField(value="resource_url")
	private String resourceUrl;

	/**
	 * 操作
	 */
	private String oper;

	/**
	 * 状态
	 */
	@TableField(value="oper_status")
	private String operStatus;

	/**
	 * 操作描述
	 */
	@TableField(value="oper_remark")
	private String operRemark;

	/**
	 * 操作日期
	 */
	@TableField(value="oper_date")
	private String operDate;

	/**
	 * 操作时间
	 */
	@TableField(value="oper_time")
	private String operTime;

	/**
	 * 业务编号
	 */
	@TableField(value="service_id")
	private String serviceId;



	public String getAuditLogId() {
		return auditLogId;
	}

	public void setAuditLogId(String auditLogId) {
		this.auditLogId = auditLogId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public String getOper() {
		return oper;
	}

	public void setOper(String oper) {
		this.oper = oper;
	}

	public String getOperStatus() {
		return operStatus;
	}

	public void setOperStatus(String operStatus) {
		this.operStatus = operStatus;
	}

	public String getOperRemark() {
		return operRemark;
	}

	public void setOperRemark(String operRemark) {
		this.operRemark = operRemark;
	}

	public String getOperDate() {
		return operDate;
	}

	public void setOperDate(String operDate) {
		this.operDate = operDate;
	}

	public String getOperTime() {
		return operTime;
	}

	public void setOperTime(String operTime) {
		this.operTime = operTime;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

}
