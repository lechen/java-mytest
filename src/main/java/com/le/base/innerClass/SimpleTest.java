package com.le.base.innerClass;

public class SimpleTest {
   private boolean beep;
   private int interval;
   
   private class TimePrinter{
     public void getParam(){
       System.out.println(beep);
     }
   }
   
   public static void main(String[] args) {
     SimpleTest st = new SimpleTest();
//     TimePrinter tp = new TimePrinter();
//     tp.getParam();
  }
}

 class Test{
   private int b;
   public static void main(String[] args) {
    System.out.println("----------");
  }
}