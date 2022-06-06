package com.bitwise;

public class resetBit {

    public static void main(String[] args) {
        System.out.println(reset(7,2));
    }

    public static int reset(int num, int place){
        return num & ~(1<<place-1);
    }
}
