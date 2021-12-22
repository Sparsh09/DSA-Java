package com.methods;

import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args) {
        sumfunction();
    }

    static void sumfunction(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first numnber");
        int a = in.nextInt();
        System.out.println("enter second number");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("sum is " + sum);
    }
}
