package collectionInJava.streamAPI;

import java.net.Inet4Address;
import java.util.function.Predicate;

public class Example4 {
    public static void main(String[] args) {
        // Method-1 to work with predicate functions,
        // A function which returns the True/False value is predicate function
        
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2==0)
                        return  true;
                return false;
            }
        };
    }
}
