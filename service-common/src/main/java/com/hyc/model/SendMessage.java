package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 消息推送表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("send_message")
public class SendMessage implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 推送消息ID
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 客户编号
	 */
	@TableField(value="user_id")
	private Integer userId;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 
	 */
	private String content;

	/**
	 * (01：个人消息，02 系统消息 )
	 */
	private String type;

	/**
	 * (0文本消息 1 h5消息 )
	 */
	@TableField(value="msg_type")
	private String msgType;

	/**
	 * 跳转url
	 */
	@TableField(value="jump_url")
	private String jumpUrl;

	/**
	 * 创建时间
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;

	/**
	 * 推送渠道（01 友盟）
	 */
	@TableField(value="spread_channel")
	private String spreadChannel;

	/**
	 * 
	 */
	private String reserve1;

	/**
	 * 
	 */
	private String reserve2;

	/**
	 * 
	 */
	private String reserve3;



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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getJumpUrl() {
		return jumpUrl;
	}

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getSpreadChannel() {
		return spreadChannel;
	}

	public void setSpreadChannel(String spreadChannel) {
		this.spreadChannel = spreadChannel;
	}

	public String getReserve1() {
		return reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getReserve2() {
		return reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	public String getReserve3() {
		return reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

}
