package com.recursion;

public class CheckSorted {

    public static boolean checkSorted(int[] arr){
        if(arr.length <= 1){
            return true;
        }
        int[] smallInput = new int[arr.length - 1];
        for(int i =1;i<arr.length;i++){
            smallInput[i-1] = arr[i];
        }
        boolean smallAns = checkSorted(smallInput);
        if(!smallAns){
            return false;
        }
        if(arr[0] <= arr[1]) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkSorted_2(int[] input){
        if(input.length <=1 ){
            return true;
        }
        if(input[0] > input[1]){
            return false;
        }
        int[] smallInput = new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallInput[i-1] = input[i];
        }
        boolean smallAns = checkSorted_2(smallInput);
        return smallAns;
    }

    public static boolean checkBetter(int[] arr, int startIndex){
        if(arr.length == startIndex){
            return true;
        }
        if(arr[startIndex] > arr[startIndex]+1){
            return false;
        }
        boolean smallAns = checkBetter(arr, startIndex+1);
        return smallAns;
    }
    public static boolean checkBetter(int [] arr){
        return checkBetter(arr, 0);
    }


    public static void main(String[] args) {
        int [] input = new int[] {1,2,3,4,5} ;
        System.out.println(checkSorted(input));
        System.out.println(checkSorted_2(input));
        System.out.println(checkBetter(input));
    }
}
