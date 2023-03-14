package IfElse;

public class IfIf {
    public static void main(String[] args) {

        String weather = "warm and rainy";

        if (weather.contains("cold")){
            System.out.println("cold, stay home!");
        }
        else if (weather.contains("hot")) {
            System.out.println("hot, stay home!");
        }
        else if (weather.contains("warm")) {
            System.out.println("warm, go out!");
        }
        else if (weather.contains("rainy")) {
            System.out.println("rainy stay home!");
        }
        else{
            System.out.println("party hard!");
        }

        System.out.println("IF IF IF IF ");

        if (1 < 2){
            System.out.println("one is less than two");
        }
        if (1 < 3){
            System.out.println("one is less than three");
        }
        if (1 < 4){
            System.out.println("one is less than four");
        }
    }
}
