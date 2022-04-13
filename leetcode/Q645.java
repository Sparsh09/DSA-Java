package com.leetcode;

import java.util.Arrays;

public class Q645 {

    public static void main(String[] args) {
     int[] ar = {1,2,2,4};
     int[] arr = new int[2];
     System.out.println(Arrays.toString(findErrorNums(ar)));
    }
    static int[] findErrorNums(int[] nums) {
        int i =0 ;
        while(i < nums.length){
            if(nums[i] != nums[nums[i]-1]){
                swap(nums , i, nums[i] - 1);
            }else {
                i++;
            }
        }
        int[] nAr = new int[2];
        for(i = 0 ; i < nums.length ; i++){
            if(i+1 != nums[i]){
                nAr[0] = nums[i];
                nAr[1] = i+1;
            }
        }
        return nAr;
    }
    static void swap(int[] nums, int start , int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
