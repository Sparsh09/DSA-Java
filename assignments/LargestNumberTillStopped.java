package com.assignments;

import java.util.Scanner;

public class LargestNumberTillStopped {
    public static void main(String[] args) {
        System.out.println(largest());
    }

    static int largest(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ma = -1;
        while(n != 0){
            ma = Math.max(ma , n);
            n = in.nextInt();
        }
        return ma;
    }
}
