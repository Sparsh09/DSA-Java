package com.arrays;

public class numOfPairs {


    public static int count(int input[] , int s){
        int cnt = 0;
        for(int i =0 ; i < input.length;i++){
            for(int j = i+1;j<input.length ; j++){
                if(input[i] + input[j] == s){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[]  = {1,3,6,2,5,4,3,2,4};
        int s = 7;
        System.out.println(count(arr,s));
    }
}
