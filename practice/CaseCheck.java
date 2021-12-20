package com.practice;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        // trim is used for removing the extra spaces
        // charat is used for getting the charater at particular index

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("lower case");
        }else {
            System.out.println("upper case");
        }
    }
}
