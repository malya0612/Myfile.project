package strings;

public class StringSubstring {
    public static void main(String[] args) {

        String message = "Hello Chicago, why are so cold and windy?";
        String city = message.substring(6, 13);
        System.out.println(city);

        String question = message.substring(15);
        System.out.println(question);

        String welcomeSign = "Welcome to USA, our population is 140 million people, " +
                "the average salary is 90k dollars, and our president is Joe Biden";
        String country = welcomeSign.substring(welcomeSign.indexOf("U"), welcomeSign.indexOf("A") +1);
        System.out.println(country);
        String population = welcomeSign.substring(welcomeSign.indexOf("140"), welcomeSign.indexOf(" people"));
        System.out.println(population);
        String salary = welcomeSign.substring(welcomeSign.indexOf("9"), welcomeSign.indexOf("and") -1);
        System.out.println(salary);
        String president = welcomeSign.substring(welcomeSign.indexOf("Joe"));
        System.out.println(president);

        String phrase = "Just one positive thought in the morning can change your whole day.";

        System.out.println(phrase.substring(0, 4) + " a " + phrase.substring(18, 25));
        int beginIndex = phrase.indexOf("positive");
        int endIndex = phrase.indexOf(" thought");
        System.out.println( phrase.substring(beginIndex, endIndex));
        beginIndex = phrase.indexOf("morning");
        endIndex = phrase.indexOf("can");
        System.out.println(phrase.substring(beginIndex, endIndex));

        //====================== NEW ASSIGNMENT ======================

        String str1 = "hi";
        String str2 = "bye";
        System.out.println(str1 + str2 + str2 + str1);
        //print====> hi bye HI HI BYE BYE bye hi

        System.out.println(str1 + " " + str2 + " " + str1.toUpperCase() + " " + str1.toUpperCase() + " " + str2.toUpperCase() + " " + str2.toUpperCase());


        //print====> hi
        System.out.println(str2.substring(0,1) + str1.substring(1));
        System.out.println(str1.replace('h', 'i'));
        System.out.println(str2.charAt(8) + "" + str1.charAt(1));


        String see = "see";
        String hear = "hear";
        System.out.println(hear.substring(0,1)+ see.substring(1));
        System.out.println(see.replace('h', 's'));











    }
}
