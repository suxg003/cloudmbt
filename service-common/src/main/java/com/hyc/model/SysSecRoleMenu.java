package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 角色菜单
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("sys_sec_role_menu")
public class SysSecRoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 角色编号
	 */
	@TableId(type = IdType.UUID)
	@TableField(value="role_id")
	private String roleId;

	/**
	 * 菜单编号
	 */
	@TableField(value="menu_code")
	private String menuCode;



	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

}
