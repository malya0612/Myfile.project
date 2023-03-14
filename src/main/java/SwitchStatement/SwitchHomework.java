package SwitchStatement;

import java.util.Scanner;

public class SwitchHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a symbol");
        char symbol = sc.next().charAt(0);
        switch (symbol){
            case '!':
                System.out.println("Exclamation mark");
                break;
            case '?':
                System.out.println("Question mark");
                break;
            case '%':
                System.out.println("Modulus");
                break;
            case '#':
                System.out.println("Hash");
                break;
            case '*':
                System.out.println("Star");
                break;
            case '@':
                System.out.println("At");
                break;
            case '$':
                System.out.println("Dollar sign");
                break;
            default:
                System.out.println("Unknown symbol");
                break;


            }
        }

    }

