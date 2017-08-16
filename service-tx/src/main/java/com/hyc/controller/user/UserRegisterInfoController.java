package com.hyc.controller.user;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.hyc.exception.AppException;
import com.hyc.exception.ExceptionConstant;
import com.hyc.model.AcctUserAcctInfo;
import com.hyc.model.UserInfo;
import com.hyc.model.UserRegisterInfo;
import com.hyc.rep.UserLoginInfoConst;
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
@RestController
public class UserRegisterInfoController {
	Logger log = org.slf4j.LoggerFactory.getLogger(UserRegisterInfoController.class);

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
	@RequestMapping("/userregisterinfo/regis")
	@Transactional
	public Map<String,Object> doLocalService(String ip, String phone, String code,
			String pass_word, String channel_no, String first_spread_channel,
			String second_spread_channel, String third_spread_channel,
			String spread_user_id, String parent_spread_user_id,
			String spread_link) {
		Map<String,Object> map = new HashMap<String,Object> ();
		try {
			// 手机号
			if (phone != null && !"".equals(phone)) {
				// 后台验证手机号是否存在
				// 对手机号进行查询
				Map<String, Object> sqlParamsMap = new HashMap<String, Object>();
				sqlParamsMap.put("phone", phone);
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
				throw new AppException(ExceptionConstant.TX_CODE_100006,
						"手机号不能为空");
			}

			/*// 用书输入验证码是否为空
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

				String rediscode = (String) appMap.getOut().get(
						"regist." + phone);
				if (rediscode == null || "".equals(rediscode)) {
					// 验证码超时或不存在
					throw new AppException(ExceptionConstant.TX_CODE_100003,
							"手机验证码超时");
				} else {
					if (!code.equals(rediscode)) {
						// 验证码不一致
						throw new AppException(
								ExceptionConstant.TX_CODE_100005,
								"手机验证码和发送验证码不一致");
					}
				}
			} else {
				// 验证码不能为空
				throw new AppException(ExceptionConstant.TX_CODE_100004,
						"手机验证码不能为空");
			}*/

			// 密码加密
			String tPwd = null;
			if (pass_word != null && !"".equals(pass_word)) {
				pass_word = new String(Base64.decode(pass_word));
				try {
					tPwd = SecurityUtil.hashWithBase64Encoded("md5",
							pass_word.getBytes("UTF-8"));
				} catch (UnsupportedEncodingException e) {
					e.printStackTrace();
				}
			} else {
				// 密码不能为空
				throw new AppException(ExceptionConstant.TX_CODE_100007,
						"密码不能为空");
			}

			if (ip != null && !("".equals(ip)) && ip.contains(",")) {
				ip = ip.split(",")[0].trim();
			}
			long ipL = ipToLong(ip);

			String ipMap = confIpInformationServiceImpl.queryIpss(String
					.valueOf(ipL));
			UserRegisterInfo userRegisterInfo = new UserRegisterInfo();
			userRegisterInfo.setPhone(phone);
			userRegisterInfo.setRegIp(ip);// 注册ip
			userRegisterInfo.setRegAddress(ipMap);// 注册所在地
			userRegisterInfo.setPassWord(tPwd);// 密码
			userRegisterInfo.setRegTime(new Date());// 注册时间

			userRegisterInfo.setFirstSpreadChannel(StringUtils
					.defaultString(first_spread_channel));// 推广渠道
			userRegisterInfo.setSecondSpreadChannel(StringUtils
					.defaultString(second_spread_channel));// 二级推广渠道
			userRegisterInfo.setThirdSpreadChannel(StringUtils
					.defaultString(third_spread_channel));// 三级推广渠道
			userRegisterInfo.setSpreadUserId(StringUtils
					.defaultString(spread_user_id));// 直属推广员id
			userRegisterInfo.setParentSpreadUserId(StringUtils
					.defaultString(parent_spread_user_id));// 祖系推广员id
			userRegisterInfo.setSpreadLink(StringUtils
					.defaultString(spread_link));
			// 插入用户注册信息记录表
			if (userRegisterInfoServiceImpl.insert(userRegisterInfo)) {
				UserInfo userInfo = new UserInfo();
			log.info("插入用户注册信息记录表&&&&&&&&&&&&&&userRegisterInfo.getUserId()="+userRegisterInfo.getUserId());
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

			Date currentTime = new Date();
			AcctUserAcctInfo record = new AcctUserAcctInfo();
			// // 注册成功开账户
			record.setUserId(userRegisterInfo.getUserId());
			log.info("插入注册成功开账户&&&&&&&&&&&&&&userRegisterInfo.getUserId()="+userRegisterInfo.getUserId());
			record.setChannelNo("channel_no");
			record.setCreditAmount(new BigDecimal(0));
			record.setLoanAmount(new BigDecimal(0));
			record.setBorrowAmount(new BigDecimal(0));
			record.setCreateDateTime(currentTime);
			record.setUpdateTime(currentTime);
			acctUserAcctInfoServiceImpl.insert(record);
			map.put("code", "100000");
			map.put("message", "注册成功");
			 HashMap<String, Object>insertMap = new HashMap<String, Object>();
			 
				insertMap.put(UserLoginInfoConst.USER_ID, userRegisterInfo.getUserId());
				insertMap.put(UserLoginInfoConst.LOGIN_TIME, new Date());
				insertMap.put(UserLoginInfoConst.LOGIN_IP, ip);
				insertMap.put(UserLoginInfoConst.LOGIN_REGION, ipL);
				insertMap.put(UserLoginInfoConst.LOGIN_ADDRESS, ipMap);
				insertMap.put(UserLoginInfoConst.DEVICE_ID,  "device_id");
				insertMap.put(UserLoginInfoConst.APP_STORE, "app_store");
				insertMap.put(UserLoginInfoConst.CHANNEL_PACKAGE, "channel_package");
				insertMap.put(UserLoginInfoConst.LOGIN_SITE, "login_site");
				insertMap.put(UserLoginInfoConst.APP_VERSION, "ver");
				insertMap.put(UserLoginInfoConst.APP_RESOLUTION, "app_resolution");
				insertMap.put(UserLoginInfoConst.APP_SYSTEM, "os");
				insertMap.put(UserLoginInfoConst.TONGDUN_DEVICE_ID, "blackBox");
			
				map.put("loginUser", insertMap);
		} catch (AppException e) {
			map.put("code", e.getErrorCode());
			map.put("message", e.getMessage());
		}

		return map;
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