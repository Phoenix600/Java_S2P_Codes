package userInputAndOutput;
import java.lang.*;
import java.util.Scanner;
public class Example1 {

    public static void main(String[] args){
        // Keyboard as a data source
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = input.next();
        System.out.println(name);
        System.out.println("Enter your age : ");
        input.next();
        int x = input.nextInt();
        System.out.println(x);

        System.out.println("Enter some boolean value : ");
        boolean isTrue = input.nextBoolean();
        System.out.println(isTrue);

        // String as a data source
        input = new Scanner("Hello 123 people 456");

    }
}
