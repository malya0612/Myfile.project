package strings;

public class StringToLowerCase {
    public static void main(String[] args) {

        String word = "hello everyONE! HOW ARE you doinG";
        System.out.println(word);
        word = word.toLowerCase();
        System.out.println(word);

        String word2 = "hello guys, I'm good. AND you?";
        System.out.println(word2);
        word2 = word.toUpperCase();
        System.out.println(word2);

        String word3 = "hello everyone";
        String word4 = "HELLO EVERYONE";
        System.out.println(word3.toUpperCase().equals(word4));
        System.out.println(word3.equals(word4.toLowerCase()));
        System.out.println(word3.equalsIgnoreCase(word4));


    }
}
