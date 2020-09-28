package com.nuc.lday02;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class LeetCode2 {

    public static boolean isValid2(String s) {
        //字符串不符合合法的范围
        if (s.length() == 0 || s.length()%2!=0){
            System.out.println("进入s.length() == 0 || s.length()%2!=0 ========================");
            return false;
        }
        //对于数量符合的字符串进行判断
        int strLen = s.length();
        for (int i=0;i<strLen/2;i++){
            Character prech = s.charAt(i);
            Character lastch = s.charAt(strLen - 1 - i);
            System.out.println("prech-->>"+prech+",lastch"+lastch);
            //()情况
            if (prech.equals('(')){
                if (!lastch.equals(')')){
                    return false;
                }
            }
            //{}情况
            if (prech.equals('{')){
                if (!lastch.equals('}')){
                    return false;
                }
            }
            //[]情况
            if (prech.equals('[')){
                if (!lastch.equals(']')){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid3(String s) {
        LinkedList <Character> stack = new LinkedList<>();
        for (char c: s.toCharArray()){
            if (c == '[')stack.push(']');
            else if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop())
                return false;
        }
        return stack.isEmpty();
    }

    public static boolean isValid(String s) {
        if (s == null || s.length() ==0 ) return true;
        Map map = new HashMap();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        Deque<Character> deque = new ArrayDeque<>();
        for (char c:s.toCharArray()){
            if (c=='(' || c=='[' || c=='{' ){
                deque.push(c);
            }else {
                if (deque.size()==0 || map.get(c) != deque.pop() ) return false;
            }
        }
        return deque.size() == 0 ;
    }

    public static void main(String[] args) {
        boolean valid = isValid("{[]}{}[]");
        System.out.println(valid);

    }
}
