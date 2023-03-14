package Practice;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();{
            System.out.println("Enter 1st number:");
        }
        int num2 = sc.nextInt();{
            System.out.println("Enter 2nd number:");
        }
        int num3 = sc.nextInt();{
            System.out.println("Enter 3rd number:");
        }if (num > num2 && num > num3){
            System.out.println("1st larger ");
        } else if (num2 > num && num2 > num3) {
            System.out.println("2nd larger");
        } else if (num3 > num2 && num3 >num) {
            System.out.println("3rd larger");
        }else {
            System.out.println();
        }
    }
}
