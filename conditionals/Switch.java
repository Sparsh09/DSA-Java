package conditionals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit =  in.next();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits");
//            case "apple" -> System.out.println("sweet red fruit");
//            case "orange" -> System.out.println("round fruits");
//            case "grapes" -> System.out.println("small fruits");
//            default -> System.out.println("please enter a valid fruits");
//        }

        int dayno = in.nextInt();
        switch (dayno){
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
            default -> System.out.println("this day no does not exist");
        }
    }
}
