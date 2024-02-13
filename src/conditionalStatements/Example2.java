package conditionalStatements;

import java.util.Scanner;

/**
 * Find the radix of a number
 * 0-1 Binary                       Radix : 2
 * 0-7 Octal                        Radix : 8
 *  * 0-9 Decimal                   Radix : 10
 * 0-9 A-F Hexadecimal              Radix : 16
 */
public class Example2 {
    public static void main(String...args){
        String nums;
        Scanner input = new Scanner(System.in);

        System.out.println("[+]Enter the number : ");
        nums = input.nextLine();

        if(nums.matches("[01]+")){
            System.out.println("Binary Number Radix=2");
        }else if(nums.matches("[0-7]+")){
            System.out.println("Octal Number Radix=7");
        }
        else if(nums.matches("[0-9]+")){
            System.out.println("Decimal Number Radix=10");
        }else if(nums.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal Number Radix=16");
        }else{
            System.out.println("Invalid String....for number systems");
        }

    }
}
