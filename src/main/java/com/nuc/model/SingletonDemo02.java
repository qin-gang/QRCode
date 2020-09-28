package com.nuc.model;

/***
 * 测试懒汉式 单例模式
 *
 *
 */
public class SingletonDemo02 {

    //类初始化，不初始化这个对象（延时加载  真正调用时才加载）
    private static SingletonDemo02 singletonDemo02 = null;

    //私有化构造器
    private SingletonDemo02(){

    }

    //方法同步，调用效率低
    public static synchronized SingletonDemo02 getInstance(){
        if (singletonDemo02 == null){
            singletonDemo02 = new SingletonDemo02();
        }
        return singletonDemo02;
    }

}
