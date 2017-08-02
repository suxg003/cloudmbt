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
 * 业务付费模型配置
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("conf_bus_pay_model")
public class ConfBusPayModel implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 业务编号（主键）
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 借款金额
	 */
	@TableField(value="loan_amount")
	private BigDecimal loanAmount;

	/**
	 * 借款期限（天）
	 */
	@TableField(value="loan_period")
	private Integer loanPeriod;

	/**
	 * 管理费（元）
	 */
	@TableField(value="manage_fee")
	private BigDecimal manageFee;

	/**
	 * 查询费（元）
	 */
	@TableField(value="search_fee")
	private BigDecimal searchFee;

	/**
	 * 服务费（元）
	 */
	@TableField(value="service_fee")
	private BigDecimal serviceFee;

	/**
	 * 年化率
	 */
	private BigDecimal rate;

	/**
	 * 计息方式（01:放款次日计息02:放款计息）
	 */
	@TableField(value="interest_way")
	private String interestWay;

	/**
	 * 还款方式（01:一次性还本付息02:先息后本）
	 */
	@TableField(value="repay_way")
	private String repayWay;

	/**
	 * 提前还款（是,否）
	 */
	@TableField(value="is_prepayment")
	private String isPrepayment;

	/**
	 * 有效性（1有效,0无效）
	 */
	@TableField(value="is_effective")
	private String isEffective;

	/**
	 * 是否默认（是,否）
	 */
	@TableField(value="is_default")
	private String isDefault;

	/**
	 * 最低评分（评分范围的最小值）
	 */
	@TableField(value="score_min")
	private Integer scoreMin;

	/**
	 * 最高评分（评分范围的最小值）
	 */
	@TableField(value="score_max")
	private Integer scoreMax;

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
	 * 是否立即生效
	 */
	@TableField(value="effective_way")
	private Date effectiveWay;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Integer getLoanPeriod() {
		return loanPeriod;
	}

	public void setLoanPeriod(Integer loanPeriod) {
		this.loanPeriod = loanPeriod;
	}

	public BigDecimal getManageFee() {
		return manageFee;
	}

	public void setManageFee(BigDecimal manageFee) {
		this.manageFee = manageFee;
	}

	public BigDecimal getSearchFee() {
		return searchFee;
	}

	public void setSearchFee(BigDecimal searchFee) {
		this.searchFee = searchFee;
	}

	public BigDecimal getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(BigDecimal serviceFee) {
		this.serviceFee = serviceFee;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getInterestWay() {
		return interestWay;
	}

	public void setInterestWay(String interestWay) {
		this.interestWay = interestWay;
	}

	public String getRepayWay() {
		return repayWay;
	}

	public void setRepayWay(String repayWay) {
		this.repayWay = repayWay;
	}

	public String getIsPrepayment() {
		return isPrepayment;
	}

	public void setIsPrepayment(String isPrepayment) {
		this.isPrepayment = isPrepayment;
	}

	public String getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(String isEffective) {
		this.isEffective = isEffective;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getScoreMin() {
		return scoreMin;
	}

	public void setScoreMin(Integer scoreMin) {
		this.scoreMin = scoreMin;
	}

	public Integer getScoreMax() {
		return scoreMax;
	}

	public void setScoreMax(Integer scoreMax) {
		this.scoreMax = scoreMax;
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

	public Date getEffectiveWay() {
		return effectiveWay;
	}

	public void setEffectiveWay(Date effectiveWay) {
		this.effectiveWay = effectiveWay;
	}

}
