package Loop;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {

        for (int i =1; i <= 10; i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i++){
            if (i % 2 ==0){
                continue;
            }
            System.out.println(i);
        }

        for (int k = 1; k <= 100; k++){
            if (k % 3 == 0){
                continue;
            }
            System.out.println(k);
        }


    }
}
