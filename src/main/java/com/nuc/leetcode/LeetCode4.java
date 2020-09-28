package com.nuc.leetcode;


public class LeetCode4 {

    public static String longestCommonPrefix(String[] strs) {
      //判断传入的字符串是否为空！！！！
      if (strs == null || strs.length ==0){
          return "";
      }
      String s = strs[0];
      //以字符串数组的第一个字符串为 起点， 不断进行裁剪
      for (int i=1;i<strs.length;i++){
          int j=0;
          for (;j<s.length() && j<strs[i].length() ;j++){
              if (s.charAt(j) != strs[i].charAt(j))
                  break;
          }
          s = s.substring(0, j);
          if (s.equals("")){
              return s;
          }
      }
      return s;
    }

    public static void main(String[] args) {
        String[] string = {"qab","qac","qaf"};
    }
}
