package com.leetcode;

public class Q268 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));

    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(i == nums[i]){
                i++;
            }else {
                if(nums[i] != nums.length) {
                    swap(nums, i, nums[i]);
                }else {
                    i++;
                }
            }
        }
        for(i =0 ; i < nums.length ;i++){
            if(i != nums[i]){
                return i;
            }
        }
        return i;
    }
    static void swap(int[] arr, int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
