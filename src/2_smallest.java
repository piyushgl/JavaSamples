import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    int arr1[] = {1,2,3,4};
    int arr2[] = {3,4,5,1,2,3};
    int arr3[] = {4,5,1,2,3,4};
    
    System.out.println(findMin(arr1));
    System.out.println(findMin(arr2));
    System.out.println(findMin(arr3));
                                          
  }
                       
  static int findMin(int arr[]){
    //int min = arr[0];
    int temp = 0;
    for(int j=0 ; j<arr.length ; j++){
    for( int i =1; i< (arr.length - j) ; i++){
      if( arr[i] < arr[i-1]){
        temp = arr[i];
        arr[i] = arr[i-1];
        arr[i-1] = temp;
      }
    }
      
    }
    return arr[1];
  }
                       
}
