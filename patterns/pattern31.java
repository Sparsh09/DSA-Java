package com.patterns;

public class pattern31 {
    public static void main(String[] args) {
        int orignalN = 4;
        int n = 2 * orignalN;
        for(int row = 0; row <=n; row ++){
            for(int col  =0 ; col <= n ; col++){
                int atEveryIndex =orignalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
