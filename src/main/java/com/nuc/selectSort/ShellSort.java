package com.nuc.selectSort;

import java.util.Arrays;

public class ShellSort {

    public void shellsort(int[] arr){
        int gap = arr.length /2 ;
        while (gap != 0){
            for (int i=gap ; i<arr.length ; i++){
                int tmp = arr[i];
                int j = i -gap ;
                for (; j>=0 && tmp < arr[j] ; j-=gap){
                    arr[j+gap] = arr[j];
                }
                arr[j+gap]= tmp;    //加回来进行赋值
            }
            gap /=2;
        }
    }



    public static void main(String[] args) {
        int arr[] ={9,8,7,6,5,4,3,2,1};
        ShellSort shellSort = new ShellSort();
        shellSort.shellsort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
