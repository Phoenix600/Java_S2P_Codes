package conditionalStatements;

import java.util.Scanner;

/**
 * This example is about simple if-constructs
 */
public class Example1 {
    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a number to find the factors :");
        n = input.nextInt();

        for(int i=1; i<n; i++)
        {
            if(n%i == 0){
                System.out.printf("%d Is A Factor Of %d\n",i,n);
            }
        }
    }
}
