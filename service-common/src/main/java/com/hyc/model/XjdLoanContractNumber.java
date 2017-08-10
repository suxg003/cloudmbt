package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("xjd_loan_contract_number")
public class XjdLoanContractNumber implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 
	 */
	@TableField(value="loan_no")
	private Integer loanNo;

	/**
	 * 
	 */
	@TableField(value="loan_no_number")
	private Integer loanNoNumber;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(Integer loanNo) {
		this.loanNo = loanNo;
	}

	public Integer getLoanNoNumber() {
		return loanNoNumber;
	}

	public void setLoanNoNumber(Integer loanNoNumber) {
		this.loanNoNumber = loanNoNumber;
	}

}
