package com.le.base.suanfa.sort;

/**
 * 
 * @author LE
 *
 */
public class QuickSort {
  public static void quickSort(int[] array){  
    if(array != null){  
        quickSort(array, 0, array.length-1);  
    }  
  }  
  
  private static void quickSort(int[] array,int beg,int end){  
      if(beg >= end || array == null)  
          return;  
      int p = partition(array, beg, end);  
      quickSort(array, beg, p-1);  
      quickSort(array, p+1, end);  
  }  
  
  private static int partition(int[] array, int beg, int end) {  
    int first = array[beg];  
    int i = beg, j = end;  
    while (i < j) {  
        while (array[i] <= first && i < end) {  
            i++;  
        }  
        while (array[j] > first && j >= beg) {  
            j--;  
        }  
        if (i < j) {  
            array[i] = array[i] ^ array[j];  
            array[j] = array[i] ^ array[j];  
            array[i] = array[i] ^ array[j];  
        }  
    }  
    if (j != beg) {  
        array[j] = array[beg] ^ array[j];  
        array[beg] = array[beg] ^ array[j];  
        array[j] = array[beg] ^ array[j];  
    }  
    return j;  
  }  
  
  /**
   * 第二种partition
   * @author LE
   * @param array
   * @param beg
   * @param end
   * @return
   */
  private static int partition2(int[] array,int beg,int end){  
    int last = array[end];  
    int i = beg -1;  
    for (int j = beg; j <= end-1; j++) {  
        if(array[j] <= last){  
            i++;  
            if(i != j){  
                array[i] = array[i]^array[j];  
                array[j] = array[i]^array[j];  
                array[i] = array[i]^array[j];  
            }  
        }  
    }  
    if((i+1) != end){  
        array[i+1] = array[i+1]^array[end];  
        array[end] = array[i+1]^array[end];  
        array[i+1] = array[i+1]^array[end];  
    }  
    return i+1;  
  }  

}
