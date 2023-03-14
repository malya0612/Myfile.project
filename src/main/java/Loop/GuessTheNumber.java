package Loop;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(1, 100);
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter number: ");
            num = sc.nextInt();
            if (num < randomNumber){
                System.out.println("Too low");
            } else if (num > randomNumber) {
                System.out.println("Too high");
            }else {
                System.out.println("Guessed the right number");
                break;
            }
        }while (num <= 100);
    }
}

