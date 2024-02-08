package stringsInJava.regex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Example3 {
    public static void main(String[] args){
        String source = "abcabcabcabc";
        boolean result;

        result = source.matches(".*");
        System.out.println(result);

        result = source.matches("[abc]*");
        System.out.println(result);

        source = "abc123bca";
        result = source.matches("[abc123]*");
        System.out.println(result);

        source = "";
        result  = source.matches("[abc123]*");
        System.out.println(result);

        result  = source.matches("[abc123]+");
        System.out.println(result);

        source = "aacc";
        result = source.matches("[abc]{4}");
        System.out.println(result);


        result = source.matches("[abc]{3,7}");
        System.out.println(result);

        source = "jhon@gmail.com";
        result = source.matches(".*gmail.com");
        System.out.println("Gmail Account : "+result);

        result = source.matches("\\w*@gmail.*");
        System.out.println(result);

        /**
         * Yahoo
         * Hotmail
         * Outlook
         * gmail
         */

    }
}
