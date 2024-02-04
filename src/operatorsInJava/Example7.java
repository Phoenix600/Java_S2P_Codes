package operatorsInJava;

/**
 * Program for swapping  :  using the xor operator
 */
public class Example7 {
    public static void main(String[] args) {
        int a  = 9;
        int b = 12;

        System.out.println(a + "..." + b);

        a = (a^b);
        b = (a^b);
        a = (a^b);

        System.out.println(a + "...." + b);

    }
}
