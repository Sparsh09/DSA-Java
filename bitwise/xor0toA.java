package com.bitwise;

public class xor0toA {
    public static void main(String[] args) {
        System.out.println(doXor(5));
    }

    public static int doXor(int n){

        if(n % 4 == 0){
            return n;
        }
        else if( n%4 == 1){
            return 1;
        }else if(n%4 == 2){
            return n + 1;
        }
        return 0;
    }
}
