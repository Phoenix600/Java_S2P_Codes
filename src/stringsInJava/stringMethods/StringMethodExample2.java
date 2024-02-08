package stringsInJava.stringMethods;

public class StringMethodExample2 {
    public static void main(String[] args) {
        String message = "Fake It Till You Make It";
        int count = message.length();
        System.out.println("Length of string is " + count);

        String lowerCaseString = message.toLowerCase();
        System.out.println("[+]Lowercase String : " + lowerCaseString);

        String upperCaseString = message.toUpperCase();
        System.out.println("[+]Uppercase string : " + upperCaseString);

        /**
         * sample space
         * Sample Space
         *
         * String result;
         */
//        String res;
//        res = Character.toString( input.charAt(0) - 32);
//        for(int i=1; i<input.length(); i++)
//        {
//
//                if(input.charAt(i) == ' '){
//
//                        res = res + Character.toString(input.charAt(i));
//
//                } if(input.charAt(i-1) == ' ')
//                    res = res + Character.toString( input.charAt(i+1) - 32);
//                else{
//                    res = res + Character.toString(input.charAt(i));
//                }
//        }
//        System.out.println(res);

        String input = "sample space universal";

        // sample space ===> Sample Space
        String s1 = input.substring(0,input.indexOf(' ')); // sample
        System.out.println(s1);
        char letter = (char)(s1.charAt(0) -32);
        s1 = ( letter + s1.substring(1));// Sample
        System.out.println(s1);
        String s2 = input.substring(input.indexOf(' ')+1); // space
        letter = (char)(s2.charAt(0)-32);
        s2 = (letter + s2.substring(1));
        System.out.println(s2);
        String res = s1 + " " + s2;
        System.out.println(res);

        /**
         * char[] = {'s','a'
         */

        // Converting the first letter of each word into caps
        char[] chars = input.toCharArray();
        String res1 = (char)(chars[0] -32) + "";

        for (int i=1;i <chars.length; i++){
            if(chars[i] == ' '){
                res1 = res1 + " ";
            }else if(chars[i-1]==' '){
                res1 = res1 + (char)(chars[i]-32);
            }else{
                res1 = res1 + chars[i];
            }
        }

        System.out.println(res1);


    }
}
