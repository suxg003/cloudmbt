package com.hyc.utils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 调用base64工具类
 */
public class SecurityUtil {
	private final static Logger logger = LoggerFactory.getLogger(SecurityUtil.class);
	
//    public static byte[] hash(String aAlgorithm, byte[] aByteArray) {
//        MessageDigest md;
//		try {
//			md = MessageDigest.getInstance(aAlgorithm);
//			md.update(aByteArray);
//			return md.digest();
//		} catch (Exception e) {
//			logger.error("{}", e);
//			return null;
//		}
//        
//    }
//	public static String hashWithBase64Encoded(String aAlgorithm, byte[] aByteArray) {
//		return Base64.encode(hash(aAlgorithm, aByteArray));
//	}
	//密码加密方式
    public static String hashWithBase64Encoded(String aAlgorithm, byte[] aByteArray) {
	        MessageDigest md = null;
	        try {
	            md = MessageDigest.getInstance(aAlgorithm);
	            md.update(aByteArray);
	            byte[] md5Bytes = md.digest();
	            return SecurityUtil.bytes2Hex(md5Bytes);
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }

	        return null;
	    }

	    private static String bytes2Hex(byte[] byteArray) {
	        StringBuffer strBuf = new StringBuffer();
	        for (byte element : byteArray) {
	            if (element >= 0 && element < 16) {
	                strBuf.append("0");
	            }
	            strBuf.append(Integer.toHexString(element & 0xFF));
	        }
	        return strBuf.toString();
	    }
}
