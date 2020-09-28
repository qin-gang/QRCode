package com.nuc.exchangeSort;

import java.util.Arrays;

public class QuickSort {

    private void quicksort(int arr[], int low, int high){
        if (low > high) return;
        int i,j,temp;
        i = low ;
        j = high;
        temp = arr[low];  //temp为基准位
        while (i<j){
            //基数前边选，先从右边到左边递减
            while (temp <= arr[j] && i<j){
                j--;
            }
            //再看左边 ， 依次往右递增
            while (temp >= arr[i] && i<j ){
                i++;
            }
            //如过没有条件则进行交换
            if (i<j){
                swap(arr,i,j);
            }
            System.out.println(Arrays.toString(arr));
        }
        arr[low] = arr[j];
        arr[j] = temp;
        //递归左右俩边
        quicksort(arr,low,j-1);
        quicksort(arr,j+1,high);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =temp;
    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr={6,5,94,8,2,7,0};
        quickSort.quicksort(arr,0,arr.length-1);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
