package com.nuc.collection;

import java.util.Comparator;

public class MyCompare implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1 ;
        String s2 = (String) o2;
        return s1.length()-s2.length();
    }


}
