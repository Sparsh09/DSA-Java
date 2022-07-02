package com.arrays;

import java.util.Arrays;

public class swapAlternate {

    public static void swap(int input[]){
        for(int i = 0; i<input.length - 1; i+=2){
            int t = input[i];
            input[i] = input[i+1];
            input[i+1] = t;
        }
    }
    public static void main(String[] args) {

        int arr[] = {9,3,6,12,42,32,0};
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
}
