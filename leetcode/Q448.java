package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q448 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> a = new ArrayList<Integer>();
        a = findDisappearedNumbers(arr);
        System.out.println(a);
//        System.out.println(Arrays.toString(a));
//        for (int i = 0 ; i < ar.length; i++){

//            if(ar[i] != 0 ){
//                System.out.println(ar[i]);
//            }
//        }
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0 ;
        while(i < nums.length){
            if(nums[nums[i] - 1] != nums[i] ){ // || nums[i] == -1
                swap(nums , i , nums[i] - 1);
            }
            else {
                    i++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(i = 0 ; i < nums.length; i++){
            if(nums[i] != i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
