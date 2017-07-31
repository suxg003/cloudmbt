package com.quick.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hyc.model.Tuser;

@Mapper
public interface TuserMapper {
	int deleteByPrimaryKey(String id);

	int insert(Tuser record);

	int insertSelective(Tuser record);

	Tuser selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(Tuser record);

	int updateByPrimaryKeyWithBLOBs(Tuser record);

	int updateByPrimaryKey(Tuser record);
}