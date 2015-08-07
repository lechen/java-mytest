package com.le.base.design.strategy;

/**
 * 执行策略
 * @author Administrator
 *
 */
public class Main {
	public static void main(String[] args) {
		//拿到锦囊
		Context c = new Context(new StrategyImpl1());
		//执行妙计
		c.operate();
	}
}
