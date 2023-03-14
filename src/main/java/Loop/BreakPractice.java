package Loop;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        for (int i = 1; i <= sum; i++){
            if ( i == 45){
                break;
            }
            System.out.println(i);
        }
    }
}
