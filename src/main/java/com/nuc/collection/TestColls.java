package com.nuc.collection;

import javax.jws.Oneway;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestColls {
    public static void main(String[] args) {
        //集合转数组
        ArrayList<Object> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        Object[] objects = list.toArray();
        for (Object obj:objects){
            System.out.println(obj);
        }

        Object[] strs=new Object[10];
        Object[] objects1 = list.toArray(strs);
        for (Object obj:objects1){
            System.out.println(obj);
        }

        //数组转集合
        int[] nums={1,2,3,4};
        List<int[]> ints = Arrays.asList(nums);
        System.out.println(ints.toString());

        Integer[] integer = new Integer[] {10,20,30};
        List<Integer> integers = Arrays.asList(integer);
        System.out.println(integers);

        Collections.synchronizedList(list);
    }
}
