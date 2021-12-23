package com.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListt {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList(5);

        list.add(34);
        list.add(635);

        System.out.println(list);

        Scanner in = new Scanner(System.in);
        for(int i=0 ; i < 5; i++){
            list.add(in.nextInt());
        }

        //get items
        for(int i = 0; i < 7; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
