package Loop;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        int numOfNumbers = 0;
       while (true){
            System.out.println("Enter positive numbers");
             number = sc.nextInt();
            if (number == 0) {
                continue;
            }
            else if (number < 0){
                break;
            }
            sum += number;
            numOfNumbers++;
        }
        System.out.println("The sum of all numbers: " + sum);
        System.out.println("The average of all numbers: " + sum/numOfNumbers);

    }
}
