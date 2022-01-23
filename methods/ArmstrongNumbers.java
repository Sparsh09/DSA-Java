package methods;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        // Q Find armstrong between 100 to 999
        Scanner in = new Scanner(System.in);
        armstrong();

    }
    static boolean checkArmstrong(int a){
        int sum = 0;
        int temp = a;
        while(a !=0 ){
            int n = (a % 10 );
            sum += n * n * n;
            a = a / 10;

        }
//        System.out.println(temp == sum);
        return temp == sum;
    }
    static void armstrong(){
        for(int i = 100 ; i <= 999 ; i++){
//            System.out.println(i);
            if(checkArmstrong(i)){
                System.out.println(i);
            }
        }
    }
}
