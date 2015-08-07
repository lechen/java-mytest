package com.le.base.design.proxy;

/**
 * 代理模式入口
 * @author Administrator
 *
 */
public class MainProxy {
	public static void main(String[] args) {
		//默认情况
		ProxyClass proxy = new ProxyClass();
		proxy.method1();
		proxy.method2();
		
		//指定被代理对象
		ProxyClass proxy2 = new ProxyClass(new PassivityClass2());
		proxy2.method1();
		proxy2.method2();
		
	}
}
