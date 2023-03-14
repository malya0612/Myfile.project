package methods;

public class Calculator {
    public int add (int x, int y){
        return x + y;
    }
    public int subtract  (int x, int y){
        return x - y;
    }
    public int multiply (int x , int y){
        return x * y;
    }
    public double divide (int x, int y){
        return x / y;
    }
    public int modulus (int x, int y){
        return x % y;
    }

    public static void main(String[] args) {
        Calculator str = new Calculator();

        System.out.println(str.add(2,5));
        System.out.println(str.subtract(10,5));
        System.out.println(str.multiply(383,23));
        System.out.println(str.divide(433,223));
        System.out.println(str.modulus(122,56));

    }


}
