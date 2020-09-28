package com.nuc.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("wwwwwwww");
        return 1;
    }
}
