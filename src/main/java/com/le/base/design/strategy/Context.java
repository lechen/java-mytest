package com.le.base.design.strategy;

/**
 * 锦囊：放妙计的地方
 * @author Administrator
 *
 */
public class Context {
	private IStrategy strategy;
	
	public Context(IStrategy strategy){
		this.strategy = strategy;
	}
	
	public void operate(){
		strategy.operate();
	}
}
