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
 * 还款计划表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("xjd_repay_plan")
public class XjdRepayPlan implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 还款记录编号
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="repay_id")
	private Integer repayId;

	/**
	 * 用户id
	 */
	@TableField(value="user_id")
	private Integer userId;

	/**
	 * 借款编号
	 */
	@TableField(value="loan_no")
	private Integer loanNo;

	/**
	 * 还款期数
	 */
	private Integer periods;

	/**
	 * 计息天数
	 */
	@TableField(value="inter_days")
	private Integer interDays;

	/**
	 * 还款日期
	 */
	@TableField(value="repay_date")
	private Date repayDate;

	/**
	 * 还款步骤
	 */
	private Integer step;

	/**
	 * 还款状态(01:未还款 02:已还款 03:已逾期)
	 */
	private String status;

	/**
	 * 应还利息
	 */
	private BigDecimal interest;

	/**
	 * 实还利息
	 */
	@TableField(value="repayed_interest")
	private BigDecimal repayedInterest;

	/**
	 * 应还本金
	 */
	private BigDecimal amount;

	/**
	 * 实还本金
	 */
	@TableField(value="repayed_amount")
	private BigDecimal repayedAmount;

	/**
	 * 应还总金额
	 */
	@TableField(value="total_amount")
	private BigDecimal totalAmount;

	/**
	 * 实还总金额
	 */
	@TableField(value="repayed_total_amount")
	private BigDecimal repayedTotalAmount;

	/**
	 * 应还罚息
	 */
	@TableField(value="over_interest")
	private BigDecimal overInterest;

	/**
	 * 实还罚息
	 */
	@TableField(value="repayed_over_interest")
	private BigDecimal repayedOverInterest;

	/**
	 * 实际还款时间
	 */
	@TableField(value="repayed_date_time")
	private Date repayedDateTime;

	/**
	 * 逾期天数
	 */
	@TableField(value="over_days")
	private Integer overDays;

	/**
	 * 逾期阶段
	 */
	@TableField(value="over_stage")
	private String overStage;

	/**
	 * 逾期管理费（按天计算）
	 */
	@TableField(value="over_manage_fee")
	private BigDecimal overManageFee;

	/**
	 * 逾期催收费（按月计算）
	 */
	@TableField(value="over_collect_fee")
	private BigDecimal overCollectFee;

	/**
	 * 是否有过逾期(01:是02:否)
	 */
	@TableField(value="is_have_overdue")
	private String isHaveOverdue;

	/**
	 * 流水号
	 */
	@TableField(value="request_no")
	private String requestNo;

	/**
	 * 
	 */
	@TableField(value="deal_status")
	private String dealStatus;

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
	 * 预留字段1（自动还款流水号）
	 */
	private String reserve1;

	/**
	 *  01: app前端已提交成功 
	 */
	@TableField(value="third_pay_status")
	private String thirdPayStatus;

	/**
	 * 逾期利息
	 */
	@TableField(value="extra_interest")
	private BigDecimal extraInterest;



	public Integer getRepayId() {
		return repayId;
	}

	public void setRepayId(Integer repayId) {
		this.repayId = repayId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(Integer loanNo) {
		this.loanNo = loanNo;
	}

	public Integer getPeriods() {
		return periods;
	}

	public void setPeriods(Integer periods) {
		this.periods = periods;
	}

	public Integer getInterDays() {
		return interDays;
	}

	public void setInterDays(Integer interDays) {
		this.interDays = interDays;
	}

	public Date getRepayDate() {
		return repayDate;
	}

	public void setRepayDate(Date repayDate) {
		this.repayDate = repayDate;
	}

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getRepayedInterest() {
		return repayedInterest;
	}

	public void setRepayedInterest(BigDecimal repayedInterest) {
		this.repayedInterest = repayedInterest;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getRepayedAmount() {
		return repayedAmount;
	}

	public void setRepayedAmount(BigDecimal repayedAmount) {
		this.repayedAmount = repayedAmount;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getRepayedTotalAmount() {
		return repayedTotalAmount;
	}

	public void setRepayedTotalAmount(BigDecimal repayedTotalAmount) {
		this.repayedTotalAmount = repayedTotalAmount;
	}

	public BigDecimal getOverInterest() {
		return overInterest;
	}

	public void setOverInterest(BigDecimal overInterest) {
		this.overInterest = overInterest;
	}

	public BigDecimal getRepayedOverInterest() {
		return repayedOverInterest;
	}

	public void setRepayedOverInterest(BigDecimal repayedOverInterest) {
		this.repayedOverInterest = repayedOverInterest;
	}

	public Date getRepayedDateTime() {
		return repayedDateTime;
	}

	public void setRepayedDateTime(Date repayedDateTime) {
		this.repayedDateTime = repayedDateTime;
	}

	public Integer getOverDays() {
		return overDays;
	}

	public void setOverDays(Integer overDays) {
		this.overDays = overDays;
	}

	public String getOverStage() {
		return overStage;
	}

	public void setOverStage(String overStage) {
		this.overStage = overStage;
	}

	public BigDecimal getOverManageFee() {
		return overManageFee;
	}

	public void setOverManageFee(BigDecimal overManageFee) {
		this.overManageFee = overManageFee;
	}

	public BigDecimal getOverCollectFee() {
		return overCollectFee;
	}

	public void setOverCollectFee(BigDecimal overCollectFee) {
		this.overCollectFee = overCollectFee;
	}

	public String getIsHaveOverdue() {
		return isHaveOverdue;
	}

	public void setIsHaveOverdue(String isHaveOverdue) {
		this.isHaveOverdue = isHaveOverdue;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getDealStatus() {
		return dealStatus;
	}

	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
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

	public String getReserve1() {
		return reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getThirdPayStatus() {
		return thirdPayStatus;
	}

	public void setThirdPayStatus(String thirdPayStatus) {
		this.thirdPayStatus = thirdPayStatus;
	}

	public BigDecimal getExtraInterest() {
		return extraInterest;
	}

	public void setExtraInterest(BigDecimal extraInterest) {
		this.extraInterest = extraInterest;
	}

}
