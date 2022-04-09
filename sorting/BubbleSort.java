package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped ;
        // run the steps n-1 times
        for (int i =0 ; i < arr.length; i++){
            swapped = false;
            //for each step max item will come at the last respective index
            for(int j = 1; j <= arr.length-i-1 ; j++){
                // swap item if the previous item is smaller than the next item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if for a particular case there is no swapping took place , it means the array is sorted so break the loop
            if(!swapped) { // !(swapped(false)) = true
                break;
            }
        }
    }
}
