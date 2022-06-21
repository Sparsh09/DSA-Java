package com.recursion;

import java.util.Scanner;

public class powerOfN {

    public static int cal(int x , int n){
        if(n == 0){
            return 1;
        }
        return x * cal(x , n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        System.out.println(cal(n,x));
    }
}
