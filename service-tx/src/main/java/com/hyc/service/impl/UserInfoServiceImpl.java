package com.hyc.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hyc.mapper.UserInfoMapper;
import com.hyc.model.UserInfo;
import com.hyc.service.IUserInfoService;

/**
 * <p>
 * 用户信息表  服务实现类
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {
	
}
