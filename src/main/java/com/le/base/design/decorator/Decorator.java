package com.le.base.design.decorator;

public class Decorator implements Component{

  private Component component;
  
  public Decorator(Component component){
      this.component = component;
  }

  public void sampleOperation() {
      // 委派给构件
      component.sampleOperation();
  }

}
