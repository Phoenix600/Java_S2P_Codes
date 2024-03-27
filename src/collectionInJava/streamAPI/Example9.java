package collectionInJava.streamAPI;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Example9 {
    public static void main(String[] args) {
        LinkedList<String> llNames = new LinkedList<>(List.of("Pranay","Diya","Srushti","Tanvi","Vedant"));

        BinaryOperator<String> binaryOperatorReff = new BinaryOperator<String>() {
            @Override
            public String apply(String s, String s2) {
                if(s2.contains("Srushti") || s2.contains("Pranay"))
                        s = s+s2;
                return s;
            }
        };


        String result =   llNames.stream().reduce("",binaryOperatorReff);

//       String result =   llNames.stream().reduce("",(largestString,n)->largestString+n);
        System.out.println(result);
    }
}
