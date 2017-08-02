package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 报文记录
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("stl_transfer")
public class StlTransfer implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * 请求流水号
	 */
	@TableField(value="req_no")
	private String reqNo;

	/**
	 * 发送报文 
	 */
	@TableField(value="send_mess")
	private String sendMess;

	/**
	 * 返回报文
	 */
	@TableField(value="retu_mess")
	private String retuMess;

	/**
	 * 创建时间
	 */
	@TableField(value="create_date_time")
	private Date createDateTime;

	/**
	 * 完成时间
	 */
	@TableField(value="update_time")
	private Date updateTime;

	/**
	 * 返回状态码
	 */
	@TableField(value="retu_code")
	private String retuCode;

	/**
	 * 资金托管渠道
	 */
	@TableField(value="escr_channels")
	private String escrChannels;

	/**
	 * 签名
	 */
	@TableField(value="sign_mess")
	private String signMess;

	/**
	 * 
	 */
	@TableField(value="call_mess")
	private String callMess;

	/**
	 * 
	 */
	@TableField(value="noti_mess")
	private String notiMess;

	/**
	 *  01   绑卡                                                   
 02   卡bin查询                                               
 03   放款至银行卡 
 04   放款至银行卡确认付款    
 05   放款至银行卡异步通知                               
 06   放款至银行卡查询                                     
 07   认证支付                                                 
 08   认证支付异步通知                                     
 09   认证支付查询                                           
 10   分期付自动扣款                                        
 11   分期付自动扣款异步通知                             12   分期付自动扣款查询                                   13   授权申请(自动扣款前需要调用此接口,开通自动扣款授权申请) 
	 */
	@TableField(value="tran_type")
	private String tranType;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReqNo() {
		return reqNo;
	}

	public void setReqNo(String reqNo) {
		this.reqNo = reqNo;
	}

	public String getSendMess() {
		return sendMess;
	}

	public void setSendMess(String sendMess) {
		this.sendMess = sendMess;
	}

	public String getRetuMess() {
		return retuMess;
	}

	public void setRetuMess(String retuMess) {
		this.retuMess = retuMess;
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

	public String getRetuCode() {
		return retuCode;
	}

	public void setRetuCode(String retuCode) {
		this.retuCode = retuCode;
	}

	public String getEscrChannels() {
		return escrChannels;
	}

	public void setEscrChannels(String escrChannels) {
		this.escrChannels = escrChannels;
	}

	public String getSignMess() {
		return signMess;
	}

	public void setSignMess(String signMess) {
		this.signMess = signMess;
	}

	public String getCallMess() {
		return callMess;
	}

	public void setCallMess(String callMess) {
		this.callMess = callMess;
	}

	public String getNotiMess() {
		return notiMess;
	}

	public void setNotiMess(String notiMess) {
		this.notiMess = notiMess;
	}

	public String getTranType() {
		return tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

}
