package stringsInJava;

public class Example5 {
    public static void main(String[] args) {
        String name1 = "Diya";
        String name2 = new String("Diya");
        String name3Intern = name2.intern();

        System.out.println(name1 == name2); // False
        System.out.println(name3Intern == name1); // True
    }
}
