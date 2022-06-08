package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1854 {
    public static void main(String[] args) {
        int[][] n = new int[][]{{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(n));
    }

    public static int maximumPopulation(int[][] logs) {
        int low = 1950;
        int high = 2030;

        int[] yearsCount = new int[101];
        for(int[] ar : logs){
            yearsCount[ar[0]-1950]++;
            yearsCount[ar[1]-1950]--;
//            for(int i = ar[0] ; i < ar[1]; i++){
//                yearsCount[i-1950] += 1;
//            }
        }
        for(int i = 1; i < 101; i++){
            yearsCount[i] += yearsCount[i-1] ;
        }


        int maxYearCount = 0;
        int maxYear = 1950;
        for(int i = 0; i < 101 ; i++){
            if(maxYearCount < yearsCount[i]){
                maxYearCount = yearsCount[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}
