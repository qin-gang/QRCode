package com.nuc.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class TestColl {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        Iterator<Object> iterator1 = objects.iterator();
        ListIterator<Object> objectListIterator = objects.listIterator();
        System.out.println(objectListIterator.hasNext());
        System.out.println(objectListIterator.hasPrevious());

        System.out.println("=======================");
        ArrayList<Object> objects1 = new ArrayList<>();
        System.out.println(objects1.hashCode());
        objects1.add("qg1");
        objects1.add("qg2");
        objects1.add("qg3");
        objects1.add(1,"java");
        System.out.println(objects1);
        System.out.println("======>>"+(4>>1));

        Object o = objects1.get(2);

    }
}
