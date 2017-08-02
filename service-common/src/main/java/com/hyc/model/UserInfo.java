package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="user_id")
	private Integer userId;

	/**
	 * 用户姓名
	 */
	@TableField(value="user_name")
	private String userName;

	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 证件号码
	 */
	@TableField(value="idcard_no")
	private String idcardNo;

	/**
	 * 实名认证(01：通过 02：未通过)
	 */
	@TableField(value="real_name_auth")
	private String realNameAuth;

	/**
	 * 身份证人像比对(01：通过 02：未通过)
	 */
	@TableField(value="id_card_comparison")
	private String idCardComparison;

	/**
	 * 活体人像比对(01：通过 02：未通过)
	 */
	@TableField(value="living_portrait_comparison")
	private String livingPortraitComparison;

	/**
	 * 手机实名(01：通过 02：未通过)
	 */
	@TableField(value="phone_auth")
	private String phoneAuth;

	/**
	 * 芝麻分
	 */
	@TableField(value="zhima_score")
	private Integer zhimaScore;

	/**
	 * 银行卡认证(01：通过 02：未通过)
	 */
	@TableField(value="bank_card_auth")
	private String bankCardAuth;

	/**
	 * 资料审核-信审评分
	 */
	@TableField(value="letter_score")
	private Integer letterScore;

	/**
	 * 芝麻欺诈评分
	 */
	@TableField(value="sesame_credit")
	private Integer sesameCredit;

	/**
	 * 会员等级
	 */
	@TableField(value="member_level")
	private String memberLevel;

	/**
	 * 状态(01：正常 02：禁用)
	 */
	private String status;

	/**
	 * 状态(01：正常 02：禁用)
	 */
	@TableField(value="loan_status")
	private String loanStatus;

	/**
	 * 是否授信(01：授信 02：未授信)
	 */
	@TableField(value="is_credit")
	private String isCredit;

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
	 * 审核状态(01:待审核 02:审核通过 03:已驳回)
	 */
	@TableField(value="approve_status")
	private String approveStatus;

	/**
	 * 
	 */
	private String resive2;

	/**
	 * 
	 */
	private String resive3;

	/**
	 * 用户生日
	 */
	private String birthday;

	/**
	 * 法大大返回客户编号
	 */
	@TableField(value="fdd_customer_id")
	private String fddCustomerId;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 活体人像比对次数
	 */
	@TableField(value="living_comparison_num")
	private Integer livingComparisonNum;

	/**
	 * 手机实名次数
	 */
	@TableField(value="phone_auth_num")
	private Integer phoneAuthNum;

	/**
	 * 银行卡认证次数
	 */
	@TableField(value="bank_card_auth_num")
	private Integer bankCardAuthNum;

	/**
	 * 用户在三方支付用户id
	 */
	@TableField(value="third_pay_user_id")
	private String thirdPayUserId;



	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIdcardNo() {
		return idcardNo;
	}

	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}

	public String getRealNameAuth() {
		return realNameAuth;
	}

	public void setRealNameAuth(String realNameAuth) {
		this.realNameAuth = realNameAuth;
	}

	public String getIdCardComparison() {
		return idCardComparison;
	}

	public void setIdCardComparison(String idCardComparison) {
		this.idCardComparison = idCardComparison;
	}

	public String getLivingPortraitComparison() {
		return livingPortraitComparison;
	}

	public void setLivingPortraitComparison(String livingPortraitComparison) {
		this.livingPortraitComparison = livingPortraitComparison;
	}

	public String getPhoneAuth() {
		return phoneAuth;
	}

	public void setPhoneAuth(String phoneAuth) {
		this.phoneAuth = phoneAuth;
	}

	public Integer getZhimaScore() {
		return zhimaScore;
	}

	public void setZhimaScore(Integer zhimaScore) {
		this.zhimaScore = zhimaScore;
	}

	public String getBankCardAuth() {
		return bankCardAuth;
	}

	public void setBankCardAuth(String bankCardAuth) {
		this.bankCardAuth = bankCardAuth;
	}

	public Integer getLetterScore() {
		return letterScore;
	}

	public void setLetterScore(Integer letterScore) {
		this.letterScore = letterScore;
	}

	public Integer getSesameCredit() {
		return sesameCredit;
	}

	public void setSesameCredit(Integer sesameCredit) {
		this.sesameCredit = sesameCredit;
	}

	public String getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public String getIsCredit() {
		return isCredit;
	}

	public void setIsCredit(String isCredit) {
		this.isCredit = isCredit;
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

	public String getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getFddCustomerId() {
		return fddCustomerId;
	}

	public void setFddCustomerId(String fddCustomerId) {
		this.fddCustomerId = fddCustomerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getLivingComparisonNum() {
		return livingComparisonNum;
	}

	public void setLivingComparisonNum(Integer livingComparisonNum) {
		this.livingComparisonNum = livingComparisonNum;
	}

	public Integer getPhoneAuthNum() {
		return phoneAuthNum;
	}

	public void setPhoneAuthNum(Integer phoneAuthNum) {
		this.phoneAuthNum = phoneAuthNum;
	}

	public Integer getBankCardAuthNum() {
		return bankCardAuthNum;
	}

	public void setBankCardAuthNum(Integer bankCardAuthNum) {
		this.bankCardAuthNum = bankCardAuthNum;
	}

	public String getThirdPayUserId() {
		return thirdPayUserId;
	}

	public void setThirdPayUserId(String thirdPayUserId) {
		this.thirdPayUserId = thirdPayUserId;
	}

}
