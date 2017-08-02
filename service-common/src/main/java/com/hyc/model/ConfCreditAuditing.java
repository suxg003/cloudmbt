package com.hyc.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 信审规则配置表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("conf_credit_auditing")
public class ConfCreditAuditing implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 信审规则编号
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 信用最小分值
	 */
	@TableField(value="credit_min_score")
	private Integer creditMinScore;

	/**
	 *  信用最大分值
	 */
	@TableField(value="credit_max_score")
	private Integer creditMaxScore;

	/**
	 * 授信额度
	 */
	@TableField(value="credit_amount")
	private BigDecimal creditAmount;

	/**
	 * 审核类型（1资料审核，2批贷审核）
	 */
	@TableField(value="approve_type")
	private String approveType;

	/**
	 * 审核方式(1:自动拒绝 2:自动通过 3:人工审核)
	 */
	@TableField(value="approve_type_way")
	private String approveTypeWay;

	/**
	 * 是否生效(1:生效 0:失效)
	 */
	private String status;

	/**
	 * 资料审核方式(1:自动拒绝 2:自动通过 3:人工审核)
	 */
	@TableField(value="auditing_type")
	private String auditingType;

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
	 * 
	 */
	@TableField(value="operator_name")
	private String operatorName;

	/**
	 * 最后操作人id
	 */
	@TableField(value="edit_user_id")
	private String editUserId;

	/**
	 * 生效方式（1:立即，0:定时）
	 */
	@TableField(value="take_effect_type")
	private String takeEffectType;

	/**
	 * 预计生效时间
	 */
	@TableField(value="take_effect_time")
	private Date takeEffectTime;

	/**
	 * 批贷审核方式（1 2 3）
	 */
	@TableField(value="approve_way")
	private String approveWay;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCreditMinScore() {
		return creditMinScore;
	}

	public void setCreditMinScore(Integer creditMinScore) {
		this.creditMinScore = creditMinScore;
	}

	public Integer getCreditMaxScore() {
		return creditMaxScore;
	}

	public void setCreditMaxScore(Integer creditMaxScore) {
		this.creditMaxScore = creditMaxScore;
	}

	public BigDecimal getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getApproveType() {
		return approveType;
	}

	public void setApproveType(String approveType) {
		this.approveType = approveType;
	}

	public String getApproveTypeWay() {
		return approveTypeWay;
	}

	public void setApproveTypeWay(String approveTypeWay) {
		this.approveTypeWay = approveTypeWay;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAuditingType() {
		return auditingType;
	}

	public void setAuditingType(String auditingType) {
		this.auditingType = auditingType;
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

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
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

	public String getApproveWay() {
		return approveWay;
	}

	public void setApproveWay(String approveWay) {
		this.approveWay = approveWay;
	}

}
