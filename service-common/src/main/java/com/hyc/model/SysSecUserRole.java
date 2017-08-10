package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户角色
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_sec_user_role")
public class SysSecUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 用户编号
	 */
	@TableId(type = IdType.AUTO)
	@TableField(value="user_id")
	private String userId;

	/**
	 * 角色编号
	 */
	@TableField(value="role_id")
	private String roleId;



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
