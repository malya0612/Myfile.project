package strings;

public class StringManipulationHomework {
    public static void main(String[] args) {
        //1
        String message = "Hello everyone, Let's do Java String exercises";
        char character = message.charAt(10);
        System.out.println("The character at position 10 is:  " + character);
        //2
        int length = message.length();
        System.out.println("The length of the message is: " + length);
        //3
        String uppercase = message.toUpperCase();
        System.out.println("The message is all uppercase is: " + uppercase);
        //4
        String lowercase = message.toLowerCase();
        System.out.println("The message is all lowercase is: " + lowercase);
        //5
        char letter = message.charAt(4);
        System.out.println("The letter at position 5 is: " + letter);
        //6
        char lastletter = message.charAt(length - 1);
        System.out.println("The last letter is: " + lastletter);
        //7
        String firstletter = message.substring(0,1);
        String lowercase1 = firstletter.toLowerCase();
        System.out.println("The first letter in lower case is: " + lowercase1);
        //8
        String lastletter1 = message.substring(length -1);
        String uppercase1 = lastletter1.toUpperCase();
        System.out.println("The last letter in uppercase is: " + uppercase1);










    }
}
