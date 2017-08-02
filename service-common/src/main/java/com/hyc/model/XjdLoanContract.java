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
@TableName("xjd_loan_contract")
public class XjdLoanContract implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 借款合同id
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 借款编号
	 */
	@TableField(value="loan_no")
	private Integer loanNo;

	/**
	 * 合同编号1
	 */
	@TableField(value="contract_id")
	private String contractId;

	/**
	 * 传给法大大的合同编号
	 */
	@TableField(value="fdd_contract_id")
	private String fddContractId;

	/**
	 * 本地合同地址1
	 */
	@TableField(value="doc_url")
	private String docUrl;

	/**
	 * 交易号
	 */
	@TableField(value="transaction_id")
	private String transactionId;

	/**
	 * 用户id
	 */
	@TableField(value="user_id")
	private Integer userId;

	/**
	 * 签章结果代码3000：成功，3001：失败 3002：超时 3003：等待中
	 */
	@TableField(value="result_code")
	private String resultCode;

	/**
	 * 法大大合同下载地址
	 */
	@TableField(value="download_url")
	private String downloadUrl;

	/**
	 * 法大大查看合同地址
	 */
	@TableField(value="viewpdf_url")
	private String viewpdfUrl;

	/**
	 * 异步返回时间
	 */
	private Date timestamp;

	/**
	 * 创建时间
	 */
	@TableField(value="create_data_time")
	private Date createDataTime;



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

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public String getFddContractId() {
		return fddContractId;
	}

	public void setFddContractId(String fddContractId) {
		this.fddContractId = fddContractId;
	}

	public String getDocUrl() {
		return docUrl;
	}

	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getViewpdfUrl() {
		return viewpdfUrl;
	}

	public void setViewpdfUrl(String viewpdfUrl) {
		this.viewpdfUrl = viewpdfUrl;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Date getCreateDataTime() {
		return createDataTime;
	}

	public void setCreateDataTime(Date createDataTime) {
		this.createDataTime = createDataTime;
	}

}
