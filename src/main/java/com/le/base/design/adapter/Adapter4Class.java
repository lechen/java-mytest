package com.le.base.design.adapter;

public class Adapter4Class extends Adaptee implements Target{

  public void getHeadset2() {
    this.getHeadset3();
  }

  public static void main(String args[]){
    Target target = new Adapter4Class(); 
    target.getHeadset2();
  }
}
