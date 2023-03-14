package IfElse;

public class IntroIfElse {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        System.out.println("I will compare a and b below");

        if (a == b){
            System.out.println("a is more than b");

        }else {
            System.out.println("a is less than b");
        }
        System.out.println(" I already compared a and b");


        int number1 = 10;
        int number2 = 50;

        if (number1 / number2 ==2){
            System.out.println("YES, two!");

        }else{
            System.out.println("Not two!");
        }


        String elon = "Tesla SpaceX Paypal Twitter";

        if (elon.contains("Paypal")){
            System.out.println("Elon owned Paypal");
        }else{
            System.out.println("Elon did not own Paypal");
        }

        if (elon.contains("SpaceX")){
            System.out.println("Elon write Twitter");
        }else{
            System.out.println("Elon did not write Twitter");
        }

        int gate = 25;
        int gate2 = 123;
        if (gate < gate2){
            System.out.println("This is gate");
        }else{
            System.out.println("This is not gate");
        }

        int garage = 345;
        int garage2 = 3473;
        if (garage == garage2){
            System.out.println("It's in garage");
        }else{
            System.out.println("It's not in garage");
        }

        String bottle = " I drink water";
        if (bottle.endsWith("v")){
            System.out.println("Just drink water");
        }else{
            System.out.println("Just not drink water");
        }

        String instrument = "I like my piano";
        if (instrument.contains("w")){
            System.out.println("Like my piano");
        }









    }
}
