package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 客户帐户信息表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("acct_user_acct_tran")
public class AcctUserAcctTran implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 流水号
	 */
	@TableField(value="flow_id")
	private String flowId;

	/**
	 * 在账户系统账号
	 */
	@TableField(value="acct_no")
	private Integer acctNo;

	/**
	 * 用户id
	 */
	@TableField(value="user_id")
	private Integer userId;

	/**
	 * 资金渠道
	 */
	@TableField(value="channel_no")
	private String channelNo;

	/**
	 * 授信额度
	 */
	@TableField(value="credit_amount")
	private BigDecimal creditAmount;

	/**
	 * 01:等待确认 02:成功 03:失败
	 */
	private String status;

	/**
	 * 已贷余额
	 */
	@TableField(value="loan_amount")
	private BigDecimal loanAmount;

	/**
	 * 交易后可借余额
	 */
	@TableField(value="available_amount")
	private BigDecimal availableAmount;

	/**
	 * 交易金额
	 */
	@TableField(value="tx_amount")
	private BigDecimal txAmount;

	/**
	 * 创建时间
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;

	/**
	 * 更新时间
	 */
	@TableField(value="update_time")
	private Date updateTime;

	/**
	 * 交易类型 01: 放款至银行卡 02:用户主动还款 03:自动扣款还款
	 */
	@TableField(value="trade_type")
	private String tradeType;

	/**
	 * 交易银行卡号
	 */
	@TableField(value="account_no")
	private String accountNo;

	/**
	 * 交易后余额
	 */
	@TableField(value="tx_balance")
	private BigDecimal txBalance;

	/**
	 * 应还本金
	 */
	private BigDecimal amount;

	/**
	 * 应还利息
	 */
	private BigDecimal interest;

	/**
	 * 综合管理费
	 */
	@TableField(value="manage_amount")
	private BigDecimal manageAmount;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public Integer getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(Integer acctNo) {
		this.acctNo = acctNo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getChannelNo() {
		return channelNo;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public BigDecimal getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(BigDecimal creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public BigDecimal getAvailableAmount() {
		return availableAmount;
	}

	public void setAvailableAmount(BigDecimal availableAmount) {
		this.availableAmount = availableAmount;
	}

	public BigDecimal getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(BigDecimal txAmount) {
		this.txAmount = txAmount;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public BigDecimal getTxBalance() {
		return txBalance;
	}

	public void setTxBalance(BigDecimal txBalance) {
		this.txBalance = txBalance;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public BigDecimal getManageAmount() {
		return manageAmount;
	}

	public void setManageAmount(BigDecimal manageAmount) {
		this.manageAmount = manageAmount;
	}

}
