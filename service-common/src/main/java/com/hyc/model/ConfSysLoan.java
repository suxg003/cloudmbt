package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 借贷业务-系统参数配置表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("conf_sys_loan")
public class ConfSysLoan implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 规则编号
	 */
	@TableField(value="rule_id")
	private Integer ruleId;

	/**
	 * 规则名称
	 */
	@TableField(value="conf_name")
	private String confName;

	/**
	 * 参数
	 */
	private String param;

	/**
	 * 生效方式（1立即,0定时）
	 */
	@TableField(value="is_now")
	private String isNow;

	/**
	 * 有效性（1有效,0无效）
	 */
	@TableField(value="is_effective")
	private String isEffective;

	/**
	 * 创建时间
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;

	/**
	 * 更新时间
	 */
	@TableField(value="update_date_time")
	private Date updateDateTime;

	/**
	 * 计划生效时间
	 */
	@TableField(value="plan_date_time")
	private Date planDateTime;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRuleId() {
		return ruleId;
	}

	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}

	public String getConfName() {
		return confName;
	}

	public void setConfName(String confName) {
		this.confName = confName;
	}

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getIsNow() {
		return isNow;
	}

	public void setIsNow(String isNow) {
		this.isNow = isNow;
	}

	public String getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(String isEffective) {
		this.isEffective = isEffective;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public Date getPlanDateTime() {
		return planDateTime;
	}

	public void setPlanDateTime(Date planDateTime) {
		this.planDateTime = planDateTime;
	}

}
