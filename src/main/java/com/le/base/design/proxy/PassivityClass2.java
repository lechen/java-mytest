package com.le.base.design.proxy;

/**
 * 被代理类2
 * @author LE
 *
 */
public class PassivityClass2 implements IPublicInterface{

	public void method1() {
		System.out.println(this.getClass().getName() + " method1");
	}

	public void method2() {
		System.out.println(this.getClass().getName() + " method2");
	}

}
