package com.practice;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
                For Loops
                for(intialisation; condition; increment/decrement){
                        //body
                 }
         */

        // Print numbers from 1 to 5
        for(int i =1; i < 6; i++){
            System.out.println("Count :- " + i);
        }

        //Print numbers from 1 to n
        System.out.println("enter the number");
        int n = input.nextInt();
        for(int i = 0; i < n ; i++){
            System.out.println(i);
        }

        // while loops
        /*
            while(condtion)
            {
                //body
                increment
             }
         */
        int num = 1 ;
        while(num < 5){
            System.out.println(num);
            num +=1;
        }

        // do while loop
        /*
            do {
            //body
            }while(condition);
         */
        int news = 0;
        do{
            System.out.println("hello world");
            news++;
        }while(news != 1);
    }
}
