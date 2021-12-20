package com.company;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = input.nextInt();
        System.out.println("enter the second number");
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("The Sum is " + sum);

    }
}
