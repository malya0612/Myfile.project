package ScannerClass;

import java.util.Scanner;

public class ScannerHasNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean b = sc.hasNext();
        System.out.println(b);

    }
}
