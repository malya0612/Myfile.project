package strings;

public class HomeworkEquals {
    public static void main(String[] args) {
        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("Hello World!");

        //1
        boolean a1 = hello1.equalsIgnoreCase(hello2);
        System.out.println(a1);
        //2
        boolean a2 = !hello1.equals(hello3);
        System.out.println(a2);
        //3
        boolean a3 = hello1.equals(hello2);
        System.out.println(a3);
        //4
        String water1 = hello1.toLowerCase();
        String water2 = hello2.toLowerCase();
        boolean a4 = hello1.equals(water1 + water2);
        System.out.println(a4);
        //5
        String water3 = hello1.toUpperCase();
        String water4 = hello3.toUpperCase();
        boolean a5 = water3.equals(water4);
        System.out.println(a5);


    }
}
