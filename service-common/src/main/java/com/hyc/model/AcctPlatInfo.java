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
@TableName("acct_plat_info")
public class AcctPlatInfo implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 账户编号
	 */
	@TableField(value="acct_no")
	private String acctNo;

	/**
	 * 账户类别 1:连连支付
             2:中诚信
             3:同盾
             4:法大大
             5:鹏元
             6:万达
	 */
	@TableField(value="channel_no")
	private String channelNo;

	/**
	 * 细分账户 
对账户类别
1:连连支付 细分账户
               11:平台放款账户 
               12:支付手续费账户
               13:推广资金账户
2:中诚信   细分账户
               21:手机实名
               22:身份证实名
               23:活体识别
               24:手机在网时长
3:同盾     细分账户
              31:贷前申请反欺诈接口
4:法大大  细分账户
              41:电子合同签署
5.鹏元     51:身份证实名
              52:活体识别
6.万达     61:身份证实名
              02:活体识别
	 */
	@TableField(value="acct_sub_channel")
	private String acctSubChannel;

	/**
	 * 缴费模式 01:线下打款 02:平台充值 03:其他 
	 */
	@TableField(value="acct_pay_type")
	private String acctPayType;

	/**
	 * 帐户余额
	 */
	private BigDecimal balance;

	/**
	 * 预警余额
	 */
	@TableField(value="warn_balance")
	private BigDecimal warnBalance;

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
	 * 描述
	 */
	@TableField(value="desc_info")
	private String descInfo;

	/**
	 * 预警号码（多个号码以 , 隔开）
	 */
	@TableField(value="warn_phone")
	private String warnPhone;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getWarnBalance() {
		return warnBalance;
	}

	public void setWarnBalance(BigDecimal warnBalance) {
		this.warnBalance = warnBalance;
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

	public String getDescInfo() {
		return descInfo;
	}

	public void setDescInfo(String descInfo) {
		this.descInfo = descInfo;
	}

	public String getWarnPhone() {
		return warnPhone;
	}

	public void setWarnPhone(String warnPhone) {
		this.warnPhone = warnPhone;
	}

}
