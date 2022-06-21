package com.recursion;

public class printNumbers {

    public static void p(int n){
        if(n == 1){
            System.out.println(n + " ");
            return ;
        }
        p(n-1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {

        p(5);
    }
}
