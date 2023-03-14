package SwitchStatement;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month");
        String month = sc.nextLine();
        if (month.equals(12) || month.equals(1) || month.equals(2)){
            System.out.println("Winter");
        } else if (month.equals(3) || month.equals(4) || month.equals(5)) {
            System.out.println("Spring");
        } else if (month.equals(6) || month.equals(7) || month.equals(8)) {
            System.out.println("Summer");
        } else if (month.equals(9) || month.equals(10) || month.equals(11)) {
            System.out.println("Fall");
        }else {
            System.out.println("Invalid month");
        }


        switch (month){
            case "12", "1", "2":
                System.out.println("Winter");
                break;
            case "3", "4", "5":
                System.out.println("Spring");
                break;
            case "6", "7", "8":
                System.out.println("Summer");
                break;
            case "9", "10", "11":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
