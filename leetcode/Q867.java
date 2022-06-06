package com.leetcode;

import java.util.Arrays;

public class Q867 {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,3},{4,5,6}};
        int[][] a = transpose(matrix);
        for(int[] ar : a){
            for(int n : ar){
                System.out.print(n);
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        for(int i =0 ; i < matrix.length ; i++){
            for(int j =0; j < matrix[i].length ; j++){
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
}
