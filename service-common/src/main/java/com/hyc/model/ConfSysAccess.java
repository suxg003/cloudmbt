package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 风控管理-准入规则配置表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("conf_sys_access")
public class ConfSysAccess implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 规则编号
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 最小年龄（年龄范围最小值）
	 */
	@TableField(value="age_min")
	private Integer ageMin;

	/**
	 * 最大年龄（年龄范围最大值）
	 */
	@TableField(value="age_max")
	private Integer ageMax;

	/**
	 * 年龄 是否必要条件（1必要0权重）
	 */
	@TableField(value="age_flag")
	private String ageFlag;

	/**
	 * 年龄的权重值（%）
	 */
	@TableField(value="age_weight")
	private Integer ageWeight;

	/**
	 * 常住地(暂未用)
	 */
	@TableField(value="permanent_place")
	private String permanentPlace;

	/**
	 * 文化程度
	 */
	@TableField(value="edu_level")
	private String eduLevel;

	/**
	 * 文化程度 是否必要条件（1必要0权重）
	 */
	@TableField(value="edu_flag")
	private String eduFlag;

	/**
	 * 文化程度 权重分值（%）
	 */
	@TableField(value="edu_weight")
	private Integer eduWeight;

	/**
	 * 职业
	 */
	private String profession;

	/**
	 * 职业 是否必要条件（1必要0权重）
	 */
	@TableField(value="profession_flag")
	private String professionFlag;

	/**
	 * 职业权重分值（%）
	 */
	@TableField(value="profession_weight")
	private Integer professionWeight;

	/**
	 * 常住地居住时长(暂不用)
	 */
	@TableField(value="permanent_place_time")
	private Integer permanentPlaceTime;

	/**
	 * 常住地居住时长单位
	 */
	@TableField(value="permanent_place_time_unit")
	private String permanentPlaceTimeUnit;

	/**
	 * 手机号在网时长 单位 月  0 （0,6] 1 （6,12] 2 （12,24]   
	 */
	@TableField(value="phone_net_time")
	private String phoneNetTime;

	/**
	 * 手机号在网时长单位
	 */
	@TableField(value="phone_net_time_unit")
	private String phoneNetTimeUnit;

	/**
	 * 手机在网时长 是否必要条件（1必要0权重）
	 */
	@TableField(value="phone_net_time_flag")
	private String phoneNetTimeFlag;

	/**
	 * 手机在网时长权重分值（%）
	 */
	@TableField(value="phone_net_time_weight")
	private Integer phoneNetTimeWeight;

	/**
	 * 银行卡开户时长(暂不用)
	 */
	@TableField(value="bank_card_time")
	private Integer bankCardTime;

	/**
	 * 银行卡开户时长单位
	 */
	@TableField(value="bank_card_time_unit")
	private String bankCardTimeUnit;

	/**
	 * 银行卡近半年月均交易次数(暂不用)
	 */
	@TableField(value="average_month_trans_time")
	private Integer averageMonthTransTime;

	/**
	 * 有效性（是,否）
	 */
	@TableField(value="is_effective")
	private String isEffective;

	/**
	 * 生效方式(1立即0定时)
	 */
	@TableField(value="effective_way")
	private String effectiveWay;

	/**
	 * 最后操作人ID
	 */
	@TableField(value="last_operator_id")
	private String lastOperatorId;

	/**
	 * 最后操作人
	 */
	@TableField(value="last_operator_name")
	private String lastOperatorName;

	/**
	 * 常住地省市(1全国2省会、直辖市3地级市4区县)
	 */
	@TableField(value="provice_city")
	private String proviceCity;

	/**
	 * 常住地省市 是否必要条件（1必要0权重）
	 */
	@TableField(value="provice_city_flag")
	private String proviceCityFlag;

	/**
	 * 常住地省市 权重分值（%）
	 */
	@TableField(value="provice_city_weight")
	private Integer proviceCityWeight;

	/**
	 * 计划生效时间
	 */
	@TableField(value="plan_date_time")
	private Date planDateTime;

	/**
	 * 创建时间
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;

	/**
	 * 最后操作时间
	 */
	@TableField(value="update_date_time")
	private Date updateDateTime;

	/**
	 * 权重通过率（%）
	 */
	@TableField(value="weight_pass")
	private Integer weightPass;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAgeMin() {
		return ageMin;
	}

	public void setAgeMin(Integer ageMin) {
		this.ageMin = ageMin;
	}

	public Integer getAgeMax() {
		return ageMax;
	}

	public void setAgeMax(Integer ageMax) {
		this.ageMax = ageMax;
	}

	public String getAgeFlag() {
		return ageFlag;
	}

	public void setAgeFlag(String ageFlag) {
		this.ageFlag = ageFlag;
	}

	public Integer getAgeWeight() {
		return ageWeight;
	}

	public void setAgeWeight(Integer ageWeight) {
		this.ageWeight = ageWeight;
	}

	public String getPermanentPlace() {
		return permanentPlace;
	}

	public void setPermanentPlace(String permanentPlace) {
		this.permanentPlace = permanentPlace;
	}

	public String getEduLevel() {
		return eduLevel;
	}

	public void setEduLevel(String eduLevel) {
		this.eduLevel = eduLevel;
	}

	public String getEduFlag() {
		return eduFlag;
	}

	public void setEduFlag(String eduFlag) {
		this.eduFlag = eduFlag;
	}

	public Integer getEduWeight() {
		return eduWeight;
	}

	public void setEduWeight(Integer eduWeight) {
		this.eduWeight = eduWeight;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getProfessionFlag() {
		return professionFlag;
	}

	public void setProfessionFlag(String professionFlag) {
		this.professionFlag = professionFlag;
	}

	public Integer getProfessionWeight() {
		return professionWeight;
	}

	public void setProfessionWeight(Integer professionWeight) {
		this.professionWeight = professionWeight;
	}

	public Integer getPermanentPlaceTime() {
		return permanentPlaceTime;
	}

	public void setPermanentPlaceTime(Integer permanentPlaceTime) {
		this.permanentPlaceTime = permanentPlaceTime;
	}

	public String getPermanentPlaceTimeUnit() {
		return permanentPlaceTimeUnit;
	}

	public void setPermanentPlaceTimeUnit(String permanentPlaceTimeUnit) {
		this.permanentPlaceTimeUnit = permanentPlaceTimeUnit;
	}

	public String getPhoneNetTime() {
		return phoneNetTime;
	}

	public void setPhoneNetTime(String phoneNetTime) {
		this.phoneNetTime = phoneNetTime;
	}

	public String getPhoneNetTimeUnit() {
		return phoneNetTimeUnit;
	}

	public void setPhoneNetTimeUnit(String phoneNetTimeUnit) {
		this.phoneNetTimeUnit = phoneNetTimeUnit;
	}

	public String getPhoneNetTimeFlag() {
		return phoneNetTimeFlag;
	}

	public void setPhoneNetTimeFlag(String phoneNetTimeFlag) {
		this.phoneNetTimeFlag = phoneNetTimeFlag;
	}

	public Integer getPhoneNetTimeWeight() {
		return phoneNetTimeWeight;
	}

	public void setPhoneNetTimeWeight(Integer phoneNetTimeWeight) {
		this.phoneNetTimeWeight = phoneNetTimeWeight;
	}

	public Integer getBankCardTime() {
		return bankCardTime;
	}

	public void setBankCardTime(Integer bankCardTime) {
		this.bankCardTime = bankCardTime;
	}

	public String getBankCardTimeUnit() {
		return bankCardTimeUnit;
	}

	public void setBankCardTimeUnit(String bankCardTimeUnit) {
		this.bankCardTimeUnit = bankCardTimeUnit;
	}

	public Integer getAverageMonthTransTime() {
		return averageMonthTransTime;
	}

	public void setAverageMonthTransTime(Integer averageMonthTransTime) {
		this.averageMonthTransTime = averageMonthTransTime;
	}

	public String getIsEffective() {
		return isEffective;
	}

	public void setIsEffective(String isEffective) {
		this.isEffective = isEffective;
	}

	public String getEffectiveWay() {
		return effectiveWay;
	}

	public void setEffectiveWay(String effectiveWay) {
		this.effectiveWay = effectiveWay;
	}

	public String getLastOperatorId() {
		return lastOperatorId;
	}

	public void setLastOperatorId(String lastOperatorId) {
		this.lastOperatorId = lastOperatorId;
	}

	public String getLastOperatorName() {
		return lastOperatorName;
	}

	public void setLastOperatorName(String lastOperatorName) {
		this.lastOperatorName = lastOperatorName;
	}

	public String getProviceCity() {
		return proviceCity;
	}

	public void setProviceCity(String proviceCity) {
		this.proviceCity = proviceCity;
	}

	public String getProviceCityFlag() {
		return proviceCityFlag;
	}

	public void setProviceCityFlag(String proviceCityFlag) {
		this.proviceCityFlag = proviceCityFlag;
	}

	public Integer getProviceCityWeight() {
		return proviceCityWeight;
	}

	public void setProviceCityWeight(Integer proviceCityWeight) {
		this.proviceCityWeight = proviceCityWeight;
	}

	public Date getPlanDateTime() {
		return planDateTime;
	}

	public void setPlanDateTime(Date planDateTime) {
		this.planDateTime = planDateTime;
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

	public Integer getWeightPass() {
		return weightPass;
	}

	public void setWeightPass(Integer weightPass) {
		this.weightPass = weightPass;
	}

}
