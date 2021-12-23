package com.assignments;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        System.out.println((sum()));
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 0;
        while(n!=0)
        {
            s += n;
            n = in.nextInt();
        }
        return s;
    }
}
