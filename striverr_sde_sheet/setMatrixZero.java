package com.striverr_sde_sheet;

import java.util.Arrays;

public class setMatrixZero {
    public static void main(String[] args){
     int[][] arr = new int[][] {
             {0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}
     };
     int[] rowCol = findZeroEle(arr);
//        System.out.println(Arrays.toString(rowCol));
//     System.out.println(Arrays.toString(changeMatrix(arr, rowCol)));
        arr = changeMatrix(arr, rowCol);
        for(int i = 0; i  < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    static int[] findZeroEle(int arr[][]){
        for(int i =0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                if(arr[i][j] == 0){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int[][] changeMatrix(int arr[][] , int[] rowCol){
        int row = rowCol[0];
        int col = rowCol[1];
        System.out.println(row + " " + col);
        int rc =0 ;
        while(rc < arr.length){
            arr[rc][col] = 0;
            rc++;
        }
        System.out.println(row + " " + col);
        rc = 0;
        while(rc < arr.length){
            arr[row][rc] = 0;
            rc++;
        }
        return arr;
    }

}
