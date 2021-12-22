package com.assignments;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        System.out.println(area());
    }

    static double area(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter length and breadth");
        float length = in.nextFloat();
        float breadth = in.nextFloat();

        return length * breadth;
    }
}
