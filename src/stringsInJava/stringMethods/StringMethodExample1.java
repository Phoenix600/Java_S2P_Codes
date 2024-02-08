package stringsInJava.stringMethods;

/**
 *
 * String Constructors
 */
public class StringMethodExample1 {
    public static void main(String[] args){
        // Method-1
        String s0 = "Sample Space";

        // Creating the string with constructors
        String s1;

        s1 = new String(); // empty string ==> s1 = ""
        System.out.println("[+]Empty String : " + s1);

        s1 = new String("Sample Space");
        System.out.println("[+]String created with constructor-1 : " + s1);

        char charArray[] = {'A','B','C'};
        s1 = new String(charArray);
        System.out.println("[+] String created with char array : " + s1);


        byte byteArray[] = {65,97,66,98};
        s1 = new String(byteArray);
        System.out.println("[+] String created with byte array : " + s1);


    }
}
