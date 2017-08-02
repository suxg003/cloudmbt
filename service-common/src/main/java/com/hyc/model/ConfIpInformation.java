package com.hyc.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * ip配置表
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@TableName("conf_ip_information")
public class ConfIpInformation implements Serializable {

    private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId(type = IdType.UUID)
	private Integer id;

	/**
	 * ip区间开始值
	 */
	@TableField(value="ip_begin")
	private String ipBegin;

	/**
	 * ip区间结束值
	 */
	@TableField(value="ip_end")
	private String ipEnd;

	/**
	 * 地区名称
	 */
	@TableField(value="ip_name")
	private String ipName;

	/**
	 * 转换后的ip
	 */
	@TableField(value="ip_begin_num")
	private Long ipBeginNum;

	/**
	 * 转换后的ip
	 */
	@TableField(value="ip_end_num")
	private Long ipEndNum;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIpBegin() {
		return ipBegin;
	}

	public void setIpBegin(String ipBegin) {
		this.ipBegin = ipBegin;
	}

	public String getIpEnd() {
		return ipEnd;
	}

	public void setIpEnd(String ipEnd) {
		this.ipEnd = ipEnd;
	}

	public String getIpName() {
		return ipName;
	}

	public void setIpName(String ipName) {
		this.ipName = ipName;
	}

	public Long getIpBeginNum() {
		return ipBeginNum;
	}

	public void setIpBeginNum(Long ipBeginNum) {
		this.ipBeginNum = ipBeginNum;
	}

	public Long getIpEndNum() {
		return ipEndNum;
	}

	public void setIpEndNum(Long ipEndNum) {
		this.ipEndNum = ipEndNum;
	}

}
