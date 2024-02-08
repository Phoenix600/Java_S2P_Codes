package stringsInJava.regex;
import java.util.Scanner;
enum Organization{
    GOOGLE,
    YAHOO,
    HOTMAIL,
    WIPRO,
    OUTLOOK,
    UNKNOWN;
}
public class Example5 {
    public static void main(String[] args) {
        Organization org;

        Scanner input = new Scanner(System.in);

        System.out.println("[+]Enter the email");
        String res = input.nextLine();
        res = res.trim();

        // thisispranayramteke@google.com

        boolean isValid = false;

        isValid = res.matches("\\w*@google.com");
        System.out.println(isValid);


        if(res.matches("\\w*@google.com")){
            org = Organization.GOOGLE;

        }else if(res.matches("\\w*@yahoo.com")){
            org = Organization.YAHOO;
        }
        else{
            org = Organization.UNKNOWN;
        }


        System.out.println("You are an employee of " + org);

    }
}
