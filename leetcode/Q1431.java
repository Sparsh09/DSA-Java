package com.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q1431 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i =0 ; i < n; i++){
            ar[i] = in.nextInt();
        }
        int extra = in.nextInt();
        candies(ar , n, extra);
    }

    static void candies(int[] ar , int n, int extra){
        int[] m = new int[n];
        List<Boolean> b = new ArrayList<Boolean>();
        for(int i = 0 ; i < n; i++) {
            m[i] = ar[i] + extra;
        }

        for(int i = 0; i < ar.length;i++) {
            int flag = 1;
            for (int j = 0; j < m.length; j++) {
                if (m[i] >= ar[j]) {
                    flag = 1;
                } else {
                    flag = 0;
                    break;
                }
            }
            b.add(flag == 1);
        }
        System.out.println(b);
    }
}
