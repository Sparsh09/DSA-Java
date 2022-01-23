package practice;

import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args) {

        // type casting
//        int num = (int)65.43f;
//        System.out.println(num);

        //automatic type promotion in expression
//        int a = 257;
//        byte b = (byte) a;  // 257 % 256 = 1
//        System.out.println(b);

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = (a * b) / c;

        System.out.println(d);

    }
}
