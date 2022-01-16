package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Q832 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 3;
        int[][] ar = new int[3][3];
        for(int i =0 ; i < 3; i++){
            for(int j =0 ; j < 3; j++){
                ar[i][j] = in.nextInt();
//                System.out.println(ar[i][j]);
            }
        }

        System.out.println(Arrays.toString(ar));
        flipAndInvertImage(ar);
    }
    static void flipAndInvertImage(int[][] image) {
//        int[][] ar= new int[image.length][];
        System.out.println(Arrays.toString(image));
        for(int i =0 ; i< image.length; i++){
            for(int j = 0 ; j < image[i].length; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                }else {
                    image[i][j] = 0;
                }
            }
        }
        for(int i =0 ; i < 3; i++){
            for(int j =0 ; j < 3; j++){
                System.out.print(image[i][j]);
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(image));
    }
}
