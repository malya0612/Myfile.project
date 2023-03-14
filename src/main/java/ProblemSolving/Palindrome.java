package ProblemSolving;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        boolean isPalindrome = true;
        int str = word.length();
        for (int i = 0; i < str / 2; i++) {
            if (word.charAt(i) != word.charAt(str -1 -i)){
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);


    }
}
