package com.le.base.data.structure.sort;

public class MySort {
	
	static int array [] = { 9, 2, 7, 19, 100, 97, 63, 208, 55, 78 };
	public static void main(String[] args) {
		MySort ms = new MySort();
		//ms.insertSort();
		ms.choiceSort();
	}
	
	public void choiceSort(){
		for (int i = 0; i < array.length; i++) {
			//默认当前为最小值索引
			int min = i;
			//寻找最小值的索引
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			
			//交换当前值和最小值位置
			if (min != i) {
				int tem = array[min];
				array[min] = array[i];
				array[i] = tem;
			}
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void insertSort(){
		int tem;
		int j = 0;
		
		for (int i = 0; i < array.length; i++) {
			tem = array[i];
			j = i - 1;
			while (j >=0 && tem < array[j]) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = tem;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
