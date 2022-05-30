package com.leetcode;

public class Q1572 {
    public static void main(String[] args) {
        int[][] mat = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
    public static int diagonalSum(int[][] mat) {
        int row = 0;
        int col = 0;
        int sum = 0;
        for(int i = 0;i < mat.length ; i++){
            sum += mat[row++][col++];
        }
        row = mat.length-1;
        col = 0;
        for(int i = 0 ; i < mat.length;i++){
            if(row != col) {
                sum += mat[row--][col++];
            }else {
                row--;
                col++;
            }
        }
        return sum;
    }
}
