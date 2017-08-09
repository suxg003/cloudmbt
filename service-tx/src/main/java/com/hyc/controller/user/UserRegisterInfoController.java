package com.hyc.controller.user;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hyc.exception.AppException;
import com.hyc.exception.ExceptionConstant;
import com.hyc.mapper.UserInfoMapper;
import com.hyc.model.AcctUserAcctInfo;
import com.hyc.model.ConfIpInformation;
import com.hyc.model.UserInfo;
import com.hyc.model.UserRegisterInfo;
import com.hyc.service.TxRedisDomainService;
import com.hyc.service.impl.AcctUserAcctInfoServiceImpl;
import com.hyc.service.impl.ConfIpInformationServiceImpl;
import com.hyc.service.impl.UserInfoServiceImpl;
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
	@Autowired
	private UserInfoServiceImpl userInfoServiceImpl;
	@Autowired
	private ConfIpInformationServiceImpl confIpInformationServiceImpl;
	@Autowired
	private AcctUserAcctInfoServiceImpl acctUserAcctInfoServiceImpl;

	/**
	 * 用户注册服务端
	 * 
	 * @param request
	 */
	@RequestMapping("/regis")
	public void doLocalService(HttpServletRequest request, String phone,
			String code, String pass_word) {

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

		// 用书输入验证码是否为空
		if (code != null && !"".equals(code)) {
			// 验证手机验证码是否失效
			// 取出redis缓存中存的验证码
			Map<String, Object> in = new HashMap<String, Object>();
			AppMap appMap = new AppMap();
			try {
				in.put("_cache_redis_key_", "regist." + phone);
				in.put("action", "read");
				appMap.setIn(in);
				txRedisDomainService.doService(appMap);
			} catch (Exception e) {
				// logger.error("读取redis服务获取配置信息异常", e);
				throw new AppException(ExceptionConstant.TX_CODE_100021,
						"请先点击获取验证码");
			}

			String rediscode = (String) appMap.getOut().get("regist." + phone);
			if (rediscode == null || "".equals(rediscode)) {
				// 验证码超时或不存在
				throw new AppException(ExceptionConstant.TX_CODE_100003,
						"手机验证码超时");
			} else {
				if (!code.equals(rediscode)) {
					// 验证码不一致
					throw new AppException(ExceptionConstant.TX_CODE_100005,
							"手机验证码和发送验证码不一致");
				}
			}
		} else {
			// 验证码不能为空
			throw new AppException(ExceptionConstant.TX_CODE_100004,
					"手机验证码不能为空");
		}

		// 密码加密
		String tPwd = null;
		if (pass_word != null && !"".equals(pass_word)) {
			pass_word = new String(Base64.decode(pass_word));
			try {
				tPwd = SecurityUtil.hashWithBase64Encoded("md5",
						pass_word.getBytes("UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			// 密码不能为空
			throw new AppException(ExceptionConstant.TX_CODE_100007, "密码不能为空");
		}

		if (ip != null && !("".equals(ip)) && ip.contains(",")) {
			ip = ip.split(",")[0].trim();
		}
		long ipL = ipToLong(ip);

		Map<String, Object> sqlMap = new HashMap<String, Object>();
		// sqlMap.put("ip", ipL);
		// Map<String, Object> ipMap =
		// mapSimpleDao.getMapByMap("tx_100101_user_login.tx_conf_ip", sqlMap);

		// ConfIpInformation ipMap =confIpInformationServiceImpl.selectOne(new
		// EntityWrapper<ConfIpInformation>().eq("ip", ipL) );
		String ipMap = (String) confIpInformationServiceImpl
				.selectObj(new EntityWrapper<ConfIpInformation>().eq("ip", ipL));
		UserRegisterInfo userRegisterInfo = new UserRegisterInfo();
		userRegisterInfo.setRegIp(ip);// 注册ip
		userRegisterInfo.setRegAddress(ipMap);// 注册所在地
		userRegisterInfo.setPassWord(tPwd);// 密码
		userRegisterInfo.setRegTime(new Date());// 注册时间

		/*
		 * insertMap.put(UserRegisterInfoConst.FIRST_SPREAD_CHANNEL,
		 * params.get("first_spread_channel")==null ||
		 * "".equals(params.get("first_spread_channel")) ?
		 * "":params.get("first_spread_channel"));//推广渠道
		 * insertMap.put(UserRegisterInfoConst.SECOND_SPREAD_CHANNEL,
		 * params.get("second_spread_channel")==null ||
		 * "".equals(params.get("second_spread_channel")) ?
		 * "":params.get("second_spread_channel"));//二级推广渠道
		 * insertMap.put(UserRegisterInfoConst.THIRD_SPREAD_CHANNEL,
		 * params.get("third_spread_channel")==null ||
		 * "".equals(params.get("third_spread_channel")) ?
		 * "":params.get("third_spread_channel"));//三级推广渠道
		 * insertMap.put(UserRegisterInfoConst.SPREAD_USER_ID,
		 * params.get("spread_user_id")==null ||
		 * "".equals(params.get("spread_user_id")) ?
		 * "":params.get("spread_user_id"));//直属推广员id
		 * insertMap.put(UserRegisterInfoConst.PARENT_SPREAD_USER_ID,
		 * params.get("parent_spread_user_id")==null ||
		 * "".equals(params.get("parent_spread_user_id")) ?
		 * "":params.get("parent_spread_user_id"));//祖系推广员id
		 * insertMap.put(UserRegisterInfoConst.SPREAD_LINK,
		 * params.get("spread_link")==null ||
		 * "".equals(params.get("spread_link")) ?
		 * "":params.get("spread_link"));//专属链接
		 */

		// 插入用户注册信息记录表

		// int userId = (Integer)
		// mapDao.insert(UserRegisterInfoConst.SQL_MAP_NS, insertMap);

		if (userRegisterInfoServiceImpl.insert(userRegisterInfo)) {
			UserInfo userInfo = new UserInfo();
			// userInfoMap.put(UserInfoConst.USER_ID, userId);//用户id
			userInfo.setUserId(userRegisterInfo.getUserId());// 用户id
			userInfo.setPhone(phone);
			userInfo.setStatus("01");
			userInfo.setLoanStatus("01");
			userInfo.setCreateDateTime(new Date());
			userInfoServiceImpl.insert(userInfo);
		} else {
			// 注册失败
			throw new AppException(ExceptionConstant.TX_CODE_100002, "注册失败");
		}
		// 成功后返回数据
		// appMap.getIn().put("phone",phone);
		// appMap.getIn().put("pass_word",params.get("pass_word"));
		//
		// // 注册成功开账户
		// AppMap acctMap = new AppMap();
		// Map<String, Object> acctInfoMap = new HashMap<String, Object>();
		// acctInfoMap.put("user_id", userId);
		// acctInfoMap.put("channel_no", "1");
		// acctMap.setIn(acctInfoMap);

		// tx105101DomainService.doService(acctMap);

		Date currentTime = new Date();
		AcctUserAcctInfo record = new AcctUserAcctInfo();

		// record.setUserId("user_id");
		record.setChannelNo("channel_no");
		record.setCreditAmount(new BigDecimal(0));
		record.setLoanAmount(new BigDecimal(0));
		record.setBorrowAmount(new BigDecimal(0));
		record.setCreateDateTime(currentTime);
		record.setUpdateTime(currentTime);
		acctUserAcctInfoServiceImpl.insert(record);

	}

	// ip转换方法
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