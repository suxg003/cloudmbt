package com.hyc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hyc.mapper.ConfIpInformationMapper;
import com.hyc.model.ConfIpInformation;
import com.hyc.service.IConfIpInformationService;

/**
 * <p>
 * ip配置表 服务实现类
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@Service
public class ConfIpInformationServiceImpl extends
		ServiceImpl<ConfIpInformationMapper, ConfIpInformation> implements
		IConfIpInformationService {
	@Autowired
	ConfIpInformationMapper confIpInformationMapper;

	@Override
	public String queryIpss(String ip) {
		return confIpInformationMapper.queryIpss(ip);
	}

}
