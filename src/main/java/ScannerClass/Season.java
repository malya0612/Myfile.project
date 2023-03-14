package ScannerClass;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the name of the month");
        String month = str.next();
        if (month.equalsIgnoreCase("january")){
            System.out.println("winter");
        } else if (month.equalsIgnoreCase("february")) {
            System.out.println("winter");

        } else if (month.equalsIgnoreCase("March")) {
            System.out.println("spring");
        } else if (month.equalsIgnoreCase("April")) {
            System.out.println("spring");

        } else if (month.equalsIgnoreCase("May")) {
            System.out.println("spring");
        } else if (month.equalsIgnoreCase("June")) {
            System.out.println("summer");
        } else if (month.equalsIgnoreCase("July")) {
            System.out.println("summer");
        } else if (month.equalsIgnoreCase("August")) {
            System.out.println("summer");
        } else if (month.equalsIgnoreCase("September")) {
            System.out.println("autumn");
        } else if (month.equalsIgnoreCase("October")) {
            System.out.println("autumn");
        } else if (month.equalsIgnoreCase("November")) {
            System.out.println("autumn");
        } else if (month.equalsIgnoreCase("December")) {
            System.out.println("winter");
        }else {
            System.out.println("invalid season");
        }




    }
}
