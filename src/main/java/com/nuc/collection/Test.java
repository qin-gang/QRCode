package com.nuc.collection;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int i=0;
        test.f(i);
        i=i++;
        System.out.println(i);
    }
    void f(int i){
        i++;
        System.out.println(i);
    }
}
