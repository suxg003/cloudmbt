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
 * 银行卡快捷支付配置
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("conf_bc_fast_pay")
public class ConfBcFastPay implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 银行编码
	 */
	@TableField(value="bank_code")
	private String bankCode;

	/**
	 * 支付渠道
	 */
	@TableField(value="pay_channel")
	private String payChannel;

	/**
	 * 业务类型（01:用户主动还款02:自动扣款还款03:放款至银行卡）
	 */
	@TableField(value="bus_type")
	private String busType;

	/**
	 * 银行名称
	 */
	@TableField(value="bank_name")
	private String bankName;

	/**
	 * 单笔限额
	 */
	@TableField(value="single_limit_money")
	private BigDecimal singleLimitMoney;

	/**
	 * 单日限额
	 */
	@TableField(value="day_limit_money")
	private BigDecimal dayLimitMoney;

	/**
	 * 计费单位
	 */
	@TableField(value="charge_unit")
	private String chargeUnit;

	/**
	 * 起始手续费
	 */
	@TableField(value="first_fee")
	private BigDecimal firstFee;

	/**
	 * 是否有效
	 */
	@TableField(value="is_effective")
	private String isEffective;

	/**
	 * 单笔手续费
	 */
	private BigDecimal rate;

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
	 * 计划生效时间
	 */
	@TableField(value="taskeffect_time")
	private Date taskeffectTime;

	/**
	 * 
	 */
	@TableField(value="charge_amount")
	private BigDecimal chargeAmount;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public BigDecimal getSingleLimitMoney() {
		return singleLimitMoney;
	}

	public void setSingleLimitMoney(BigDecimal singleLimitMoney) {
		this.singleLimitMoney = singleLimitMoney;
	}

	public BigDecimal getDayLimitMoney() {
		return dayLimitMoney;
	}

	public void setDayLimitMoney(BigDecimal dayLimitMoney) {
		this.dayLimitMoney = dayLimitMoney;
	}

	public String getChargeUnit() {
		return chargeUnit;
	}

	public void setChargeUnit(String chargeUnit) {
		this.chargeUnit = chargeUnit;
	}

	public BigDecimal getFirstFee() {
		return firstFee;
	}

	public void setFirstFee(BigDecimal firstFee) {
		this.firstFee = firstFee;
	}

	public String getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(String isEffective) {
		this.isEffective = isEffective;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
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

	public Date getTaskeffectTime() {
		return taskeffectTime;
	}

	public void setTaskeffectTime(Date taskeffectTime) {
		this.taskeffectTime = taskeffectTime;
	}

	public BigDecimal getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

}
