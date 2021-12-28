package com.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q1470 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = in.nextInt();
        }
        int d = in.nextInt();

        newar(ar , d);
    }

    static void newar(int[] ar , int n){
        int[] nar = new int[ar.length];
        int count = 0;
        for(int i = 0 ; i < n; i++){
            nar[count] = ar[i];
            nar[count+1] = ar[n+i];
            count += 2;
        }
        System.out.println(Arrays.toString(nar));
    }
}
