package com.nuc.collection;

import java.util.HashMap;
import java.util.Hashtable;

public class TestMap {
    public static void main(String[] args) {
        /**
         * HashMap与Hashtable
         * 1、版本不同
         * 2、继承安排
         * 3、HashMap允许有空值，Hashtable非null的键值
         * 4、线程同步
         */
        HashMap<Object, Object> map = new HashMap<>();
        Hashtable<Object, Object> hashtable = new Hashtable<>();

    }
}
