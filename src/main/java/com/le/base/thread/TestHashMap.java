package com.le.base.thread;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashMap {
	private HashMap<String,Integer> map = new HashMap<String,Integer>();
	private ConcurrentHashMap<String, Integer> cMap = new ConcurrentHashMap<String, Integer>();
	public synchronized void add(String key){
		Integer value = map.get(key);
		if (value == null) {
			map.put(key, 1);
		}else{
			map.put(key, value + 1);
		}
	}
	
	public void cAdd(String key){
		Integer value = cMap.get(key);
		if (value == null) {
			cMap.put(key, 1);
		}else{
			cMap.put(key, value + 1);
		}
	}
	
	public static void main(String[] args) {
		TestHashMap testMap = new TestHashMap();
		testMap.add("1");
		System.out.println(testMap.map);
		
		testMap.cAdd("1");
		System.out.println(testMap.cMap);
		
		
	}
	
	
}
