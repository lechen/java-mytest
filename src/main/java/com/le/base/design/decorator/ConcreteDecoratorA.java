package com.le.base.design.decorator;

public class ConcreteDecoratorA extends Decorator {
  public ConcreteDecoratorA(Component component) {
    super(component);
  }

  public void sampleOperation() {
    super.sampleOperation();
    // 写相关的业务代码
  }
}
