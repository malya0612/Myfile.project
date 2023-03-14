package Practice;

import java.util.Scanner;

public class IsDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = 10;
        int num2 = 5;
        if (num1 % num2 == 0){
            System.out.println("Yes, divisible");
        }else{
            System.out.println("NOT, divisible");
        }
    }
}
