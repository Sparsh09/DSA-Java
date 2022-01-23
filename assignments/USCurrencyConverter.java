package assignments;

import java.util.Scanner;

public class USCurrencyConverter {
    public static void main(String[] args) {

        System.out.println("$"+currencyConvert());
    }

    static float currencyConvert(){
        Scanner in = new Scanner(System.in);
        float ruppess = in.nextFloat();
        return ruppess / 70 ;
    }
}
