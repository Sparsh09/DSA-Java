package com.arrays;

public class arrayFunction {

    public static void printArray(int input[] ){
        for(int i = 0; i < input.length ;i++){
            System.out.println(input[i]);
        }
    }
    public static void incrementArray(int input[]){
        input = new int[7];
        for(int i = 0; i < input.length;i++){
            input[i] = input[i]+1;
        }
        printArray(input);
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        incrementArray(arr);
        printArray(arr);
    }
}
