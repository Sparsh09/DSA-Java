package com.bitwise;

import javax.swing.plaf.IconUIResource;

public class numOfSetBits {

    public static void main(String[] args) {
        System.out.println(countSetBits(5));
        System.out.println(secondApp(5));
    }

    public static int countSetBits(int n){

        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int secondApp(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n & n-1;
        }
        return count;
    }
}
