package com.nuc.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCall {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable myCallable = new MyCallable();
        FutureTask futureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        System.out.println(futureTask.get());
        System.out.println(futureTask.isDone());

    }
}
