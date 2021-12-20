package com.assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principal = input.nextInt();
        float time = input.nextFloat();
        float rate = input.nextFloat();

        double simpleInterest = principal * time * rate;
        System.out.println("The simple interest for the principal is :- " + simpleInterest);


    }
}
