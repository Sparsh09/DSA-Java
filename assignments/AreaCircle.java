package com.assignments;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        System.out.println(area());
    }

    static double area(){
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();

        return radius * radius * 3.14;
    }
}
