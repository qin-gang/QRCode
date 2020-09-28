package com.nuc.thread;

import java.util.Timer;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class testThread {
    public void main(String[] args) throws Exception {
        MyRun myRun = new MyRun();
        new Thread(myRun).start();

        String s="aaaaaaaaaaaaa";
        System.out.println("");
        System.out.println("---------main");

        System.out.println("=====================================");

        Thread thread = Thread.currentThread();
        thread.sleep(10);

        Lock lock = new ReentrantLock();

        Timer timer = new Timer();

        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(thread.toString());
    }
}
