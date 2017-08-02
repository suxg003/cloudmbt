package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户银行卡账号信息表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("user_card")
public class UserCard implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 用户银行卡ID
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="user_card_id")
	private Integer userCardId;

	/**
	 * 客户编号
	 */
	@TableField(value="user_id")
	private Integer userId;

	/**
	 * 银行卡账号
	 */
	@TableField(value="account_no")
	private String accountNo;

	/**
	 * 开户银行
	 */
	@TableField(value="bank_name")
	private String bankName;

	/**
	 * 开户姓名
	 */
	@TableField(value="acc_name")
	private String accName;

	/**
	 * 银行中文名称
	 */
	@TableField(value="bank_real_name")
	private String bankRealName;

	/**
	 * 银行预留手机号
	 */
	@TableField(value="reser_phone")
	private String reserPhone;

	/**
	 * 状态(01：己绑定  02：己解绑 03:绑定中 04：解绑中)
	 */
	private String status;

	/**
	 * 01 储蓄卡 02 信用卡
	 */
	@TableField(value="card_type")
	private String cardType;

	/**
	 * 01 连连  02 宝付
	 */
	@TableField(value="escr_channel")
	private String escrChannel;

	/**
	 * 01:默认卡 00：非默认
	 */
	@TableField(value="pay_trade_type")
	private String payTradeType;

	/**
	 * 签约协议号
	 */
	@TableField(value="no_agree")
	private String noAgree;

	/**
	 * 解绑时间
	 */
	@TableField(value="release_date_time")
	private Date releaseDateTime;

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
	 * 银行编号
	 */
	@TableField(value="bank_code")
	private String bankCode;

	/**
	 * 
	 */
	private String resive2;

	/**
	 * 
	 */
	private String resive3;

	/**
	 * 
	 */
	@TableField(value="card_purpose")
	private String cardPurpose;



	public Integer getUserCardId() {
		return userCardId;
	}

	public void setUserCardId(Integer userCardId) {
		this.userCardId = userCardId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getBankRealName() {
		return bankRealName;
	}

	public void setBankRealName(String bankRealName) {
		this.bankRealName = bankRealName;
	}

	public String getReserPhone() {
		return reserPhone;
	}

	public void setReserPhone(String reserPhone) {
		this.reserPhone = reserPhone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getEscrChannel() {
		return escrChannel;
	}

	public void setEscrChannel(String escrChannel) {
		this.escrChannel = escrChannel;
	}

	public String getPayTradeType() {
		return payTradeType;
	}

	public void setPayTradeType(String payTradeType) {
		this.payTradeType = payTradeType;
	}

	public String getNoAgree() {
		return noAgree;
	}

	public void setNoAgree(String noAgree) {
		this.noAgree = noAgree;
	}

	public Date getReleaseDateTime() {
		return releaseDateTime;
	}

	public void setReleaseDateTime(Date releaseDateTime) {
		this.releaseDateTime = releaseDateTime;
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

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getResive2() {
		return resive2;
	}

	public void setResive2(String resive2) {
		this.resive2 = resive2;
	}

	public String getResive3() {
		return resive3;
	}

	public void setResive3(String resive3) {
		this.resive3 = resive3;
	}

	public String getCardPurpose() {
		return cardPurpose;
	}

	public void setCardPurpose(String cardPurpose) {
		this.cardPurpose = cardPurpose;
	}

}
