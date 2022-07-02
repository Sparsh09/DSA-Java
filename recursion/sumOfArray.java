package com.recursion;

public class sumOfArray {
    public static int sum(int[] arr,int startIndex){
        if(startIndex == arr.length){
            return arr[startIndex];
        }

        return arr[startIndex] + sum(arr,startIndex+1);
    }
    public static void main(String[] args) {
        int[] arr = new int[] {4,2,1};
        System.out.println(sum(arr,0));
    }
}
