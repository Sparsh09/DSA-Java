package practice;

public class Basics {
    public static void main(String[] args) {

        int a = 10 ;
        if(a == 10){
            System.out.println("Value is ten");
        }

        // while loop
        while(a != 20){
            System.out.println("Count : " + a);
            a++;
        }

        // for loops
        for(int i =a ; i <= 100; i++){
            System.out.println("Count : " + i);
        }

    }
}
