package com.le.base.commons.beanUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class TestMain {
	public static void main(String[] args) {
		Bean1 b1 = new Bean1();
		b1.setAge(1);
		b1.setBirthday(new Date());
		b1.setName("aaaaa");
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
		System.out.println(b1.toString() == b11.toString());
	}
}
