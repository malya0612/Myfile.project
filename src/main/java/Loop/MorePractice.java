package Loop;

import java.util.Scanner;

public class MorePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int negative = sc.nextInt();
        int positive = sc.nextInt();
        for (int i = negative; i<= positive; i++){
            if (i < 0 && i % 2==0 ){
                continue;
            } else if (i > 0 && i % 2 != 0) {
                continue;

            }
            System.out.println(i);
        }
    }
}
