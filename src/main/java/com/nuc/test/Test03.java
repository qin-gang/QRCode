package com.nuc.test;

public class Test03 {
    public static void main(String[] args) {
        char aa= 'a';
        char AA =(char) ( aa ^ 32);

        String a= "sasa";

        String ch="qg is good boy!";

        char c = ch.charAt(3);
        System.out.println(c);
        int length = ch.length();
        System.out.println(length);

        byte[] bytes = ch.getBytes();
        char[] des=new char[20];
        ch.getChars(1,2,des,2);

        System.out.println(AA);
    }
}
