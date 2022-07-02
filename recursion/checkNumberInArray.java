package com.recursion;

public class checkNumberInArray {
    public static boolean check(int[] input,int startIndex,int n){
        if(startIndex == input.length){
            return false;
        }
        if(input[startIndex] == n) {
            return true;
        }
        boolean ans = check(input , startIndex+1,n);
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,2,4};
        int n = 4;

        System.out.println(check(arr,0,n));
    }
}
