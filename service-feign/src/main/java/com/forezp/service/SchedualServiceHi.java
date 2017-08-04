package com.forezp.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hyc.model.Tuser;
import com.hyc.utils.BaseResp;

@FeignClient(value = "service-demo", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
	@RequestMapping(value = "/888/{id}", method = RequestMethod.GET)
	public BaseResp<Tuser> getById(@PathVariable("id") String id);

	@RequestMapping(value = "/tuesr/add", method = RequestMethod.POST)
	public BaseResp<Tuser> addTuser(Tuser tuser);
}