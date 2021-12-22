package com.assignments;

import java.util.Scanner;

public class DifferenceBetweenProductSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(diff(product(n), sum(n)));
    }

    static int diff(int p , int s){

        return p - s;
    }
    static int product(int n){
       int p = 1;
       while(n != 0 ){
           p *= n % 10;
           n = n / 10;
       }

       return p;
    }
    static int sum(int n){
        int s = 0;
        while(n != 0 ){
            s += n % 10 ;
            n = n / 10 ;
        }

        return s ;
    }
}
