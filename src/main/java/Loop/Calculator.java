package Loop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
        create a program that asks use to enter
        one number
        arithmetic operator (+, -, *, /, %)
        second number
        output the result

        Ask user if he wants to try again? yes/no
        if yes, calculate again
        if no, stop

        USE DO WHILE LOOP, if-else, switch, Scanner
         */
        Scanner sc = new Scanner(System.in);
        boolean yesNo = true;

        do {
            System.out.println("Enter one number");
            int num1 = sc.nextInt();
            System.out.println("Enter arithmetic operator: + - * / %");
            String str = sc.nextLine();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();
            if (str.equals("+")){
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (str.equals("-")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (str.equals("*")) {
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            } else if (str.equals("/")) {
                System.out.println(num1 + " / "  + num2 + " = " + (num1 / num2));
            } else if (str.equals("%")) {
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            }else {
                System.out.println("Invalid");
            }
            System.out.println("Do you want to try again? (yes/no)");
            yesNo = sc.nextBoolean();

        }while (yesNo);


    }
}
