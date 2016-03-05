package com.le.base.commons.beanUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.util.SerializationUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


public class TestMain {
	public static void main(String[] args) {
        Bean1 b1 = new Bean1();
		b1.setAge(1);
		b1.setBirthday(new Date());
		b1.setName("aaaaa");
		Bean2 b2 = new Bean2();
		b2.setAge(8);
		b2.setName("bbbb2222");
		b1.setBean2(b2);
		
		
		Bean1 b12 = new Bean1();
		BeanUtils.copyProperties(b1, b12);
		
//	    byte[] srcByte = SerializationUtils.serialize(b1);
//	    Bean1 b12 = (Bean1)SerializationUtils.deserialize(srcByte);
//	    
//		String srcStr = JSONObject.toJSONString(b1);
//		Bean1 b12 = JSON.parseObject(srcStr, Bean1.class);
		
		b12.setAge(b12.getAge() + 2);
		b12.setName(b12.getName() + "ppppp");
		b12.getBean2().setName(b12.getBean2().getName() + "yyy");
		System.out.println(b1.toString());
		System.out.println(b12.toString());
		/*		
		Bean1 b11 = new Bean1();
		b11.setAge(1);
		b11.setBirthday(new Date());
		b11.setName("aaaaa");
		
		Bean1 b2 = new Bean1();
		b2.setAge(1);
		b2.setBirthday(new Date());
		b2.setName("aaaaa");
		
		Map map1 = new HashMap<String,String>();
		Map map2 = new HashMap<String,String>();
		try {
			map1 = BeanUtils.describe(b1);
			map2 = BeanUtils.describe(b2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map1.equals(map2));
		System.out.println(map1 == map2);
		System.out.println("=================");
		System.out.println(b1.toString());
		System.out.println(b11.toString());
		System.out.println(b1.toString().equals(b11.toString()));
		System.out.println(b1.toString() == b11.toString());*/
	}
}
