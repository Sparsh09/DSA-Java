package linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 21, 3, 4 },
                { 78, 99, 32, 41 },
                { 18, 12 }
        };

        int target = 78;
        int[] ans = search(arr, target); // format of return value {row , col}
        int max = maxIn2dArray(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(max);
    }

    static int[] search(int[][] ar, int target) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int maxIn2dArray(int[][] ar){

        int max = Integer.MIN_VALUE;
        for(int[] a : ar){
            for(int ele : a){
                if(ele > max){
                    max = ele;
                }
            }
        }
        return max;

    }
}
