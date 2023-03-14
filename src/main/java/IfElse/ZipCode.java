package IfElse;

import java.util.Scanner;

public class ZipCode {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter 5 digit zip code");
        int zipCode = sc.nextInt();
        String zip = zipCode + "";
        if (zip.length()== 5 && !zip.contains("9") && !zip.startsWith("0")){
            System.out.println("Zip code is valid");
        }else {
            System.out.println("Zip code is not valid");
        }
    }
}
