package assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci();
    }

    static void fibonacci(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(c);
        while(c < n-2) {
            int temp = a; // temp = 0 , 1 , 1
//            System.out.println(temp + " "+ a + "" + b + " " + c);
            a = b;// a = 1 , 1 , 2
            b = c;// b = 1  , 2 , 3
            c = a + b; // c = 2 , 3 ,
            System.out.println(c);
        }
    }
}
