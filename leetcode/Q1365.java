package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Q1365 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i =0 ; i < n ; i++){
            ar[i] = in.nextInt();
        }
        smallCurrent(ar);
    }

    static void smallCurrent(int[] ar){
        int[] c = new int[ar.length];
        for(int i = 0 ; i < ar.length; i++){
            for(int j =0; j < ar.length;j++){
                if(i!=j){
                    c[i] += ar[i] > ar[j] ? 1 : 0;
                }
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
