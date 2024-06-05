package userInputAndOutput;

import java.util.Scanner;

/**
 * @brief Assignment Master the difference between hasNext() and hasNextLine()
 * @link https://www.baeldung.com/java-scanner-hasnext-vs-hasnextline
 */
public class Example4 {
    public static void main(String[] args) {
        String DATA_SOURCE = new StringBuilder()
                .append("magic/project\n")
                .append("database:mysql\n")
                .append("dependencies:java")
                .append("\n")
                .toString();
        Scanner input = new Scanner(DATA_SOURCE);
        while (input.hasNext())
        {
            System.out.println(input.next());
        }
    }
}
