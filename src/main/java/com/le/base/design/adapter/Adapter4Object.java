package com.le.base.design.adapter;

public class Adapter4Object implements Target{

  private Adaptee adaptee ;
  public Adapter4Object() {
      super();
      this.adaptee = new Adaptee();
  }
  
 
  public static void main(String args[]){
      Target target = new Adapter4Object(); 
      target.getHeadset2();
  }


  public void getHeadset2() {
    adaptee.getHeadset3();
  }
}
