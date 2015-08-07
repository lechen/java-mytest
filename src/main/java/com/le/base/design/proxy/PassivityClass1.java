package com.le.base.design.proxy;

/**
 * 被代理类1
 * @author LE
 *
 */
public class PassivityClass1 implements IPublicInterface{

	public void method1() {
		System.out.println(this.getClass().getName() + " method1");
	}

	public void method2() {
		System.out.println(this.getClass().getName() + " method2");
	}

}
