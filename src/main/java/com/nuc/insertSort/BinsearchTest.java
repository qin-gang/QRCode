package com.nuc.insertSort;

import java.util.Arrays;

public class BinsearchTest {

    public int binsearch(int[] arr,int val){
        int low =0;
        int high = arr.length -1 ;
        while (low <= high){
            int mid = (low + high)/2;  //中间位置每一循环都在变化
            if (val == arr[mid]){
                return mid;
            }
            if (val > arr[mid]){
                low = mid + 1;
            }
            if (val <arr[mid]){
                high = mid -1;
            }
        }
       return -1;
    }

    public static void main(String[] args) {
        BinsearchTest binsearchTest = new BinsearchTest();
        int[] arr={2,34,4,5,6,8,9,0,1};
        Arrays.sort(arr);
        int[] arr2={0,1,2,3,4,5,6,7,8,9};
        System.out.println();;

        int binsearch = binsearchTest.binsearch(arr2, 8);
        System.out.println("查找结果------》》》》"+binsearch);
    }
}
