package com.methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Q : Take input of two numbers and print sum
        System.out.println("Enter first numnber");
        int a = input.nextInt();
        System.out.println("enter second number");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("sum is " + sum);
    }
}
