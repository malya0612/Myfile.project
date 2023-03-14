package Loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
        prime numbers are numbers that can only divided by 1 and by itself
         */



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        boolean num = true;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                num = false;
                break;
            }
        }
        if (num){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }
    }
}
