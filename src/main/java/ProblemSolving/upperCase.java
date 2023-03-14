package ProblemSolving;

import java.util.Scanner;

public class upperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        System.out.println(word1 + word2.toUpperCase().charAt(0) + word2.substring(1));
        System.out.println(word1.toUpperCase().charAt(0) + word1.substring(1)
                + word2.toUpperCase().charAt(0) + word2.substring(1));
        System.out.println(word1.toUpperCase() + " " + word2.toLowerCase() + " " + word2.toLowerCase() +
                " " + word1.toUpperCase());
        System.out.println(word1.toUpperCase().replace("A","") +
                word2.toUpperCase().replace("A",""));
        System.out.println(word1.toUpperCase().substring(0,1) + word1.substring(1,2) +
                word2.toUpperCase().substring(0,1) + word2.substring(1,2));
        System.out.println(word1.toUpperCase().substring(word1.length()-0) + word1.substring(1,2) +
                word2.toUpperCase().substring(word2.length()));

    }
}
