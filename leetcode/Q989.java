package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q989 {

    public static void main(String[] args) {
        int[] ar = new int[] {9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(ar, 1));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {

        int nu = 0;
        for(int i = 0; i < num.length; i++){
            nu = nu * 10 + num[i];
        }

        System.out.println(nu);
        nu += k ;
        System.out.println(nu);
        List<Integer> ar = new ArrayList<>();
        while(nu!=0){
            ar.add(nu%10);
            nu = nu / 10;
        }
        Collections.reverse(ar);
        return ar;
    }
}
