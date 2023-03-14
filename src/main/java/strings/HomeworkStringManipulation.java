package strings;

public class HomeworkStringManipulation {
    public static void main(String[] args) {
        //1
        String str1 = "Hello Universe!";
        char ch = '0';
        System.out.println(str1.indexOf(ch));
        //2
        String str2 = "Hello, World";
        int start = 7;
        int end = 12;
        String subStr = str2.substring(start , end);
        System.out.println(subStr); //World
        //3
        String str3 = "Good morning World";
       char c = str3.charAt(13);
        System.out.println(c);//W
        //4
        String str4 = "         I love coding      ";
        str4 = str4.trim();
        System.out.println(str4);
        //5
        String str5 = "Learn as if you will live forever,live like you will die tomorrow";
        str5 = str5.replace("o","" );
        System.out.println(str5);








    }
}
