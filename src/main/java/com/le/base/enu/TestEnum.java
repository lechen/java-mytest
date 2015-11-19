package com.le.base.enu;

public class TestEnum {
	public static void main(String[] args) {
	  
	for (ColorValues colorValues : ColorValues.values()) {
        System.out.println("第" + (colorValues.ordinal() + 1) + "个枚举是："
                + colorValues.name());
        System.out.println("此枚举的值为：" + colorValues.getDescription());
        System.out.println("此枚举和枚举BLUE比较的值为："
                + colorValues.compareTo(colorValues.BLUE));
        System.out.println("用'equals()方法'判断此枚举是否和枚举BLUE相等为："
                + colorValues.equals(colorValues.BLUE));
        System.out.println("用'== '的形式判断此枚举是否和枚举BLUE相等为："
                + (colorValues == colorValues.BLUE));
        System.out.println(colorValues.getDeclaringClass());
        System.out
                .println("========================================================");

    }
	  
//		WeekDay1 w1 = WeekDay1.MON;
//		System.out.println(w1.toString());
//		System.out.println(w1.nextDay());
		
//	  System.out.println(WeekDay.MON);
		
//		TrafficLamp t1 = TrafficLamp.GREEN;
//		System.out.println(t1.nextLamp());
//		System.out.println(t1.nextLamp().name());
//		System.out.println(t1.nextLamp().getClass().getName());
	  
//	  System.out.println(IntTest.a.getVal());
	}
}
