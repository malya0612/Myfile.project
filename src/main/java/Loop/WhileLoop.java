package Loop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int k = 1;
        while (k <= 100) {

            if (k % 2 == 0) {

            }
            System.out.println(k);
            k++;
        }

        int s = 1;
        while (s <= 10 ){
            System.out.println("Good morning everyone");
            s++;
        }
        for (int j = 1; j <=10; j++){
            System.out.println("Good morning everyone");
        }

        int h = 100;
        while (h >= 1){
            if (h % 2 == 0){

            }
            System.out.println(h);
            h--;
        }
        int g = 1;
        while (g <= 31){
            System.out.println( g + " January 2023");
            g++;
        }

       //=============================================

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        boolean isPrime = true;
        int r = 2;
        while (r < number ){
            if (number % r == 0){
                isPrime = false;
                break;
            }
            r++;
        }
        if (isPrime){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }


    }
}
