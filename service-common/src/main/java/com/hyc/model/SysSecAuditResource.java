package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 审计过滤表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_sec_audit_resource")
public class SysSecAuditResource implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 功能id或url
	 */
	@TableId(type = IdType.AUTO)
	@TableField(value="resource_id")
	private String resourceId;



	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

}
