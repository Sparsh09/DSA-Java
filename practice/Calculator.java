package practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // take input from user till user does not press x or X
        int ans = 0;

        while(true){
            // takes operator as input
            System.out.println("Enter operator or close it");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/'  ){
                // take input two numbers
                System.out.println("Enter two numbers");
                int a = in.nextInt();
                int b = in.nextInt();

                if(op =='+'){
                    ans = a + b;
                }else if (op =='-'){
                    ans = a - b;
                }else if(op == '*') {
                    ans = a * b;
                }else if(op == '/') {
                    ans = a / b;
                }
                System.out.println("Answer -" + ans);
            }
            else if( op == 'x' || op == 'X'){
                break;
            }
            else {
                System.out.println("invalid operation");
            }
        }
    }
}
