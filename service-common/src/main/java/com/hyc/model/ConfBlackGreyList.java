package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 黑灰名单表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("conf_black_grey_list")
public class ConfBlackGreyList implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 黑灰名单id
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 名单类型（01：黑名单，02：灰名单）
	 */
	private String type;

	/**
	 * 名单来源(数据字典)
	 */
	private String source;

	/**
	 * 数据主体类别（关联字段表，01：手机号码，02：身份证号，03：银行卡号，04：设备ID，05：IP地址 ）
	 */
	@TableField(value="trigger_type")
	private String triggerType;

	/**
	 * 入库原因
	 */
	@TableField(value="trigger_reason")
	private String triggerReason;

	/**
	 * 数据主体
	 */
	@TableField(value="trigger_value")
	private String triggerValue;

	/**
	 * 业务场景（关联字典表，01：资料审核，02：借款审核）
	 */
	@TableField(value="bus_scene")
	private String busScene;

	/**
	 * 创建时间
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;

	/**
	 * 有效性(1:生效 0:失效)
	 */
	@TableField(value="is_relieve")
	private String isRelieve;

	/**
	 * 操作时间
	 */
	@TableField(value="relieve_date_time")
	private Date relieveDateTime;

	/**
	 * 操作解除用户
	 */
	@TableField(value="relieve_user_id")
	private String relieveUserId;

	/**
	 * 到期时间
	 */
	@TableField(value="end_date_time")
	private Date endDateTime;

	/**
	 * 操作原因
	 */
	private String reason;

	/**
	 * 操作人
	 */
	@TableField(value="operator_name")
	private String operatorName;

	/**
	 * 操作人ID
	 */
	@TableField(value="operator_id")
	private String operatorId;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTriggerType() {
		return triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
	}

	public String getTriggerReason() {
		return triggerReason;
	}

	public void setTriggerReason(String triggerReason) {
		this.triggerReason = triggerReason;
	}

	public String getTriggerValue() {
		return triggerValue;
	}

	public void setTriggerValue(String triggerValue) {
		this.triggerValue = triggerValue;
	}

	public String getBusScene() {
		return busScene;
	}

	public void setBusScene(String busScene) {
		this.busScene = busScene;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getIsRelieve() {
		return isRelieve;
	}

	public void setIsRelieve(String isRelieve) {
		this.isRelieve = isRelieve;
	}

	public Date getRelieveDateTime() {
		return relieveDateTime;
	}

	public void setRelieveDateTime(Date relieveDateTime) {
		this.relieveDateTime = relieveDateTime;
	}

	public String getRelieveUserId() {
		return relieveUserId;
	}

	public void setRelieveUserId(String relieveUserId) {
		this.relieveUserId = relieveUserId;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

}
