package com.le.base.design.factory;

interface ISample {

}

class SampleA implements ISample{
  
}
class SampleB implements ISample{
  
}

public class SampleFactory{
  public static ISample creator(int flag){
    if (flag == 1) {
      return new SampleA();
    }else {
      return new SampleB();
    }
  }
  
  public static void main(String[] args) {
    ISample sampleA = SampleFactory.creator(1);
  }
}