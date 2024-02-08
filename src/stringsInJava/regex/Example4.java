package stringsInJava.regex;

public class Example4 {
    public static void main(String[] args) {
        String input = "784732843";
        System.out.println(input.matches("\\d*"));
    }
}
