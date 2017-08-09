package com.hyc.exception;


public class ExceptionConstant {
	/**
	 *错误码描述
	 */
	/**
	 * app接口错误码
	 * */
	public final static String TX_CODE_000001="000001";// "信息不存在！";
	public final static String TX_CODE_99= "99";//系统错误
	public final static String TX_CODE_100000= "100000";//成功
	public final static String TX_CODE_100001= "100001";//此手机号已存在
	public final static String TX_CODE_100002= "100002";//注册失败
	public final static String TX_CODE_100003= "100003";//手机验证码超时
	public final static String TX_CODE_100004= "100004";//手机验证码不能为空
	public final static String TX_CODE_100005= "100005";//手机验证码和发送验证码不一致
	public final static String TX_CODE_100006= "100006";//手机号不能为空
	public final static String TX_CODE_100007= "100007";//密码不能为空
	public final static String TX_CODE_100008= "100008";//手机号不存在
	public final static String TX_CODE_100009= "100009";//密码不正确
	public final static String TX_CODE_100010= "100010";//不支持该银行卡
	public final static String TX_CODE_100011= "100011";//解绑银行卡时，至少的留下一张银行卡
	public final static String TX_CODE_100012= "100012";//银行卡验证4要素参数不能为空
	public final static String TX_CODE_100015= "100015";//再次输入密码不能为空
	public final static String TX_CODE_100016= "100016";//OCR银行卡识别错误
	public final static String TX_CODE_100017= "100017";//银行卡已存在
	public final static String TX_CODE_100018= "100018";//平台自动签署出错
	public final static String TX_CODE_100019= "100019";//PDF中文转码错误
	public final static String TX_CODE_100020= "100020";//PDF个人申请CA证书失败
	public final static String TX_CODE_100021= "100021";//读取redis服务获取配置信息异常
	public final static String TX_CODE_100022= "100022";//当前用户输错密码已被锁定暂时无法登陆
	public final static String TX_CODE_100023= "100023";//用户被禁止登录
	public final static String TX_CODE_100024= "100024";//绑卡失败
	/**
	 * 放款错误码
	 * */
	public final static String TX_CODE_100013= "100013";//借款信息不能为空
	public final static String TX_CODE_100014= "100014";//借款编号不能为空
	
	
	
}