package Practice;

import java.util.Scanner;

public class LongerString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = sc.next();

        System.out.println("Enter second number:");
        String word2 = sc.next();

        if (word1.length() > word2.length()){
            System.out.println(word1 + ":" + word1.length());
        } else if (word2.length() > word1.length()) {
            System.out.println(word2 + ":" + word2.length());
        }else {
            System.out.println(word1 + " " + word2 + ":" + word1.length());
        }
    }
}
