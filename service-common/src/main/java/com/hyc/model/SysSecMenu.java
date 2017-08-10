package com.hyc.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 菜单
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_sec_menu")
public class SysSecMenu implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 菜单编号
	 */
	@TableId(type = IdType.AUTO)
	@TableField(value="menu_code")
	private String menuCode;

	/**
	 * 根菜单编号
	 */
	@TableField(value="root_menu_code")
	private String rootMenuCode;

	/**
	 * 父菜单编号
	 */
	@TableField(value="parent_code")
	private String parentCode;

	/**
	 * 菜单类型
	 */
	@TableField(value="menu_type")
	private String menuType;

	/**
	 * 菜单名称
	 */
	@TableField(value="menu_name")
	private String menuName;

	/**
	 * 菜单级别
	 */
	@TableField(value="menu_level")
	private BigDecimal menuLevel;

	/**
	 * 功能编号
	 */
	@TableField(value="resource_code")
	private String resourceCode;

	/**
	 * 菜单url
	 */
	@TableField(value="menu_url")
	private String menuUrl;

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
	 * 创建日期
	 */
	@TableField(value="create_date")
	private String createDate;

	/**
	 * 创建时间
	 */
	@TableField(value="create_time")
	private String createTime;

	/**
	 * 版本
	 */
	@TableField(value="version_")
	private BigDecimal version;



	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getRootMenuCode() {
		return rootMenuCode;
	}

	public void setRootMenuCode(String rootMenuCode) {
		this.rootMenuCode = rootMenuCode;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public BigDecimal getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(BigDecimal menuLevel) {
		this.menuLevel = menuLevel;
	}

	public String getResourceCode() {
		return resourceCode;
	}

	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
	}

	public String getMenuUrl() {
		return menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
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

	public BigDecimal getVersion() {
		return version;
	}

	public void setVersion(BigDecimal version) {
		this.version = version;
	}

}
