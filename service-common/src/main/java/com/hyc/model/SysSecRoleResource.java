package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 角色功能
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_sec_role_resource")
public class SysSecRoleResource implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 角色编号
	 */
	@TableId(type = IdType.AUTO)
	@TableField(value="role_id")
	private String roleId;

	/**
	 * 资源编号
	 */
	@TableField(value="resource_id")
	private String resourceId;



	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

}
