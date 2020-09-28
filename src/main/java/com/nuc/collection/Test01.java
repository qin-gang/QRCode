package com.nuc.collection;

import java.io.*;
import java.util.*;

public class Test01 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("1111",111);
        map.put("2222",222);
        map.put("1111",99999);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ss","sss");
        linkedHashMap.get("ss");
        System.out.println(map);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<>();
        objectObjectTreeMap.put("name1","q1");

        int[] arr1 ={1,2,3,4,5};
        int[] arr2 =new int[5];
        System.arraycopy(arr1, 3, arr2, 2, 2);
        System.out.println(Arrays.toString(arr2));

        //FileReader fileReader = new FileReader(new File("d:\\aa.txt"));

    }
}
