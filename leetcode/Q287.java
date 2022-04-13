package com.leetcode;

public class Q287 {
    public static void main(String[] args) {
        int[] nums = {1,3,1,4,2,2};
        System.out.println(findDuplicate(nums));

    }

    static int findDuplicate(int[] nums){
        int i = 0 ;
        while( i < nums.length ){
            if(nums[i] != nums[nums[i] - 1]){
                swap(nums , i , nums[i] - 1);

            }else {
                i++;
            }
        }
        for(i = 0; i < nums.length; i++){
            if(i != nums[i] - 1){
                return nums[i];
            }
        }
        return -1;
    }
    static void swap(int[] nums , int start , int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
