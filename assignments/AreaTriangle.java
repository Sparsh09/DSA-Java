package assignments;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        System.out.println(area());
    }

    static double area(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter base and height");
        float base = in.nextFloat();
        float height = in.nextFloat();

        return 0.5 * base * height;
    }
}
