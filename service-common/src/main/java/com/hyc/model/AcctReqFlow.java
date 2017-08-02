package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 账户中心业务请求流水关联表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("acct_req_flow")
public class AcctReqFlow implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 表id
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 业务请求号
	 */
	@TableField(value="request_no")
	private String requestNo;

	/**
	 * 账户流水号
	 */
	@TableField(value="flow_id")
	private String flowId;

	/**
	 * 流水类型(01：平台账户 02：用户总账户 )
	 */
	@TableField(value="flow_type")
	private String flowType;

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
	 * 备注
	 */
	private String remark;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getFlowId() {
		return flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getFlowType() {
		return flowType;
	}

	public void setFlowType(String flowType) {
		this.flowType = flowType;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
