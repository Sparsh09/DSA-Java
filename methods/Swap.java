package methods;

public class Swap {
    public static void main(String[] args) {

        int a= 10 ;
        int b = 20 ;



        // swap numbers
//        int temp = a;
//        a = b ;
//        b = temp;
        swaps(a , b);

        System.out.println("a = " + a + " b = " + b);
    }
    static void swaps(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
