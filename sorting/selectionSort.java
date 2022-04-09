package com.sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectSort(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            // find the max element from the array and swap it with the correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0 , last);
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
    static int getMaxIndex(int[] arr , int start , int end){
        int max = start;
        for(int i = start; i <= end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
