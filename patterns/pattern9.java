package com.patterns;

public class pattern9 {
    public static void main(String[] args) {
        int n = 9;
        for(int row = n; row >=0 ; row-=2){
            int spaceCol = n - row;
            for(int col = 0; col < spaceCol / 2; col++){
                System.out.print(" ");
            }
            for(int col =row; col > 0; col--){
                System.out.print("*");
            }

            for(int col = 0; col < spaceCol / 2; col++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
