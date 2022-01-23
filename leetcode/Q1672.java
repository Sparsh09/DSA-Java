package leetcode;

import java.util.Scanner;

public class Q1672 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] ar = new int[n][m];
        for(int i =0 ; i < n ; i++){
            for(int j = 0; j < ar[i].length; j++){
                ar[i][j] = in.nextInt();
            }
        }
        rich(ar , n);

    }
    static void rich(int[][] ar , int n){
        int maxsu = -1;
        for (int[] a: ar) {
            int s= 0;
            for(int ele : a){
                s += ele;
            }
            if(s > maxsu)
                maxsu = s;
        }
        System.out.println(maxsu);
    }
}
