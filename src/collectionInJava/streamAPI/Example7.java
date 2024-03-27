package collectionInJava.streamAPI;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Example7 {
    public static void main(String[] args)
    {
        // Example of intermediate operations

        // Filter Operation
        Stream<String> ss = Stream.of("Pranay R","Srushti S R","Parth P","Pranay G");

        Predicate<String> predicateFunctionReff = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if(s.contains("R"))
                {
                    return  true;
                }
                return false;
            }
        };

        Stream<String> filteredStream = ss.filter(predicateFunctionReff);
        Consumer<String> consumerFunctionReff = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Name " + s);
            }
        };
        filteredStream.forEach(consumerFunctionReff);
    }
}

