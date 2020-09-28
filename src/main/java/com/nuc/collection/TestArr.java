package com.nuc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class TestArr {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};


        int[] arr2=new int[50];
        System.arraycopy(arr, 1, arr2, 1 + 1,
                arr.length - 1);
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr.length);

        LinkedList<Object> linkedList = new LinkedList<>();

    }
}
