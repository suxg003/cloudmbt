package com.quick;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hyc.model.Tuser;
import com.quick.service.TuserService;
import com.quick.utils.BaseResp;
import com.quick.utils.ResultStatus;

/**
 * 生产者，可以理解为当前系统中的tx，内提供服务
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
//@ServletComponentScan
public class ServiceDemoApplication {
    @Resource
//	@Autowired
	private TuserService tuserService;
	public static void main(String[] args) {
		SpringApplication.run(ServiceDemoApplication.class, args);
	}

	@Value("${server.port}")
	String port;
	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi "+name+",i am from port:" +port;
	}

	
}
