package arithmeticOperators;

public class ComparisonOperators {

    public static void main(String [] args){
        /*
        Comparison operators are used to compare 2 values:
        > more than
        < less than
        >= more or equal
        <= less or equal
        == equal
        != not equal

         */

        byte potato = 5;
        byte fries = 10;
        System.out.println(potato > fries);
        System.out.println(potato < fries);
        System.out.println(potato >= fries);
        System.out.println(potato <= fries);
        System.out.println(potato == fries);
        System.out.println(potato != fries);


        byte bottle = 22;
        byte bottle2 = 35;
        System.out.println(bottle2 > bottle);
        boolean a = bottle2 > bottle;

        short swimmingPool = 3467;
        short swimmingPool2 = 3855;
        int number = 4831823;
        int number2 = 39838238;
        long myGarage = 29398;
        long myGarage3 = 123;
        /*
        Concatenation
         */

        System.out.println(1 + 2);
        System.out.println(1 + 2 + "Hello");//3 hello
        System.out.println("hello " + 1 + 2);//hello 12
        System.out.println("hello" + 3 + true); //hello3true
        System.out.println("hello" + 3 + false);





    }
}
