package com.recursion;

public class sumOfElementsOfArray {

    public static int calSum(int []input){
        if(input.length == 1){
            return input[0];
        }
        int [] smallInput = new int[input.length -1 ];
        for(int i =1 ; i < input.length;i++){
            smallInput[i-1] = input[i];
        }
        int smallAns = calSum(smallInput);
        return input[0] + smallAns;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        System.out.println(calSum(arr));

    }
}
