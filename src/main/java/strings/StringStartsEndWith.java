package strings;

public class StringStartsEndWith {
    public static void main(String[] args) {
        String banner = "ThanksGiving Sale20%";
        boolean isSale = banner.startsWith("Thanks");
        System.out.println(isSale);
        System.out.println(banner.startsWith("thanks")); //true
        System.out.println(banner.startsWith("T")); //true
        System.out.println(banner.startsWith("Giving")); //false

        boolean endsWith = banner.endsWith("%");//trye
        System.out.println(endsWith);//false

        System.out.println(banner.endsWith("Sale 20% "));//false
        System.out.println(banner.endsWith("sale 20%")); //false




    }
}
