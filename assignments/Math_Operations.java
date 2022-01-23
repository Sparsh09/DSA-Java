package assignments;

import java.util.Scanner;

public class Math_Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("enter second number");
        int b = input.nextInt();
        System.out.println("enter the operation to be performed from given :- +,-,*,/");
        char operator = input.next().charAt(0);
        if(operator == '+'){
            System.out.println("Result :" + (a + b));
        }else if(operator == '-'){
            System.out.println("Result :" + (a - b));
        }else if(operator =='*'){
            System.out.println("Result :"+ (a*b));
        }else {
            System.out.println("Result :" + (a/b));
        }

    }
}
