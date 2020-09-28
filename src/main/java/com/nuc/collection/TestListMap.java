package com.nuc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestListMap {
    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("q1",123);
        map.put("q2",456);

        Set<Object> objects = map.keySet();
        System.out.println("======================set中key遍历======================");
        for(Object obj:objects){
            System.out.println(obj+"\t"+map.get(obj));
        }

        System.out.println("===================set中entry遍历=======================");
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry<Object,Object> e:entries){
            System.out.println(e.getKey()+"\t"+e.getValue());
        }

    }
}
