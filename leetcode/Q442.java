package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> a = findDuplicates(arr);
        System.out.println(a);

    }
    static List<Integer> findDuplicates(int[] nums){
        int i = 0 ;
        while(i < nums.length){
            if(nums[i] != nums[nums[i] - 1]){
                swap(nums , i , nums[i]-1);
            }else {
                i++;
            }
        }
        List<Integer> a = new ArrayList<Integer>();
        for(i = 0; i < nums.length; i++){
            if(i+1 != nums[i]){
                a.add(nums[i]);
            }
        }
        return a;
    }
    static void swap(int[] nums , int start , int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
