package com.recursion;

public class fibonaci {
    public static void main(String[] args) {
        System.out.println(fibo(9));

    }

    static int fibo(int n ){

        // base condition
        if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
