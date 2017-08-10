package com.hyc.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 角色
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_sec_role")
public class SysSecRole implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.AUTO)
	@TableField(value="role_id")
	private String roleId;

	/**
	 * 角色编号
	 */
	@TableField(value="role_code")
	private String roleCode;

	/**
	 * 机构编号
	 */
	@TableField(value="org_id")
	private String orgId;

	/**
	 * 机构级别类型
	 */
	@TableField(value="org_level_type")
	private String orgLevelType;

	/**
	 * 数据权限
	 */
	@TableField(value="data_authority")
	private String dataAuthority;

	/**
	 * 角色名称
	 */
	@TableField(value="role_name")
	private String roleName;

	/**
	 * 角色描述
	 */
	@TableField(value="role_desc")
	private String roleDesc;

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
	 * 版本控制
	 */
	@TableField(value="version_")
	private BigDecimal version;



	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgLevelType() {
		return orgLevelType;
	}

	public void setOrgLevelType(String orgLevelType) {
		this.orgLevelType = orgLevelType;
	}

	public String getDataAuthority() {
		return dataAuthority;
	}

	public void setDataAuthority(String dataAuthority) {
		this.dataAuthority = dataAuthority;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
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
