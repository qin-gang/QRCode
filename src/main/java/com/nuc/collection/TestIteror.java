package com.nuc.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIteror {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("q1");
        list.add("q2");
        list.add("q3");
        list.add("q4");
        ListIterator listIterator = list.listIterator();
        System.out.println("=====================正向迭代==================");
        while (listIterator.hasNext()){
            String str=(String) listIterator.next();
            if ("q2".equals(str)){
                listIterator.add("222");
            }
            System.out.println(str);

        }
        System.out.println("==================反向迭代======================");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
