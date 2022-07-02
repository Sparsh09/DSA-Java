package com.arrays;

public class arrayIntersection {

    public static int findM(int input[]){
        int m = input[0];
        for(int i = 0; i < input.length ; i++){
            if(m < input[i]){
                m = input[i];
            }
        }
        return m;
    }

    public static void inter(int input1[] , int input2[]){
        int m = findM(input1)+1;
        int checkArr[] = new int[m];
        for(int i =0 ; i < input1.length;i++){
            checkArr[input1[i]] += 1;
        }

        for(int i =0 ; i < input2.length ; i++){
            if(checkArr[input2[i]] >= 1){
                System.out.print(input2[i] + ",");
            }
        }
    }
    public static void print2(int input1[],int input2[]){
        for (int i: input1) {
            for(int j = 0 ; j < input2.length;j++){
                if( i == input2[j]){
                    System.out.println(i);
                    input2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int input1[] = {2,6,1,2};
        int input2[] = {1,2,3,4,2};
//        inter(input1,input2);
        print2(input1,input2);
    }
}
