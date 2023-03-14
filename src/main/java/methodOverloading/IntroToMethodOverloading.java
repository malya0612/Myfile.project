package methodOverloading;

import kotlin.reflect.KType;

public class IntroToMethodOverloading {
    /*
    method names must be unique.
    cannot have two or more methods to use the same name
     */

    public  int getAreaOfRectangle(int length, int width){
        return length * width;
    }
    public  int getAreaOfRectangle(long length, long width) {
        return (int) (length * width);
    }

    public  int getAreaOfRectangle(double length, double width) {
        System.out.println(9.4 + "dfj".substring(12));
        return (int) (length * width);
    }


    public int getPerimeterOfSquare(int b){
        return b;
    }
    public int getPerimeterOfSquare(long c){
        return (int) (c);
    }
    public int getPerimeterOfSquare(double d) {
        return (int) (d);
    }
}
