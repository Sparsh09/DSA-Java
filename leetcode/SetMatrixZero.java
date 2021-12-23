package com.leetcode;


import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for(int i =0; i < arr.length; i++ ){
            for(int j = 0; j < arr[0].length;j++){
                arr[i][j] = in.nextInt();
            }
        }
        setZeroes(arr);
    }
        public static int[][] setRowZero(int row , int[][] matrix){
            System.out.println("row zero");
            for(int i = row ; i <= row ; i++){
                for(int j = 0; j < matrix[i].length; j++){
                    matrix[i][j] = 0;
                }
            }
            return matrix;
        }
        public static int[][] setColZero(int col , int[][] matrix){
            System.out.println("col zero");
            for(int i = 0 ; i < matrix.length; i++){
                for(int j = col ; j <= col ; j++){
                    matrix[i][j] = 0;
                }
            }
            return matrix;
        }
        public static void setZeroes(int[][] matrix) {
            for(int i = 0 ; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    if(matrix[i][j] == 0){
                        System.out.println("enter");
                        matrix = setRowZero(i , matrix);
                        matrix = setColZero(i , matrix);
                        break;
                    }
                }
            }
            for(int i =0 ; i < matrix.length; i++){
                for(int j =0 ; j< matrix[0].length; j++){
                    System.out.println(matrix[i][j]);
                }
            }

        }
    }

