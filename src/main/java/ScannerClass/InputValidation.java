package ScannerClass;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int number = 8;
        if (number >= 1 && number <= 10){
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }


    }
}
