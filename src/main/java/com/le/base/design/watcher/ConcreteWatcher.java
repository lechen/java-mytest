package com.le.base.design.watcher;

/**
 * 具体的观察者
 * @author LE
 *
 */
public class ConcreteWatcher implements Watcher{

  public void update(String str) {
    System.out.println(str);
  }

}
