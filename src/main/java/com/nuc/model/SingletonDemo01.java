package com.nuc.model;

/**
 * 测试饿汉式单例模式
 */
public class SingletonDemo01 {

    private static SingletonDemo01 singletonDemo01=new SingletonDemo01();  //立即加载,static加载类是天然的线程安全，但是不能延迟加载

    private SingletonDemo01(){

    }

    public static SingletonDemo01 getInstance(){
        return singletonDemo01;
    }


}
