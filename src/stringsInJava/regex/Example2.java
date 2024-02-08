package stringsInJava.regex;

/**
 * Meta Characters In Regex
 */
public class Example2 {
    public static void main(String[] args) {
        String phone = "$";
        boolean result;


        result = phone.matches("\\w"); // alphabet or number // returns false for special characters
        System.out.println(result);

        phone = "1";
        result = phone.matches("\\d"); // to check single symbol as digit
        System.out.println(result);

        result = phone.matches("\\D"); // returns true, if given symbol is not a number
        System.out.println(result);


    }
}
