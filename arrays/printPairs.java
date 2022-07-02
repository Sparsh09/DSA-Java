package com.arrays;

public class printPairs {

    public static void printP(int input[]){
        for(int i = 0 ; i < input.length - 1; i++){
            for(int j = i+1;j<input.length;j++){
                System.out.print(input[i] + " " + input[j] + " ,");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5};
        printP(arr);
    }
}
