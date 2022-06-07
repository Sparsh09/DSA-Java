package com.bitwise;

public class powOf2 {

    public static void main(String[] args) {
        int a = 1024;
        System.out.println(pow2(a));
        System.out.println(secondApp(a));
    }

    public static boolean secondApp(int n){
        return ((n & (n-1))==0);
    }
    public static boolean pow2(int n){
        boolean check = false;
        int count = 0;
        while(n > 0){
            if((n &1) == 1){
                count++;
            }
            n = n >> 1;
        }
        if(count == 1){
            check = true;
        }
        return check;
    }
}
