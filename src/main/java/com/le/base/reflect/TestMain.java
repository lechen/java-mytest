package com.le.base.reflect;

import java.lang.reflect.Field;

public class TestMain {
  public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
//    Stu2 s2 = new Stu2();
    Stu1 s1 = new Stu1();
    s1.setId(1);
    s1.setSex(true);
    s1.setStuName("tom");
    Stu2 s2 = (Stu2)Obj2ObjUtils.getInstance().convert(s1, new Stu2());
    System.out.println(s2);
  }
}
