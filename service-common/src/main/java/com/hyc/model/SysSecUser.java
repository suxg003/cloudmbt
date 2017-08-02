package com.hyc.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_sec_user")
public class SysSecUser implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 用户编号
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="user_id")
	private String userId;

	/**
	 * 管理机构
	 */
	@TableField(value="admin_org_id")
	private String adminOrgId;

	/**
	 * 所属机构
	 */
	@TableField(value="parent_org_id")
	private String parentOrgId;

	/**
	 * 所属岗位
	 */
	@TableField(value="user_position")
	private String userPosition;

	/**
	 * 用户账号
	 */
	@TableField(value="user_account")
	private String userAccount;

	/**
	 * 用户密码
	 */
	@TableField(value="user_password")
	private String userPassword;

	/**
	 * 用户邮箱
	 */
	@TableField(value="user_email")
	private String userEmail;

	/**
	 * 用户姓名
	 */
	@TableField(value="user_name")
	private String userName;

	/**
	 * 用户说明
	 */
	@TableField(value="user_desc")
	private String userDesc;

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



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAdminOrgId() {
		return adminOrgId;
	}

	public void setAdminOrgId(String adminOrgId) {
		this.adminOrgId = adminOrgId;
	}

	public String getParentOrgId() {
		return parentOrgId;
	}

	public void setParentOrgId(String parentOrgId) {
		this.parentOrgId = parentOrgId;
	}

	public String getUserPosition() {
		return userPosition;
	}

	public void setUserPosition(String userPosition) {
		this.userPosition = userPosition;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
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
