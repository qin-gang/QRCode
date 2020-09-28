package com.nuc.collection;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<Object> objects = new HashSet<>();
        objects.add(new User("q1","m"));
        objects.add(new User("q1","m"));
        objects.add(new User("q2","s"));
        objects.size();
        objects.contains("ss");
        System.out.println(objects);
    }
}
