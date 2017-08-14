package com.hyc.service;

import com.baomidou.mybatisplus.service.IService;
import com.hyc.model.ConfIpInformation;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
public interface IConfIpInformationService extends IService<ConfIpInformation> {
	
	/**
	 * 自定义查询ip
	 * @param ip
	 * @return
	 */
	public String queryIpss(String ip);
}
