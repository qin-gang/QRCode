package com.nuc.collection;

import org.apache.commons.lang3.ObjectUtils;

import java.util.TreeMap;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeMap<Object,Object> objects = new TreeMap<>();
        User user = new User("q1","m");
        User user1 = new User("q2", "dd");

        objects.put(user,"qq");
        objects.put(user1,"oo");
        System.out.println(objects.size());
        System.out.println(objects);
    }
}
