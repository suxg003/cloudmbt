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
 * 用户账号流水明细
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("acct_user_acct_tran_detail")
public class AcctUserAcctTranDetail implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 在账户系统账号
	 */
	@TableField(value="acct_no")
	private Integer acctNo;

	/**
	 * 用户id
	 */
	@TableField(value="user_id")
	private Integer userId;

	/**
	 * 
	 */
	@TableField(value="tx_amount")
	private BigDecimal txAmount;

	/**
	 * 01:放款至虚拟账户 02:查询费 03:服务费 04:管理费 05:提现至银行卡
	 */
	@TableField(value="trade_type")
	private String tradeType;

	/**
	 * 
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;

	/**
	 * 业务流水编号
	 */
	@TableField(value="flow_id")
	private String flowId;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(Integer acctNo) {
		this.acctNo = acctNo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public BigDecimal getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(BigDecimal txAmount) {
		this.txAmount = txAmount;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

}
