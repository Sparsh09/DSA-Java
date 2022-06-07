package com.bitwise;

public class xorOfA2B {

    public static void main(String[] args) {

        int a = 3;
        int b = 9;
        System.out.println(doXor(b) ^ doXor(a-1));
    }

    public static int doXor(int n){
        if(n%4 == 0){
            return n;
        }
        else if(n%4 == 1){
            return 1;
        }
        else if(n%4 == 2){
            return n+1;
        }
        return 0;
    }
}
