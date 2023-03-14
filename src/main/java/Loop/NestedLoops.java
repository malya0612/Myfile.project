package Loop;

public class NestedLoops {
    public static void main(String[] args) {
        /*
        nested loop - loop inside loop
         */
        for (int i = 1; i <= 15; i++) {
            for (int k = 1; k <= 15; k++) {
                System.out.print((i * k) + "\t");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
         int row = 5;
        for (int i = 1; i <= row; i++){
            for (int j = row - i; j >= 1; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
                System.out.println("* ");
        }
        System.out.println();

    }
}



