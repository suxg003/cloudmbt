package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户认证记录表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("user_auth_record")
public class UserAuthRecord implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 用户认证记录id
	 */
	@TableId(type = IdType.AUTO)
	@TableField(value="u_a_r_id")
	private Integer uARId;

	/**
	 * 客户表id
	 */
	@TableField(value="user_id")
	private Integer userId;

	/**
	 * 真实姓名
	 */
	@TableField(value="real_name")
	private String realName;

	/**
	 * 客户性别
	 */
	private String sex;

	/**
	 * 证件类型  01 : 身份证
	 */
	@TableField(value="idcard_type")
	private String idcardType;

	/**
	 * 证件号码
	 */
	@TableField(value="idcard_no")
	private String idcardNo;

	/**
	 * 身份证照片
	 */
	@TableField(value="idcard_photo")
	private String idcardPhoto;

	/**
	 * 银行卡照片
	 */
	@TableField(value="account_photo")
	private String accountPhoto;

	/**
	 * 银行卡账号
	 */
	@TableField(value="account_no")
	private String accountNo;

	/**
	 * 职业
	 */
	private String vocation;

	/**
	 * 公司名称
	 */
	@TableField(value="company_name")
	private String companyName;

	/**
	 * 公司地址
	 */
	@TableField(value="company_address")
	private String companyAddress;

	/**
	 * 教育程度
	 */
	private String education;

	/**
	 * 婚姻状况
	 */
	private String marriage;

	/**
	 * 户口类型
	 */
	@TableField(value="house_regist")
	private String houseRegist;

	/**
	 * 当前详细地址
	 */
	@TableField(value="current_address")
	private String currentAddress;

	/**
	 * 紧急联系人电话
	 */
	@TableField(value="contact_phone")
	private String contactPhone;

	/**
	 * 紧急联系人关系
	 */
	@TableField(value="contact_relation")
	private String contactRelation;

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
	 * 备注
	 */
	private String reserve1;

	/**
	 * 备注
	 */
	private String reserve2;

	/**
	 * 备注
	 */
	private String reserve3;

	/**
	 * 01：审核成功  02：审核失败
	 */
	private String status;

	/**
	 * 人脸识别信息
	 */
	@TableField(value="res_msg")
	private String resMsg;

	/**
	 * 质量最佳的人脸照片
	 */
	@TableField(value="image_best")
	private String imageBest;

	/**
	 * 用于假脸攻击判定的人
脸照片
	 */
	@TableField(value="image_env")
	private String imageEnv;

	/**
	 * OCR身份证返照
	 */
	@TableField(value="idcard_orc_photo")
	private String idcardOrcPhoto;

	/**
	 * 常居住地
	 */
	@TableField(value="common_address")
	private String commonAddress;

	/**
	 * 个人身份验证返照
	 */
	@TableField(value="idcard_personal_photo")
	private String idcardPersonalPhoto;

	/**
	 * 单位 月  0 （0,6] 1 （6,12] 2 （12,24]   
3 （24,+） -1 （查无此记录）
	 */
	@TableField(value="the_net_time")
	private String theNetTime;

	/**
	 * 手机运营商 0 未知 1 联通 2 电信 3 移动
	 */
	private String operator;

	/**
	 * 手机在网状态 0 正常使用 1 停机 2 销号 3 预销号 4 未启用 -1 查无结果
	 */
	@TableField(value="mobile_state")
	private String mobileState;

	/**
	 * 紧急联系人姓名
	 */
	@TableField(value="contact_name")
	private String contactName;



	public Integer getUARId() {
		return uARId;
	}

	public void setUARId(Integer uARId) {
		this.uARId = uARId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getIdcardType() {
		return idcardType;
	}

	public void setIdcardType(String idcardType) {
		this.idcardType = idcardType;
	}

	public String getIdcardNo() {
		return idcardNo;
	}

	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}

	public String getIdcardPhoto() {
		return idcardPhoto;
	}

	public void setIdcardPhoto(String idcardPhoto) {
		this.idcardPhoto = idcardPhoto;
	}

	public String getAccountPhoto() {
		return accountPhoto;
	}

	public void setAccountPhoto(String accountPhoto) {
		this.accountPhoto = accountPhoto;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getVocation() {
		return vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getHouseRegist() {
		return houseRegist;
	}

	public void setHouseRegist(String houseRegist) {
		this.houseRegist = houseRegist;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getContactRelation() {
		return contactRelation;
	}

	public void setContactRelation(String contactRelation) {
		this.contactRelation = contactRelation;
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

	public String getReserve1() {
		return reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResMsg() {
		return resMsg;
	}

	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}

	public String getImageBest() {
		return imageBest;
	}

	public void setImageBest(String imageBest) {
		this.imageBest = imageBest;
	}

	public String getImageEnv() {
		return imageEnv;
	}

	public void setImageEnv(String imageEnv) {
		this.imageEnv = imageEnv;
	}

	public String getIdcardOrcPhoto() {
		return idcardOrcPhoto;
	}

	public void setIdcardOrcPhoto(String idcardOrcPhoto) {
		this.idcardOrcPhoto = idcardOrcPhoto;
	}

	public String getCommonAddress() {
		return commonAddress;
	}

	public void setCommonAddress(String commonAddress) {
		this.commonAddress = commonAddress;
	}

	public String getIdcardPersonalPhoto() {
		return idcardPersonalPhoto;
	}

	public void setIdcardPersonalPhoto(String idcardPersonalPhoto) {
		this.idcardPersonalPhoto = idcardPersonalPhoto;
	}

	public String getTheNetTime() {
		return theNetTime;
	}

	public void setTheNetTime(String theNetTime) {
		this.theNetTime = theNetTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getMobileState() {
		return mobileState;
	}

	public void setMobileState(String mobileState) {
		this.mobileState = mobileState;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

}
