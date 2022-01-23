package leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Q1732 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] gain = new int[n];
        for(int i = 0 ; i < n; i++){
            gain[i] = in.nextInt();
        }
        largestAltitude(gain);
    }
    static void largestAltitude(int[] gain) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(gain[0]);
        int highest= l.get(0);
        for(int i = 1; i < gain.length; i++){
            l.add(l.get(i-1) + gain[i]);
            highest = Integer.max(l.get(i) , highest);
        }
        if(highest < 0)
            System.out.println(0);
        else
            System.out.println(highest);
    }

}

