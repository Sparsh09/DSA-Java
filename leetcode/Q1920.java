// 1920. Build Array from Permutation
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Q1920 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i =0 ; i < n;i++){
            ar[i] = in.nextInt();
        }
        buildArray(ar, n);
    }

    static void buildArray(int[] ar , int n){
        int[] nar = new int[n];

        for(int i =0 ; i < n; i ++){
            nar[i] = ar[ar[i]];
        }
        System.out.println(Arrays.toString(nar));

    }
}

