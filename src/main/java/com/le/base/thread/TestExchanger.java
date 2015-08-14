package com.le.base.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class TestExchanger {
  public static void main(String[] args) {
    final Exchanger<List<Integer>> ex = new Exchanger<List<Integer>>();
    new Thread(
          new Runnable() {
            public void run() {
              List<Integer> list = new ArrayList<Integer>(2);
              list.add(1);
              list.add(2);
              try {
                list = ex.exchange(list);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
              System.out.println("Thread1 : " + list);
            }
          }
        ).start();
    
    new Thread(
        new Runnable() {
          public void run() {
            List<Integer> list = new ArrayList<Integer>(2);
            list.add(4);
            list.add(5);
            try {
              list = ex.exchange(list);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }
            System.out.println("Thread2 : " + list);
          }
        }
      ).start();
  }
}
