package com.le.base.design.single;

/**
 * 
 * @author LE
 *  饿汉
 */
public class Singleton {
  private Singleton(){}
  private static Singleton instance = new Singleton();
  public static Singleton getInstance() {
    return instance;
  }
}

/**
 * 懒汉1
 * @author LE
 *
 */
class Singleton2 {
  private Singleton2(){}
  private static Singleton2 instance = null;
  public static synchronized Singleton2 getInstance() {
    if (instance == null) {
      instance = new Singleton2();
    }
    return instance;
  }
}