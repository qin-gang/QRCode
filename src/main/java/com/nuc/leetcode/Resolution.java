package com.nuc.leetcode;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;

class Solution {

    //数字字符串的反转
    public static int reverse(int x) {
        if (x> Integer.MIN_VALUE && x< Integer.MAX_VALUE){
            String s = String.valueOf(x);
            char[] chars = s.toCharArray();
            //实现反转
            for (int i=0;i<chars.length/2;i++){
                char temp ;
                temp = chars[i];
                chars[i]=chars[chars.length-i-1];
                chars[chars.length-1-i] = temp;
            }
            StringBuilder sb = new StringBuilder();
            if (x>=0){
                for (int i=0;i<chars.length;i++){
                    sb.append(chars[i]);
                }
                //正数
                String s1 = sb.toString();
                try{
                    return Integer.parseInt(s1);
                }catch (NumberFormatException e){
                    e.printStackTrace();
                }
            }else{
                for (int i=0;i<chars.length-1;i++){
                    sb.append(chars[i]);
                }
                //负数
                String s1 = sb.toString();
                String s2 = '-' + s1;
                try {
                    return Integer.parseInt(s2);
                }catch (NumberFormatException e){
                    e.printStackTrace();
                }
            }
        }
        return 0;
    }

    //俩个数求和-----暴力法
    public static int[] twoSum(int[] nums, int target) {
        int aa[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1; j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    aa[0]=i;
                    aa[1]=j;
                    break;
                }
            }
        }
        return aa;
    }

    //俩个数求和------map方法
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map
                = new HashMap<>();
        //把所有元素放入map集合
        for (int i =0 ;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for (int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            if (map.containsKey(temp)&&(map.get(temp)!=i)){
                return new int[]{i,map.get(temp)};
            }
        }
        throw new IllegalArgumentException("having exception!!!!");
    }

    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println(reverse);

        int i= Integer.MAX_VALUE;

        System.out.println("Java中int类型的最大值"+i);
        //int i1 = Integer.parseInt("2147483648");
        //System.out.println(i1);
//        String s = "1534236469";
//        StringBuilder stringBuilder = new StringBuilder(s);
//        String s1 = stringBuilder.reverse().toString();
//        int i = Integer.parseInt(s1);
//        System.out.println(i);
    }
            }
