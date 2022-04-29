package com.patterns;

/* This is the pattern
 *****
 *****
 *****
 *****
 *****
 */
/*
Step 1 - Find the nu of rows
Step 2 - Find the nu of items printing in each col
Step 3 - What item is to be printed
 */
public class pattern1 {
    public static void main(String[] args) {
       int n = 5 ;
       for(int row = 1; row <=n ; row++){
           for(int col = 1; col <= n ; col++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
