package practice;

import java.util.Scanner;

public class FrequencyNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        char n = in.nextLine().charAt(0);
        int count = 0;

        for(int i = 0; i< num.length(); i++){
            if(n == num.charAt(i)){
                count ++;
            }
        }

        System.out.println("The number of time appearance is" + count);

        // Another way
        int new_num =Integer.parseInt(num);
        int new_n = (int)n;
        int c = 0;
        while(new_num != 0){
            if(n == new_num%10){
                c++;
            }
            new_num /= 10;
        }

        System.out.println("Frequency is : " + c );
    }
}
