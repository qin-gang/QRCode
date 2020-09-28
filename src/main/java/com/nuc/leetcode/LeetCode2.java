package com.nuc.leetcode;

public class LeetCode2 {




    //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    public static boolean isPalindrome(int x) {
        if (x>Integer.MIN_VALUE && x<Integer.MAX_VALUE){
            //反转前
            String s = Integer.toString(x);
            System.out.println("s------->>>>"+s);
            //反转操作
            StringBuffer sb = new StringBuffer(s);
            StringBuffer reverseStr = sb.reverse();
            String s1 = reverseStr.toString();
            System.out.println("s1反转后------>>>"+s1);
            //判断
            if (s1.equals(s)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        boolean flag = isPalindrome(121);
        System.out.println(flag);

        System.out.println("=============");
        String s1="121";
        String s2="121";
        System.out.println(s1.equals(s2));
    }
}
