package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Q832 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 3;
        int[][] ar = {{1,1,0},{1,0,1},{0,0,0}};
        ar = flipAndInvertImage(ar);
        for (int[] a:ar) {
            for (int e : a) {
                System.out.print(e);
            }
            System.out.println();

        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int count = 0;
        for (int[] ar : image) {
            image[count++] = reverseAr(ar);
        }
        return image;
    }
    public static int[] reverseAr(int[] ar){
        int n = ar.length;
        for(int i = 0; i <= (n +1)/ 2; i++){
            int temp  = ar[i] ^ 1;
            ar[i] = ar[n-i-1] ^ 1;
            ar[n-i-1] = temp;
        }
        return ar;
    }
}
