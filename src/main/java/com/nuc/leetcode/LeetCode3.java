package com.nuc.leetcode;

public class LeetCode3 {

    //罗马数字转整数
    public static int romanToInt(String s) {
        int sum = 0;
        char c = s.charAt(0);
        int preVal = getValue(c);
        for (int i=1;i<s.length();i++){
            int num = getValue(s.charAt(i));
            if (preVal < num){
                sum -= preVal;
            }
            if (preVal >= num){
                sum += preVal;
            }
            preVal =num;
            System.out.println("sum---->"+sum);
        }
     sum += preVal;
     return sum;
    }

    //菜单
    private static int getValue(char ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        int iv = romanToInt("MCMXCIV");
        System.out.println(iv);
    }
}
