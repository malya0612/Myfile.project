package Practice;

import java.util.Scanner;

public class StringEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter equals");
        String w = sc.nextLine();
        String q = sc.nextLine();
        if (w.equalsIgnoreCase(q)){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
    }
}
