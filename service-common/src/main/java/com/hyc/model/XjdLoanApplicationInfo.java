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
 * 借款申请表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("xjd_loan_application_info")
public class XjdLoanApplicationInfo implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 借款编号
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="loan_no")
	private Integer loanNo;

	/**
	 * 用户ID
	 */
	@TableField(value="user_id")
	private Integer userId;

	/**
	 * 申请平台(01:和云筹)
	 */
	@TableField(value="apply_plat")
	private String applyPlat;

	/**
	 * 申请借款金额
	 */
	@TableField(value="loan_amount")
	private BigDecimal loanAmount;

	/**
	 * 借款期限
	 */
	@TableField(value="loan_period")
	private String loanPeriod;

	/**
	 * 利率
	 */
	private BigDecimal rate;

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
	 * 审核状态(01:待审核 02:审核通过 03:已驳回)
	 */
	@TableField(value="approve_status")
	private String approveStatus;

	/**
	 * 审核原因
	 */
	@TableField(value="approve_reason")
	private String approveReason;

	/**
	 * 审批人
	 */
	private String approver;

	/**
	 * 审批时间
	 */
	@TableField(value="approve_time")
	private Date approveTime;

	/**
	 * 放款金额
	 */
	@TableField(value="real_loan_amount")
	private BigDecimal realLoanAmount;

	/**
	 * 放款状态步骤
	 */
	private Integer step;

	/**
	 * 放款状态(00借款申请 01:生成合同成功，等待放款 02:放款成功 03放款中 04:放款业务处理失败06:连连放款失败 07已作废)
	 */
	@TableField(value="loan_status")
	private String loanStatus;

	/**
	 * 放款时间
	 */
	@TableField(value="loan_time")
	private Date loanTime;

	/**
	 * 放款流水号
	 */
	@TableField(value="request_no")
	private String requestNo;

	/**
	 * 合同路径
	 */
	@TableField(value="contr_url")
	private String contrUrl;

	/**
	 * 合同名称
	 */
	@TableField(value="contr_name")
	private String contrName;

	/**
	 * 01:自动放款,02手动放款
	 */
	@TableField(value="loan_way")
	private String loanWay;

	/**
	 * 申请IP
	 */
	private String ip;

	/**
	 * 设置id
	 */
	@TableField(value="device_id")
	private String deviceId;

	/**
	 * 借款申请授权卡ID
	 */
	@TableField(value="user_card_id")
	private Integer userCardId;

	/**
	 * 签约协议号
	 */
	@TableField(value="no_agree")
	private String noAgree;

	/**
	 * 失败原因
	 */
	@TableField(value="lose_reason")
	private String loseReason;

	/**
	 * 放款标志(01:超过放款限额,第二日零点跑批放款)
	 */
	@TableField(value="loan_flag")
	private String loanFlag;

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
	 * 备用字段1
	 */
	private String reserve1;

	/**
	 * 备用字段2
	 */
	private String reserve2;

	/**
	 * 备用字段3
	 */
	private String reserve3;

	/**
	 * 是否命中黑名单 1：是，0：否
	 */
	@TableField(value="is_black")
	private Integer isBlack;

	/**
	 * 是否命中灰名单 1：是，0：否
	 */
	@TableField(value="is_grey")
	private Integer isGrey;



	public Integer getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(Integer loanNo) {
		this.loanNo = loanNo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getApplyPlat() {
		return applyPlat;
	}

	public void setApplyPlat(String applyPlat) {
		this.applyPlat = applyPlat;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanPeriod() {
		return loanPeriod;
	}

	public void setLoanPeriod(String loanPeriod) {
		this.loanPeriod = loanPeriod;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
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

	public String getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getApproveReason() {
		return approveReason;
	}

	public void setApproveReason(String approveReason) {
		this.approveReason = approveReason;
	}

	public String getApprover() {
		return approver;
	}

	public void setApprover(String approver) {
		this.approver = approver;
	}

	public Date getApproveTime() {
		return approveTime;
	}

	public void setApproveTime(Date approveTime) {
		this.approveTime = approveTime;
	}

	public BigDecimal getRealLoanAmount() {
		return realLoanAmount;
	}

	public void setRealLoanAmount(BigDecimal realLoanAmount) {
		this.realLoanAmount = realLoanAmount;
	}

	public Integer getStep() {
		return step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public Date getLoanTime() {
		return loanTime;
	}

	public void setLoanTime(Date loanTime) {
		this.loanTime = loanTime;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getContrUrl() {
		return contrUrl;
	}

	public void setContrUrl(String contrUrl) {
		this.contrUrl = contrUrl;
	}

	public String getContrName() {
		return contrName;
	}

	public void setContrName(String contrName) {
		this.contrName = contrName;
	}

	public String getLoanWay() {
		return loanWay;
	}

	public void setLoanWay(String loanWay) {
		this.loanWay = loanWay;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public Integer getUserCardId() {
		return userCardId;
	}

	public void setUserCardId(Integer userCardId) {
		this.userCardId = userCardId;
	}

	public String getNoAgree() {
		return noAgree;
	}

	public void setNoAgree(String noAgree) {
		this.noAgree = noAgree;
	}

	public String getLoseReason() {
		return loseReason;
	}

	public void setLoseReason(String loseReason) {
		this.loseReason = loseReason;
	}

	public String getLoanFlag() {
		return loanFlag;
	}

	public void setLoanFlag(String loanFlag) {
		this.loanFlag = loanFlag;
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

	public String getReserve2() {
		return reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	public String getReserve3() {
		return reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

	public Integer getIsBlack() {
		return isBlack;
	}

	public void setIsBlack(Integer isBlack) {
		this.isBlack = isBlack;
	}

	public Integer getIsGrey() {
		return isGrey;
	}

	public void setIsGrey(Integer isGrey) {
		this.isGrey = isGrey;
	}

}
