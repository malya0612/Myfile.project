package IfElse;

public class IfElseDay2 {
    public static void main(String[] args) {


        int day = 3;
        if (day == 1){
            System.out.println("Monday");
        } else if (day ==2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid day");


            String dayOfWeek = "Monday";
            if (dayOfWeek.equalsIgnoreCase("monday")){
                System.out.println(1);
            } else if (dayOfWeek.equalsIgnoreCase("tuesday")) {
                System.out.println(2);
            } else if (dayOfWeek.equalsIgnoreCase("wednesday")) {
                System.out.println(3);
            } else if (dayOfWeek.equalsIgnoreCase("thursday")) {
                System.out.println(4);
            } else if (dayOfWeek.equalsIgnoreCase("friday")) {
                System.out.println(5);
            } else if (dayOfWeek.equalsIgnoreCase("saturday")) {
                System.out.println(6);
            } else if (dayOfWeek.equalsIgnoreCase("sunday")) {
                System.out.println(7);
            }else {
                System.out.println(-1);
            }

            byte time = 10;
            if (time >= 9 && time <= 17){
                System.out.println("WORK HOURS");
            } else if (time >= 7 && time <= 9) {
                System.out.println("COMMUTE HOURS");
            } else if (time >= 6 && time <= 8) {
                System.out.println("BREAKFAST TIME");
            } else if (time >= 12 && time <= 13) {
                System.out.println("Lunch Time");
            } else if (time >= 20 && time <= 22) {
                System.out.println("Dinner time");
            } else if (time >= 22 && time <= 24) {
                System.out.println("Late hours");
            } else if (time >=0 && time <= 4) {
                System.out.println("SLEEP TIME");
            }else{
                System.out.println("Invalid Time");
            }


        }


    }
}
