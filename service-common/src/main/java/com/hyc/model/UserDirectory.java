package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户通讯录
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("user_directory")
public class UserDirectory implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 用户ID
	 */
	@TableField(value="user_id")
	private Integer userId;

	/**
	 * 用户通讯录
	 */
	@TableField(value="user_directory")
	private String userDirectory;

	/**
	 * 创建时间
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;

	/**
	 * 更新时间
	 */
	@TableField(value="update_time")
	private Date updateTime;

	/**
	 * 
	 */
	private String resive1;

	/**
	 * 
	 */
	private String resive2;

	/**
	 * 
	 */
	private String resive3;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserDirectory() {
		return userDirectory;
	}

	public void setUserDirectory(String userDirectory) {
		this.userDirectory = userDirectory;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getResive1() {
		return resive1;
	}

	public void setResive1(String resive1) {
		this.resive1 = resive1;
	}

	public String getResive2() {
		return resive2;
	}

	public void setResive2(String resive2) {
		this.resive2 = resive2;
	}

	public String getResive3() {
		return resive3;
	}

	public void setResive3(String resive3) {
		this.resive3 = resive3;
	}

}
