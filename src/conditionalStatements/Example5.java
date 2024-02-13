package conditionalStatements;

import java.util.Scanner;

// http:www.godaddy.com
// https:www.google.com
// https:www.instagram.com
public class Example5 {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the URL : ");
        String url = input.nextLine();

        String protocol = url.substring(0,url.indexOf(":"));

        String websiteName = url.substring(url.indexOf(".")+1,url.lastIndexOf("."));

        String domain = url.substring(url.lastIndexOf(".")+1);


        if(protocol == "http"){
            System.out.println("Its a HTTP protocol");
        }else if(protocol == "https"){
            System.out.println("Its a HTTPS protocol");
        }else{
            System.out.println("We Don't Know");
        }

        switch (protocol) {
            case "http":
                System.out.println("Http Protocol");
                break;
            default:
                System.out.println("Unknown URL");
                break;
        }

    }
}
