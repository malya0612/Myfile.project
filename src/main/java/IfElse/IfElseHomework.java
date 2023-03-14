package IfElse;

public class IfElseHomework {
    public static void main(String[] args) {
        //1
        int number = 40;
        if (number > 0){
            System.out.println(number + " positive number");
        } else if (number < 0) {
            System.out.println(number + " negative number");
        }else{
            System.out.println("number is zero");
        }
        //2
        int year = 2019;
        if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0){
            System.out.println("is a leap year");
        }else {
            System.out.println("is not a leap year");
        }
        //3
        int num1 = 3;
        int num2 = 123;
        if (num1 > num2){
            System.out.println(num1 + "is larger than " + num2);
        } else if (num2 < num1) {
            System.out.println(num2 + "is larger than " + num1);
        }else {
            System.out.println(num1 + num2 + "are equal");
        }
        //4
        double tempInFahrenheit = 77.3;
        if (tempInFahrenheit <= 32){
            System.out.println("The temperature is below freezing");
        } else if (tempInFahrenheit <= 212) {
            System.out.println("In between");
        } else if (tempInFahrenheit >= 212) {
            System.out.println("Boiling");
        }
        //5
        byte month = 6;
        if (month == 11 || month == 1 || month == 2){
            System.out.println("Winter");
        } else if ( month == 3 || month == 4 || month == 5 ) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 3) {
            System.out.println("");
            
        }


    }
        }


