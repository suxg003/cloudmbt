package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 催收逾期规则配置表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("conf_overdue_rule_cs")
public class ConfOverdueRuleCs implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 逾期最小天数
	 */
	@TableField(value="over_min_day")
	private Integer overMinDay;

	/**
	 * 逾期最大天数
	 */
	@TableField(value="over_max_day")
	private Integer overMaxDay;

	/**
	 * 逾期级别（关联字典表类型）
	 */
	@TableField(value="over_level")
	private String overLevel;

	/**
	 * 催收方式（1语音催收、2外呼催收、3委外催收、4线上仲裁）
	 */
	@TableField(value="penalty_type")
	private String penaltyType;

	/**
	 * 是否生效(1:生效 0:失效)
	 */
	private String status;

	/**
	 * 创建时间
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;

	/**
	 * 最后操作时间
	 */
	@TableField(value="edit_date_time")
	private Date editDateTime;

	/**
	 * 最后操作人ID
	 */
	@TableField(value="edit_user_id")
	private String editUserId;

	/**
	 * 最后操作人
	 */
	@TableField(value="last_operator_name")
	private String lastOperatorName;

	/**
	 * 生效方式（1:立即，0:定时）
	 */
	@TableField(value="take_effect_type")
	private String takeEffectType;

	/**
	 * 定时生效时间
	 */
	@TableField(value="take_effect_time")
	private Date takeEffectTime;

	/**
	 * 备用字段1
	 */
	private String reserve1;

	/**
	 * 备用字段2
	 */
	private String reserve2;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOverMinDay() {
		return overMinDay;
	}

	public void setOverMinDay(Integer overMinDay) {
		this.overMinDay = overMinDay;
	}

	public Integer getOverMaxDay() {
		return overMaxDay;
	}

	public void setOverMaxDay(Integer overMaxDay) {
		this.overMaxDay = overMaxDay;
	}

	public String getOverLevel() {
		return overLevel;
	}

	public void setOverLevel(String overLevel) {
		this.overLevel = overLevel;
	}

	public String getPenaltyType() {
		return penaltyType;
	}

	public void setPenaltyType(String penaltyType) {
		this.penaltyType = penaltyType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Date getEditDateTime() {
		return editDateTime;
	}

	public void setEditDateTime(Date editDateTime) {
		this.editDateTime = editDateTime;
	}

	public String getEditUserId() {
		return editUserId;
	}

	public void setEditUserId(String editUserId) {
		this.editUserId = editUserId;
	}

	public String getLastOperatorName() {
		return lastOperatorName;
	}

	public void setLastOperatorName(String lastOperatorName) {
		this.lastOperatorName = lastOperatorName;
	}

	public String getTakeEffectType() {
		return takeEffectType;
	}

	public void setTakeEffectType(String takeEffectType) {
		this.takeEffectType = takeEffectType;
	}

	public Date getTakeEffectTime() {
		return takeEffectTime;
	}

	public void setTakeEffectTime(Date takeEffectTime) {
		this.takeEffectTime = takeEffectTime;
	}

	public String getReserve1() {
		return reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getReserve2() {
		return reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

}
