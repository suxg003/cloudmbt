package com.hyc.serviceimpl;

import java.util.List;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
 
import com.hyc.mapper.TuserMapper;
import com.hyc.model.Tuser;
import com.hyc.service.TuserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TuserServiceImpl extends ServiceImpl<TuserMapper, Tuser> implements TuserService {

    @Autowired
    private TuserMapper tuserMapper;

     @Override
    public List<Tuser> findById(String id) {
   //     return tuserMapper.selectByPrimaryKey(id);
 
    return tuserMapper.selectList( new EntityWrapper<Tuser>().eq("user_age",id));
     } 

	@Override
	public void addUser(Tuser user) {
		// TODO Auto-generated method stub
		tuserMapper.insert(user);
	 
	}

}
