package com.leetcode;

public class Q441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
    }
    static int arrangeCoins(int n){
        if(n == 1){
            return 1;
        }
        int temp = n;
        int ans  = 0;
        for(int i =1; i <=temp;  i++){
            if(n - i < 0){
                ans = i - 1;
                break;
            }else {
                n = n- i;
            }
        }
        return ans;
    }

//    static int arrangeCoinsBinary(int n){
//        int start = 1;
//        int end = n;
//        while(start <= end){
//            int mid = start + (end - start) /2 ;
//            if(mid )
//        }
//    }
}
