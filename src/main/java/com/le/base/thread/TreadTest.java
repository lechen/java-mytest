package com.le.base.thread;

public class TreadTest extends Thread{
	public static void main(String[] args) {
		TreadTest t = new TreadTest();
		t.start();
		
		Thread t2 = new Thread(){
			@Override
			public void run() {
				while(true){
					try {
						sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("t2--" + Thread.currentThread().getName());
				}
			}
		};
		t2.start();
		
//		Thread t3 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				while(true){
//					try {
//						sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println("t3--" + Thread.currentThread().getName());
//				}
//			}
//		});
//		t3.start();
		
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				while(true){
//					try {
//						sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println("t3--Runnable--" + Thread.currentThread().getName());
//				}
//			}
//		}){
//			@Override
//			public void run() {
//				while(true){
//					try {
//						sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println("t4--Thread--" + Thread.currentThread().getName());
//				}
//			}
//		}.start();
		
	}
	
	public void run(){
		while(true){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t--" + Thread.currentThread().getName());
		}
		
	}
}
