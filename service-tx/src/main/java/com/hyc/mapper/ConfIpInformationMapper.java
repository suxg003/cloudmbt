package com.hyc.mapper;

import com.hyc.model.ConfIpInformation;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
public interface ConfIpInformationMapper extends BaseMapper<ConfIpInformation> {
	/**
	 * 自定义查询ip
	 * @param ip
	 * @return
	 */
	public String queryIpss(String ip);
}