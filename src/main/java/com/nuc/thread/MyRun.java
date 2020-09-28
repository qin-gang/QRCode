package com.nuc.thread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyRun implements Runnable {
    @Override
    public void run() {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("D:/s"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("myThread-------");
    }
}
