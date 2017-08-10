package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("xjd_lender_info")
public class XjdLenderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 出借人信息ID
	 */
	@TableId(type = IdType.AUTO)
	@TableField(value="lender_id")
	private Integer lenderId;

	/**
	 * 出借人姓名
	 */
	@TableField(value="lender_name")
	private String lenderName;

	/**
	 * 出借人身份证Id
	 */
	@TableField(value="lender_card_id")
	private String lenderCardId;

	/**
	 * 出借人邮箱
	 */
	@TableField(value="lender_email")
	private String lenderEmail;

	/**
	 * 出借人手机号
	 */
	@TableField(value="lender_phone")
	private String lenderPhone;

	/**
	 * 法大大返回客户编号
	 */
	@TableField(value="fdd_customer_id")
	private String fddCustomerId;

	/**
	 * 创建时间
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;



	public Integer getLenderId() {
		return lenderId;
	}

	public void setLenderId(Integer lenderId) {
		this.lenderId = lenderId;
	}

	public String getLenderName() {
		return lenderName;
	}

	public void setLenderName(String lenderName) {
		this.lenderName = lenderName;
	}

	public String getLenderCardId() {
		return lenderCardId;
	}

	public void setLenderCardId(String lenderCardId) {
		this.lenderCardId = lenderCardId;
	}

	public String getLenderEmail() {
		return lenderEmail;
	}

	public void setLenderEmail(String lenderEmail) {
		this.lenderEmail = lenderEmail;
	}

	public String getLenderPhone() {
		return lenderPhone;
	}

	public void setLenderPhone(String lenderPhone) {
		this.lenderPhone = lenderPhone;
	}

	public String getFddCustomerId() {
		return fddCustomerId;
	}

	public void setFddCustomerId(String fddCustomerId) {
		this.fddCustomerId = fddCustomerId;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

}
