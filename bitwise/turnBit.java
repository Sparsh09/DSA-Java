package com.bitwise;
// set bit -> this change 0 to 1 or keep same if 1
public class turnBit {
    public static void main(String[] args) {
        System.out.println(change(10,3));
    }

    public static int change(int num , int place){
        return num | (1 << place -1);
    }
}
