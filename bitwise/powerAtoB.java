package com.bitwise;

public class powerAtoB {
    public static void main(String[] args) {
        System.out.println(cal(2,4));

    }

    public static int cal(int a, int b){
        int base = a;
        int ans = 1;
        while(b > 0){
            if((b&1) == 1){
                ans = ans * base;
            }
            base = base * base;
            b = b >> 1;
        }
        return ans;
    }

}
