package com.bitwise;

public class evenOrOdd {
    public static void main(String[] args) {
        System.out.println(isEven(52));
    }

    public static boolean isEven(int num){
        return (num & 1) == 1;
    }
}
