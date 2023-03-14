package SwitchStatement;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a grade");
        String g = sc.nextLine();
        switch (g){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good job");
                break;
            case "C":
                System.out.println("Well done");
                break;
            case "D":
                System.out.println("Passed");
                break;
            case "F":
                System.out.println("Try again");
                break;
            default:
                System.out.println("Invalid grade");




        }
    }
}
