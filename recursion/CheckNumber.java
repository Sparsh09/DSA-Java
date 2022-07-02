package com.recursion;

public class CheckNumber {

    public static int check(int[] input , int ele){
        if(input.length == 1){
            if(input[0] == ele){
                //return true;
                return 1;
            }else {
                //return false;
                return -1;
            }
        }
        int[] smallInput = new int[input.length -1 ];
        for(int i = 1; i < input.length; i++){
            smallInput[i-1] = input[i];
        }
//        boolean smallAns = check(smallInput,ele);
        int smallAns = check(smallInput , ele);
        if(smallAns == -1){
            return input[0] == ele ? 1 : -1;
        }
        return 1+smallAns;
//        if(!smallAns){
//            return input[0] == ele;
//        }
//        return smallAns;
    }

    public static int check_2(int[] arr, int startIndex, int n){
        if(arr.length == startIndex){
            return -1;
        }
        if(arr[startIndex] == n){
            return 1;
        }
        int smallAns= check_2(arr, startIndex+1 , n);
        return smallAns != -1 ? smallAns + 1 : smallAns;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2};
        System.out.println(check_2(arr, 0,5));
    }
}
