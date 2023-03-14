package Practice;

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number");
        int c = sc.nextInt();

        if (a < b && a > c) {
            if (b > c) {
                System.out.println("Ascending : " + c + " , " + b + " , " + a);
                System.out.println("Descending: " + a + " , " + b + " , " + c);
            } else {
                System.out.println("Ascending : " + b + " , " + c + " , " + a);
                System.out.println("Descending: " + a + " , " + c + " , " + b);
            }
        }
    }
}
