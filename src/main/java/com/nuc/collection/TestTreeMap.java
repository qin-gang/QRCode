package com.nuc.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        MyCompare myCompare = new MyCompare();
        TreeMap<Object, Object> tr = new TreeMap<>();
        tr.put("qg1111","21212");
        tr.put("qg00000","21");
        System.out.println(tr);



        HashMap<Object, Object> map = new HashMap<>();
        map.put(null,"123");
        //System.out.println(map);

        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("lp","qwqw");
        //System.out.println(hashtable);

    }
}
