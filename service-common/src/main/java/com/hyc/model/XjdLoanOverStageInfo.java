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
 * 借款逾期罚息信息表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("xjd_loan_over_stage_info")
public class XjdLoanOverStageInfo implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 借款编号
	 */
	@TableField(value="loan_no")
	private Integer loanNo;

	/**
	 * 
	 */
	@TableField(value="over_min_day")
	private Integer overMinDay;

	/**
	 * 
	 */
	@TableField(value="over_max_day")
	private Integer overMaxDay;

	/**
	 * 
	 */
	@TableField(value="over_level")
	private String overLevel;

	/**
	 * 罚息类型（1:本金罚息 2:本息罚息）
	 */
	@TableField(value="penalty_type")
	private String penaltyType;

	/**
	 * 日罚息（%）
	 */
	@TableField(value="penalty_day")
	private BigDecimal penaltyDay;

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
	 * 
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;

	/**
	 * 
	 */
	@TableField(value="update_date_time")
	private Date updateDateTime;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(Integer loanNo) {
		this.loanNo = loanNo;
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

	public BigDecimal getPenaltyDay() {
		return penaltyDay;
	}

	public void setPenaltyDay(BigDecimal penaltyDay) {
		this.penaltyDay = penaltyDay;
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

}
