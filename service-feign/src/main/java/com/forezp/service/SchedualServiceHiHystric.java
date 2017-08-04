package com.forezp.service;

import org.springframework.stereotype.Component;

import com.hyc.model.Tuser;
import com.hyc.utils.BaseResp;


@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
/*    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry，not call server "+name;
    }*/

	@Override
	public BaseResp<Tuser> getById(String id) {
		// TODO Auto-generated method stub
		BaseResp<Tuser> br=new BaseResp<Tuser>();
		br.setMessage("sorry，not call server");
		return br;
	}

@Override
public BaseResp<Tuser> addTuser(Tuser tuser) {
	BaseResp<Tuser> br=new BaseResp<Tuser>();
	br.setMessage("######sorry，not call server");
	return br;
}

 
}
