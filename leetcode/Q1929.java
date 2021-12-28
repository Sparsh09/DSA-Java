package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Q1929 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }
        concat(ar , n);

    }

    static void concat(int[] ar , int n){
        int[] ans = new int[2*n];

        for(int i =0 ; i < ans.length; i++){

            if(i >= ar.length){
                ans[i] = ar[i % ar.length];
            }else {
                ans[i] = ar[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}

// 0 1 2
// 3
