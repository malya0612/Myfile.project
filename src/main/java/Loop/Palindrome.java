package Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String ");
        String str = sc.nextLine();
        boolean isPalindrome = true;
        int l = str.length();
        for (int i =0; i < l/2; i++){
            if (str.charAt(i) != str.charAt(l -1 -i)){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("It's a palindrome");
        }else {
            System.out.println("It's not palindrome");
        }


    }
}
