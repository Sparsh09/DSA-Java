package com.bitwise;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }

    public static int ans(int[] arr){
        int n = 0;
        for(int i = 0; i  < arr.length; i++){
            n = n ^ arr[i];
        }
        return n;
    }
}
