package com.leetcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q989 {

    public static void main(String[] args) {
        int[] ar = new int[] {9,9,9,9,9,9,9,9,9,9};
        System.out.println(newApp(ar,1));
//        System.out.println(addToArrayForm(ar, 1));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {

        long nu = 0;
        int count = 0;

        for(int i = 0; i < num.length; i++){
            nu = nu * 10 + num[i];
            count++;
        }
        System.out.println("Count");
        System.out.println(count);
        System.out.println(nu);
        nu += k ;
        System.out.println(nu);
        List<Integer> ar = new ArrayList<>();
        ar.add(0,3);
        int temp = count-1;
        for(int i = count-1 ; i>=0 ; i--){
//            ar.add(nu%10);
            nu = nu % power(10, temp--);
        }
        return ar;
    }

    public static int power(int a , int b){
        int ans = 1;
        while(b > 0){
           if((b & 1) == 1){
               ans = ans * a;
           }
           a = a * a;
           b = b >> 1;
        }
        return ans;
    }

    public static List<Integer> newApp(int[] a , int b){
        List<Integer> ans = new ArrayList<>();
        for(int i = a.length - 1 ; i >= 0 ; i--){
            ans.add(0,(a[i]+b)%10);
            b = (a[i] + b) / 10;
        }
        while(b > 0){
            ans.add(0,b % 10);
            b = b / 10;

        }
        return ans;
    }
}
