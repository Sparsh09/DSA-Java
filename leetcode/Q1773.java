package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q1773 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<List<String>> item = new ArrayList<>();

        for(int i =0 ; i < 3 ; i++){
            String type = in.nextLine();
            String color = in.nextLine();
            String name = in.nextLine();
            String[] ar = new String[3];
            ar[0] = type ;
            ar[1] = color;
            ar[2] = name;
            item.add(Arrays.asList(ar));

        }
        String ruleKey = in.nextLine();
        String ruleValue = in.nextLine();

        countMatches(item , ruleKey, ruleValue);
    }
    static void countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ind = 0;
        switch(ruleKey){
            case "type" :
                ind = 0;
                break;
            case "color" :
                ind = 1;
                break;
            case "name":
                ind = 2;
                break;
        }
        int count = 0;
        for (List item : items) {
            String value = (String) item.get(ind);
            System.out.println(value.equals(ruleValue));
            if(value.equals(ruleValue))
                count++;
        }
        System.out.println(count);
    }
}
