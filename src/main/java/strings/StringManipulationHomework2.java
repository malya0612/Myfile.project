package strings;

public class StringManipulationHomework2 {
    public static void main(String[] args) {

        //1
        String s = "Hello world";
        int index = s.indexOf("world");
        System.out.println(index);//6
        //2
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//H
        //3
        String s1 = "HELLO";
        String lower = s1.toLowerCase();
        System.out.println(lower);//hello
        //4
        String s2 ="hello";
        String upper = s2.toUpperCase();
        System.out.println(upper);//HELLO
        //5
        String s3 = "hello";
        String s4 = "Hello";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
        //6
        String s5 = "the quick brown fox";
        String ss = new String();



        //7
        String s6 = "Hello";
        String reverse = "";
        int i = s6.length()-1;
        reverse += s6.charAt(i);
        System.out.println(reverse);
        //8
        String str = "Hello World";
















    }
}
