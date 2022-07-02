package com.arrays;

public class findDuplicates {

    public static int findMax(int input[]){
        int m = input[0];
        for(int i =0 ;i <input.length ; i++){
            if(m < input[i]){
                m = input[i];
            }
        }
        return m;
    }
    public static int findD(int input[]){

        int m = findMax(input)+1;
        int checkArr[] = new int[m];
        for(int i = 0; i < input.length ; i++){
            checkArr[input[i]] += 1;
        }
        for(int i = 0; i < m ; i++){
            if(checkArr[i] > 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arrr[] = {0 ,2,1,3,1};
        System.out.println(findD(arrr));
    }
}
