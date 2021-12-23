package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1 ,3 , 23 , 9 , 19};
        change(arr , 3,  1);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] ar , int i , int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
