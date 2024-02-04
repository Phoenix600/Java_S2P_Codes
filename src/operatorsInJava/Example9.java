package operatorsInJava;
import java.lang.*;

public class Example9 {
    public static void main(String[] args) {
        float f = 12;
//        System.out.println((Float)f instanceof Float);

        int a = 10;
        int b = 10;
        int c = 10;


        double s = (a + b + c)/2;

        double result = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println(result);

    }
}
