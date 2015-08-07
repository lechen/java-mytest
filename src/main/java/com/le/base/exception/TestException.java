package com.le.base.exception;

public class TestException {
	public static void main(String[] args) {
		TestException te = new TestException();
		te.method0();
		System.out.println("++++++" );
	}
	
	private void method0() {
		for (int i = 0; i < 5; i++) {
			try {
				method1();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("--------i = " + i);
		}


	}
	
	public int method1()  throws Exception{
		System.out.println("1111aaaaaaaa");
		method2();
		System.out.println("1111bbbbbbbb");
		return 1;
	}
	public void method2() throws Exception{
//		try {
			System.out.println("222222aaaaaaaa");
//			method3();
			throw new Exception("22222XXXXXXX");
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}
	public void method3(){
		try {
			System.out.println("333333aaaaaaaa");
		} catch (Exception e) {
			
		}
	}
}
