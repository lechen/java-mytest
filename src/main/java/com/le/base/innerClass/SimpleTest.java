package com.le.base.innerClass;

import com.le.base.innerClass.SimpleTest.TimePrinter;

public class SimpleTest {
   private boolean beep;
   private int interval;
   
   /**
    * 内部类
    * @author LE
    *
    */
   public class TimePrinter{
     public int a = 10;
     private int b = 20;
     public void getParam(){
       System.out.println(SimpleTest.this.beep);
       //等价于
       System.out.println(beep);
     }
   }
   
   /**
    * 局部内部类
    * @param interval
    * @param beep
    */
   public void start(int interval, final boolean beep){
     int c = 0;
     class TimePrinter{
       public void test(){
         System.out.println(beep);
       }
     }
   }
   
   /**
    * 匿名内部类
    */
   public void nameless(){
     System.out.println("______in method");
     new ActionListenner() {
      public void actionPerformed(String name) {
        System.out.println("---------nameless : " + beep);
      }
    };
   }
   
   public static void main(String[] args) {
     int [] values = {0,1,2,3,4,5,};
     int max = values[0];
     int min = values[0];
     for (int i : values) {
      if (max > i) max = i;
      if (min < i) min = i;
    }
     System.out.println("max = " + max + "\n min = " + min);
     
//     SimpleTest outter = new SimpleTest();
//     outter.nameless();
//     TimePrinter inner = outter.new TimePrinter();
//     System.out.println(inner.a);
//     System.out.println(inner.b);
//     inner.getParam();
  }
}
//
// class Test{
//   private int b;
//   public static void main(String[] args) {
//     SimpleTest outter = new SimpleTest();
//     TimePrinter inner = outter.new TimePrinter();
//     System.out.println(inner.a);
//     //
////     System.out.println(inner.b);
//     inner.getParam();
//  }
//}