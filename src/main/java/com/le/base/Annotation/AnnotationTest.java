package com.le.base.Annotation;

@MyAnnotation(color = "red", arrayAttr = { 0 })
public class AnnotationTest {
	public static void main(String[] args) {
		if (AnnotationTest.class.isAnnotationPresent(MyAnnotation.class)) {
			System.out.println(true);
			MyAnnotation myAn = AnnotationTest.class.getAnnotation(MyAnnotation.class);
			System.out.println(myAn.color());
			System.out.println(myAn.arrayAttr());
		}
	}
}
