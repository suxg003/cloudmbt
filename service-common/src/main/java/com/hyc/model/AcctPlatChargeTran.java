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
 * 手续费（平台支付）
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("acct_plat_charge_tran")
public class AcctPlatChargeTran implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 流水号，对应连连支付报文中的no_order
	 */
	@TableField(value="flow_id")
	private String flowId;

	/**
	 * 支付通道 1:连连 2:中诚信 3:同盾 4:法大大 5:鹏元 6:万达
	 */
	@TableField(value="third_pay_channel")
	private String thirdPayChannel;

	/**
	 * 交易类型 01: 放款至银行卡 02:用户主动还款 03:自动扣款还款
	 */
	@TableField(value="bus_type")
	private String busType;

	/**
	 * 对应的平台账号
	 */
	@TableField(value="plat_acct_no")
	private String platAcctNo;

	/**
	 * 单笔交易手续费
	 */
	@TableField(value="charge_amount")
	private BigDecimal chargeAmount;

	/**
	 * 状态 01:等待确认 02:成功 03:失败
	 */
	private String status;

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
	 * 结算处理状态 01:未处理 02:已处理
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

	public String getThirdPayChannel() {
		return thirdPayChannel;
	}

	public void setThirdPayChannel(String thirdPayChannel) {
		this.thirdPayChannel = thirdPayChannel;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getPlatAcctNo() {
		return platAcctNo;
	}

	public void setPlatAcctNo(String platAcctNo) {
		this.platAcctNo = platAcctNo;
	}

	public BigDecimal getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(BigDecimal chargeAmount) {
		this.chargeAmount = chargeAmount;
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

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getDealStatus() {
		return dealStatus;
	}

	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}

}
