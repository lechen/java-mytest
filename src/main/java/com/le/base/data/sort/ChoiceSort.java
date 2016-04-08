package com.le.base.data.sort;

/**
 * 选择sort
 * @author LE
 *  1.从第一个元素开始，每一轮找最小索引；
 *  2.交换最小索引和第一轮的位置；
 *  3.循环以上1、2；
 */
public class ChoiceSort {
	
	static int array [] = { 9, 66, 7, 19, 100, 97, 63, 208, 55, 78 };
	public static void main(String[] args) {
		ChoiceSort.choiceSort();
	}
	
	public static void choiceSort(){
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

}
