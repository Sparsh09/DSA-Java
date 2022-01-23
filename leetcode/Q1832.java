package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q1832 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        checkIfPangram(s);
    }
    static void checkIfPangram(String sentence){

        int[] ar = new int[130];
        for (char a : sentence.toCharArray()) {
            ar[(int) a] = 1;
        }
        int[] nar = new int[26];
        for(int i =0 ; i < nar.length; i++){
            nar[i] = ar[97+i];
        }
        boolean flag = false;
        for(int i =0 ; i < nar.length; i++){
            if(nar[i] == 0)
                 flag =  false;
//                return false;
        }

    }
}

