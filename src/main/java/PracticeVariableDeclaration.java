public class PracticeVariableDeclaration {



    public static void main(String [] args){

        byte myByte; //declared variable
        byte _another_byte;

        myByte = 5;
        myByte = 10;
        System.out.println(myByte);  //10

        myByte = 20;
        System.out.println(myByte); //20
        _another_byte = 100;
        System.out.println(_another_byte);

        //---------------------------------------------------

        short myShort = 10;
         myShort = 100;
        System.out.println(myShort);

        short myPhone3 = 25;
         myPhone3 = 85;
        System.out.println(myPhone3);

       short time = 50;
       System.out.println(time);

       short blueBottle =200;
       System.out.println(blueBottle);

       short blueBottle2 = 3400;
       System.out.println(blueBottle2);

       int myFollowers = 200;
       myFollowers = 5500;
       System.out.println(myFollowers);
       int myName = 2000;
       myName = 2500;
       System.out.println(myName);
       int helloPeople = 453;
       helloPeople = 345;
       System.out.println(helloPeople);
       int yourNotes = 22;
       yourNotes = 222;
       System.out.println(yourNotes);
       int myWater = 234;
       myWater = 324;
       System.out.println(myWater);
       int helloWorld = 45;
       helloWorld = 445;
       System.out.println(helloWorld);
       int yourGlasses = 543;
       yourGlasses = 544;
       System.out.println(yourGlasses);
       //-----------------------------------------

       long longNumber1 = 1;
       longNumber1 = -2000;

       long longNumber2 = -2147483649L;
       long longNumber3 = 2147483648L;
       longNumber2 = yourGlasses;
       System.out.println(yourGlasses);

       byte byteNumber = 0;
        short shortNumber = 0;
        int intNumber = 0;
        long longNumber =214748300 ;
        //

        System.out.println(intNumber);
        longNumber = byteNumber;
       // shortNumber- intNumber; NOT WORK
        longNumber = shortNumber;
        intNumber = byteNumber;
        // byte is smallest

        intNumber = (int) longNumber;



        // CASTING is used to store larger variable values into smaller variable values
        intNumber = (int) longNumber;

        byteNumber = (byte)intNumber;

        shortNumber = (short) longNumber;
        System.out.println(shortNumber);

        //-------------------------------

        intNumber = 100;
        byteNumber = (byte) intNumber;
        System.out.println(byteNumber); //100

        byteNumber = 30;
        shortNumber = byteNumber;
        System.out.println(shortNumber); // 30


































        /*
        multiline comment
       // single line comment


        1. Declare variable (means create variable)
        2. Assign value to variable (put value inside variable)
        3. Reassign value to variable (put new value to the same variable)
        //--------------------------
        Variable Declaration
        byte myByte;
        short myShort;
        int myInt;
        long myLong;


        Value Assignment
        byte myByte =3; (declare variable and assign value)

        short age;(declaring variable)
        age = 40;(assigning value to variable)
        //---------------------------

        Reassign Value

        int number = 100;
        number = 30; (reassign value)
        number = 0;



        Naming Convention;
       - all variables must start with lower case
       - all variables must use camelCase (thisIsMuCamelCaseLongWord)
       - all classes must start with upper case, use camelCase
       - all packages must start with lower case, use camelCase
       - names must start with any letter, or _ or $


         */
    }

}
