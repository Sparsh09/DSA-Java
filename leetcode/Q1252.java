package com.leetcode;

import java.util.Arrays;

public class Q1252 {
    public static void main(String[] args){
        int[][] ar = new int[][] {{1,1},{0,0}};
        System.out.println(oddCells(2,2,ar));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] nar = new int[m][n];
        for (int[]arr:indices) {
            int rIndice = arr[0];
            int cIndice = arr[1];
            nar = increaseValue(nar, rIndice , cIndice , m , n);
        }

        return countOdd(nar);
    }

    public static int[][] increaseValue(int[][] arr, int r , int c, int m , int n) {
        for(int i =0 ; i < n; i++){
            arr[r][i]+=1;
        }
        for(int i =0 ; i < m; i++){
            arr[i][c]+=1;
        }
        return arr;
    }
    public static int countOdd(int[][] arr){
        int count = 0;
        for(int[] ar: arr){
            for (int n: ar) {
                if(n % 2 == 1){
                    count++;
                }
            }
        }
        return count;

    }

}
