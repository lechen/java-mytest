package com.le.base.suanfa.sort;

/**
 * 插入排序，
 * 由N-1趟组成，从p=1到N-1趟，保证从位置0到位置p上的元素为已排序状态。
 * @author LE
 *
 */
public class InsertionSort {
  public static void main(String[] args) {
    int [] array = {34,8,64,51,32,21};
    
    for (int p = 1;  p < array.length; p++) {
      int temp = array[p];
      int i;
      for ( i = p; i > 0 && temp < array[i - 1]; i--) {
        array[i] = array[i - 1];
      }
      array[i] = temp;
    }
    System.out.println(array);
  }
  
  
}
