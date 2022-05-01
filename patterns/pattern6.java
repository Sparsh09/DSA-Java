package com.patterns;

public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n; row++){
            for(int col = n-row ; col > 0 ; col--){
                System.out.print(" ");
            }
            for(int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
