package com.practice;

public class ifElse {
    public static void main(String[] args) {
        /*
        syntax of if else statements
        if(boolean expression True or False){
            //body
        }else {
            // do this
            }
         */

        int salary = 25400;
        if(salary > 10000){
            salary += 2000;
        }else {
            salary += 1000;
        }
        System.out.println("Updated salary is :" + salary);
    }
}
