package com.le.base.design.proxy;

/**
 * 代理类
 * @author LE
 *
 */
public class ProxyClass implements IPublicInterface{

	//声明公共接口为代理来的属性
	private IPublicInterface publicInterface;
	
	//未指定代理对象，默认代理ProxyClass1
	public ProxyClass(){
		this.publicInterface = new PassivityClass1();
	}
	
	//指定被代理对象
	public ProxyClass(IPublicInterface publicInterface){
		this.publicInterface = publicInterface;
	}
	
	public void method1() {
		publicInterface.method1();
	}

	public void method2() {
		publicInterface.method2();
	}

}
