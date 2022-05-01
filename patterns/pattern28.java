package com.patterns;

public class pattern28 {
    public static void main(String[] args) {
        int n = 5;
        for(int row =1 ; row <= 2 *n ; row++){
            int totalCols = row > n ? 2 * n - row : row;

            int space = n - totalCols;

            for(int col = 0; col < space; col++){
                System.out.print(" ");
              }
            for(int col = 0; col <  totalCols ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
