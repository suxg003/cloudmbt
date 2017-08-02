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
 * 平台帐户信息表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("acct_plat_tran")
public class AcctPlatTran implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 流水号
	 */
	@TableField(value="flow_id")
	private String flowId;

	/**
	 * 账户编号
	 */
	@TableField(value="acct_no")
	private String acctNo;

	/**
	 * 账户类别
	 */
	@TableField(value="channel_no")
	private String channelNo;

	/**
	 * 01:等待确认 02:成功 03:失败
	 */
	private String status;

	/**
	 * 细分账户
	 */
	@TableField(value="acct_sub_channel")
	private String acctSubChannel;

	/**
	 * 缴费模式
	 */
	@TableField(value="acct_pay_type")
	private String acctPayType;

	/**
	 * 交易金额
	 */
	@TableField(value="tx_amount")
	private BigDecimal txAmount;

	/**
	 * 帐户余额
	 */
	private BigDecimal balance;

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
	 * 收支类型 01:收入 02:支出
	 */
	@TableField(value="tx_type")
	private String txType;

	/**
	 * 参考数据字典表
	 */
	@TableField(value="trade_type")
	private String tradeType;

	/**
	 * 描述
	 */
	@TableField(value="desc_info")
	private String descInfo;

	/**
	 * 平台账户入账处理状态 01:未处理 02:已处理
	 */
	@TableField(value="deal_status")
	private String dealStatus;



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

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getChannelNo() {
		return channelNo;
	}

	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAcctSubChannel() {
		return acctSubChannel;
	}

	public void setAcctSubChannel(String acctSubChannel) {
		this.acctSubChannel = acctSubChannel;
	}

	public String getAcctPayType() {
		return acctPayType;
	}

	public void setAcctPayType(String acctPayType) {
		this.acctPayType = acctPayType;
	}

	public BigDecimal getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(BigDecimal txAmount) {
		this.txAmount = txAmount;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
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

	public String getTxType() {
		return txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public String getDescInfo() {
		return descInfo;
	}

	public void setDescInfo(String descInfo) {
		this.descInfo = descInfo;
	}

	public String getDealStatus() {
		return dealStatus;
	}

	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}

}
