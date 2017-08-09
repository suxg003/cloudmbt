package com.forezp.web.user;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * 注册表  前端控制器
 * </p>
 *
 * @author hyc123
 * @since 2017-08-02
 */
@Controller
@RequestMapping("/userregisterinfo")
public class UserRegisterInfoController {
public void doLocalService(HttpServletRequest request) {
		
//		HttpServletRequest request = AppMapHandler.getRequest(appMap);
		String ip = request.getHeader("X-Forwarded-For");
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
	        ip = request.getHeader("Proxy-Client-IP");
	    }
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
	        ip = request.getHeader("WL-Proxy-Client-IP");
	    }
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
	        ip = request.getRemoteAddr();
	    }
	    ip = ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip;
	/*	AppMap.getIn().put("ip", ip);
		
		this.localServiceTools.callService(appMap, "tx", "100100");
		if(appMap.getStatusData().isResultStatus()){
			apiv10appcommonloginLocalService.doLocalService(appMap);
		}*/
	}	
}
