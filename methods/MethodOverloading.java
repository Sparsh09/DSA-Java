package methods;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        fun("sparsh");

        sum(4 , 2 , 3);
    }

    static void fun(int a){
        System.out.println(a);
    }
    static  void fun(String s) {
        System.out.println(s);
    }

    static void sum(int a , int b){
        System.out.println(a + b);
    }

    static void sum(int ...v){
        System.out.println(Arrays.stream(v).sum());

    }
}
