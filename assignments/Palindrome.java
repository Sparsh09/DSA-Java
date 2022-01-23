package assignments;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(stringPalindrome());;
    }

    static boolean stringPalindrome(){
        Scanner in = new Scanner(System.in);
        String word = in.next().trim();
        String revword = "";
        for(int i = word.length() - 1  ; i >= 0 ; i--){
            revword += word.charAt(i);
        }
        return word.equals(revword);
    }
}
