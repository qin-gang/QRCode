package com.nuc.str;

import java.io.File;
import java.io.FileReader;
import java.util.Random;

public class TestMath {
    public static void main(String[] args) {
        System.out.println(Math.random()*10);

        Random random = new Random();
        System.out.println(random.nextInt());

        File file = new File("D:/aa.txt");

    }
}
