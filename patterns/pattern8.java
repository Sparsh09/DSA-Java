package com.patterns;

public class pattern8 {
    public static void main(String[] args) {
        int n = 9;
        for(int row = 1; row <= n  ; row+=2){
            int spaceCol = n - row;
            for(int col = 0 ; col < spaceCol / 2; col++){
                System.out.print(" ");
            }
            for(int col = 1 ; col <= row; col++){
                System.out.print("*");
            }
            for(int col = 0; col < spaceCol / 2 ; col ++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
