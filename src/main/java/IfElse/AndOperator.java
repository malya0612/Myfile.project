package IfElse;

public class AndOperator {
    public static void main(String[] args) {

        if (2 < 3){
            System.out.println("hello");
        }
        if (5 > 10){
            System.out.println("hello");
        }
        //========
        if (2 < 3 && 5 < 10){
            System.out.println("bye bye");
        }
        if (false && true){
            System.out.println("potato");
        }
        if (true && false){
            System.out.println("do something");
        }
        if (true && true) {
            System.out.println("finally true");
        }
            //=============================

           String username = "sunshine123" ;
           String password = "moonlight456!true";
           String email = "sunshine123@gmail.com";
           String enteredUsername = "malaya06";
           String enteredPassword = "9744life";
           String enteredEmail = "boots123";
           if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
               System.out.println("logged in");
           }
            if (enteredEmail.equals(email)) {
                System.out.println("incorrect password, try again");
            }
            if (username.equals(enteredUsername)) {
                System.out.println("does not exist");
            }
            if (enteredUsername.equals(username) && username.equals(enteredUsername)) {
                System.out.println("incorrect name");
            }

           }


        }



