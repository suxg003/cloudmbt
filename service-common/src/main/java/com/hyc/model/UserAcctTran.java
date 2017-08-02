package com.hyc.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 账户流水表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("user_acct_tran")
public class UserAcctTran implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 客户编号
	 */
	@TableField(value="user_id")
	private String userId;

	/**
	 * 借款编号
	 */
	@TableField(value="loan_no")
	private String loanNo;

	/**
	 * 订单号
	 */
	@TableField(value="order_id")
	private String orderId;

	/**
	 * 交易类型(01：确认付款  02：自动还款 03: 授权 04:用户主动还款)
	 */
	@TableField(value="trade_type")
	private String tradeType;

	/**
	 * 金额
	 */
	@TableField(value="tx_amount")
	private BigDecimal txAmount;

	/**
	 * 描述
	 */
	@TableField(value="desc_info")
	private String descInfo;

	/**
	 * 状态(01:成功 02 失败 03 等待确认)
	 */
	private String status;

	/**
	 * 手续费
	 */
	private BigDecimal fee;

	/**
	 * 卡号
	 */
	private String cardno;

	/**
	 * 费用类型(01：放款扣费  02：还款扣费)
	 */
	@TableField(value="fee_type")
	private String feeType;

	/**
	 * 账户系统状态(01:成功 02 失败 03 等待确认)
	 */
	@TableField(value="acc_status")
	private String accStatus;

	/**
	 * 资金渠道(1:连连 2:宝付)
	 */
	@TableField(value="escr_channel")
	private String escrChannel;

	/**
	 * 设备唯一ID
	 */
	@TableField(value="device_id")
	private String deviceId;

	/**
	 * APP的渠道名称
	 */
	@TableField(value="um_channel")
	private String umChannel;

	/**
	 * 使用券的id 对应cash_record_info id
	 */
	@TableField(value="cash_id")
	private String cashId;

	/**
	 * 使用券的面值
	 */
	@TableField(value="cash_prize_value")
	private BigDecimal cashPrizeValue;

	/**
	 * 支付版本
	 */
	@TableField(value="pay_version")
	private String payVersion;

	/**
	 * 交易时间
	 */
	@TableField(value="create_date_time")
	private String createDateTime;

	/**
	 * 更新时间
	 */
	@TableField(value="update_time")
	private String updateTime;

	/**
	 * 订单时间
	 */
	@TableField(value="order_time")
	private String orderTime;

	/**
	 * 备注
	 */
	private String reserve2;

	/**
	 * 备注
	 */
	private String reserve3;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public BigDecimal getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(BigDecimal txAmount) {
		this.txAmount = txAmount;
	}

	public String getDescInfo() {
		return descInfo;
	}

	public void setDescInfo(String descInfo) {
		this.descInfo = descInfo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getFeeType() {
		return feeType;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public String getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	public String getEscrChannel() {
		return escrChannel;
	}

	public void setEscrChannel(String escrChannel) {
		this.escrChannel = escrChannel;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getUmChannel() {
		return umChannel;
	}

	public void setUmChannel(String umChannel) {
		this.umChannel = umChannel;
	}

	public String getCashId() {
		return cashId;
	}

	public void setCashId(String cashId) {
		this.cashId = cashId;
	}

	public BigDecimal getCashPrizeValue() {
		return cashPrizeValue;
	}

	public void setCashPrizeValue(BigDecimal cashPrizeValue) {
		this.cashPrizeValue = cashPrizeValue;
	}

	public String getPayVersion() {
		return payVersion;
	}

	public void setPayVersion(String payVersion) {
		this.payVersion = payVersion;
	}

	public String getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(String createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
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

}
