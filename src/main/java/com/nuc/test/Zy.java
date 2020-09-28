package com.nuc.test;

public class Zy {
    public static void main(String[] args) {
        int i = tryTest();
        System.out.println(i);
    }

    static int tryTest(){
        try {
            return 1;
        }catch (Exception e){
             e.printStackTrace();
        }finally {
            return 2;
        }
    }
}
