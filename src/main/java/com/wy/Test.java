package com.wy;

public class Test {

    public static void buildJz(int n){  //建立矩阵的规模
        int i=0,j=0;   //记录坐标
        int flag=0;
        int[][] arr1=new int[n][n];
        int num = 1;      //自增器

         //建立蛇形数组
         for (;i<n;i++){
                for (;j<n;j++){
                    arr1[i][j] = num;
                    num++;
                }
         }



        return;
    }

    public static int sz(int x,int y){

        int num;   //记录数字自增
        return 1;
        //

    }

    public static void main(String[] args) {
        System.out.println(0%2);
    }
}
