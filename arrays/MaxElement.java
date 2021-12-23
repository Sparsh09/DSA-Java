package com.arrays;

public class MaxElement {
    public static void main(String[] args) {

        int[] arr = { 1, 3,23 , 52, 34};
        int ma = -1;
        for (int j : arr) {
            if (j > ma) {
                ma = j;
            }
        }
        System.out.println("max is " + ma);
    }
}
