package strings;

public class StringIndexOf {
    public static void main(String[] args) {
        String ad = "Buy two, get one free!";
        int index = ad.indexOf('g');
        System.out.println(index);
        int index1 = ad.indexOf('t');
        System.out.println(index1);

        index = ad.indexOf('o' , 7);
        System.out.println(index);
        index = ad.indexOf('o' , ad.indexOf('o'));
        System.out.println(index);




    }
}
