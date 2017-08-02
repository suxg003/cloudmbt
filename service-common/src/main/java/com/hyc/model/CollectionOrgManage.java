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
@TableName("collection_org_manage")
public class CollectionOrgManage implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 催收机构编号
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="organization_number")
	private Integer organizationNumber;

	/**
	 * 催收方式: (1:语音催收，2:外呼催收，3:委外催收，4:线上仲裁)
	 */
	@TableField(value="collection_type")
	private Integer collectionType;

	/**
	 * 逾期级别
	 */
	@TableField(value="overdue_level")
	private Integer overdueLevel;

	/**
	 * 机构名称
	 */
	@TableField(value="organization_name")
	private String organizationName;

	/**
	 * 合作开始
	 */
	@TableField(value="cooperation_star_time")
	private Date cooperationStarTime;

	/**
	 * 合作结束时间
	 */
	@TableField(value="cooperation_end_time")
	private Date cooperationEndTime;

	/**
	 * 创建时间
	 */
	@TableField(value="credit_time")
	private Date creditTime;

	/**
	 * 更新时间
	 */
	@TableField(value="update_time")
	private Date updateTime;

	/**
	 * 1:有效 0:无效
	 */
	@TableField(value="is_effective")
	private Integer isEffective;

	/**
	 * 操作人
	 */
	private String operationmen;

	/**
	 * 分配权重（%）
	 */
	@TableField(value="apply_weight")
	private Integer applyWeight;



	public Integer getOrganizationNumber() {
		return organizationNumber;
	}

	public void setOrganizationNumber(Integer organizationNumber) {
		this.organizationNumber = organizationNumber;
	}

	public Integer getCollectionType() {
		return collectionType;
	}

	public void setCollectionType(Integer collectionType) {
		this.collectionType = collectionType;
	}

	public Integer getOverdueLevel() {
		return overdueLevel;
	}

	public void setOverdueLevel(Integer overdueLevel) {
		this.overdueLevel = overdueLevel;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public Date getCooperationStarTime() {
		return cooperationStarTime;
	}

	public void setCooperationStarTime(Date cooperationStarTime) {
		this.cooperationStarTime = cooperationStarTime;
	}

	public Date getCooperationEndTime() {
		return cooperationEndTime;
	}

	public void setCooperationEndTime(Date cooperationEndTime) {
		this.cooperationEndTime = cooperationEndTime;
	}

	public Date getCreditTime() {
		return creditTime;
	}

	public void setCreditTime(Date creditTime) {
		this.creditTime = creditTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(Integer isEffective) {
		this.isEffective = isEffective;
	}

	public String getOperationmen() {
		return operationmen;
	}

	public void setOperationmen(String operationmen) {
		this.operationmen = operationmen;
	}

	public Integer getApplyWeight() {
		return applyWeight;
	}

	public void setApplyWeight(Integer applyWeight) {
		this.applyWeight = applyWeight;
	}

}
