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
 * 三方服务费用配置表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("conf_tri_service_charge")
public class ConfTriServiceCharge implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 平台编码
	 */
	@TableField(value="plat_code")
	private String platCode;

	/**
	 * 平台名称
	 */
	@TableField(value="plat_name")
	private String platName;

	/**
	 * 对plat_code 1001 中诚信
该字段对应的码值为:
01:手机实名
02:身份证实名
03:活体识别
04:手机在网时长

对plat_code 2001 同盾
01:贷前申请反欺诈接口

对plat_code 3001 法大大
01:电子合同签署

	 */
	@TableField(value="trans_type")
	private String transType;

	/**
	 * 收费模式(01:包年02:查询收费03:查得收费04:交易收费05:申请收费06:命中收费)
	 */
	@TableField(value="charge_model")
	private String chargeModel;

	/**
	 * 计费形式(01:包年02:单笔)
	 */
	@TableField(value="charge_way")
	private String chargeWay;

	/**
	 * 计费金额
	 */
	@TableField(value="charge_money")
	private BigDecimal chargeMoney;

	/**
	 * 生效日期
	 */
	@TableField(value="effective_time")
	private Date effectiveTime;

	/**
	 * 失效日期
	 */
	@TableField(value="expire_time")
	private Date expireTime;

	/**
	 * 有效期
	 */
	@TableField(value="valid_time")
	private Integer validTime;

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
	 * 平台账户的编号acct_no
	 */
	@TableField(value="plat_acct_no")
	private String platAcctNo;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlatCode() {
		return platCode;
	}

	public void setPlatCode(String platCode) {
		this.platCode = platCode;
	}

	public String getPlatName() {
		return platName;
	}

	public void setPlatName(String platName) {
		this.platName = platName;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getChargeModel() {
		return chargeModel;
	}

	public void setChargeModel(String chargeModel) {
		this.chargeModel = chargeModel;
	}

	public String getChargeWay() {
		return chargeWay;
	}

	public void setChargeWay(String chargeWay) {
		this.chargeWay = chargeWay;
	}

	public BigDecimal getChargeMoney() {
		return chargeMoney;
	}

	public void setChargeMoney(BigDecimal chargeMoney) {
		this.chargeMoney = chargeMoney;
	}

	public Date getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getValidTime() {
		return validTime;
	}

	public void setValidTime(Integer validTime) {
		this.validTime = validTime;
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

	public String getPlatAcctNo() {
		return platAcctNo;
	}

	public void setPlatAcctNo(String platAcctNo) {
		this.platAcctNo = platAcctNo;
	}

}
