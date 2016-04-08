package com.le.base.data.sort;

import java.util.Arrays;

/**
 * 
 * @author LE
 *
 */
public class QuickSort {
  private static int partition(int data[],int low,int high){//分治  
    int key = data[low];  
//    int key = data[(low + high)/2 + 1];  
    while(low<high){  
        //从右向左  
        while(low<high && data[high]>key){
          high--;  
        }
        data[low] = data[high];  
              
        //从左向右  
        while(low<high && data[low]<key){
          low++;  
        }
        data[high] = data[low];  
    }  
    data[low] = key;//把轴元素放在轴所在地位置  
    return low;//返回轴所在的位置  
  }  
  
  private static void quickSort(int data[],int low,int high){//递归  
      int q;  
      if(low<high){  
           q = partition(data,low,high);  
           quickSort(data,q+1,high);  
           quickSort(data,low,q-1);  
      }  
  }  
  
  /**
   * 最优
   * @author LE
   * @param data
   * @param low
   * @param hight
   */
  private static void quickSort2(int data[], int low, int hight){
    int i=low,j=hight;
    int mid=data[(low+hight)/2 + 1];
    while(i <= j){
      while(data[i]<mid) i++;
      while(data[j]>mid) j--;
      if(i<=j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
        i++;
        j--;
      }
    }
    if(i<hight) quickSort2(data, i, hight);
    if(j>low) quickSort2(data, low, j);
  }
  
  public static void main(String[] args) {
    int[] a = {34,8,64,51,32,21};
//    quickSort(array);
//    System.out.println(array);
    
//    int a[] = new int[]{1,4,6,2,3,5,7};  
    quickSort2(a,0,a.length -1);  
    System.out.println(Arrays.toString(a));  
  }

}
