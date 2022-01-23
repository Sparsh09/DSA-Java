package assignments;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        factor();
    }

    static void factor(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Factors are");
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
}
