package com.assignments;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        System.out.println(largest());
    }

    static int largest(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        return Math.max(a, b);
    }
}
