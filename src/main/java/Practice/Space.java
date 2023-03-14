package Practice;

import java.util.Scanner;

public class Space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter space");
        String str = sc.nextLine();
        System.out.println(str.replace(" ", " "));

    }
}
