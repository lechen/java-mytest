package com.le.base.data.sort;

/**
 * 冒泡
 * @author LE
 *
 */
public class BubbleSort {
  
  public static void main(String[] args) {
    int data [] = { 9, 66, 7, 19, 100, 97, 63, 208, 55, 78 };
    BubbleSort.sort(data);
    for (int i : data) {
      System.out.print(i + ",");
    }
  }
  
  public static void sort(int [] data){
    for (int i = 0; i < data.length -1; i++){    //最多做n-1趟排序  
      for(int j = 0 ;j < data.length - i - 1; j++){    //对当前无序区间score[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)  
          if(data[j] < data[j + 1]){    //把小的值交换到后面  
              int temp = data[j];  
              data[j] = data[j + 1];  
              data[j + 1] = temp;  
          }  
      }              
  }
  }
}
