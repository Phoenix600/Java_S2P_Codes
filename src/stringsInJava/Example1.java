package stringsInJava;


/**
 * This Example is all about the Printing in Java
 */
public class Example1 {
    public static void main(String[] args)
    {
        String constantString1 = "eminem";
        String constantString2 = "eminem";
        String constantString3 = new String("eminem");
        String constantString4 = new String("eminem");

        System.out.println(constantString2 == constantString1);
        System.out.println(constantString2 == constantString3);
        System.out.println(constantString3.equals(constantString2));
        System.out.println(constantString3.intern());
        System.out.println(constantString1.hashCode());
        System.out.println(constantString3.hashCode());
        System.out.println(constantString4.hashCode());
        System.out.println(constantString1 == constantString4);



        String sample1 = "Hello";
        String sample2 = new String("Hello");
        System.out.println(sample1.hashCode() == sample2.hashCode()); // true

    }
}
