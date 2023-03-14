package strings;

public class IntroToStrings {


    public static void main(String [] args){

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName); //John
        System.out.println(lastName); //Doe

        firstName = "Albert";
        lastName = "Gold";

        System.out.println(lastName); //Gold

        //====================================


        String myName = "Malika";
        String myLastName = " Nur ";
        System.out.println(myName);
        System.out.println(myLastName);

        String myAddress = " 5924 N Lincoln Ave ";
        System.out.println(myAddress);
        long phoneNumber = 7735585236L;
        System.out.println(phoneNumber);
        byte age = 22;
        System.out.println(age);
        System.out.println(" My name is " + myName + " "  + myLastName);
        System.out.println(" I am " + age + " years old.");
        System.out.println("My address is:" + myAddress );



        //====================
        String city = "London";
        System.out.println(city);

       String city2 = new String( " New York ");
       System.out.println(city2);

       System.out.println(city.length()); //6
        System.out.println(city2.length()); //8

        String name = "Malika";
        System.out.println("The length of Malika is: " + name.length());
        /*
        equals () methods compares values of 2 Strings
         */

        String fruit1 = "apple";
        String fruit2 = "apple";
        String fruit3 = "Apple";

        boolean isSame = fruit1.equals(fruit2);
        System.out.println(isSame); //true

        isSame = fruit1.equals(fruit3);
        System.out.println(isSame); //false

        fruit1 = "banana";
        fruit2 = "orange";
        System.out.println("Is banana same as orange? " + fruit1.equals(fruit2)); //false

        boolean isSame2 = !fruit1.equals(fruit2); // explanation mark not equals, true

        //=====
        int cucumber = 5;
        int tomato = 10;

        int empty = cucumber;//10
        cucumber = tomato;//5
        tomato = empty;//10

        System.out.println("cucumber: " + cucumber);//cucumber: 10
        System.out.println("tomato: " + tomato);//tomato: 5
        //==========




        String state1 = "California";
        String state2 = "Illinois";
        String state3 = "Florida";
        String state4 = "ILlinois";
        String state5 = "florida";

        boolean isState = !state1.equals(state2);
        System.out.println(isState);
        boolean isState1 = state2.equalsIgnoreCase(state4);//true
        System.out.println(isState1);
        boolean isState2 = state3.equals(state5);
        System.out.println(isState2);
        boolean isState3 = state5.equals(state1);
        System.out.println(isState3);
        boolean isState4 = !state4.equals(state3);
        System.out.println(isState4);

        String s1 = new String("java");
        String s2 = new String("JAVA");
        s2 = s2.toLowerCase();
        System.out.println(s1 = s2);



























    }
}
