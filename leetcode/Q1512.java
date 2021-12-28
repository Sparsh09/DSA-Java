package com.leetcode;

import java.util.Scanner;

public class Q1512 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];

        for(int i =0 ; i < n; i++){
            ar[i] = in.nextInt();
        }
        goodPairs(ar);
    }

    static void goodPairs(int[] ar){
        int count = 0;
        for(int i =0 ; i< ar.length;i++){
            for(int j =0 ; j <ar.length;j++){
                if(i < j){
                    count += ar[i] == ar[j] ? 1 : 0;
                }
            }

        }
        System.out.println(count);
    }
}
