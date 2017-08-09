package com.hyc.service.impl;


import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hyc.mapper.UserRegisterInfoMapper;
import com.hyc.model.UserRegisterInfo;
import com.hyc.service.IUserRegisterInfoService;

/**
 * <p>
 * 注册表  服务实现类
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@Service
public class UserRegisterInfoServiceImpl extends ServiceImpl<UserRegisterInfoMapper, UserRegisterInfo> implements IUserRegisterInfoService {
	
}
