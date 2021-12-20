package com.practice;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c= input.nextInt();
        int max = -1;
        if(a > max){
            max = a;
        }
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println("Largest Number " + max);

        // Using Math Class
        int max_num = Math.max(c, Math.max(a , b));
        System.out.println("Largest number" + max_num);
    }
}
