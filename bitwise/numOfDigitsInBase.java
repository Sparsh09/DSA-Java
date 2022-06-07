package com.bitwise;

public class numOfDigitsInBase {
    public static void main(String[] args) {
        System.out.println(count(10,2));
    }

    public static int count(int n, int b){
        double di = Math.log(n) / Math.log(b);
        int ans = (int) di + 1;
        return ans;
    }
}
