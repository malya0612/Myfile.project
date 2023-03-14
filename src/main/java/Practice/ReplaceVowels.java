package Practice;

import java.util.Scanner;

public class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String sentence = sc.nextLine();
        sentence = sentence.replaceAll("[aieuyoAIEUYO]", "X");
        System.out.println(sentence);


    }
}
