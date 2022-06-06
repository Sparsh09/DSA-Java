package com.bitwise;

public class findIthBit {
    public static void main(String[] args) {

        System.out.println(re(15,3));
    }

    public static int re(int n , int place){
        System.out.println(1 << place-1);
        return n & (1 << (place-1));
    }
}
