package com.leetcode;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q1389 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int[]index = new int[n];
        for(int i =0 ; i < n; i++){
            ar[i] = in.nextInt();
        }
        for(int i =0; i < n; i++){
            index[i] = in.nextInt();
        }

        createTargetArray(ar, index);
    }
    static void createTargetArray(int[] nums, int[] index) {
        int[] nar = new int[nums.length];
        ArrayList<Integer> newa = new ArrayList<Integer>();
        for(int i =0 ; i < nums.length;i++){
            newa.add(index[i], nums[i]);
            }
        int count = 0;
        for(Integer e : newa){
            nar[count++] = e;
        }
        System.out.println(Arrays.toString(nar));
    }
}
