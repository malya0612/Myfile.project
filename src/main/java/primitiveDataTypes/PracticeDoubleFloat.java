package primitiveDataTypes;

public class PracticeDoubleFloat {

    public static void main (String [] args){
        /*
       - float and double are variables that store decimal numbers
       - double is larger than float
       - double is the most precise variable (точные цифры)
       - Java thinks that all decimal numbers are double
       - to make sure float is float put F/f in the end
       both double and float can hold both numbers

         */

        double priceOfBread = 4.99;
        double priceOfApples = 3.995554444444444444444444444444444555555555555;
        System.out.println(priceOfApples);

        priceOfBread = 32834782347.466660;
        System.out.println(priceOfBread);

        priceOfBread = 98.1;
        byte byte1 = 2;
        short short1 =5;
        int int1 = 7;
        long long1 = 345;
        float float1 = 3545;
        double double1 = 2343;

        float1 = (float) double1;
        double1 = 4.99;
        long1 = (long)double1;
        System.out.println(long1);

        //======= hello people==========================================

        /*
        4.88 - floating, fractional
        1, 2, 3 - whole numbers
        1234567890 - decimal system
        01234567 - octal system
        0123456789abcdf - hexadecimal
        101010 - binary system
         */

        int a = 5;
        double d = 8.9;
        a = (int)d;
        System.out.println(a); //8

        short sh;
        float f = (float) 12.7;
        f = 12.7F;

        sh = (short)f;
















    }
}
