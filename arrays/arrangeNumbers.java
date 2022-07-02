package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrangeNumbers {


    public static void main(String[] args) {

        int n = 6;
        int arr[] = new int[n];
        int count = 1;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            if(count % 2 == 0){
                arr[end--] = count++;
            }else{
                arr[start++] = count++;
            }
        }
//        for(int i = 1 ; i <=n; i++){
//            if(i % 2 == 1){
//                arr[count++] = i;
//            }
//        }
//        for(int i=n;i>=1;i--){
//            if(i % 2== 0){
//                arr[count++] = i;
//            }
//        }
        System.out.println(Arrays.toString(arr));
    }
}
