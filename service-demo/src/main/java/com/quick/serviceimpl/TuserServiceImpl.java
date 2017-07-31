package com.quick.serviceimpl;

import com.hyc.model.Tuser;
import com.quick.mapper.TuserMapper;
import com.quick.service.TuserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TuserServiceImpl implements TuserService {

    @Autowired
    private TuserMapper tuserMapper;

    @Override
    public Tuser findById(String id) {
        return tuserMapper.selectByPrimaryKey(id);
    }

}
