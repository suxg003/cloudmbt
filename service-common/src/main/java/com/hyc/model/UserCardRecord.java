package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户银行卡账号记录表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("user_card_record")
public class UserCardRecord implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 用户银行卡记录ID
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="u_c_r_id")
	private Integer uCRId;

	/**
	 * 银行卡编号
	 */
	@TableField(value="user_card_id")
	private String userCardId;

	/**
	 * 客户编号
	 */
	@TableField(value="user_id")
	private String userId;

	/**
	 * 银行卡账号
	 */
	@TableField(value="account_no")
	private String accountNo;

	/**
	 * 开户姓名
	 */
	@TableField(value="acc_name")
	private String accName;

	/**
	 * 银行预留手机号
	 */
	@TableField(value="reser_phone")
	private String reserPhone;

	/**
	 * 鉴权渠道 01 ：连连
	 */
	@TableField(value="auth_channel")
	private String authChannel;

	/**
	 * 01 连连  02 宝付 
	 */
	@TableField(value="escr_channel")
	private String escrChannel;

	/**
	 * 银行中文名称
	 */
	@TableField(value="bank_real_name")
	private String bankRealName;

	/**
	 * 01 储蓄卡 02 信用卡
	 */
	@TableField(value="card_type")
	private String cardType;

	/**
	 * 绑定ID
	 */
	@TableField(value="bind_id")
	private String bindId;

	/**
	 * 状态(01：绑定  02：解绑 03:绑定中 04：解绑中)
	 */
	private String status;

	/**
	 * 操作类型  01：绑卡  02解绑
	 */
	@TableField(value="oper_type")
	private String operType;

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
	 * 三方返回数据
	 */
	private String resive1;

	/**
	 * 本地流水
	 */
	private String resive2;

	/**
	 * 
	 */
	private String resive3;

	/**
	 * 唯一绑定标识
	 */
	@TableField(value="the_only_binding_identifier")
	private String theOnlyBindingIdentifier;



	public Integer getUCRId() {
		return uCRId;
	}

	public void setUCRId(Integer uCRId) {
		this.uCRId = uCRId;
	}

	public String getUserCardId() {
		return userCardId;
	}

	public void setUserCardId(String userCardId) {
		this.userCardId = userCardId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getReserPhone() {
		return reserPhone;
	}

	public void setReserPhone(String reserPhone) {
		this.reserPhone = reserPhone;
	}

	public String getAuthChannel() {
		return authChannel;
	}

	public void setAuthChannel(String authChannel) {
		this.authChannel = authChannel;
	}

	public String getEscrChannel() {
		return escrChannel;
	}

	public void setEscrChannel(String escrChannel) {
		this.escrChannel = escrChannel;
	}

	public String getBankRealName() {
		return bankRealName;
	}

	public void setBankRealName(String bankRealName) {
		this.bankRealName = bankRealName;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getBindId() {
		return bindId;
	}

	public void setBindId(String bindId) {
		this.bindId = bindId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOperType() {
		return operType;
	}

	public void setOperType(String operType) {
		this.operType = operType;
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

	public String getResive1() {
		return resive1;
	}

	public void setResive1(String resive1) {
		this.resive1 = resive1;
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

	public String getTheOnlyBindingIdentifier() {
		return theOnlyBindingIdentifier;
	}

	public void setTheOnlyBindingIdentifier(String theOnlyBindingIdentifier) {
		this.theOnlyBindingIdentifier = theOnlyBindingIdentifier;
	}

}
