package com.nuc.insertSort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSortTest {

    public void insertSort(int[] arr){
        int tmp;
        for (int i=1;i<arr.length;i++){    //哨兵索引
            tmp = arr[i];
            int j;
            for (j=i-1;i>=0;j--){
                if (arr[j]>tmp){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
        System.out.println("插入排序后：-------》"+ Arrays.toString(arr));
    }

    public static void main(String[] args) {
        InsertSortTest insertSortTest = new InsertSortTest();
        int[] arr={2,9,8,7,6,5,4,3,2};
        insertSortTest.insertSort(arr);
    }

}
