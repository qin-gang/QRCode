package com.nuc.selectSort;

import java.util.Arrays;

public class SimpleSelectSort {

    public void sort(int[] arr){
        int min ;
        int temp ;
        for(int i=0;i<arr.length-1;i++){
            min = arr[i];
            for (int j=i+1;j<arr.length;j++){
                if (min>arr[j]){
                    temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            }
            arr[i] = min;
        }
    }


    public static void main(String[] args) {
        SimpleSelectSort simpleSelectSort = new SimpleSelectSort();
        int arr[] ={9,8,7,6,5,4,3};
        simpleSelectSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
