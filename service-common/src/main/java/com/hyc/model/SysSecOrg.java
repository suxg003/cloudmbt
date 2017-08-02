package com.hyc.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 组织机构
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_sec_org")
public class SysSecOrg implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 机构编码
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="org_id")
	private String orgId;

	/**
	 * 根机构
	 */
	@TableField(value="root_org_id")
	private String rootOrgId;

	/**
	 * 上级机构
	 */
	@TableField(value="up_org_id")
	private String upOrgId;

	/**
	 * 一级机构编号
	 */
	@TableField(value="root_br_org_id")
	private String rootBrOrgId;

	/**
	 * 机构名称
	 */
	@TableField(value="org_name")
	private String orgName;

	/**
	 * 机构编号
	 */
	@TableField(value="org_code")
	private String orgCode;

	/**
	 * 机构说明
	 */
	@TableField(value="org_desc")
	private String orgDesc;

	/**
	 * 机构级别
	 */
	@TableField(value="org_level")
	private BigDecimal orgLevel;

	/**
	 * 机构类型
	 */
	@TableField(value="org_type")
	private String orgType;

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

	/**
	 * 机构部门标志
	 */
	@TableField(value="org_or_dep_flag")
	private String orgOrDepFlag;

	/**
	 * 机构级别类型
	 */
	@TableField(value="org_level_type")
	private String orgLevelType;

	/**
	 * 数据来源
	 */
	@TableField(value="org_data_source")
	private String orgDataSource;

	/**
	 * 预留
	 */
	@TableField(value="org_district")
	private String orgDistrict;



	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getRootOrgId() {
		return rootOrgId;
	}

	public void setRootOrgId(String rootOrgId) {
		this.rootOrgId = rootOrgId;
	}

	public String getUpOrgId() {
		return upOrgId;
	}

	public void setUpOrgId(String upOrgId) {
		this.upOrgId = upOrgId;
	}

	public String getRootBrOrgId() {
		return rootBrOrgId;
	}

	public void setRootBrOrgId(String rootBrOrgId) {
		this.rootBrOrgId = rootBrOrgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgDesc() {
		return orgDesc;
	}

	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}

	public BigDecimal getOrgLevel() {
		return orgLevel;
	}

	public void setOrgLevel(BigDecimal orgLevel) {
		this.orgLevel = orgLevel;
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
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

	public String getOrgOrDepFlag() {
		return orgOrDepFlag;
	}

	public void setOrgOrDepFlag(String orgOrDepFlag) {
		this.orgOrDepFlag = orgOrDepFlag;
	}

	public String getOrgLevelType() {
		return orgLevelType;
	}

	public void setOrgLevelType(String orgLevelType) {
		this.orgLevelType = orgLevelType;
	}

	public String getOrgDataSource() {
		return orgDataSource;
	}

	public void setOrgDataSource(String orgDataSource) {
		this.orgDataSource = orgDataSource;
	}

	public String getOrgDistrict() {
		return orgDistrict;
	}

	public void setOrgDistrict(String orgDistrict) {
		this.orgDistrict = orgDistrict;
	}

}
