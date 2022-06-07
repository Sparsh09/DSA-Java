package com.bitwise;

public class numOfResetBits {
    public static void main(String[] args) {
        System.out.println(countResetBits(6));
    }

    public static int countResetBits(int n ){
        int count = 0;
        while(n > 0){
            if((n&1) == 0){
                count++;
            }
           n = n >> 1;
        }
        return count;
    }
}
