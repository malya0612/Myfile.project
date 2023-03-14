package ScannerClass;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner weather = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        double temp = weather.nextDouble();
        System.out.println("Is is rainy? true/false");
        boolean isRaining = weather.nextBoolean();
        
        if (temp < 8){
            System.out.println("It's freezing outside! Wear a heavy coat, gloves, and a hat.");
        } else if (isRaining && temp >=0 && temp <= 10) {
            System.out.println("It's chilly and rainy! Wear a raincoat, boots, and a scarf.");
        } else if (isRaining && temp >= 0 && temp <= 10 ) {
            System.out.println("It's chilly outside! Wear a jacket, gloves and a hat.");
        } else if (isRaining && temp >= 11 && temp <= 20) {
            System.out.println("It's cool and rainy! Wear a light jacket, boots, and scarf.");
        } else if (isRaining && temp >= 11 && temp <= 20) {
            System.out.println("It's cool outside! Wear a light jacket and comfortable shoes.");
        } else if (isRaining && temp >= 20 ) {
            System.out.println("It's warm and rainy! Wear a light jacket, shorts, and sandals.");
        } else if (!isRaining && temp >= 20) {
            System.out.println("It's warm outside! Wear a t-shirt,shorts, amd comfortable shoes.");
        }else {
            System.out.println("Invalid input");
        }
    }
}
