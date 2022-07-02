package com.arrays;

public class findUnique {

    public static int findMax(int input[]){
        int m = input[0];
        for(int i = 1; i< input.length ; i++){
            if(m < input[i]){
                m = input[i];
            }
        }

        return m;
    }
    public static int find(int input[]){
        int m = findMax(input);
        int checkArr[] = new int[m+1];
        for(int i = 0; i < input.length; i++){
            checkArr[input[i]] += 1 ;
        }
        for(int i =0 ;i < checkArr.length; i++){
            if(checkArr[i]  == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {2,3,5,6,3000,6,2,5,10000};
        System.out.println(find(arr));
    }
}
