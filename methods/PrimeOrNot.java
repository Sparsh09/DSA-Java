package methods;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int a){
        if(a <= 1) {
            return true;
        }
        int c = 2;
        while(c * c < a){
            if(a%c == 0){
                return false;
            }
            c++;
        }
        return c*c > a;
    }
}
