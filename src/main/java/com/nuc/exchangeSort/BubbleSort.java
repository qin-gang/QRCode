package com.nuc.exchangeSort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    void bubbleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }


    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr={9,1,2,5,3,7,8,6,4};
        System.out.println(arr.length);
        bubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
