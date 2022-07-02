package com.recursion;

public class firstIndexofNumber {
    public static int findFirstIndex(int [] input , int startIndex , int ele){
        if(input.length == startIndex){
            return -1;
        }
        if(input[startIndex] == ele){
            return startIndex;
        }
        int smallAns = findFirstIndex(input , startIndex+1 , ele);
        return smallAns;
    }
    public static int findFirstIndex(int [] input , int ele){
        int ans = findFirstIndex(input , 0 , ele) ;
        return ans;
    }

    public static void main(String[] args) {
        int[] input = {9,8,10,8};

        System.out.println(findFirstIndex(input , 8));

    }
}
