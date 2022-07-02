package com.recursion;

public class lastIndexOfEle {

    public static int findIndex(int input[] , int ele, int foundIndex, int startIndex){
        if(input.length == startIndex){
            return foundIndex;
        }
        if(input[startIndex] == ele){
            foundIndex = startIndex;
        }
        return findIndex(input , ele , foundIndex , startIndex+1);
    }

    public static int findIndex(int input[] , int ele){
        return findIndex(input , ele , -1, 0 );
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,3};
        System.out.println(findIndex(arr , 91));
    }
}
