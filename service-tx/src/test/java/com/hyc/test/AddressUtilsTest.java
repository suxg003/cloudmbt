package com.hyc.test;


import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hyc.utils.AddressUtils;
@RunWith(SpringJUnit4ClassRunner.class)
public class AddressUtilsTest {
	@Test
	public void testAddess() {
		String ip = "61.187.182.195";
		String address = "";
		try {
			address = AddressUtils.getAddresses("ip=" + ip, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(address);
		/*
		 * String country =
		 * JSONObject(json.get("data")).get("country").toString(); String region
		 * = JSONObject.fromObject(json.get("data")).get("region").toString();
		 * String city =
		 * JSONObject.fromObject(json.get("data")).get("city").toString();
		 * String county =
		 * JSONObject.fromObject(json.get("data")).get("county").toString();
		 * String isp =
		 * JSONObject.fromObject(json.get("data")).get("isp").toString(); String
		 * area =
		 * JSONObject.fromObject(json.get("data")).get("area").toString();
		 */
		/*
		 * System.out.println("国家： " + country); System.out.println("地区： " +
		 * area); System.out.println("省份: " + region); System.out.println("城市： "
		 * + city); System.out.println("区/县： " + county);
		 * System.out.println("互联网服务提供商： " + isp); String jjjjj =
		 * region+city+isp; System.out.println("ip地址： " + jjjjj);
		 */

		// {"code":0,"data":{"area":"华中","country":"中国","isp_id":"100017","city":"衡阳市","isp":"电信","ip":"61.187.182.195","region_id":"430000","county":"","area_id":"400000","county_id":"-1","region":"湖南省","country_id":"CN","city_id":"430400"}}

	}
}
