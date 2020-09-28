package com.nuc.test;

public class Sushu {

    public boolean isShu(int a){
        if (a == 1 || a==2) return true;
        if (a<= 0) return false;
        for(int i=2;i<a/2;i++){
            if (a%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Sushu sushu = new Sushu();
        boolean shu = sushu.isShu(0);
        System.out.println("是否是素数："+shu);

    }
}
