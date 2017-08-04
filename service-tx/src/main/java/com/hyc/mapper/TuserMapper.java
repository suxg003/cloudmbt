package com.hyc.mapper;


import org.apache.ibatis.annotations.Mapper;

import com.hyc.model.Tuser;
import com.hyc.utils.SuperMapper;

@Mapper
public interface TuserMapper extends SuperMapper<Tuser> {
//	int deleteByPrimaryKey(String id);
//	Tuser selectByPrimaryKey(String id);
	/*Integer insert(Tuser record);

	int insertSelective(Tuser record);

	

	int updateByPrimaryKeySelective(Tuser record);

	int updateByPrimaryKeyWithBLOBs(Tuser record);

	int updateByPrimaryKey(Tuser record);*/
}