package ProblemSolving;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String word = sc.nextLine();
        String reverseWord = "";
        for (int i = word.length()-1; i >= 0; i--){
            reverseWord += word.charAt(i);
        }
        System.out.println(reverseWord);

    }
}
