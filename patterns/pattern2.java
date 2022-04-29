package com.patterns;

/*this is the pattern
*
**
***
****
*****
 */
public class pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row<= n; row++){
            for(int col =1 ; col <= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
