package com.hyc.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 功能
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_sec_resource")
public class SysSecResource implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 功能编号
	 */
	@TableId(type = IdType.AUTO)
	@TableField(value="resource_id")
	private String resourceId;

	/**
	 * 菜单编号
	 */
	@TableField(value="menu_code")
	private String menuCode;

	/**
	 * 功能名称
	 */
	@TableField(value="resource_name")
	private String resourceName;

	/**
	 * 功能类型
	 */
	@TableField(value="resource_type")
	private String resourceType;

	/**
	 * 功能链接
	 */
	@TableField(value="resource_url")
	private String resourceUrl;

	/**
	 * 功能分组
	 */
	@TableField(value="resource_group")
	private String resourceGroup;

	/**
	 * 排序
	 */
	@TableField(value="sec_order")
	private BigDecimal secOrder;

	/**
	 * 是否可用
	 */
	@TableField(value="sec_enabled")
	private String secEnabled;

	/**
	 * 系统保留
	 */
	@TableField(value="sec_sys_flag")
	private String secSysFlag;

	/**
	 * 只读标志
	 */
	@TableField(value="sec_readonly_flag")
	private String secReadonlyFlag;

	/**
	 * 删除标志
	 */
	@TableField(value="sec_delete_flag")
	private BigDecimal secDeleteFlag;

	/**
	 * 版本控制
	 */
	@TableField(value="version_")
	private BigDecimal version;

	/**
	 * 创建日期
	 */
	@TableField(value="create_date")
	private String createDate;

	/**
	 * 创建时间
	 */
	@TableField(value="create_time")
	private String createTime;



	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceUrl() {
		return resourceUrl;
	}

	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	public String getResourceGroup() {
		return resourceGroup;
	}

	public void setResourceGroup(String resourceGroup) {
		this.resourceGroup = resourceGroup;
	}

	public BigDecimal getSecOrder() {
		return secOrder;
	}

	public void setSecOrder(BigDecimal secOrder) {
		this.secOrder = secOrder;
	}

	public String getSecEnabled() {
		return secEnabled;
	}

	public void setSecEnabled(String secEnabled) {
		this.secEnabled = secEnabled;
	}

	public String getSecSysFlag() {
		return secSysFlag;
	}

	public void setSecSysFlag(String secSysFlag) {
		this.secSysFlag = secSysFlag;
	}

	public String getSecReadonlyFlag() {
		return secReadonlyFlag;
	}

	public void setSecReadonlyFlag(String secReadonlyFlag) {
		this.secReadonlyFlag = secReadonlyFlag;
	}

	public BigDecimal getSecDeleteFlag() {
		return secDeleteFlag;
	}

	public void setSecDeleteFlag(BigDecimal secDeleteFlag) {
		this.secDeleteFlag = secDeleteFlag;
	}

	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
