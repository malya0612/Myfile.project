package SwitchStatement;

public class IntroToSwitch {
    public static void main(String[] args) {
        int number = 2;
        switch (number){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
            default:
                System.out.println("Invalid");
                break;

            }
           // ====================================================

        String digit = "three".toLowerCase();
        switch (digit){
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            case "five":
                System.out.println(5);
                break;
            default:
                System.out.println("Invalid number");
                break;

        }
        String num = "five";
            if (num.equals("one")){
                System.out.println(1);
            } else if (num.equals("two")) {
                System.out.println(2);
            } else if (num.equals("three")) {
                System.out.println(3);
            } else if (num.equals("four")) {
                System.out.println(4);
            } else if (num.equals("five")) {
                System.out.println(5);
            }else {
                System.out.println("Invalid");
            }


    }
}
