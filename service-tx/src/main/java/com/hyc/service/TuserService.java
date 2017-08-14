package com.hyc.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.hyc.model.Tuser;


public interface TuserService extends IService<Tuser>{

	public List<Tuser> findById(String id);

	public void addUser(Tuser tuser);
	
 

}
