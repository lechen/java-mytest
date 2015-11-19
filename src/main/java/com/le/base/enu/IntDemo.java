package com.le.base.enu;

public enum IntDemo {
  a(1),b(2),c(3);
  private int val;
  private IntDemo(int val){
    this.val = val;
  }
  
  public int getVal(){
    return this.val;
  }
}
