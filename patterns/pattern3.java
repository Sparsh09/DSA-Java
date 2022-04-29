package com.patterns;

/*
This is the pattern

*****
****
***
**
*

 */

public class pattern3 {
    public static void main(String[] args) {
        int n=5 ;
        for(int row = 1; row<=n ; row++){
            for(int col = n+1-row; col>0; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
