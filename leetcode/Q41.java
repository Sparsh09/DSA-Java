package com.leetcode;

public class Q41 {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums){
        int i =0 ;
        while(i < nums.length){
            if(nums[i] > 0 && nums[i]< nums.length && nums[i] != nums[nums[i]-1]){
                swap(nums, i , nums[i]-1);
            }else {
                i++;
            }
        }
        for(i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return i+1;
    }
    static void swap(int[] nums, int start , int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
