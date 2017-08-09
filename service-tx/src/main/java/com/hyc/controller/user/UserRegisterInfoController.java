package com.hyc.controller.user;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hyc.exception.AppException;
import com.hyc.exception.ExceptionConstant;
import com.hyc.model.UserRegisterInfo;
import com.hyc.service.TxRedisDomainService;
import com.hyc.service.impl.UserRegisterInfoServiceImpl;
import com.hyc.utils.AppMap;
import com.hyc.utils.Base64;
import com.hyc.utils.SecurityUtil;

/**
 * <p>
 * 注册表 前端控制器
 * </p>
 *
 */
@Controller
@RequestMapping("/userregisterinfo")
public class UserRegisterInfoController {
	
	@Autowired
	private UserRegisterInfoServiceImpl userRegisterInfoServiceImpl;
	@Autowired
	private TxRedisDomainService txRedisDomainService;
	/**
	 * 用户注册服务端
	 * 
	 * @param request
	 */
	@RequestMapping("/regis")
	public void doLocalService(HttpServletRequest request,String phone,String code,String pass_word) {

		// HttpServletRequest request = AppMapHandler.getRequest(appMap);
		String ip = request.getHeader("X-Forwarded-For");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		ip = ip.equals("0:0:0:0:0:0:0:1") ? "127.0.0.1" : ip;
		/*
		 * AppMap.getIn().put("ip", ip);
		 * 
		 * this.localServiceTools.callService(appMap, "tx", "100100");
		 * if(appMap.getStatusData().isResultStatus()){
		 * apiv10appcommonloginLocalService.doLocalService(appMap); }
		 */

		// 手机号
	 
		if (phone != null && !"".equals(phone)) {
			// 后台验证手机号是否存在
			// 对手机号进行查询
			Map<String, Object> sqlParamsMap = new HashMap<String, Object>();
			sqlParamsMap.put("phone", phone);
			Map<String, Object> userMap = new HashMap<String, Object>();
			UserRegisterInfo userRegisterInfo = userRegisterInfoServiceImpl
					.selectOne(new EntityWrapper<UserRegisterInfo>().eq(
							"phone", phone));
			if (userRegisterInfo != null) {
				// 此手机号已存在
				throw new AppException(ExceptionConstant.TX_CODE_100001,
						"此手机号已存在");
			}
		} else {
			// 手机号不能为空
			throw new AppException(ExceptionConstant.TX_CODE_100006, "手机号不能为空");
		}
		 
		 //用书输入验证码是否为空
		 if(code!=null && !"".equals(code)){
			 //验证手机验证码是否失效
			 //取出redis缓存中存的验证码
			 Map<String, Object> in = new HashMap<String, Object>();
			 AppMap appMap=new AppMap();
			 try{
				 in.put("_cache_redis_key_", "regist."+phone);
				 in.put("action", "read");
				 appMap.setIn(in);
					txRedisDomainService.doService(appMap);
			 }catch(Exception e){
//				 logger.error("读取redis服务获取配置信息异常", e);
				 throw new AppException(ExceptionConstant.TX_CODE_100021,"请先点击获取验证码");
			 }
			 
			 String rediscode = (String) appMap.getOut().get("regist."+phone);
			 if(rediscode==null || "".equals(rediscode)){
				//验证码超时或不存在
				 throw new AppException (ExceptionConstant.TX_CODE_100003,"手机验证码超时");
			 }else{
				 if(!code.equals(rediscode)){
					//验证码不一致
					 throw new AppException (ExceptionConstant.TX_CODE_100005,"手机验证码和发送验证码不一致"); 
				 }
			 }
		 }else{
			 //验证码不能为空
			 throw new AppException (ExceptionConstant.TX_CODE_100004,"手机验证码不能为空");
		 }
		
		//密码加密
		 String tPwd = null ;
		 if(pass_word!=null && !"".equals(pass_word)){
			 pass_word = new String (Base64.decode(pass_word));
		 	 try {
				tPwd = SecurityUtil.hashWithBase64Encoded("md5", pass_word.getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }else{
			 //密码不能为空
			 throw new AppException (ExceptionConstant.TX_CODE_100007,"密码不能为空");
		 }
	 	 
		 if(ip!=null&&!("".equals(ip))&&ip.contains(",")){
	        ip=ip.split(",")[0].trim();
	     }
		 long ipL=ipToLong(ip);

	}
	
	
	//ip转换方法
	public long ipToLong(String ipAddress) {  
		  
	        String[] addrArray = ipAddress.split("\\.");  
	  
	        long num = 0;  
	        for (int i = 0; i < addrArray.length; i++) {  
	  
	            int power = 3 - i;  
	  
	            // 1. (192 % 256) * 256 pow 3  
	            // 2. (168 % 256) * 256 pow 2  
	            // 3. (108 % 256) * 256 pow 1  
	            // 4. (108 % 256) * 256 pow 0  
	            num += ((Integer.parseInt(addrArray[i]) % 256 * Math  
	                    .pow(256, power)));  
	  
	        }  
	        return num;  
	    }
}