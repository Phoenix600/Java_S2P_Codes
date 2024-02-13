package conditionalStatements;

import java.util.Scanner;

/**
 * Display the days based on the number passed by the user
 */
public class Example4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        switch (n){
            default:
                System.out.println("Not a valid week day");
                break;
            case  1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;


        }
    }
}
