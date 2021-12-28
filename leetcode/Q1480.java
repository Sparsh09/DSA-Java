package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Q1480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = in.nextInt();
        }
        sums(ar , n);
    }

    static void sums(int[] ar , int n ){
        int[] s = new int[n];
        for(int i = 0; i < n; i++){
            if(i == 0){
             s[i] = ar[i];
            }
            else {
                s[i] = s[i-1] + ar[i];
            }
        }
        System.out.println(Arrays.toString(s));
    }
}
