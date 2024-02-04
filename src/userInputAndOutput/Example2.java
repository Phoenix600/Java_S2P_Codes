package userInputAndOutput;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some data : ");
        System.out.println("Integer : " + input.hasNextInt());
        System.out.println("String  : " + input.hasNext());



        input.close();
    }
}
