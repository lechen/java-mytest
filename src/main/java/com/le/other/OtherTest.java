package com.le.other;

import java.util.HashMap;
import java.util.Map;

public class OtherTest {
  public static void main(String[] args) {
//    int[] array = {0,1,2,3,5,7,9};
    Map map = new HashMap();
    map.put(null, "aa");
    map.put(null, "bb");
    map.put(null, null);
    map.put(null, null);
    map.put("3", null);
    System.out.println(map);
//    System.out.println(map.get("3"));
  }
  
}
