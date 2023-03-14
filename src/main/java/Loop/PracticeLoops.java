package Loop;

public class PracticeLoops {
    public static void main(String[] args) {
        for (int k = 10; k >= 1; k--){
            System.out.println("The value of x is: " + k);
        }
        for (int h = 10; h >= 0; h = h - 2){
            System.out.println("The value of y is: " + h);
        }

        for (int k = 1; k <= 15; k += 2){
            System.out.println("The value of num is: " + k);
        }
        int sum = 0;
        for (int k = 1; k <= 10; k++ ){
            System.out.println("The value of i is: " + k);
            sum = sum + k;
        }
        System.out.println("The result is: " + sum);

        int r = 0;
        for (int i = 0; i <= 100; i+= 2){
            System.out.println("Even numbers: " + i);
            r = r + i;
        }
        System.out.println("The result is: " + r);


    }
}
