package com.le.other;

import java.util.Hashtable;
import java.util.Map;

public class OtherTest {
  public static void main(String[] args) {
    Map<Object,Object> hashtable = new Hashtable<Object,Object>(); 
//    hashtable.put(null, "a");
    hashtable.put("a", "a");
    System.out.println(hashtable);
  }
}
