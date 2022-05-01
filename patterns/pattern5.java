package com.patterns;
/*
*
**
***
****
***
**
*
 */
public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row<=2 * n;row++){
            int col = row > n ? 2*n -row : row;
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
//        for(int i=n-1;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

    }
}
