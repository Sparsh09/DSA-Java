package practice;

import java.util.Scanner;

public class FibonacciNNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        while(count <= n){
            int temp = i;
            i = temp + p;
            p = temp;
            count++;
        }
        System.out.println("The " + n + " index in fibonnaci series is  " + i);
    }
}
