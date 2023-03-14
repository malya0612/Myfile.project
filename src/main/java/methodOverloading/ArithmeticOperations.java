package methodOverloading;

import static java.lang.Math.sqrt;

public class ArithmeticOperations {
    public int arithmetic(int a, int b) {
        return a + b;
    }

    public int arithmetic(int a, int b, int c) {
        return a + b + c;
    }

    public int arithmetic(int a, int b, int c, int d) {
        return (a + b + c + d) / 4;
    }

    public int arithmetic(int a, int b, int c, int d, int e, int f) {
        return (a + b + c + d + e + f) / 6;
    }

    public int getAreaOfTriangle(int base, int height) {
        return (1 / 2 * base * height);
    }

    public int getAreaOfTriangle(int a, int b, int c) {
        int s = (a + b + c) / 2;
        int area = (int) sqrt(s * (s - a) * (s - b) * (s - c));
         return area;
    }

}
