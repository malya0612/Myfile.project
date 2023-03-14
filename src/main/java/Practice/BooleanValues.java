package Practice;

import java.util.Scanner;

public class BooleanValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter booleans");
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        boolean c = sc.nextBoolean();
        if (a && b && c ){
            System.out.println("At least two are true");
        } else if (a && b || b && c|| c && a){
            System.out.println("Less than two are true");
        } else if (a & b & c) {
            System.out.println("All true");
        }else {
            System.out.println("Invalid");
        }
    }
}
