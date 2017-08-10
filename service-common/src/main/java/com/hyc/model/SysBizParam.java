package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 系统参数
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_biz_param")
public class SysBizParam implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 参数编号
	 */
	@TableId(type = IdType.AUTO)
	@TableField(value="param_id")
	private String paramId;

	/**
	 * 参数名称
	 */
	@TableField(value="param_name")
	private String paramName;

	/**
	 * 参数类型
	 */
	@TableField(value="param_type")
	private String paramType;

	/**
	 * 参数值范围
	 */
	@TableField(value="param_scope")
	private String paramScope;

	/**
	 * 参数值
	 */
	@TableField(value="param_value")
	private String paramValue;

	/**
	 * 参数状态
	 */
	@TableField(value="param_flag")
	private String paramFlag;

	/**
	 * 参数说明
	 */
	@TableField(value="param_desc")
	private String paramDesc;

	/**
	 * 系统保留
	 */
	@TableField(value="param_sys_flag")
	private String paramSysFlag;

	/**
	 * 只读标志
	 */
	@TableField(value="param_readonly_flag")
	private String paramReadonlyFlag;



	public String getParamId() {
		return paramId;
	}

	public void setParamId(String paramId) {
		this.paramId = paramId;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamType() {
		return paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public String getParamScope() {
		return paramScope;
	}

	public void setParamScope(String paramScope) {
		this.paramScope = paramScope;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public String getParamFlag() {
		return paramFlag;
	}

	public void setParamFlag(String paramFlag) {
		this.paramFlag = paramFlag;
	}

	public String getParamDesc() {
		return paramDesc;
	}

	public void setParamDesc(String paramDesc) {
		this.paramDesc = paramDesc;
	}

	public String getParamSysFlag() {
		return paramSysFlag;
	}

	public void setParamSysFlag(String paramSysFlag) {
		this.paramSysFlag = paramSysFlag;
	}

	public String getParamReadonlyFlag() {
		return paramReadonlyFlag;
	}

	public void setParamReadonlyFlag(String paramReadonlyFlag) {
		this.paramReadonlyFlag = paramReadonlyFlag;
	}

}
