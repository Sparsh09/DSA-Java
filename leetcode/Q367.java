package com.leetcode;

public class Q367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));
    }
    static boolean isPerfectSquare(int num) {
        if(num == 1 || num == 0){
            return true;
        }
        int start = 0;
        int end = num / 2;
        while(start <= end ){
            int mid = start + (end - start) /2 ;
            System.out.println(mid);
            System.out.println(mid * mid);
            if(mid * mid == num){
                return true;
            }
            else if(mid * mid < num){
                start = mid + 1;

            }else {
                end = mid - 1;
            }
        }
        return false;
    }
}
