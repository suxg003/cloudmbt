package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 评分卡规则配置表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("conf_score_card")
public class ConfScoreCard implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 评分卡规则编号
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 规则类别（关联字典表类型）
	 */
	@TableField(value="score_type")
	private String scoreType;

	/**
	 * 参数1
	 */
	private String parameter1;

	/**
	 * 参数1名称
	 */
	@TableField(value="parameter1_name")
	private String parameter1Name;

	/**
	 * 参数2
	 */
	private String parameter2;

	/**
	 * 参数2名称
	 */
	@TableField(value="parameter2_name")
	private String parameter2Name;

	/**
	 * 参数3
	 */
	private String parameter3;

	/**
	 * 参数3名称
	 */
	@TableField(value="parameter_name")
	private String parameterName;

	/**
	 * 权重分值
	 */
	private Integer score;

	/**
	 * 是否生效(01:生效 02:失效)
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
	 * 最后操作人
	 */
	@TableField(value="edit_user_id")
	private String editUserId;

	/**
	 * 生效方式（01:立即，02:定时）
	 */
	@TableField(value="take_effect_type")
	private String takeEffectType;

	/**
	 * 预计生效时间
	 */
	@TableField(value="take_effect_time")
	private Date takeEffectTime;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getScoreType() {
		return scoreType;
	}

	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
	}

	public String getParameter1() {
		return parameter1;
	}

	public void setParameter1(String parameter1) {
		this.parameter1 = parameter1;
	}

	public String getParameter1Name() {
		return parameter1Name;
	}

	public void setParameter1Name(String parameter1Name) {
		this.parameter1Name = parameter1Name;
	}

	public String getParameter2() {
		return parameter2;
	}

	public void setParameter2(String parameter2) {
		this.parameter2 = parameter2;
	}

	public String getParameter2Name() {
		return parameter2Name;
	}

	public void setParameter2Name(String parameter2Name) {
		this.parameter2Name = parameter2Name;
	}

	public String getParameter3() {
		return parameter3;
	}

	public void setParameter3(String parameter3) {
		this.parameter3 = parameter3;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
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

}
